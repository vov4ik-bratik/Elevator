package model;

import constant.Const;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vs on 08.03.17.
 */
public class Elevator extends MovingObjects {

    private final int elevatorId;
    private final int capacity;
    private int currentLoad;
    private List<Passenger> elevatedPassenger;

    public Elevator(boolean isFreight, int id) {

        elevatorId = id;
        currentLoad = 0;

        super.setDestinationPos(getCurrentPos());

        elevatedPassenger = new ArrayList<>();

        if(!isFreight)
            this.capacity = Const.PASSENGER_ELEVATOR_CAPACITY;
        else
            capacity = Const.FREIGHT_ELEVATOR_CAPACITY;

    }


    public int getElevatorId() {
        return elevatorId;
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
