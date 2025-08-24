import java.awt.Color;
import java.awt.Graphics;
<<<<<<< HEAD
import java.awt.Point;


public class Actor extends Cell {
    // Properties
    public void paint(Graphics g){
        g.setColor(Color.GRAY);
    }

    // Constructors
    public Actor(int x, int y) {
        super(x, y);
    }

    class Cat extends Actor {
        // Properties
        public void paint(Graphics g) {
            g.setColor(Color.blue);
        }

        // Constructors
        public Cat(int x, int y) {
            super(x, y);
        }

        class Dog extends Actor {
        // Properties
        public void paint(Graphics g) {
            g.setColor(Color.blue);
        }

        // Constructors
        public Dog(int x, int y) {
            super(x, y);
        }

        class Bird extends Actor {
        // Properties
        public void paint(Graphics g) {
            g.setColor(Color.blue);
        }

        // Constructors
        public Bird(int x, int y) {
            super(x, y);
        }
    

  }
=======

public abstract class Actor {
  Color color;
  Cell loc;

  public void paint(Graphics g) {
    g.setColor(color);
    g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    g.setColor(Color.GRAY);
    g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
  }
}
>>>>>>> 727cb67c3d258132db9bfa6e496d5db6c8b109cd
