public class MainTest {
    public static void main(String[] args) {
        Movie mov = new Movie("title", 0);
        Movie mov2 = new Movie("title2", 1);
        Rental rent = new Rental(mov, 5);
        Rental rent2 = new Rental(mov2, 67);

        Customer cust = new Customer("Alan");

        cust.addRental(rent);
        cust.addRental(rent2);

        String statement = cust.statement();

        System.out.println(statement);
    }
}