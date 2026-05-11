class BicycleImpl implements Bicycle {

    int bicycleCadence = 0;
    int bicycleSpeed = 0;
    int bicycleGear = 1;

    public void changeCadence(int newValue) {
        bicycleCadence =  newValue;
    }

    public void speedUp(int newValue) {
        bicycleSpeed = newValue;
    }

    public void changeGear(int newValue) {
        bicycleGear = newValue;
    }

    public void applyBreaks(int newValue) {
        bicycleSpeed = bicycleSpeed - newValue;
    }

    public void retrieveStates() {
        IO.println(
            """
                Bicycle Speed: %s
                Bicycle Cadence: %s
                Bicycle Gear: %s
            """.formatted(bicycleSpeed, bicycleCadence, bicycleGear)
        );
    }
}
