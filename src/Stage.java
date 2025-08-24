<<<<<<< HEAD
public class Stage {
    // Properties


    // Constructors
    public Stage(){
        
    }
=======
import java.awt.Graphics;
import java.awt.Point;

public class Stage {
  Grid grid;
  Actor cat;
  Actor dog;
  Actor bird;

  public Stage() {
    grid = new Grid();
    cat = new Cat(grid.cellAtColRow(0, 0));
    dog = new Dog(grid.cellAtColRow(0, 15));
    bird = new Bird(grid.cellAtColRow(12, 9));
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    cat.paint(g);
    dog.paint(g);
    bird.paint(g);
  }
>>>>>>> 727cb67c3d258132db9bfa6e496d5db6c8b109cd
}
