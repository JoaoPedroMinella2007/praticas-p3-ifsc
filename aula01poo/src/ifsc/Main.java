package ifsc;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa Joao = new Pessoa();
		
		Joao.cpf = "123456";
		Joao.primeiroNome = "Joao";
		Joao.sobrenome = "Minella";
		
		Pessoa Mariana = new Pessoa();
		
		Mariana.cpf = "789456";
		Mariana.primeiroNome = "Mariana";
		Mariana.sobrenome = "Azevedo";
		
		System.out.println(Joao.cpf);
		System.out.println(Joao.primeiroNome);
		System.out.println(Joao.sobrenome);
		
		System.out.println(Mariana.cpf);
		System.out.println(Mariana.primeiroNome);
		System.out.println(Mariana.sobrenome);
		
		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0] = Joao;
		pessoas[1] = Mariana;
		
		
		


	}

}
