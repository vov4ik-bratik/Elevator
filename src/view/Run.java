package view;

import constant.Const;
import controller.BuildingMamagement;
import controller.ElevatorStartTread;
import controller.PassengerCreatingThread;
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


//        PassengerCreatingThread passengerCreatingThread = new PassengerCreatingThread();
//        ElevatorStartTread elevatorStartTread = new ElevatorStartTread();
//
//        passengerCreatingThread.start();
//        elevatorStartTread.start();

//        for (int i = 0; i < 6; i++) {
//            BuildingMamagement.getInstance().createPassenger();
//        }
//
//        BuildingMamagement.getInstance().allElevatorsStarts();



    }
}
