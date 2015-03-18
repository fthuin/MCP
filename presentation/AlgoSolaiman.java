
public class AlgoSolaiman {
	/** 
	* Renvoie le nombre d'éléments communs aux tableaux a et b
	
	* pre : a est un tableau d'entiers triés dans l'ordre croissant ^
	*		b est un tableau d'entiers triés dans l'ordre croissant ^

	* post : les éléments des tableaux a et b sont inchangés
	* return : le nombre d'éléments présents à la fois dans a et dans b
	*/
	public static int nCommonValues(int []a, int [] b){
		
		int i = 0, j = 0, k = 0 ;
		//i index of a
		//j index of b
		while((i<a.length)&&(j<b.length)){
			if(a[i]==b[j]){
				k++;
				i++;
				j++;
			}
			if(a[i]<b[j]){
				i++;
			}
			//if(a[j]>b[j]){
			else{
				j++;
			}
				
	}
		return k;

}

public static void main(String[] args) {
System.out.println("Test");
int[] a = {-2, 0, 3, 4, 6, 10, 12};
int[] b = {-5, -2, 3, 5, 6, 13};

System.out.println("k= " +  nCommonValues(a,b));
}
}