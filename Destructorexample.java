import static java.lang.System.*;
public class Destructorexample {
    // Method for division
    float division(int  x, int y) {
        return x / y;
    }

    // Overriding finalize() method
    @Override
    protected void finalize() throws Throwable {
        try {
            out.println("This is the end of the program.");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        Destructorexample de = new Destructorexample();

        // Performing the division operation
        out.println("Result: " + de.division(455, 5));

        // Setting the object reference to null to encourage garbage collection
        de = null;

        // Suggesting garbage collection (not guaranteed to invoke finalize immediately)
        System.gc();
    }
}
