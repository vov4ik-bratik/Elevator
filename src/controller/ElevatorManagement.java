package controller;

import model.Elevator;

/**
 * Created by vs on 10.03.17.
 */
public class ElevatorManagement implements ElevatorManager {

    @Override
    public void elevatorStar(Elevator elevator) {

    }

    @Override
    public void moveUp(Elevator elevator) {
        elevator.moveUp();
    }

    @Override
    public void moveDown(Elevator elevator) {
        elevator.moveDown();
    }

    @Override
    public void doorsOpen(Elevator elevator) {
        elevator.openDoors();
    }

    @Override
    public void doorsClosed(Elevator elevator) {
        elevator.closeDoors();
    }

    @Override
    public void passengerIn(Elevator elevator) {
    }

    @Override
    public void passengerOut(Elevator elevator) {

    }
}
