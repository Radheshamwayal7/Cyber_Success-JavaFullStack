class Task {
    public static void main(String[] args) {
        
        char ch = 'A';

       if(ch >= 'A' && ch <= 'Z') {
        System.out.println("UpperCase .");
       }
       else if (ch >= 'a' && ch <= 'z' ) {
        System.out.println("LowerCase .");
       }
       else if (ch >= '0' && ch <= '9') {
        System.out.println("This Is Digit .");
       }
       else {
        System.out.println("Special Character .");
       }
    }
}