package controller;

import model.Elevator;

/**
 * Created by vs on 10.03.17.
 */
public interface ElevatorManager {

    void moveUp(Elevator elevator);
    void moveDown(Elevator elevator);

    void doorsOpen(Elevator elevator);
    void doorsClosed(Elevator elevator);

    void passengerIn(Elevator elevator);
    void passengerOut(Elevator elevator);
}
