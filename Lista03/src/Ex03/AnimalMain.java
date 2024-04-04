package Ex03;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal golfinho = new Animal();
		
		golfinho.Nomes_Populares_Animal = new String[5];
		
		golfinho.nomeCientifico = "Delphinus delphis";
		golfinho.familia =  "Delphinidae";
		golfinho.reino = "Animalia";
		golfinho.Nomes_Populares_Animal[0] = "delfins"; 
		golfinho.Nomes_Populares_Animal[1] = "peixes-botos"; 
		golfinho.Nomes_Populares_Animal[2] = "botos"; 
		golfinho.Nomes_Populares_Animal[3] = "toninhas";
		golfinho.Nomes_Populares_Animal[4] = "delfim";
		
		System.out.println("=/=Golfinho=/=" + "\n");
		
		System.out.println("Nome cientifico: " + golfinho.nomeCientifico);
		System.out.println("Familia: " + golfinho.familia);
		System.out.println("Reino: " + golfinho.reino);
		
		for (int i = 0; i < golfinho.Nomes_Populares_Animal.length; i++) {
			System.out.println("Os nomes mais populares do Golfinho são: "+ golfinho.Nomes_Populares_Animal[i]);
			
		}

		
		
	}

}
