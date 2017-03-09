package model;

import constant.Const;
import utilities.RandomDigitsGenerator;

/**
 * Created by vs on 08.03.17.
 */
public class Passenger extends MovingObjects{

    private final int startPos;

    private final int weight;


    public int getStartPos() {
        return startPos;
    }

    public int getWeight() {
        return weight;
    }


    public Passenger() {

        weight = RandomDigitsGenerator.generator(Const.PASSENGER_MIN_WEIGHT, Const.PASSENGER_MAX_WEIGHT);

        this.startPos = RandomDigitsGenerator.generator(Const.BUILDING_FIRST_FLOORS, Const.BUILDING_LAST_FLOORS);

        super.setCurrentPos(startPos);

        do {

            setDestinationPos(RandomDigitsGenerator.generator(Const.BUILDING_FIRST_FLOORS, Const.BUILDING_LAST_FLOORS));

        } while (getDestinationPos() == startPos);

    }

    @Override
    public String toString() {
        return "Passenger: " +
                "\nstart position: " + startPos + " floor" +
                "\ncurrent position: " + getCurrentPos() + " floor" +
                "\ndestination: " + getDestinationPos() + " floor" +
                "\nweight: " + weight + "kg";
    }

    @Override
    void passengerIn() {

    }

    @Override
    void passengerOut() {

    }
}
