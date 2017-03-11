package controller;

import constant.Const;
import model.Building;
import model.Elevator;
import model.Passenger;

/**
 * Created by vs on 10.03.17.
 */
public class BuildingMamagement extends Thread {

    private static final BuildingMamagement BUILDING_MAMAGEMENT = new BuildingMamagement();

    private Building building;


    private BuildingMamagement(){
        this.building = new Building();
    }

    public static BuildingMamagement getInstance(){
        return BUILDING_MAMAGEMENT;
    }

    public Building getBuilding() {
        return building;
    }

    public void createPassenger() {
        getBuilding().createPassenger();
    }


    public void elevatorStart(Elevator elevator){
        getBuilding().elevatorStart(elevator);
    }


    public void allElevatorsStarts(){


        //all this threads work serial!!! They shoul work concurrent

        elevatorStart(getBuilding().getElevatorById(Const.FREIGHT_ELEVATOR_ID));
//        elevatorStart(getBuilding().getElevatorById(Const.FIRST_PASSENGER_ELEVATOR_ID));
//        elevatorStart(getBuilding().getElevatorById(Const.SECOND_PASSENGER_ELEVATOR_ID));
    }

}
