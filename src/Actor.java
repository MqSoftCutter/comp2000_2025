import java.awt.Color;
import java.awt.Graphics;
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