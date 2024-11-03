package exAnimal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.setIdade(15);
		animal.setTamanho(2.6);
		
		System.out.println(animal);
		
		Mamifero mamifero = new Mamifero();
		
		mamifero.setIdade(16);
		mamifero.setQuantGlandMamarias(4);
		mamifero.setTamanho(1.5);
		
		System.out.println(mamifero);
		
		Gato gato = new Gato();
		
		gato.setIdade(10);
		gato.setQuantGlandMamarias(6);
		gato.setTamanho(0.4);
		gato.setVisaoNoturna(true);
		
		System.out.println(gato);
		
		Cao cao = new Cao();
		
		cao.setIdade(5);
		cao.setLatido(false);
		cao.setQuantGlandMamarias(6);
		cao.setTamanho(0.9);
		
		System.out.println(cao);
		
		Reptil reptil = new Reptil();
		
		reptil.setIdade(30);
		reptil.setQuantOvos(9);
		reptil.setTamanho(0.2);
		
		System.out.println(reptil);
		
		Tartaruga tartaruga = new Tartaruga();
		
		tartaruga.setIdade(80);
		tartaruga.setQuantOvos(20);
		tartaruga.setTamanho(0.3);
		tartaruga.setTamanhoCasca(0.25);
		
		System.out.println(tartaruga);
		
		Lagarto lagarto = new Lagarto();
		
		lagarto.setIdade(150);
		lagarto.setQuantOvos(0);
		lagarto.setTamanho(1.5);
		lagarto.setTamanhoCauda(1);
		
		System.out.println(lagarto);
		
	}

}
