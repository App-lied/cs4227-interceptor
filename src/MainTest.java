public class MainTest {
    public static void main(String[] args) {
        
        RentalDispatcher myDispatcher = new RentalDispatcher();
        RentalInterceptor myInterceptor = new RentalInterceptor() {
            public void onRentalAdded(TransactionInfo context) {
                System.out.println("Customer " + context.getCustomerName()
                    + " rented movie " + context.getMovieTitle() 
                    + " for " + context.getDaysRented() + " days.");
            }
        };
        myDispatcher.registerRentalInterceptor(myInterceptor);

        Movie mov = new Movie("title", 0);
        Movie mov2 = new Movie("title2", 1);

        Customer cust = new Customer("Alan");

        Rental rent = new Rental(mov, 5);
        Rental rent2 = new Rental(mov2, 67);


        cust.addRental(rent);
        TransactionInfo t = new TransactionInfo(cust, rent);
        myDispatcher.onRentalAdded(t);
        
        cust.addRental(rent2);
        TransactionInfo t2 = new TransactionInfo(cust, rent2);
        myDispatcher.onRentalAdded(t2);
    
    }
}