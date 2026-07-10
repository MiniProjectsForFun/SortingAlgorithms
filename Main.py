'''import os
import subprocess
from py4j.java_gateway import JavaGateway, GatewayParameters, launch_gateway

BASE = os.path.dirname(os.path.abspath(__file__))

JAVA_SRC = os.path.join(BASE, "java", "src")
JAVA_OUT = os.path.join(BASE, "java", "out")
PY4J_JAR = os.path.join(BASE, "lib", "py4j.jar")

subprocess.run([
    "javac",
    "-d", JAVA_OUT,
    "-cp", PY4J_JAR,
    JAVA_SRC + "/*.java"
], shell=True)

port = launch_gateway(classpath=JAVA_OUT)

gateway = JavaGateway(gateway_parameters=GatewayParameters(port=port))

main = gateway.jvm.Main()'''

import python.GraphicsManager
import time

graphics = python.GraphicsManager.GraphicsManager()

graphics.update([2, 3, 4, 5, 1])
time.sleep(1)

graphics.update([2, 3, 4, 1, 5])
time.sleep(1)

graphics.update([2, 3, 1, 4, 5])
time.sleep(1)

graphics.update([2, 1, 3, 4, 5])
time.sleep(1)

graphics.update([1, 2, 3, 4, 5])
time.sleep(1)