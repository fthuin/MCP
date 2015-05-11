public static int abs(int a){
	return (a<0) ? -a : a;
}
	
public static int pgcd(int a, int b) {
  a = abs(a); b = abs(b);
  while (a!=b) { 
	  if (a>b) a=a-b;
	  else b=b-a;
  }
  return(a);}

public static int switchUnique(int[] tab, int j, int tmp) {
    int tmp2 = tab[j];
    tab[j] = tmp;
    return tmp2;}
	
public static void switchCadran2(int[] tab, int startIndex, int decalage, int nSwitch) {
    int switchDone = 0;
    int i = (startIndex + decalage) % tab.length;
    int tmp = tab[startIndex];
  	while (! (switchDone == nSwitch)) {
          tmp = switchUnique(tab, i, tmp);
          i = (i+decalage) % tab.length;
          switchDone++;}}

public static void switchCadran(int[] tab, int decalage) {
    int switchDone = 0;
    int pgcd = pgcd(tab.length,decalage);
    while (! (switchDone==pgcd)) {
        switchCadran2(tab, switchDone, decalage, tab.length / pgcd);
        switchDone++;}}
