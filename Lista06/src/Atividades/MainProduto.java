package Atividades;
import java.util.ArrayList;

	public class MainProduto {
		public static void main(String[] args) {
			
			// Lista (estrutura de dados)
			ArrayList <Desktop> desktops = new ArrayList<>();
			
				Desktop desktop1 = new Desktop();
			
				desktop1.setCodBarras(12345678910l);
				desktop1.setFabricante("Samsung");
				desktop1.setGamer(false);
				
							ArrayList<String> pecas = new ArrayList<>();
							pecas.add("Mouse");
							pecas.add("Monitor AOC");
							pecas.add("Teclado");
							pecas.add("RAM");
							pecas.add("GPU");
							pecas.add("SSD");
							
				desktop1.setPecas(pecas);			
				desktops.add(desktop1);
				
				Desktop desktop2 = new Desktop();
			
				desktop2.setCodBarras(10987654321l);
				desktop2. setFabricante("LG");
				desktop2.setGamer(true);
				
							ArrayList<String> pecas2 = new ArrayList<>();
							pecas.add("Mouse gamer");
							pecas.add("Monitor LG");
							pecas.add("Teclado gamer");
							pecas.add("Headset gamer");
							pecas.add("RAM");
							pecas.add("GPU");
							pecas.add("SSD");

				desktop2.setPecas(pecas2);
				desktops.add(desktop2);
				
				Desktop desktop3 = new Desktop();
				
				desktop3.setCodBarras(10958724621L);
				desktop3. setFabricante("Dell");
				desktop3.setGamer(false);
				
							ArrayList <String> pecas3 = new ArrayList<>();
							pecas.add("Mouse");
							pecas.add("Monitor HP");
							pecas.add("Teclado");
							pecas.add("RAM");
							pecas.add("GPU");
							pecas.add("SSD");

				desktop3.setPecas(pecas3);	
				desktops.add(desktop3);
				
				
				ArrayList <Smartphone> smartphones = new ArrayList<>();
				
				Smartphone smartphone1 = new Smartphone();
				
				smartphone1.setCodBarras(45612344575l);
				smartphone1.setDimensoesTela("1334x750");
				smartphone1.setFabricante("Samsung");
				smartphone1.setModeloSmartphone("A20");
				smartphones.add(smartphone1);
				
				Smartphone smartphone2 = new Smartphone();
				
				smartphone2.setCodBarras(54613214568l);
				smartphone2.setDimensoesTela("1136x750");
				smartphone2.setFabricante("Apple");
				smartphone2.setModeloSmartphone("Iphone SE");
				smartphones.add(smartphone2);
				
				Smartphone smartphone3 = new Smartphone();
				
				smartphone3.setCodBarras(78945612310l);
				smartphone3.setDimensoesTela("1920x1080");
				smartphone3.setFabricante("Apple");
				smartphone3.setModeloSmartphone("Iphone 6S");
				smartphones.add(smartphone3);
				
				// FOR 
				
				for (Desktop desktop : desktops) {
					
					System.out.println(desktop.getCodBarras());
					System.out.println(desktop.getFabricante());
					System.out.println(desktop.getGamer());
					System.out.println(desktop.getPecas());
					
				for (String peca : desktop.getPecas() ) {
					System.out.println(peca);
				}
					
				}
				
				for (Smartphone smartphone : smartphones) {
					
					System.out.println(smartphone.getCodBarras());
					System.out.println(smartphone.getDimensoesTela());
					System.out.println(smartphone.getFabricante());
					System.out.println(smartphone.getModeloSmartphone());
					
				}
			
		}

	}


