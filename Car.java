import java.util.ArrayList ;
public class Car {

private ArrayList<Passenger> PassengerList ;
private int Carmaximumcapacity ;

public Car( int Carmaximumcapacity) {
    this.Carmaximumcapacity= Carmaximumcapacity; 
    this.PassengerList= new ArrayList<Passenger>(PassengerList); 
}

public int getCapacity() {
    return this.Carmaximumcapacity;
}

public int seatsRemaining(){
    return (this.Carmaximumcapacity - this.PassengerList.size()) ;
}


public void addPassenger(Passenger p) {
    if(this.seatsRemaining()== 0) {
        throw new RuntimeException ("This Car is Full"); 
    }else if (this.PassengerList.contains(p)) {
        throw new RuntimeException( " This passanger is already onboard "); 
    }    
     else {
        this.PassengerList.add(p);
        this.seatsRemaining();
     }
    }
    public void removePassenger(Passenger p) {
        if(this.PassengerList.contains(p) == false) {
            throw new RuntimeException ("The passanger is not onboard"); 
        }   
         else {
            this.PassengerList.remove(p);
            this.seatsRemaining();
         }
        }
    public void printManifest (){ 
        for ( int i=0; i<this.PassengerList.size();i++ ){
            System.out.println (PassengerList.get(i).get_Passenger_Name()) ;
        }
        if(PassengerList.size()==0){
            System.out.println("This car is Empty"); 
        }
    }

}















