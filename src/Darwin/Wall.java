package Darwin;

/**
 * Walls for Darwin's world
 * @author Tim Wahls edited by William Goble
 * @Version 01/30/2025
 */

public class Wall {
    private int x, y;

    public Wall(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXPos() {
        return x;
    }

    public int getYPos() {
        return y;
    }
}
