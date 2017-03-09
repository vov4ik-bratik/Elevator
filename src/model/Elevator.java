package model;

/**
 * Created by vs on 08.03.17.
 */
public class Elevator extends MovingObjects {

    private int capacity;
    private int currentLoad;

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
