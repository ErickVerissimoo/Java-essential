package source.microConteudos;
import java.util.Random;
public class Aleatorio {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(100);
		System.out.println(numero);
	}

}
