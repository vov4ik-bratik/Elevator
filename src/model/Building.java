package model;

import constant.Const;

import java.util.*;

/**
 * Created by vs on 09.03.17.
 */
public class Building {

    private final int floors = Const.BUILDING_LAST_FLOORS;
    private Map <Elevator, List<Passenger>>elevatorsWithPassengers;


    public Building() {

        elevatorsWithPassengers = new HashMap<>();

        elevatorsWithPassengers.put(new Elevator(Const.FREIGHT_ELEVATOR_ID, Const.FREIGHT_ELEVATOR_CAPACITY), new ArrayList<>());
        elevatorsWithPassengers.put(new Elevator(Const.FIRST_PASSENGER_ELEVATOR_ID, Const.PASSENGER_ELEVATOR_CAPACITY), new ArrayList<>());
        elevatorsWithPassengers.put(new Elevator(Const.SECOND_PASSENGER_ELEVATOR_ID, Const.PASSENGER_ELEVATOR_CAPACITY), new ArrayList<>());
    }


    public int getFloors() {
        return floors;
    }

    public Map<Elevator, List<Passenger>> getElevatorsWithPassengers() {
        return elevatorsWithPassengers;
    }

    public void createPassenger(){

        Passenger passenger = new Passenger();
        System.out.println(passenger + "\n");

        for (Map.Entry<Elevator, List<Passenger>> entry : elevatorsWithPassengers.entrySet()) {
            if(entry.getKey().getElevatorId() == passenger.getElevatorId()){
                entry.getValue().add(passenger);
                break;
            }
        }
    }

    public List<Passenger> getPassengerList(int elevatorId){

        for (Map.Entry<Elevator, List<Passenger>> entry : elevatorsWithPassengers.entrySet()){
            if(entry.getKey().getElevatorId() == elevatorId){
                return entry.getValue();
            }
        }
        return null;
    }

    public void setPassengerList(int elevatorId, List<Passenger> passengers){

        for (Map.Entry<Elevator, List<Passenger>> entry : elevatorsWithPassengers.entrySet()){
            if(entry.getKey().getElevatorId() == elevatorId) {
                entry.setValue(passengers);
            }
        }
    }

    public Elevator getElevatorById(int id){

        for (Map.Entry<Elevator, List<Passenger>> entry : elevatorsWithPassengers.entrySet()){
            if(entry.getKey().getElevatorId() == id)
                return entry.getKey();
        }

        return null;
    }

    public void removePassenger(Passenger passenger){

        List<Passenger> passengers = new ArrayList<>();
        passengers.addAll(getPassengerList(passenger.getElevatorId()));
        passengers.remove(passenger);
        setPassengerList(passenger.getElevatorId(), passengers);
    }

    public void loadPassenger (Elevator elevator){
        elevator.openDoors();

        for (Passenger p: getPassengerList(elevator.getElevatorId())) {
            if(p.getCurrentPos() == elevator.getCurrentPos()){
                elevator.passengerIn(p);
                if(elevator.getCurrentLoad() > elevator.getCapacity()){
                    elevator.passengerOut(p);
                    break;
                }
            }
        }

        elevator.closeDoors();
    }

    public void elevatorStart(Elevator elevator){

        if(getPassengerList(elevator.getElevatorId()).size() > 0) {

            //go to "zero" passenger

            if(getPassengerList(elevator.getElevatorId()).get(0).getCurrentPos() > elevator.getCurrentPos()){

                do{
                    System.out.print("elevator id = " + elevator.getElevatorId() + " ");
                    elevator.moveUp();
                } while (elevator.getCurrentPos() != getPassengerList(elevator.getElevatorId()).get(0).getCurrentPos());

                }

                else if (getPassengerList(elevator.getElevatorId()).get(0).getCurrentPos() < elevator.getCurrentPos()){
                    do{
                        System.out.print("elevator id = " + elevator.getElevatorId() + " ");
                        elevator.moveDown();
                    } while (elevator.getCurrentPos() != getPassengerList(elevator.getElevatorId()).get(0).getCurrentPos());

                }


             loadPassenger(elevator);

            //deliver passenger

            if(elevator.getElevatedPassenger().get(0).getDestinationPos() > elevator.getCurrentPos()){
                elevator.moveUp();
            }







        }






    }

}
