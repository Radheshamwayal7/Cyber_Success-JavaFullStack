class Parent1 { 
    protected void display() { 
        System.out.println("Parent"); 
    } 
} 
class Child1 extends Parent1 { 
    public void display() { 
        System.out.println("Child"); 
    } 
    public static void main(String[] args) { 
        Child1 c = new Child1(); 
        c.display(); 
    } 
}