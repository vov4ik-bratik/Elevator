package controller;

import constant.Const;

/**
 * Created by vs on 11.03.17.
 */
public class PassengerCreatingThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {

            BuildingMamagement.getInstance().createPassenger();

            try {
                Thread.sleep(Const.NEW_PASSENGER_GENERATE_TIME_ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
