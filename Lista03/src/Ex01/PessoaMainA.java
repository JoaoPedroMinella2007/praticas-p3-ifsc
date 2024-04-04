package Ex01;

public class PessoaMainA {
	
public static void main(String[] args) {
		
		Pessoa Arthur = new Pessoa();
		
		Arthur.cpf = "123456";
		Arthur.primeiroNome = "Arthur";
		Arthur.sobrenome = "Santos";
		
		Pessoa Jose = new Pessoa();
		
		Jose.cpf = "789456";
		Jose.primeiroNome = "Jose";
		Jose.sobrenome = "Azevedo";
		
		Pessoa Felipe = new Pessoa();
		
		Felipe.cpf = "123456";
		Felipe.primeiroNome = "Felipe";
		Felipe.sobrenome = "Souza";
		
		
		
		System.out.println(Arthur.cpf);
		System.out.println(Arthur.primeiroNome);
		System.out.println(Arthur.sobrenome);
		
		System.out.println("");
		
		System.out.println(Jose.cpf);
		System.out.println(Jose.primeiroNome);
		System.out.println(Jose.sobrenome);
		
		System.out.println("");
		
		System.out.println(Felipe.cpf);
		System.out.println(Felipe.primeiroNome);
		System.out.println(Felipe.sobrenome);
		
		
		
}

}
