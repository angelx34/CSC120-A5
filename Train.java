import java.util.ArrayList;
public class Train {
private final Engine engine; 
private ArrayList<Car> cars_currently_attached;

public Train(FuelType f,double fuel,int nCars, int Carmaximumcapacity ){
    this.engine= new Engine (f, fuel); 
    this.cars_currently_attached= new ArrayList<Car>();
    for (int i=0; i<nCars; i++){
        this.cars_currently_attached.add(new Car(Carmaximumcapacity));
    }
}
public Engine getEngine() {
    return this.engine;
}
public Car getCar(int i) {
    if (i>cars_currently_attached.size()) {
        throw new RuntimeException("'i' value is out of range! The train doesn't have this many cars. It actually has" + cars_currently_attached.size() + "cars .");
    }
    return this.cars_currently_attached.get(i);
}

public int getMaxCapacity() {
    int getMaxCapacity_value= 0 ;
    for (int i=0; i<cars_currently_attached.size(); i++) {
        getMaxCapacity_value = getMaxCapacity_value + cars_currently_attached.get(i).getCapacity();
    }
    return getMaxCapacity_value;
}

public int seatsRemaining() {
    int seatsRemaining_value= 0;
    for (int i=0; i<cars_currently_attached.size();i++); {
        seatsRemaining_value = seatsRemaining_value + cars_currently_attached.get(i).seatsRemaining();
}
return seatsRemaining_value;
}
public void printManifest() {
    for (int i=0; i<this.cars_currently_attached.size();i++) {
        cars_currently_attached.get(i).printManifest(); 
    }
}







}
