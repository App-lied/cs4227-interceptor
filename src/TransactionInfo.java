//Context Object
public class TransactionInfo {
    private Customer customer;
    private Rental rental;

    public TransactionInfo(Customer c, Rental r) {
        customer = c;
        rental = r;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public String getMovieTitle() {
        return rental.getMovie().getTitle();
    }

    public int getDaysRented() {
        return rental.getDaysRented();
    }

}
