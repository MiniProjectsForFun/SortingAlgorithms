import os
import subprocess
import shutil
from py4j.java_gateway import JavaGateway, GatewayParameters, launch_gateway
import python.GraphicsManager
import time
import random

BASE = os.path.dirname(os.path.abspath(__file__))

JAVA_SRC = os.path.join(BASE, "java", "src")
JAVA_OUT = os.path.join(BASE, "java", "out")
PY4J_JAR = os.path.join(BASE, "lib", "py4j.jar")

# Delete the entire out folder if it exists
if os.path.exists(JAVA_OUT):
    shutil.rmtree(JAVA_OUT)

# Recreate the empty out folder
os.makedirs(JAVA_OUT)

subprocess.run([
    "javac",
    "-d", JAVA_OUT,
    "-cp", PY4J_JAR,
    JAVA_SRC + "/*.java"
], shell=True)

port = launch_gateway(classpath=JAVA_OUT)

gateway = JavaGateway(gateway_parameters=GatewayParameters(port=port))

main = gateway.jvm.Main()

size = 1024

arr = gateway.new_array(gateway.jvm.int, size)
for i in range(size):
    arr[i] = i

random.shuffle(arr)

main.setArray(arr)

graphics = python.GraphicsManager.GraphicsManager(height=700, width=1024)

graphics.update(main.getArray())
start_time = time.time()
python_time = 0
java_time = 0
while not main.isFinish():
    java_start = time.time()

    main.update()

    python_start = time.time()
    java_time += python_start - java_start

    graphics.update(main.getArray())

    python_time += time.time() - python_start
print(time.time() - start_time)
print(python_time)
print(java_time)