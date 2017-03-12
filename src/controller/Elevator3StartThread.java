package controller;

import constant.Const;

public class Elevator3StartThread extends Thread {

    public void run() {
        BuildingMamagement.getInstance().elevatorStart(BuildingMamagement.getInstance().getBuilding().getElevatorById(Const.SECOND_PASSENGER_ELEVATOR_ID));
    }
}
