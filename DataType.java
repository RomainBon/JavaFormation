import java.util.Date;

public class DataType {

	public static void main(String[] args) {
		// Wololoo ;)
		/*
		 * KAKA
		 */
		System.out.println("Hello Wolrd");
		// déclaration
		int largeur;
		// initialisation
		largeur = 42;
		System.out.println(largeur);

		// Déclaration intit
		int longueur = 100;
		System.out.println(longueur);
		// déclaration multiple

		int i, j, k = 2;
		i = 0;
		j = 1;
		System.out.println(i + " : " + j + " : " + k);

		double d = 4.25687, d2 = 4e1;
		System.out.println(d + " : " + d2);

		char ch = 'z';
		System.out.print(ch);

		boolean tst = true;
		System.out.print(tst);

		// Littéral long float
		long l = 12000000000000L;
		float f = 1.2f;
		System.out.println(l + " / " + f);
		// litéral changement de base
		int hexa = 0xFF;
		int bin = 0b11111;
		int oct = 077;
		System.out.println(hexa + " : " + bin + " : " + oct);

		// litéral spéparateur

		double sep = 1_000.0; // Pas de séparateur en début , fin et a coter de virgule
		System.out.println(sep);

		// Transtypage implicite
		byte bt = 12;
		int it = bt;
		double dd = it;
		System.out.println(bt + " : " + it + " : " + dd);

		// Transtypage implicite perte de précision
		long l1 = 123456789L;
		long l2 = 123456788L;
		float ft1 = l1;
		float ft2 = l2;
		long lt1 = l2 - l1;
		float ftt = ft2 - ft1;
		System.out.println(lt1 + " / " + ftt);

		// Transtypage explicite
		int ite = 1;
		byte bte = (byte) ite;
		System.out.println(bte);
		ite = 6015;
		bte = (byte) ite;
		System.out.println(bte);

		String str1 = new String("Bonjour");
		String str2 = null;
		System.out.println(str1 + " : " + str2);
		str2 = str1;
		System.out.println(str1 + " : " + str2);
		Date date = new Date();
		date.clone();
		date = null;
		// str1=date; // erreur DEBILE

		System.out.println(str1.toUpperCase());
		
		//type enveloppe
		
		Integer iw = new Integer(255);
		System.out.println(iw);
		System.out.println(Integer.parseInt("12345"));// vers type primitif int 
		System.out.println(Integer.valueOf("12345"));// vers un Objet integer
		System.out.println(Integer.toHexString(iw));// affiche sur forme hexa
	}

}
