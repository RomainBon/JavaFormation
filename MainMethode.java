
public class MainMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String str:args) {
			System.out.println(str);
		}
		System.out.println(mul(1,2));
		System.out.println(mul(7.0,2.0));
		System.out.println(mul(1,1.2));
	}
	//redéfinition de méthode : les méthodes ne doive pas avoire les même agrs en elles
	static  int mul(int a,int b) {
		System.out.println("int");
		return a*b;
	} 
	static double mul(int a, double b)
	{
		System.out.println("int/double");
		return a*b;
	}
	
	/**
	 * une méthode qui multiplie deux nombres(double)
	 * @param a
	 * @param b
	 * @return
	 */
	static double mul(double a , double b) {
		System.out.println("Double");
		return a*b;
	}

}
