
public class Questao2 {

	public static void main(String[] args) {
		String senha = "q1w2fdassdf"; //atribuir senha na variável string para verificar se possui a quantidade exigida de caracteres
		if (senha.length() >= 6){ 
			System.out.println("Parabéns! Sua senha possui no mínimo 6 caracteres.");
		} else {
			System.out.println("Sua senha deve possuir no mínimo 6 caracteres.");
		}
	}
}
