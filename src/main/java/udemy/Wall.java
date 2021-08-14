package udemy;

public class Wall {
    private String direction;
    private int width;
    private int length;

    public Wall(String direction, int width, int length) {
        this.direction = direction;
        this.width = width;
        this.length = length;
    }

    public String getDirection() {
        return direction;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
