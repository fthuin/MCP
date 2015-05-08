public class Cadran3 {

	/* Pré : tab est un tableau d'entiers
	 *		 tab != null
	 *		 j est un indice tel que 0 <= j < tab.length
	 * 
	 * Post : le tableau est modifié de manière que tmp a été placé à l'indice
	 * j du tableau tab.
	 * Résultat : La valeur présente à l'indice j de tab lors de l'appel à la 		 * méthode est renvoyé
     */
    public static int switchUnique(int[] tab, int j, int tmp) {
        int tmp2 = tab[j];
        tab[j] = tmp;
        return tmp2;
    }

	/* Pré : tab est un tableau d'entiers
	 * 		 tab != null
	 *		 startIndex est un indice tel que 0 <= startIndex < tab.length
	 *		 decalage est un entier positif
	 *		 nSwitch est un entier positif 0 <= nSwitch < tab.length 
	 * Post : le tableau est modifié de manière à ce que les éléments aux
	 * positions P_{i} sont déplacés aux positions P_{i+1} pour tout i appartenant
 	 * à [0, tab.length / nSwitch] tel que P_{x} = ((startIndex + nSwitch) * x) mod tab.length
	 * Résultat : -
	 * Invariant :
	 * 				tmp = tab[startIndex + switchDone * decalage]
	 * 			  ^ 0 <= switchDone <= nSwitch
	 * 			  ^ 
	 */
    public static void switchCadran2(int[] tab, int startIndex, int decalage, int nSwitch) {
        int switchDone = 0;
        int i = startIndex + decalage;
        int tmp = tab[startIndex];
    	while (! (switchDone == nSwitch)) {
	        tmp = switchUnique(tab, i, tmp);
            i = (i+decalage) % tab.length;
            switchDone++;
    	}
    }

	/* Pré : tab est un tableau d'entiers
	 *       decalage est un nombre d'entiers positifs
	 * Post : tous les éléments du tableau aux positions i sont déplacés aux positions
	 * (i+decalage % tab.length)
	 * Résultat : -
	 */
    public static void switchCadran(int[] tab, int decalage) {
        int switchDone = 0;
        //int pgcd = pgcd(tab.length, decalage);
        int pgcd = 1; /* A supprimer */
        while (! (switchDone==pgcd)) {
            switchCadran2(tab, switchDone, decalage, tab.length / pgcd);
            switchDone++;
        }
    }

//    public static void switchCadran(int decal, int[] tab) {
//        int i = 0;
//    	  int lastStart = 0;
//        int tmp = tab[0];
//        int tmp2;
//        int switchDone = 0;
//        while (! (switchDone == tab.length)) {

//		System.out.println("Switch i : "+i+" with : "+tab[i]+", to : "+((i + decal) % tab.length)+" with : "+tab[(i + decal) % tab.length]+", memory : "+tmp);

//		if ((i + decal)%tab.length == lastStart) {
//	            tmp2 = tab[ (i + decal + 1) % tab.length ];
//	            tab[ (i + decal) % (tab.length) ] = tmp;
//	            tmp = tmp2;
//	            i = (i + decal +1) % (tab.length);
//		    lastStart = i;
//		}
//		else {
//	            tmp2 = tab[ (i + decal) % tab.length ];
//	            tab[ (i + decal) % (tab.length) ] = tmp;
//	            tmp = tmp2;
//	            i = (i + decal) % (tab.length);
//			}
//		switchDone++;
//        }
//    }

    public static void main(String[] args) {
		int test = -5 % 2;
		System.out.println("test : " + test);
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        switchCadran(tab, 5);
        for (int i = 0; i < tab.length ; i++) {
            System.out.println("tab["+i+"]="+tab[i]);
        }
    }
}
