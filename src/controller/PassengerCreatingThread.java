package controller;

import constant.Const;


public class PassengerCreatingThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; ; i++) {

            BuildingMamagement.getInstance().createPassenger();

            try {
                Thread.sleep(Const.NEW_PASSENGER_GENERATE_TIME_ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
