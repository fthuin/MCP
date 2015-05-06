public class Cadran2 {

    public static void switchCadran(int decal, int[] tab) {
        int i = 0;
		int lastStart = 0;
        int tmp = tab[0];
        int tmp2;
        int switchDone = 0;
        while (! (switchDone == tab.length)) {
			
			System.out.println("Switch i : "+i+" with : "+tab[i]+", to : "+((i + decal) % tab.length)+" with : "+tab[(i + decal) % tab.length]+", memory : "+tmp);
			
			if ((i + decal)%tab.length == lastStart){
	            tmp2 = tab[ (i + decal + 1) % tab.length ];
	            tab[ (i + decal) % (tab.length) ] = tmp;
	            tmp = tmp2;
	            i = (i + decal +1) % (tab.length);
				lastStart = i;
			}
			else{
	            tmp2 = tab[ (i + decal) % tab.length ];
	            tab[ (i + decal) % (tab.length) ] = tmp;
	            tmp = tmp2;
	            i = (i + decal) % (tab.length);
			}
			switchDone++;             
        }
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        switchCadran(4, tab);
        for (int i = 0; i < tab.length ; i++) {
            System.out.println("tab["+i+"]="+tab[i]);
        }
    }
}