class MountainBike extends BicycleImpl {
    String colour = "black";
    String name;

    public void addName(String newValue) {
        name = newValue;
    }

    public void applyColour(String newValue) {
        colour = newValue;
    }

    @Override
    public void retrieveStates() {
           IO.println(
            """
                Bicycle Name: %s
                Bicycle Speed: %s
                Bicycle Cadence: %s
                Bicycle Gear: %s
                Bicycle Colour: %s
                
            """.formatted(name, bicycleSpeed, bicycleCadence, bicycleGear, colour)
        );
    }
}
