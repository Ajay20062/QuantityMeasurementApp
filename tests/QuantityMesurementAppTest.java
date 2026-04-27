import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void givenFeetToFeetSameValue_shouldBeEqual() {
        assertTrue(new QuantityMeasurementApp.Quantity(1.0, LengthUnit.FEET)
                .equals(new QuantityMeasurementApp.Quantity(1.0, LengthUnit.FEET)));
    }

    @Test
    void givenInchToInchSameValue_shouldBeEqual() {
        assertTrue(new QuantityMeasurementApp.Quantity(1.0, LengthUnit.INCH)
                .equals(new QuantityMeasurementApp.Quantity(1.0, LengthUnit.INCH)));
    }

    @Test
    void givenFeetToInchEquivalent_shouldBeEqual() {
        assertTrue(new QuantityMeasurementApp.Quantity(1.0, LengthUnit.FEET)
                .equals(new QuantityMeasurementApp.Quantity(12.0, LengthUnit.INCH)));
    }

    @Test
    void givenInchToFeetEquivalent_shouldBeEqual() {
        assertTrue(new QuantityMeasurementApp.Quantity(12.0, LengthUnit.INCH)
                .equals(new QuantityMeasurementApp.Quantity(1.0, LengthUnit.FEET)));
    }

    @Test
    void givenDifferentValues_shouldNotBeEqual() {
        assertFalse(new QuantityMeasurementApp.Quantity(1.0, LengthUnit.FEET)
                .equals(new QuantityMeasurementApp.Quantity(2.0, LengthUnit.FEET)));
    }

    @Test
    void givenNullComparison_shouldReturnFalse() {
        QuantityMeasurementApp.Quantity q =
                new QuantityMeasurementApp.Quantity(1.0, LengthUnit.FEET);

        assertFalse(q.equals(null));
    }

    @Test
    void givenSameReference_shouldReturnTrue() {
        QuantityMeasurementApp.Quantity q =
                new QuantityMeasurementApp.Quantity(1.0, LengthUnit.FEET);

        assertTrue(q.equals(q));
    }

    @Test
    void givenInvalidUnit_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () ->
                new QuantityMeasurementApp.Quantity(1.0, null));
    }
}
