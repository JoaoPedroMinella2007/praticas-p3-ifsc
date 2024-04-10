package ExerciciosLista04;

import java.util.ArrayList;

public class MainVeiculo {
	
	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo();
		
			veiculo1.setNome("Corolla");
			veiculo1.setAno(2023);
			veiculo1.setNumeroRodas(4);
			veiculo1.setFabricante("Toyota");
			veiculo1.setCor("Preto");
			
		Veiculo veiculo2 = new Veiculo();
			
			veiculo2.setNome("Uno");
			veiculo2.setAno(2012);
			veiculo2.setNumeroRodas(4);
			veiculo2.setFabricante("Fiat");
			veiculo2.setCor("Preto");
			
		Veiculo veiculo3 = new Veiculo();
			
			veiculo3.setNome("Passat");
			veiculo3.setAno(2000);
			veiculo3.setNumeroRodas(4);
			veiculo3.setFabricante("Volkswagen");
			veiculo3.setCor("Preto");
			
			ArrayList <Veiculo> veiculos = new ArrayList<>();
			veiculos.add(veiculo1);
			veiculos.add(veiculo2);
			veiculos.add(veiculo3);

			for (Veiculo veiculo : veiculos) {
				
				System.out.println(veiculo.getNome());
				System.out.println(veiculo.getAno());
				System.out.println(veiculo.getNumeroRodas());
				System.out.println(veiculo.getFabricante());
				System.out.println(veiculo.getCor());
				System.out.println("");

			}
			
		
	}	
}
