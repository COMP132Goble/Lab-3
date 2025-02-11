package Darwin;
import java.io.*;

/**
 * Implements the behavior of Darwin's World Creatures.
 * 
 * @author Tim Wahls edited by William Goble
 * @author STUDENT_NAME_HERE
 * @author STUDENT_NAME_HERE
 * @version 1/31/2025
 */
public class Creature {
    // declare your fields here

    /** 
      * initialize Creature species, color, initial position, direction and
      * program using the parameters, and initialize the program counter to 0.<br>
      * X and Y coordinates default to 1 if parameters are off the world.
      * The horizontal dimensions of the world are from 1 to 21,  
      * and the vertical dimensions are from 1 to 21<br> 
      * direction defaults to 0 ("up") if parameter is not one of 0, 1, 2 or 3
      * The program counter (which keeps track of which instruction in its program
      * the Creature is currently executing) should be initialized to 0 so that
      * the Creature starts executing with the first instruction its program.
      * @param initSpecies the species of the creature
      * @param initX the initial X coordinate
      * @param initY the initial Y coordinate
      * @param initDir the initial direction
      * @param initColor the initial color
      * @param initProgram the initial program
      */ 
    public Creature(String initSpecies, int initX, int initY, int initDir,
                    String initColor, Program initProgram) {
        // You code here
    }

    /**
     * Return the direction of the Creature as one of "up", "down",
     * "right" or "left".  You can assume that the direction will always
     * be stored as 0 through 3.  A direction of 0 indicates "up", 1 is "right",
     * 2 is "down" and 3 is "left"
     * 
     * @return the direction of the Creature as one of "up", "down", "left", or "right"
     */
    public String getDirection() {
        // add your code here
        return null;
    }

    /**
     * Print the species, position, orientation, color and program of the 
     * Creature to the terminal window.
     */
    public void print() {
        // add your code here.
    }

    /**
     * Return the X-coordinate of the Creature
     * @return he X-coordinate of the Creature
     */
    public int getXPos() {
        // your code here.
        return -1;
    }

    /**
     * Return the y-coordinate of the Creature
     * @return he y-coordinate of the Creature
     */
    public int getYPos() {
        // your code here.
        return -1;
    }

    /**
     * Return the color of the Creature.
     * @return the color of the Creature.
     */
    public String getColor() {
        // your code here.
        return "";
    }

    /**
     * Return the species of the Creature
     * @return the species of the Creature
     */
    public String getSpecies() {
        // your code here.
        return "";
    }

    /**
     * Return the program counter of this creature
     * @return he program counter of this creature
     */
    public int getCounter() {
        // your code here.
        return -1;
    }

    /** 
     * Set the counter of this creature.  If the specified new counter
     * value is not a valid instruction index for this creature's program,
     * display an error message and do not update the counter.
     * @param ctr the new counter value
     */
    public void setCounter(int ctr) {
        // your code here.
    }

    /** 
     * get the Instruction that this creature is currently executing.
     * Recall that the program counter keeps track of which instruction the
     * creature is currently executing.  If the program does not contain any
     * instructions, this method should return null.
     * Hint: to test this method, you should call setCounter to set the counter
     * to something other than 0, and then call this method and check that the instruction
     * returned is the expected one.
     * @return the current instruction.
     */
    public Instruction getCurrentInstruction() {
        // your code here.
        return null;
    }

    /**
     * Return the program of this creature
     * @return the program of this creature
     */
    public Program getProgram() {
        // your code here.
        return null;
    }

    /** 
     * Turn 90 degrees to the left 
     **/
    public void turnLeft() {
        // your code here.
    }

    /**
     * Turn 90 degrees to the right
     */
    public void turnRight() {
        // your code here.
    }

    /**
     * Return the X-coordinate of the square directly in front of the creature
     * @return the X-coordinate directly in front of the creature
     */
    public int getXFront() {
        // your code here.
        return -1;
    }

    /**
     * Return the y-coordinate of the square directly in front of the creature
     * @return the y-coordinate directly in front of the creature
     */
    public int getYFront() {
        // your code here.
        return -1;
    }

    /**
     * Hop forward. Here you can assume that the square in front of the creature 
     * is empty
     */
    public void hop() {
        // your code here.
    }
}
