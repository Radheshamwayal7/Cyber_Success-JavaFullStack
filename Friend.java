public class Friend {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Sham";
        p.setLens("Lenskart");

        System.out.println(p.name);
        System.out.println(p.getLens());
    }
}
