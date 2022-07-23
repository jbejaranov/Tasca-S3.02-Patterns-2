import java.util.Observable;
import java.util.Observer;

public class Suscriptor implements Observer {

	private Observable observable;
	private String email;

	public Suscriptor() {
	}

	public Suscriptor(Observable observable) {
		this.observable = observable;
	}

// Getters&Setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//Metodes

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Ha hagut un canvi a la borsa.");
	}
}
