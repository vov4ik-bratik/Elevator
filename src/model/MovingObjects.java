package model;

import constant.Const;

/**
 * Created by vs on 08.03.17.
 */

abstract class MovingObjects {

    int currentPos;
    private int destinationPos;



    public void moveUp(int currentPosition){

        if(currentPosition >= Const.BUILDING_FLOORS)
            return;
        else ++currentPosition;
    }


    void moveDown(int currentPosition){
        if(currentPosition <= 1)
            return;
        else --currentPosition;
    }

    abstract void passengerIn();
    abstract void passengerOut();
}
