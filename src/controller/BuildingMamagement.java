package controller;

import constant.Const;
import model.Building;
import model.Passenger;

/**
 * Created by vs on 10.03.17.
 */
public class BuildingMamagement {

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

        BuildingMamagement.getInstance().getBuilding().createPassenger();

        try {
            Thread.sleep(Const.NEW_PASSENGER_GENERATE_TIME_ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void removePassenger(Passenger passenger) {

        BuildingMamagement.getInstance().getBuilding().removePassenger(passenger);
    }
}
