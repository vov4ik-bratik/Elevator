package model;

import constant.Const;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vs on 08.03.17.
 */
public class Elevator extends MovingObjects {

    private final int capacity;
    private int currentLoad;

    private List<Passenger> elevatedPassenger;


    public int getCapacity() {
        return capacity;
    }


    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }


    public Elevator() {

        currentLoad = 0;

        //create a proper constructor which can choose elevator type and set capacity
        capacity = Const.PASSENGER_ELEVATOR_CAPACITY;

        elevatedPassenger = new ArrayList<>();
    }

    public void openDoors(){
        try {
            wait(1000);
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void closeDoors(){
        try {
            wait(1000);
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    void passengerIn() {

    }

    @Override
    void passengerOut() {

    }
}