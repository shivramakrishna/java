
class animal{
    String name;
public void eat(){
 System.out.println("I can eat");
}
    
} 
class Dog extends animal{
    public void display(){
        System.out.println("My name is " + name);
    }
}
class menu {
    public static void main(String[] args) {
    
Dog labrDog = new Dog();
labrDog.name="bob";
labrDog.display();
labrDog.eat();        
    }
}
