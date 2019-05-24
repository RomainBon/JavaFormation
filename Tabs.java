public class Tabs {

	public static void main(String[] args) {
		// Tableau a 1 dimension
		int s = 5;
		double tab[] = new double[s];
		// inititiation
		tab[0] = 1;
		tab[1] = 7.5;
		tab[2] = 9.6;
		tab[3] = -7.56;
		tab[4] = 45.36;
		// les deux méthodes pour appeller un tableau a 1 dimension.
		for (int i = 0; i < tab.length; i++) {
			System.out.println("id: "+ i + " / valeur : " + tab[i]);
		}
		System.out.println("-_-_-_-_-_-_-_-_-");		
		double tabInit[]= {4.5,7.8,-9.25,6.95,-6.66,10.2};
		
		for (double val : tabInit) {
			System.out.println(val);
		}
		System.out.println("---------------------------");
		// DEUX dimension
		//les deux sont équivalente 
		int tab2D1[][]= new int [3][2];
		
		int R2D2[][]= new int [3][2];
		R2D2[0]=new int [2];
		R2D2[1]=new int [2];
		R2D2[2]=new int [2];
		
		tab2D1[0][1]=69;
		System.out.println(tab2D1[0][1]);
		
		int R2D3[][]= {{12,14},{15,12,9},{5,6,11,14}};
		System.out.println(R2D3[0].length);//2
		System.out.println(R2D3[1].length);//3
		System.out.println(R2D3[2].length);//4
		
		System.out.println("---------------------------");
		vararg(1);
		System.out.println("-_-_-_-_-_-_-_-_-");
		vararg(1,2,4,5,6);
		System.out.println("-_-_-_-_-_-_-_-_-");
		vararg(1,4,5,8,4,6,42,4);
		
	}
	static void vararg(int v,int ... a)// 1 seul argument varible par méthode et seulement a la fin des déclaration des args !!!!!
	{
		for(int i:a) {
			System.out.println(i);
		}
	}
}
