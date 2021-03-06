public class Cadran3 {
	
	/*
	*Pre: a un entier
	*Post: -
	*Resultat: la valeur absolue de a
	*/
	
	public static int abs(int a){
		if(a<0){
			return -a;
		}
		else{
			return a;
		}
	}
	 
	/* Pre: a et b deux entiers
	 * Post: Le plus grand commun diviseur de a et b
	 */
	public static int pgcd(int a, int b) {
	  a = abs(a); b = abs(b);
	  while (a!=b)  
		  if (a>b){
			  a=a-b;
			  }
		  else {
			  b=b-a;
			  };
	  return(a);
	}
	
	/* Pré : tab est un tableau d'entiers
	 *		 tab != null
	 *		 j est un indice tel que 0 <= j < tab.length
	 * 
	 * Post : le tableau est modifié de manière que tmp a été placé à l'indice
	 * j du tableau tab.
	 *
	 * Résultat : La valeur présente à l'indice j de tab lors de l'appel à la
	 * méthode est renvoyé
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
 	 * à [0,nSwitch[ tel que P_{x} = (startIndex + (decalage * x)) mod tab.length
	 * Résultat : -
	 */
    public static void switchCadran2(int[] tab, int startIndex, int decalage, int nSwitch) {
        int switchDone = 0;
        int i = (startIndex + decalage) % tab.length;
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
        int pgcd = pgcd(tab.length,decalage); /* A supprimer */
        while (! (switchDone==pgcd)) {
            switchCadran2(tab, switchDone, decalage, tab.length / pgcd);
            switchDone++;
        }
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        switchCadran(tab, 8);
        for (int i = 0; i < tab.length ; i++) {
            System.out.println("tab["+i+"]="+tab[i]);
        }
    }
}
