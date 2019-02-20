/**
 * Calsse cliente que possui o main e contem os parametros para os calculos.
 * @author Laryssa
 *
 */
public class Cilente {

	public static void main(String[] args) {
		Calcula c = new Adaptador();
		System.out.println(c.operacaoMultiplica(125, 125));
	}
}
