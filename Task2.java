public class Task2 {
    public static void main(String[] args) {
        
        char ch = '9';

        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("CH is Alphabet .");

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The alphabet is Vowel");
            }
            else {
                System.out.println("Consonant.");
            }

        }
            else if (ch >= '0' && ch <= '9') {
                System.out.println("The Digit Is found .");

                if ( ch%2==0) {
                    System.out.println("Even .");
                }
                else {
                    System.out.println("Odd");
                }
            }
            else{
                System.out.println("Hello java , Special Character is found.");
            }
             
        }
    }

