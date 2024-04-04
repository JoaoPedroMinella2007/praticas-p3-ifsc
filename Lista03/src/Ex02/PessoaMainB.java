package Ex02;
import java.util.Scanner;

public class PessoaMainB {
	
	public static void main(String[] args) {
		
	Pessoa[] pessoas = new Pessoa[3];
	Scanner input = new Scanner(System.in);
	
	for (int i = 0; i < pessoas.length; i++) {
		Pessoa pessoa = new Pessoa();
		System.out.println("Informe o nome da pessoa: ");
		pessoa.nome = input.nextLine();
		System.out.println("Informe o CPF da pessoa: ");
		pessoa.cpf = input.nextLine();
		System.out.println("Informe a data de nascimento da pessoa: ");
		pessoa.dataNascimento = input.nextLine();

		
		pessoas[i] = pessoa;
	}
	
	for (int i = 0; i < pessoas.length; i++) {
		
		System.out.println("\nNome da pessoa: " + pessoas[i].nome );
		System.out.println("CPF: " + pessoas[i].cpf);
		System.out.println("Data de nascimento: " + pessoas[i].dataNascimento);
	
	}

}
}
