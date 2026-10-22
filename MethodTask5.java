public class MethodTask5 {

    public int Show(int a ) {
        return (int ) a;

    }
    public static void main(String[] args) {
        MethodTask5 m5 = new MethodTask5();

        int ans = m5.Show('A');
        System.out.println(ans);
        
    }
}
