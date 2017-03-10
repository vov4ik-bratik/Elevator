package view;

import controller.BuildingMamagement;
import model.Passenger;

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

        while (true) {

            BuildingMamagement.getInstance().createPassenger();

        }
    }
}
