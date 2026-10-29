public class Son extends Father{
    public String Degree;

    public void show() {
        System.out.println(Degree);
    }

     public static void main(String[] args) {
        Son s = new Son();
        s.Car = "Supra";
        s.farm = "5 Acres";
        s.Surname = "Patil";
        s.Degree = "Graduation";

        s.info();
        s.Vehicle();
        s.show();
    }
}
