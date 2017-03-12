package controller;

import constant.Const;

public class Elevator2StartThread extends Thread{

    public void run() {
        BuildingMamagement.getInstance().elevatorStart(BuildingMamagement.getInstance().getBuilding().getElevatorById(Const.FIRST_PASSENGER_ELEVATOR_ID));
    }

}
