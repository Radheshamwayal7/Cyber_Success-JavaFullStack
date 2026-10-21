public class MethodTask1 {
    public void Show() {
        int n = 10;

        int sq = n * n;

        int cube = n * n * n;

       System.out.println("Square Is :" + sq);
       System.out.println("Cube Is :" + cube);
    }
    public static void main(String[] args) {
        MethodTask1 m1 = new MethodTask1();

        m1.Show();
    }
}
