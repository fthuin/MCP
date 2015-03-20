public class Presentation {
	
	/** Renvoie le nombre d'éléments communs aux tableaux a et b
	 * pre :	a est un tableau d'entiers triés dans l'ordre croissant &&
	 *			b est un tableau d'entiers triés dans l'ordre croissant &&
	 *			a != null && b != null
	 * post :	les éléments des tableaux a et b sont inchangés
	 * return : le nombre d'éléments présents à la fois dans a et dans b
	 */
	public static int nCommonValues(int[] a, int[] b) {
		int k = 0; // Nombre d'éléments présents à la fois dans a et b
		int i = 0; // Index de parcours du tableau a
		int j = 0; // Index de parcours du tableau b
		
		while (i < a.length && j < b.length) {
			System.out.println("a["+i+"]=" + a[i]);
			System.out.println("b["+j+"]=" + b[j]);
			if (a[i] == b[j]) {
				k++;
				i++;
				j++;
			}
			else if (a[i] < b[j]) {
				i++;
			}
			else { /* a[i] > b[j] */
				j++;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		int[] a = {-2, 0, 3, 4, 6, 10, 12, 13};
		int[] b = {-5, -2, 3, 5, 6, 13};
		int k = nCommonValues(a,b);
		System.out.println("");
		System.out.println("Nombre d'éléments communs : " + k);
	}
}
