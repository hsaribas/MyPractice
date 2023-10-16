package Practice2;

public class SkylineGTR34 extends CarFeatures {

    public SkylineGTR34() {
        super("Japan", "Nissan", "Skyline GT-R34 V-Spec II Nür", "450 HP", "2",
                "Manuel", "Gasoline");
    }

    @Override
    public void information() {
        System.out.println("Production of the GT-R34 started in 1999 and continued until 2002. All GT-R34s were " +
                "built as 2-doors and all have manual transmissions. At the same time, all vehicles were produced " +
                "with right-hand drive, and later there were those who converted them to left-hand drive. It has 280 " +
                "horsepower from the factory. Nür models, released in 2002, were produced with 450 horsepower.");
    }
}
