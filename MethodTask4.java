public class MethodTask4 {

    public float Avg( float a , float b , float c) {
        return ((a + b + c) / 3.0F);

    }
    public static void main(String[] args) {
        MethodTask4 m4 = new MethodTask4();

        m4.Avg(10, 20 , 30);
        float ans = m4.Avg(10, 20, 30);
        System.out.println("Average Is :" + ans);
    }
}