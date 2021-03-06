package controller;

import model.Building;
import model.Elevator;


public class BuildingMamagement extends Thread {

    private static final BuildingMamagement BUILDING_MAMAGEMENT = new BuildingMamagement();

    private Building building;


    private BuildingMamagement(){
        this.building = new Building();
    }

    public static BuildingMamagement getInstance(){
        return BUILDING_MAMAGEMENT;
    }

    Building getBuilding() {
        return building;
    }

    void createPassenger() {
        getBuilding().createPassenger();
    }

    void elevatorStart(Elevator elevator){
        getBuilding().elevatorStart(elevator);
    }


    public void startSimulation(){

        Elevator1StartThread firstElevator  = new Elevator1StartThread();
        Elevator2StartThread secondElevator = new Elevator2StartThread();
        Elevator3StartThread thirdElevator  = new Elevator3StartThread();

        PassengerCreatingThread createPassengers = new PassengerCreatingThread();

        createPassengers.start();

        firstElevator.start();
        secondElevator.start();
        thirdElevator.start();

    }

}
