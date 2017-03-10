package model;

import constant.Const;
import utilities.RandomDigitsGenerator;

/**
 * Created by vs on 08.03.17.
 */
public class Passenger extends MovingObjects{

    private final int weight;
    private final int elevatorId;


    public int getWeight() {
        return weight;
    }

    public int getElevatorId() {
        return elevatorId;
    }


    public Passenger() {

        weight = RandomDigitsGenerator.generator(Const.PASSENGER_MIN_WEIGHT, Const.PASSENGER_MAX_WEIGHT);
        elevatorId = RandomDigitsGenerator.generator(Const.FREIGHT_ELEVATOR_ID, Const.SECOND_PASSENGER_ELEVATOR_ID);
    }

    @Override
    public String toString() {
        return "Passenger: " +
                "\nelevator id: " + elevatorId +
                "\ncurrent position: " + getCurrentPos() + " floor" +
                "\ndestination: " + getDestinationPos() + " floor" +
                "\nweight: " + weight + "kg";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Passenger passenger = (Passenger) o;

        if (weight != passenger.weight) return false;
        return elevatorId == passenger.elevatorId;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + weight;
        result = 31 * result + elevatorId;
        return result;
    }

    //void passengerIn() { }


    //void passengerOut() { }
}
