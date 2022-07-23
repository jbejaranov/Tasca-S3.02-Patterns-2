import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Borsa extends Observable {

	private ArrayList<Suscriptor> suscriptors;
	private int saldoActual;
	private int saldoNou;

	private Observer observer;

	public Borsa() {
		suscriptors = new ArrayList<Suscriptor>();

	}

//Getters&Setters
	public int getSaldo() {
		return saldoActual;
	}

	public void setSaldo(int saldo) {
		this.saldoActual = saldo;
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
