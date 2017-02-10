
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaz9178
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City toronto = new City();
        //creating robots
        Robot karel = new Robot(toronto, 0, 0, Direction.SOUTH);
        Robot sam = new Robot(toronto, 0, 1, Direction.SOUTH);
        //building walls
        new Wall(toronto, 0, 1, Direction.WEST);
        new Wall(toronto, 1, 1, Direction.WEST);
        new Wall(toronto, 1, 1, Direction.SOUTH);
        //moving the robots
        sam.move();
        karel.move();
        sam.turnLeft();
        karel.move();
        sam.move();
        karel.turnLeft();
        sam.turnLeft();
        sam.turnLeft();
        sam.turnLeft();
        sam.move();
        karel.move();
        sam.turnLeft();
        sam.turnLeft();
        sam.turnLeft();
        sam.move();
    }
}
