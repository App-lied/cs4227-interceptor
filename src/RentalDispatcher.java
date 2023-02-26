import java.util.ArrayList;

public class RentalDispatcher implements RentalInterceptor { 

	private ArrayList<RentalInterceptor> interceptors = new ArrayList<RentalInterceptor>();

	public void registerRentalInterceptor(RentalInterceptor i) {
		interceptors.add(i);
	}

	public void removeRentalInterceptor(RentalInterceptor i) {
		interceptors.remove(i);
	}

	public void onRentalAdded(TransactionInfo context) {
		for(RentalInterceptor i : interceptors) {
			i.onRentalAdded(context);
		}
	}

}
