public class Customer {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.Customer = "Ron";
        System.out.println(b.Customer);

        b.setAccNo(1221);
        System.out.println(b.getAccNo());
    }
}
