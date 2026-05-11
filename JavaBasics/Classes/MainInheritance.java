
class MainInheritance {

    public static void main(String[] args) {
        // Basic inheritance and interface implementation.
        
        //super class
        BicycleImpl bicycleInstance = new BicycleImpl();

        bicycleInstance.changeCadence(2);
        bicycleInstance.speedUp(15);
        bicycleInstance.changeGear(3);
        bicycleInstance.applyBreaks(5);

        bicycleInstance.retrieveStates();

        // subclass
        MountainBike mountainBikeInstance = new MountainBike();

        mountainBikeInstance.changeCadence(3);
        mountainBikeInstance.speedUp(12);
        mountainBikeInstance.changeGear(4);
        mountainBikeInstance.applyBreaks(4);
        mountainBikeInstance.addName("Mountain Bike");
        mountainBikeInstance.applyColour("Red");

        mountainBikeInstance.retrieveStates();

        // subclass
        RoadBike roadBikeInstance = new RoadBike();

        roadBikeInstance.changeCadence(7);
        roadBikeInstance.speedUp(16);
        roadBikeInstance.changeGear(2);
        roadBikeInstance.applyBreaks(10);
        roadBikeInstance.addName("Road Bike");

        roadBikeInstance.retrieveStates();
    }
}
