
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating city
        City toronto = new City();
        // creating karel
        Robot karel = new Robot (toronto, 1, 2, Direction.SOUTH);
        // making walls
        new Wall (toronto, 1, 1, Direction.NORTH);
        new Wall (toronto, 1, 1, Direction.WEST);
        new Wall (toronto, 1, 2, Direction.NORTH);
        new Wall (toronto, 1, 2, Direction.EAST);
        new Wall (toronto, 1, 2, Direction .SOUTH);
        new Wall (toronto, 2, 1, Direction.WEST);
        new Wall (toronto, 2,1, Direction.SOUTH);
        // adding paper
        new Thing (toronto, 2, 2);
        // moving karel
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.canPickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
    }
}
