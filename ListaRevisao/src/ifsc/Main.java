package ifsc;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		Tutor tutor1 = new Tutor();
			
			tutor1.setNomeCompleto("João Pedro");
			
		Gato gato1 = new Gato();
			
			gato1.setApelido("Mya");
			gato1.setClasse("Siamês");
			gato1.setNomeCientifico("Felis catus");
			gato1.setPedigree("SRD");
			
			tutor1.setGato(gato1);
			
		Tutor tutor2 = new Tutor();
		
			tutor2.setNomeCompleto("Gabriel");
		
		Gato gato2 = new Gato();
		
			gato2.setApelido("Susy");
			gato2.setClasse("Maine Coon");
			gato2.setNomeCientifico("Felis catus");
			gato2.setPedigree("SRD");
			
			tutor2.setGato(gato2);
		
		Tutor tutor3 = new Tutor();
		
			tutor3.setNomeCompleto("Cristiane");
		
		Gato gato3 = new Gato();
		
			gato3.setApelido("Zeca");
			gato3.setClasse("Scottish Fold");
			gato3.setNomeCientifico("Felis catus");
			gato3.setPedigree("SRD");
			
			tutor3.setGato(gato3);
			
			
		ArrayList <Tutor> tutores = new ArrayList<>();
		
			tutores.add(tutor1);
			tutores.add(tutor2);
			tutores.add(tutor3);
			
		for (Tutor tutor : tutores) {
			
			System.out.println("");
			System.out.print("Nome do tutor: ");
			System.out.println(tutor.getNomeCompleto());
			System.out.print("Apelido: ");
			System.out.println(tutor.getGato().getApelido());
			System.out.print("Nome científico: ");
			System.out.println(tutor.getGato().getNomeCientifico());
			System.out.print("Classe: ");
			System.out.println(tutor.getGato().getClasse());
			System.out.print("Pedigree: ");
			System.out.println(tutor.getGato().getPedigree());
			
		}

	}

}
