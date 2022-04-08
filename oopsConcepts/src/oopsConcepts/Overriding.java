package oopsConcepts;

class MyVehicle{
void run(){

	System.out.println("It's a running vehicle");}
}
class Overriding extends MyVehicle{
 public static void main(String args[]){
Overriding obj = new Overriding();
obj.run();
}
}