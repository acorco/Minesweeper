package game;

import java.util.Random;

public class Grid {
    final private ICell[][] _grid;
    final private int _w;
    final private int _h;

    public Grid(int w, int h) {
        _grid = this._createGrid(w, h);
        _w = w;
        _h = h;
    }

    private ICell[][] _createGrid(int w, int h) {
        ICell[][] grid = new ICell[w][h];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = Math.random() > 0.15 ? new Cell() : new Mine();
            }
        }
        return grid;
    }

    private void _separator() {
        System.out.println(new String(new char[_w * 4 + 4]).replace("\0", "—"));
    }

    public void draw() {
        _separator();

        System.out.printf("%2c |", 'X');
        for (int x = 0; x < _w; x++) {
            System.out.printf("%2d |", x);
        }

        System.out.println();
        _separator();

        for (int x = 0; x < _w; x++) {
            System.out.printf("%2d |", x);
            for (int y = 0; y < _h; y++) {
                _grid[x][y].draw();
            }
            System.out.println();
            _separator();
        }
    }
}
//Hola

