package main;
//Ce fichier est encodé en UTF8.

// De Cocq Aymeric
// El Jilali Solaiman
// Julémont Léonard
// Thuin Florian

// Remplacez les deux caractères XX par votre numéro de groupe encodé sur deux chiffres!
public class CT39V104 {
	
	public static void main(String[] args){
		int [] t = {3,-2,-1,1,1,2,-4,5,-6,3,5};
		
		int [] t2 = {4,-3,-1,-1,3,2,1,4,-1,-1,3,1,-4,5,-1,2};
		
		int [] t3 = {3,4,5,6};
		
		int [] t4 = {-3,-4,-5,-6};
		
		int [] t5 = {-3,-4,-5,-1};
		
		int [] t6 = {-3,-1,-5,-6};
		
		System.out.println(maxSum(t6));
	}
  
  // Le paramètre t n'est pas null. 
  // De plus, il représente un vecteur non vide de n entiers relatifs.
  
  // Cette méthode ne modifie pas les éléments du tableau t.
  // Elle renvoie la somme de la sous-sequence non vide maximum de t.
  public static long maxSum(int[] t) {
	  long sum = Integer.MIN_VALUE;
	  long sumCurr = 0;
	  
	  for (int i = 0; i < t.length ; i++) {
		 
		  
		  if(sumCurr <= 0){
			  sumCurr = t[i];
		  }
		  else{
			  sumCurr += t[i];
		  }
		  
		  if (sum < sumCurr ) {
			  sum = sumCurr;
		  }
	  }
	  
	  if(t.length == 0){
          	return 0;
      	  }
	  
	  return sum;
  }
  
  //***********************************************************************************
  //Expliquez la notion de "programme correct"

  //***********************************************************************************
  //Expliquez comment vous avez développé ce programme
  
  //***********************************************************************************
  //Expliquez pourquoi vous pensez que votre méthode est correcte
}
