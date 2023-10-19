package Practice2;

public interface CarFeatures2 {

    void history();

    default void example2() {
        System.out.println("This method has same features with a non abstract method in an abstract class. " +
                "If we create a method with body in an interface, we should add 'default' before return type. " +
                "If a method doesn't has to be implemented by child classes we should add 'default' before return type.");
    }
}
