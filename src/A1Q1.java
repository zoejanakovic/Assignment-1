
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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating the city
        City toronto = new City();
        // creating a robot
        Robot karel = new Robot (toronto, 0, 2, Direction.WEST);
        //putting up walls
        new Wall (toronto, 1, 1, Direction.NORTH);
        new Wall (toronto, 1, 2, Direction.NORTH);
        new Wall (toronto, 1, 1, Direction.WEST);
        new Wall (toronto, 2, 1, Direction.WEST);
        new Wall (toronto, 2,1, Direction.SOUTH);
        new Wall (toronto, 2, 2, Direction.SOUTH);
        new Wall (toronto, 2, 2, Direction.EAST);
        new Wall (toronto, 1, 2, Direction.EAST);
        // moving karel
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        
       
    }
}
