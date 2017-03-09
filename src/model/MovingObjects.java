package model;

import constant.Const;

/**
 * Created by vs on 08.03.17.
 */

abstract class MovingObjects {

    private int currentPos;
    private int destinationPos;

    public int getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    public int getDestinationPos() {
        return destinationPos;
    }

    public void setDestinationPos(int destinationPos) {
        this.destinationPos = destinationPos;
    }

    public void moveUp(int currentPosition){

        if(currentPosition >= Const.BUILDING_LAST_FLOORS)
            return;
        else ++currentPosition;
    }


    void moveDown(int currentPosition){
        if(currentPosition <= Const.BUILDING_FIRST_FLOORS)
            return;
        else --currentPosition;
    }

    abstract void passengerIn();
    abstract void passengerOut();
}
