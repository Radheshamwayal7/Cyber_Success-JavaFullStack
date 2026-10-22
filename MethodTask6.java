public class MethodTask6 {
    public int Show() {
        int n = 1234;
        int reverse = 0;

        while(n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        
        MethodTask6 m6 = new MethodTask6();
        int ans = m6.Show();
        System.out.println(ans);
    }
}
