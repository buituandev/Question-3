package Builder;

public class Client {
    public static void main(String[] args) {
        BicycleBuilder bicycleBuilder = new ConcreteBicycleBuilder();
        Director director = new Director(bicycleBuilder);
        Bicycle bicycle = director.build();
        System.out.println(bicycle);
    }
}
