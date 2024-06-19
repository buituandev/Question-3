package Builder;

import java.util.List;

public class Director {
    BicycleBuilder bicycleBuilder;

    public Director(BicycleBuilder bicycleBuilder) {
        this.bicycleBuilder = bicycleBuilder;
    }

    public Bicycle build(){
        bicycleBuilder.addFrameSize("18");
        bicycleBuilder.addWheelType("Tubeless");
        bicycleBuilder.addGearSystem("21");
        bicycleBuilder.addAccessory(List.of("Helmet", "Gloves", "Water Bottle Holder"));
        return bicycleBuilder.getResult();
    }
}
