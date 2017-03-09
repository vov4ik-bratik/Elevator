import model.Passenger;
import utilities.RandomDigitsGenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Thread /*extends Application*/ {

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Elevator");
//        primaryStage.setScene(new Scene(root, 900, 600));
//        primaryStage.show();
//    }


    public static void main(String[] args){
       // launch(args);

        for (int i = 0; i < 3; i++) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Passenger p = new Passenger();
            System.out.println(p.toString());

            System.out.println("*************************************");


        }



    }
}
