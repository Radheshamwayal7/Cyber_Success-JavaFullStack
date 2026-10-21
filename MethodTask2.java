public class MethodTask2 {

    public void Show() {
        int n = 10;
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
            
        }

        System.out.println("The Factorial Is :" + fact);
    }
    public static void main(String[] args) {
        
        MethodTask2 m2 = new MethodTask2();

        m2.Show();
    }
}
