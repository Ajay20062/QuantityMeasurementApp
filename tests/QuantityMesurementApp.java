class QuantityMeasurementAppTest {

    @Test
    void givenSameValue_whenCompared_thenShouldBeEqual() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(f1.equals(f2), "1.0 ft should equal 1.0 ft");
    }

    @Test
    void givenDifferentValue_whenCompared_thenShouldNotBeEqual() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(2.0);

        assertFalse(f1.equals(f2), "1.0 ft should not equal 2.0 ft");
    }

    @Test
    void givenNull_whenCompared_thenShouldReturnFalse() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertFalse(f1.equals(null), "Comparison with null should be false");
    }

    @Test
    void givenSameReference_whenCompared_thenShouldReturnTrue() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(f1.equals(f1), "Same reference should be equal");
    }

    @Test
    void givenDifferentType_whenCompared_thenShouldReturnFalse() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertFalse(f1.equals("1.0"), "Different type should not be equal");
    }
}
