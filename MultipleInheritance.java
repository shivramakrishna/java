class Animal2{ 
        public void eat(){
System.out.println("Animal is eating.");
         }
        }
class Vehicle{
    public void drive(){
        System.out.println("Vehicle is driving.");
    }
}
class Animal2Vehicle{
    private Animal2 animal2;
    private Vehicle vehicle;
    public Animal2Vehicle(){
        animal2 = new Animal2();
        vehicle = new Vehicle();
    } 
    public void eat(){
        animal2.eat();
    } 
    public void drive(){
        vehicle.drive();
    }
}  
public class MultipleInheritance{
    public static void main(String[] args) {
        Animal2Vehicle animal2Vehicle = new Animal2Vehicle();
        animal2Vehicle.eat();
        animal2Vehicle.drive();
    }
    }

