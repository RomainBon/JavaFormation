import basePackage.Animal;
import basePackage.Voiture;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal chien = new Animal("chien", "DOG");
		System.out.println(chien.getPrintName());
		chien.setPrintName("Dog");
		System.out.println(chien.getPrintName());
		
		// EXO VOITURE
		
		Voiture Bm = new Voiture("BMW","ZE888-RD");
		System.out.println(Bm.getCouleur());
		Bm.setCouleur("RougeMétal");
		System.out.println(Bm.toString());
		
		Voiture Renault = new Voiture("Renault","EE-888-RD","JauneRacing");
		System.out.println(Renault.toString());
	}
}
