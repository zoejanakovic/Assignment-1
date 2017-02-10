
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaz9178
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating city
        City toronto = new City();
        //Creating robots
        Robot karel = new Robot(toronto, 3, 3, Direction.EAST);
        Robot maria = new Robot(toronto, 0, 1, Direction.WEST);
        //setting labels
        karel.setLabel("K");
        maria.setLabel("M");
        //creating things
        new Thing(toronto, 0, 0);
        new Thing(toronto, 1, 0);
        new Thing(toronto, 1, 1);
        new Thing(toronto, 1, 2);
        new Thing(toronto, 2, 2);
        //creating walls
        new Wall(toronto, 2, 3, Direction.WEST);
        new Wall(toronto, 2, 3, Direction.NORTH);
        new Wall(toronto, 2, 3, Direction.EAST);
        new Wall(toronto, 3, 3, Direction.EAST);
        new Wall(toronto, 3, 3, Direction.SOUTH);
        //moving Robots
        maria.move();
        maria.pickThing();
        karel.turnLeft();
        maria.turnLeft();
        karel.turnLeft();
        maria.move();
        maria.pickThing();
        karel.move();
        maria.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        maria.move();
        maria.pickThing();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        
    }
}
