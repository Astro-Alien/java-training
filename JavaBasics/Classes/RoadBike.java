
class RoadBike extends BicycleImpl {

    String name;

    public void addName(String newValue) {
        name = newValue;
    }

    @Override
    public void retrieveStates() {
        IO.println(
            """
                Bicycle Name: %s
                Bicycle Speed: %s
                Bicycle Cadence: %s
                Bicycle Gear: %s
            """.formatted(name, bicycleSpeed, bicycleCadence, bicycleGear)
        );
    }
}
