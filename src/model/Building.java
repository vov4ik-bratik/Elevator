package model;

import constant.Const;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vs on 09.03.17.
 */
public class Building {

    private int floors = Const.BUILDING_LAST_FLOORS;

    private final List<Elevator>elevators;

    private List<Passenger>passengers;



    public Building() {

        this.elevators = new ArrayList<>(3);

        elevators.add(new Elevator(true, Const.FREIGHT_ELEVATOR_ID));
        elevators.add(new Elevator(false, Const.FIRST_PASSENGER_ELEVATOR_ID));
        elevators.add(new Elevator(false, Const.SECOND_PASSENGER_ELEVATOR_ID));

    }

    public List<Elevator> getElevators() {
        return elevators;
    }
}
