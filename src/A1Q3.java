
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating a city
        City toronto = new City();
        //creatiing robot
        Robot karel = new Robot(toronto, 3, 0, Direction.EAST);
        //building walls
        new Wall(toronto, 3, 1, Direction.EAST);
        new Wall(toronto, 3, 2, Direction.NORTH);
        new Wall(toronto, 2, 3, Direction.WEST);
        new Wall(toronto, 1, 3, Direction.WEST);
        new Wall(toronto, 1, 3, Direction.NORTH);
        new Wall(toronto, 1, 3, Direction.EAST);
        new Wall(toronto, 2, 4, Direction.NORTH);
        new Wall(toronto, 2, 4, Direction.EAST);
        new Wall(toronto, 3, 4, Direction.EAST);
        //creating flag
        new Thing(toronto, 3, 1);
        //moving karel
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        
        
        
    }
}
