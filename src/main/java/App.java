import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Suscriptor suscriptor = new Suscriptor();
		suscriptor.setEmail("juan@gmail.com");

		Borsa producto = new Borsa();
		producto.setSaldo(100);

		producto.altaSuscriptor(suscriptor);

		producto.setSaldo(23);
		producto.setSaldo(150);
		producto.setSaldo(50);
	}

}
