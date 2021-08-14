package udemy;

public class Chair {
    private final String model;
    private final String type;
    private Dimensions dimensions;


    public Chair(String model, String type, Dimensions dimensions) {
        this.model = model;
        this.type = type;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
