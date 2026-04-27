import java.util.Scanner;

public class QuantityMeasurementApp {

    // Inner class representing Feet
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {

            // Reflexive check
            if (this == obj) return true;

            // Null and type check
            if (obj == null || getClass() != obj.getClass()) return false;

            Feet other = (Feet) obj;

            // Floating point comparison
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Main method (for manual testing)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Feet f1 = new Feet(input.nextDouble());
        Feet f2 = new Feet(input.nextDouble());

        System.out.println("Are equal? " + f1.equals(f2));
    }
}
