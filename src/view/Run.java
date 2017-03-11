package view;

import constant.Const;
import controller.BuildingMamagement;
import model.Elevator;
import model.Passenger;

import java.util.List;
import java.util.Map;

public class Run //extends Thread /*extends Application*/
 {

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Elevator");
//        primaryStage.setScene(new Scene(root, 900, 600));
//        primaryStage.show();
//    }


    public static void main(String[] args){
       // launch(args);

        System.out.println(BuildingMamagement.getInstance().getBuilding().getElevatorById(Const.FREIGHT_ELEVATOR_ID));
        System.out.println(BuildingMamagement.getInstance().getBuilding().getElevatorById(Const.FIRST_PASSENGER_ELEVATOR_ID));
        System.out.println(BuildingMamagement.getInstance().getBuilding().getElevatorById(Const.SECOND_PASSENGER_ELEVATOR_ID));
        System.out.println("********************************");


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    BuildingMamagement.getInstance().createPassenger();

                    try {
                        Thread.sleep(Const.NEW_PASSENGER_GENERATE_TIME_ms);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                BuildingMamagement.getInstance().allElevatorsStarts();
            }
        });

        thread2.start();

    }

}
