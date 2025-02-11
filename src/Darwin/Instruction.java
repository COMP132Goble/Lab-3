package Darwin;

/** 
  * Represent instructions for Darwin's word creature programs.  Each
  * instruction has an operation code (the operation performed by the
  * instruction) and a target, which is the line to jump to for branch
  * instructions.  For nonbranch instructions, the target should be -1.
  * @author Tim Wahls edited by William Goble
  * @version 01/31/2025 */

public class Instruction {
    private String operationCode; // the operation
    private int target;           // target operation for branching instruction

    /**
     * create an instruction with branch target.  Use this constructor
     * for creating branching instructions, such as "go 0" and "ifenemy 10".
     * @param operation the operation contained in the instruction
     * @param target    the target (if the instruction is a branch)
     */
    public Instruction(String operation, int target) {
        this.operationCode = operation;
        this.target = target;
    }

    /**
     * create an instruction.  Use this constructor for creating nonbranch
     * instructions such as "hop" and "left".
     * 
     * @param operation the operation contained in the instruction
     */
    public Instruction(String operation) {
        this.operationCode = operation;
        this.target = -1;
    }

    /**
     * return the operationCode of the instruction
     * @return the operationCode of the instruction
     */
    public String getOperation() {
        return operationCode;
    }

    /**
     * return the target of the instruction
     * @return the target of the instruction
     */
    public int getTarget() {
        return target;
    }

    /** 
     * print the instruction to the terminal window 
     */
    public void print() {
        System.out.print(operationCode);
        if (target != -1) {
            System.out.print(" " + target + "\n");
        } else {
            System.out.print("\n");
        }
    }
}
