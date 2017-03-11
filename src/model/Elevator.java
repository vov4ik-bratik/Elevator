package model;

import constant.Const;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vs on 08.03.17.
 */
public class Elevator extends MovingObjects {

    private final int elevatorId;
    private boolean isStarted = false;
    private final int capacity;
    private int currentLoad;
    private List<Passenger> elevatedPassenger;

    public Elevator(int id, int capacity) {

        super.setDestinationPos(getCurrentPos());
        elevatorId = id;
        this.capacity = capacity;
        currentLoad = 0;
        elevatedPassenger = new ArrayList<>();

    }


    public int getElevatorId() {
        return elevatorId;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public List<Passenger> getElevatedPassenger() {
        return elevatedPassenger;
    }


    public void setStarted(boolean started) {
        isStarted = started;
    }

    public void setCurrentLoad(int load) {
        this.currentLoad += load;
    }


    public String toString() {
        return "Elevator{" +
                "capacity: " + capacity +
                ", current load: " + currentLoad +
                ", current position: " + getCurrentPos() +
                ", destination position: " + getDestinationPos() +
                '}';
    }


    public void openDoors(){

        try {
                Thread.sleep(Const.ELEVATOR_DOORS_OPEN_CLOSE_TIME_ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("dooors opened");

    }

    public void closeDoors(){

        try {
            Thread.sleep(Const.ELEVATOR_DOORS_OPEN_CLOSE_TIME_ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("dooors closed");
    }


    public void passengerIn(Passenger passenger) {

        currentLoad += passenger.getWeight();
        elevatedPassenger.add(passenger);
    }

    public void passengerOut(Passenger passenger) {

        currentLoad -= passenger.getWeight();
        elevatedPassenger.remove(passenger);
    }
}
