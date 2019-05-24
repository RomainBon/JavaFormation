
public class GestionTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabTest[] = { 4, 8, 1, 9, -4, 5 };
		System.out.println(FoudMinimum(tabTest));
	}

	static int FoudMinimum(int tab[]) {
		if (tab != null) {
			int min = tab[0];

			for (int i = 1; i < tab.length; i++) {
				if (tab[i] < min) {
					min = tab[i];
				}
			}
			return min;
		}else {
			return 0;
		}

	}
}
