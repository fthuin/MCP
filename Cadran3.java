public class Cadran2 {

    public static int switchUnique(int[] tab, int j, int tmp) {
        int tmp2 = tab[j];
        tab[j] = tmp;
        return tmp2;
    }

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
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        switchCadran(tab, 5);
        for (int i = 0; i < tab.length ; i++) {
            System.out.println("tab["+i+"]="+tab[i]);
        }
    }
}
