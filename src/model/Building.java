package model;

import constant.Const;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vs on 09.03.17.
 */
public class Building {

    private final int floors = Const.BUILDING_LAST_FLOORS;
    private final List<Elevator>elevators;
    private Map <Integer, List<Passenger>> passengers;


    public Building() {

        this.elevators = new ArrayList<>(3);
        elevators.add(new Elevator(true, Const.FREIGHT_ELEVATOR_ID));
        elevators.add(new Elevator(false, Const.FIRST_PASSENGER_ELEVATOR_ID));
        elevators.add(new Elevator(false, Const.SECOND_PASSENGER_ELEVATOR_ID));

        this.passengers = new HashMap<>(3);
        passengers.put(Const.FREIGHT_ELEVATOR_ID, new ArrayList<>());
        passengers.put(Const.FIRST_PASSENGER_ELEVATOR_ID, new ArrayList<>());
        passengers.put(Const.SECOND_PASSENGER_ELEVATOR_ID, new ArrayList<>());
    }


    public int getFloors() {
        return floors;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public Map<Integer, List<Passenger>> getPassengers() {
        return passengers;
    }

    public void createPassenger(){

        Passenger passenger = new Passenger();
        passengers.get(passenger.getElevatorId()).add(passenger);
    }

    public void removePassenger(Passenger passenger){
        passengers.get(passenger.getElevatorId()).remove(passenger);
    }
}
