import java.util.Date;

public class Operators {

	public static void main(String[] args) {
		// Opération mathématique
		int i = 23;
		int j =34;
		int rs = i+j;
		System.out.println(rs);
		
		int ii=25;
		int div = ii/2;
		int mod = ii%2;
		System.out.println("divison entiere = "+div+" le reste = "+mod);
		double ddiv= ii/2;
		System.out.println(ddiv);
		ddiv=ii/2.0;
		System.out.println(ddiv);
		
		//opérateur incementation / décrémen
		i=0;
		System.out.println(++i);
		i=0;
		System.out.println(i++);
		System.out.println(i);
		
		//opérateur affectaion
		i=ii;
		System.out.println(i);
		i+=23;//i=i+23
		System.out.println(i);
		
		//opérateur de comparaison
		System.out.println(i==0);
		boolean tst=i<100;
		System.out.println(tst);
		
		//opérateur court-circuit
		int val1=10,val2=32;
		boolean tst2=val1==1 && val2==32;
		String str = null;
		System.out.println(tst2);
		boolean tst3=str!=null && str.equals("azerty");
		System.out.println(tst3);
		boolean tst4=val1==10 || val2==20;
		System.out.println(tst4);
		
		int valb1=0b1001;
		int valb2=0b1011;
		System.out.println(Integer.toBinaryString(~valb1));
		System.out.println(Integer.toBinaryString(valb1&valb2));
		System.out.println(Integer.toBinaryString(valb1^valb2));
		System.out.println(valb1>>1);
		String str2 =new String("AZERTY");
		boolean tsti = str2 instanceof String;
		Date date= new Date();
		boolean tsti2=(Object)date instanceof String;
		System.out.println(tsti+"/"+tsti2);
		
		//Promotion Numérique
		int pri=11;
		short prs=2;
		int resP1 = pri+prs;
		double prd=2.0;
		double resD=pri*prd;
		byte b1=1;
		byte b2=2;
		int rb=b1+b2;
		System.out.println(rb+"/"+resD+"/"+resP1);
	}

}
