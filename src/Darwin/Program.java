package Darwin;

import java.util.ArrayList;

/**
 * Darwin's world programs are lists of Instruction objects (contained
 *  in an ArrayList)
 * 
 * @author Tim Wahls edited by William Goble
 * @author YOUR_NAME_HERE
 * @author YOUR_NAME_HERE
 * @version 01/31/2025
 */
public class Program {
    // declare your fields here

    /**
     * Creates an empty program
     */
    public Program() {
        // add your code here
    }

    /** add the specified instruction to the end of the program
      * @param instr the instruction 
      */
    public void addInstruction(Instruction inst) {
        // add your code here
    }

    /** get the specified instruction by number.  Note that instructions
     *  are numbered starting from 0.  If the instruction number is invalid,
     *  print an error message and return null.
     *  @param index the instruction to fetch 
     **/
    public Instruction getInstruction(int index) {
        // your code here
        return null;
    }

    /** 
     * return the number of instructions in the program
     * @return the number of instructions
     */
    public int size() {
        // your code here
        return -1;
    }

    /** 
     * print all instructions in the program to the terminal window.
     * Note that class Instruction does have a print method of its own.
     */
    public void print() {
        // your code here
    }
}
