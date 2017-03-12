package controller;

import constant.Const;
import model.Building;
import model.Elevator;

/**
 * Created by vs on 11.03.17.
 */
public class Elevator1StartThread extends Thread {

    @Override
    public void run() {
        BuildingMamagement.getInstance().elevatorStart(BuildingMamagement.getInstance().getBuilding().getElevatorById(Const.FREIGHT_ELEVATOR_ID));
    }
}
