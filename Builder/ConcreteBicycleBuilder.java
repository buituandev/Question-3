package Builder;
import java.util.List;

public class ConcreteBicycleBuilder implements BicycleBuilder {
    private Bicycle result;
    private String frameSize;
    private String wheelType;
    private String gearSystem;
    private List<String> accessories;

    public ConcreteBicycleBuilder() {
        this.result = new Bicycle();
    }

    @Override
    public void addFrameSize(String frameSize) {
        this.frameSize = frameSize;       
    }

    @Override
    public void addWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    @Override
    public void addGearSystem(String gearSystem) {
        this.gearSystem = gearSystem;
    }

    @Override
    public void addAccessory(List<String> accessories) {
        this.accessories = accessories;
    }

    @Override
    public Bicycle getResult() {
        result.frameSize = frameSize;
        result.wheelType = wheelType;
        result.gearSystem = gearSystem;
        result.accessories = accessories;
        return result;
    }
}
