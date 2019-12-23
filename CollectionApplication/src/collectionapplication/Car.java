
package collectionapplication;

import java.util.ArrayList;
import java.util.List;

public class Car extends VehicleAbstract implements Drivable{
    private int BikeId;
    private String BikeName;
    private String startingBy;
    public String stoppingBy;
    public Seat seat; 
    
    public Car(int id, String name, String vehicleType, String start, String stop, boolean HasEngine){
       super(id,name,vehicleType,HasEngine);
       this.BikeId = id;
       this.BikeName = name; 
       this.startingBy = start;
       this.stoppingBy = stop;
       
    }
     public String[] getTyres(){
         String[] tyre = new String[4];
         tyre[0] = "hello";
         tyre[1] = "how";
         tyre[2] = "are";
         tyre[3] = "you";
         return tyre;
     }
     public Tyres[] carTyres(){
         Tyres tyre1 = new Tyres(1, "hello!");
         Tyres tyre2 = new Tyres(2, "how");
         Tyres tyre3 = new Tyres(3, "are");
         Tyres tyre4 = new Tyres(4, "you");
         Tyres[] tyre = new Tyres[4];
         tyre[0] = tyre1;
         tyre[1] = tyre2;
         tyre[2] = tyre3;
         tyre[3] = tyre4;
         return tyre;
     }
    public void start(){
        this.startingBy = "Use kick";
    }
    @Override
    public void stop() {
       this.stoppingBy = "Use kick";
    }
    @Override
     public void setSeat(Seat seat){
        this.seat = seat; 
     }
     @Override
     public Seat getSeat(){
        return this.seat;
     }

    @Override
    public void drive() {
        
    }

    @Override
    public boolean canStop() {
       return false; 
    }
     @Override
    public ArrayList<Seat> vehicleChairs() {
       ArrayList ls = new ArrayList<>();
       Seat st;
       for(int i = 0; i < 11; i+=1){
           st = new Seat();
           st.seatId = i;
           st.seatColor = "yellow" + i;
           ls.add(st);
       }
       return ls;
    }
     public void displayCar(){
        System.out.println("Bike Id:" + this.BikeId );
        System.out.println("Bike name:" + this.BikeName );
        System.out.println("Starting By:" + this.startingBy);
        System.out.println("Stopping By: " + this.stoppingBy);
        System.out.println("manufacture Name: " + this.manufactureName);
        System.out.println("vehicle type: " + this.vehicleType);
        System.out.println("Does it have engine?: " + this.HasEngine);
        System.out.println("seat id : " + this.getSeat().seatId);
        System.out.println("seat color: " + this.getSeat().seatColor);
//        System.out.println("get tyres :" + this.carTyres());
    }

   
}
