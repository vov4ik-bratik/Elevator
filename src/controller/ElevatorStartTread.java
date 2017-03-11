package controller;

/**
 * Created by vs on 11.03.17.
 */
public class ElevatorStartTread extends Thread {
    @Override
    public void run() {
        BuildingMamagement.getInstance().allElevatorsStarts();
    }
}
