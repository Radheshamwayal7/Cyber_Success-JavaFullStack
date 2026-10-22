public class MethodTask7 {

    public String Show() {
        int n = 10;

        if(n == 0) {
            return "The No Is Zero";
        }
        else if (n % 2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        MethodTask7 m7 = new MethodTask7();

        String ans = m7.Show();
        System.out.println(ans);
    }
}
