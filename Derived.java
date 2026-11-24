class Base { 
int num = 100; 
} 
public class Derived extends Base { 
public static void main(String[] args) { 
Derived d = new Derived(); 
System.out.println(d.num); 
} 
}