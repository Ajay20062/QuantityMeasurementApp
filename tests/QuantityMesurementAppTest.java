import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // 🔹 Feet Tests
    @Test
    void givenSameFeetValue_whenCompared_thenEqual() {
        assertTrue(QuantityMeasurementApp.areFeetEqual(1.0, 1.0));
    }

    @Test
    void givenDifferentFeetValue_whenCompared_thenNotEqual() {
        assertFalse(QuantityMeasurementApp.areFeetEqual(1.0, 2.0));
    }

    // 🔹 Inches Tests
    @Test
    void givenSameInchValue_whenCompared_thenEqual() {
        assertTrue(QuantityMeasurementApp.areInchesEqual(1.0, 1.0));
    }

    @Test
    void givenDifferentInchValue_whenCompared_thenNotEqual() {
        assertFalse(QuantityMeasurementApp.areInchesEqual(1.0, 2.0));
    }

    @Test
    void givenNullComparisonFeet_thenFalse() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(f.equals(null));
    }

    @Test
    void givenNullComparisonInches_thenFalse() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i.equals(null));
    }

    @Test
    void givenSameReferenceFeet_thenTrue() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f.equals(f));
    }

    @Test
    void givenDifferentTypeComparison_thenFalse() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i.equals("1.0"));
    }
}
