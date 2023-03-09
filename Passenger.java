public class Passenger {
    
    private String name;

public Passenger(String name) {
     this.name = name;
    }
public String get_Passenger_Name() {
    return this.name; 
} 
public void boardCar(Car c){
try {
    c.addPassenger(this); 
}catch (Exception e){
    System.err.println(e.getMessage()); 
}}

public void removePassenger(Car c){
    try {
        c.removePassenger(this); 
    }catch (Exception e){
        System.err.println(e.getMessage()); 
    }



}
}
