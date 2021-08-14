package udemy;

public class Room {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Furniture furniture;
    private Furniture furniture2;
    private Ceiling ceiling;
    private Floor floor;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4,
                Furniture furniture, Furniture furniture2,
                Ceiling ceiling, Floor floor) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.furniture = furniture;
        this.furniture2 = furniture2;
        this.ceiling = ceiling;
        this.floor = floor;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
        furniture.getBed().make();
    }
}
