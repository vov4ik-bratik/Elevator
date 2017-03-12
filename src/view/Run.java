package view;

import controller.BuildingMamagement;

public class Run /*extends Application*/
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

        BuildingMamagement.getInstance().startSimulation();



    }
}
