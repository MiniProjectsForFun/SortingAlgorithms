import math

import pygame as pg

class GraphicsManager:
    def __init__(self, width=800, height=600):
        self.win_width, self.win_height = width, height
        self.win = pg.display.set_mode((self.win_width, self.win_height))

    def update(self, arr):
        self.win.fill((0,0,0))

        size_width = self.win_width / len(arr)
        size_height = self.win_height / len(arr)

        for i in range(len(arr)):
            pg.draw.rect(self.win, (255,255,255), pg.Rect(i * size_width, self.win_height - arr[i] * size_height, size_width, (1 + arr[i]) * size_height))

        pg.display.update()