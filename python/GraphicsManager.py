import pygame as pg

class GraphicsManager:
    def __init__(self):
        self.win = pg.display.set_mode((500, 500))

    def update(self, arr):
        self.win.fill((0,0,0))

        size = 500 / len(arr)

        for i in range(len(arr)):
            pg.draw.rect(self.win, (255,255,255), pg.Rect(i * size, 500 - arr[i] * size, size, arr[i] * size))

        pg.display.update()