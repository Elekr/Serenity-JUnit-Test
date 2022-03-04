package serenitygoogle;

public class TestData {
    static final String API = "https://jsonplaceholder.typicode.com/todos/1";

    static final String MODIFIED_HINT = "These include metallic paint, spoilers, alloy wheels, roof bars, side stripes and parking sensors.";
    static final String HEADER = "About the car";

    static final String DIRECTLINE_URL = "https://www.directline.com/car/quote/your-car";
    static final String TEST_REG = "GF21 WSN";

    static final int TEST_CAR_VALUE = 70000;

    public enum Keeper{
        YOU("You (proposer)");


        private final String value;

        Keeper(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
