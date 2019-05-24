
public class Methode {

	public static void main(String[] args) {
		hello();
		afficherDouble(42.42);
		System.out.println(multi(4.0,2.5));
		double d=12.0;
		System.out.println(d);
		System.out.println(tstSup5(d));
		System.out.println(d);
		
		StringBuffer t= new StringBuffer("azerty");
		affStr(t);
		System.out.println(t);
	}
	
	 static void hello() {
		System.out.println("Bonjour !");
	}
	
	 static void afficherDouble(double d) {
		 System.out.println(d);
	 }
	 
	 static double multi (double a, double b) {
		 return a*b;
	 }
	 
	 static boolean tstSup5(double a) {
		 a=30;
		 return a>5;
	 }
	 
	 static void affStr(StringBuffer bf) {
		 bf.reverse();
		 bf = new StringBuffer("awq");
		 System.out.println(bf);
	 }
}