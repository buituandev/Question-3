package Builder;

import java.util.List;

public class Bicycle {

    public String frameSize;
    public String wheelType;
    public String gearSystem;
    public List<String> accessories;

    @Override
    public String toString() {
        return "Bicycle [frameSize=" + frameSize + ", wheelType=" + wheelType + ", gearSystem=" + gearSystem
                + ", accessories=" + accessories + "]";
    }
}
