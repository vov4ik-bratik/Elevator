package model;

/**
 * Created by vs on 08.03.17.
 */
abstract class MovingObjects {

    int currentPos;
    private int destinationPos;

    abstract void moveUp();
    abstract void moveDown();

    abstract void passengerIn();
    abstract void passengerOut();
}
