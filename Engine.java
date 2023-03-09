public class Engine {

private FuelType f ; 
private double Currentfuellevel ;
public double Maximumfuellevel ; 

Engine(FuelType f, double fuel) {
    this.f= f;
    this.Currentfuellevel = fuel ; 
    this.Maximumfuellevel= fuel ;
}

public FuelType getf(){
    return f;
}
public double getCurrentfuellevel(){
    return Currentfuellevel;
}
public double Maximumfuellevel(){
    return Maximumfuellevel;
}

public void refuel() {
    this.Currentfuellevel = this.Maximumfuellevel ;

}

public void go(){
    if(Currentfuellevel > 0 ){
        this.Currentfuellevel-= 10;} 
    else{ 
        throw new RuntimeException ("Fuel Level is "+ this.Currentfuellevel );
    }
}
}


