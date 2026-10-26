public class AnimalConstructor {
    public AnimalConstructor() {
        System.out.println("Animal Is :");
    }

    public AnimalConstructor(String n) {
        this();
        System.out.println("Cat");
    }

    public static void main(String[] args) {
        AnimalConstructor ac = new AnimalConstructor("Cat");
    }
}