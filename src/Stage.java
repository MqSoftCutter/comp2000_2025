import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;  

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

    // Arraylists for Actors
    List<actors extends Stage> actors = new ArrayList<>();
    actors.add(cat);
    actors.add(dog);
    actors.add(bird);

    for(Actor actor : actors) {
      
      System.out.println(actor);
    }
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    cat.paint(g);
    dog.paint(g);
    bird.paint(g);
  }
}
