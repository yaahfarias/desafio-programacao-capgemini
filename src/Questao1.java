
public class Questao1 {

	public static void main(String[] args) {
		int n = 10; //alterar n para o valor desejado
		char[] linha = new char[n];
		for (int i=n-1; i >=0; i--) {
			linha[i] = ' ';
		}
		for (int i=n-1; i >= 0; i--) {
			linha[i] = '*';
			System.out.println(linha);
		}
	}
}