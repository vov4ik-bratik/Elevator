package model;

import constant.Const;
import utilities.RandomDigitsGenerator;

/**
 * Created by vs on 08.03.17.
 */

abstract class MovingObjects extends Thread{

    private int currentPos;
    private int destinationPos;

    public MovingObjects() {

        currentPos = RandomDigitsGenerator.generator(Const.BUILDING_FIRST_FLOORS, Const.BUILDING_LAST_FLOORS);

        do {
            destinationPos = RandomDigitsGenerator.generator(Const.BUILDING_FIRST_FLOORS, Const.BUILDING_LAST_FLOORS);

        } while (getDestinationPos() == currentPos);
    }


    public int getCurrentPos() { return currentPos; }

    public int getDestinationPos() {
        return destinationPos;
    }


    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    public void setDestinationPos(int destinationPos) {
        this.destinationPos = destinationPos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovingObjects)) return false;

        MovingObjects that = (MovingObjects) o;

        if (currentPos != that.currentPos) return false;
        return destinationPos == that.destinationPos;
    }

    @Override
    public int hashCode() {
        int result = currentPos;
        result = 31 * result + destinationPos;
        return result;
    }

    public void moveUp(){

        if(currentPos >= Const.BUILDING_LAST_FLOORS)
            return;
        else ++currentPos;

        try {
            Thread.sleep(Const.ELEVATE_TIME_PER_FLOOR_ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("move up");

    }


    public void moveDown(){

        if(currentPos <= Const.BUILDING_FIRST_FLOORS)
            return;
        else --currentPos;

        try {
            Thread.sleep(Const.ELEVATE_TIME_PER_FLOOR_ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("move down");
    }

}
