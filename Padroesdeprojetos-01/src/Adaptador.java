/**
 * Classe adaptador que herda as operacoes da classe CalculadoraExistente e faz as operacoes solicitadas pelo cliente.
 * @author Laryssa
 *
 */
public class Adaptador extends CalculadoraExistente implements Calcula{

	public int operacaoMultiplica(int v1, int v2) {
		int mul = 0;
		for (int i = 0; i < v2; i++) {
			mul = soma(mul, v1);
		}
		return mul;
	}

	public int operacaoDivide(int v1, int v2) {
		int div = 0;
		while (v1 - v2 >= 0) {
			v1 = subtrai(v1, v2);
			div++;
		}
		return div;
	}

}
