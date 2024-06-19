package Builder;

import java.util.List;

public interface BicycleBuilder {

    public void addFrameSize(String frameSize);

    public void addWheelType(String wheelType);

    public void addGearSystem(String gearSystem);

    public void addAccessory(List<String> accessories);

    public Bicycle getResult();
}
