class Parent { 
public void display() { 
System.out.println("Parent"); 
} 
} 
class Child extends Parent { 
    protected void display() { 
        System.out.println("Child"); 
    } 
} 