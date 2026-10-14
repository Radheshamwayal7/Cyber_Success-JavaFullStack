import java.util.Scanner;

public class SumOfAllEven15to25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Between 15 to 25 :");
        int num = sc.nextInt();

        for(int i = 0; i <= 25; i++) {
            if(i % 2 == 0) {
                num = num + i;
                System.out.println(num);
            }
        }
        sc.close();
    }
}
