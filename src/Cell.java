import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;


public class Cell {
    private int x, y;
    private int width, height;
    private Color color;

    public Cell(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    // Getters and setters can be added as needed
}

// Example usage (should be placed inside a method in another class):
// Cell cell = new Cell(10, 20, 50, 50, Color.BLUE);
// In a paintComponent(Graphics g) method:
// cell.draw(g);