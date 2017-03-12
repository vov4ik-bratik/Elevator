package controller;

import constant.Const;

/**
 * Created by vs on 12.03.17.
 */
public class Elevator2StartThread extends Thread{

    public void run() {
        BuildingMamagement.getInstance().elevatorStart(BuildingMamagement.getInstance().getBuilding().getElevatorById(Const.FIRST_PASSENGER_ELEVATOR_ID));
    }

}
