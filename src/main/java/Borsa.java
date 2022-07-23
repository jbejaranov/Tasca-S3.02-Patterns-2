import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Borsa extends Observable {

	private ArrayList<Suscriptor> suscriptors;
	private int saldo;

	private Observer observer;

	public Borsa() {
		suscriptors = new ArrayList<Suscriptor>();

	}

//Getters&Setters
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
		notificaSuscriptors();
	}

//Metodes
	public void altaSuscriptor(Suscriptor suscriptor) {
		suscriptors.add(suscriptor);
	}

	public void baixaSuscriptor(Observer observer) {
		suscriptors.remove(observer);
	}

	public void notificaSuscriptors() {
		suscriptors.forEach(x -> x.update(null, observer));

	}

}
