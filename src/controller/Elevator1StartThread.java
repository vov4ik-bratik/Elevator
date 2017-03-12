package controller;

import constant.Const;


public class Elevator1StartThread extends Thread {

    @Override
    public void run() {
        BuildingMamagement.getInstance().elevatorStart(BuildingMamagement.getInstance().getBuilding().getElevatorById(Const.FREIGHT_ELEVATOR_ID));
    }
}
