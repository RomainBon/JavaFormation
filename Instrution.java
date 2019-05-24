
public class Instrution {

	public static void main(String[] args) {
		System.out.println(minimum(4, -1));
		for (int i = 1; i <= 7; i++) {
			System.out.println(jourSemaine(i));
		}
		System.out.println("-----------------------");
		System.out.println(even(1));
		System.out.println(even(2));
		System.out.println("-----------------------");
		System.out.println(interval(2, 1, 3));
		System.out.println(interval(3, 1, 2));
		System.out.println("-----------------------");
		Calculette('+', 1, 2);
		Calculette('-', 10, 2);
		Calculette('*', 9, 9);
		Calculette('/', 1, 2);
		Calculette('/', 1, 0);
		Calculette('Q', 1, 5);
		System.out.println("-----------------------");
		Calculette('+', 1, -2);
		Calculette('-', 10, -2);
		Calculette('*', 9, -9);
		Calculette('/', 1, -2);
		Calculette('/', 1, -0);
		Calculette('Q', 1, -5);
		System.out.println("-----------------------");
//		System.out.println(tstWhile(3));
//		System.out.println(tstDoWhile(3));
//		System.out.println("-----------------------"); 
		for (int i = 0; i <= 10; i++) {
			TableMulti(i);
			System.out.println("-_-_-_-_-_-_-_-");
		}
		System.out.println("-----------------------");
		System.out.println(factoriel(7));
		System.out.println(factorielRecursif(3));
		System.out.println("-----------------------");
		testBreak();
		System.out.println("-_-_-_-_-_-_-_-");
		testContinue();
		System.out.println("-----------------------");
		testLabel();
	}

	static int minimum(int a, int b) {
//		if(a<b) {
//			return a;
//		}else {
//			return b;
//		}
		return a < b ? a : b;
	}

	static String jourSemaine(int jour) {
		String tmp = "";
		switch (jour) {
		case 1:
			tmp = "Monday";
			break;
		case 6:
		case 7:
			tmp = "Yes ,Week-end !";
			break;
		default:
			tmp = "An other fucking day !";
		}
		return tmp;
	}

	static boolean even(int a) {
		return a % 2 == 0;
	}

	static boolean interval(int valTest, int borneInf, int borneSup) {
		return borneInf < valTest && valTest < borneSup;
	}

	static void Calculette(char operateur, double v1, double v2) {
		switch (operateur) {
		case '+':
			System.out.println(v1 + v2);
			break;
		case '-':
			System.out.println(v1 - v2);
			break;
		case '*':
			System.out.println(v1 * v2);
			break;
		case '/':
			if (v2 < Double.MIN_VALUE && v2 > -Double.MIN_VALUE) {
				System.out.println("Erreur division par 0");
			} else {
				System.out.println(v1 / v2);
			}
			break;
		default:
			System.out.println("Erreur opérateur incorrecte");
		}
	}

	static int tstWhile(int i) {
		int j = 0, somme = 0;
		while (j <= i) {
			somme += j;
			j++;
			System.out.println(j);
		}
		return somme;
	}

	static int tstDoWhile(int i) {
		int j = 0, somme = 0;
		do {
			somme += j;
		} while (j <= i);
		return somme;
	}

	static void TableMulti(int i) {
		if (0 < i && i < 10) {
			int j = 0;
			while (j < 10) {
				System.out.println(i + " x " + j + " = " + j * i);
				j++;
			}
		} else {
			System.out.println("Erreur seuls les nombres compries entre 1 et 9 sont autorisé !");
		}

	}

	static int factoriel(int val) {
		int fact = 1;
		for (int j = 1; j <= val; j++) {
			fact *= j;
		}
		return fact;
	}

	static int factorielRecursif(int n) {
		if (n == 0) {
			return 1;
		} else {
			return factorielRecursif(n - 1) * n;
		}
	}

	static void testBreak() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			if (i == 3) {
				break;
			}
		}
	}

	static void testContinue() {
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}

	static void testLabel() {
		LOOP1: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println(i + "/" + j);
				if (j == 3) {
					break LOOP1;
				}
			}
		}
	}
}