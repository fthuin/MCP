//Ce fichier est encodé en UTF8.

// De Cocq Aymeric
// El Jilali Solaiman
// Julémont Léonard
// Thuin Florian

// Remplacez les deux caractères XX par votre numéro de groupe encodé sur deux chiffres!
public class CT39V104 {
  
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
  //
  // Un programme est correct s'il respecte les spécifications (pré et post-conditions) et s'il se finit. 

  //***********************************************************************************
  //Expliquez comment vous avez développé ce programme
  /*
   * Pour trouver le programme nécessaire pour résoudre ce problème, nous avons commencé par prendre un exemple de tableau. A partir de ce tableau, nous avons pris la première case et avons regardé quelle devait être la valeur de la séquence de somme maximale. Par la suite, nous avons ajouté la case suivante et nous avons réfléchi à ce qu'il devait se passer pour que la variable représentant la somme maximale corresponde toujours à la somme maximale. Autrement dit, nous voulions que cette variable ait toujours la même propriété à chaque ajout de nouvelle case, jusqu'à la dernière du tableau. 
   * Après avoir terminé avec le premier tableau, nous avons pris un autre tableau qui contenait des situations plus critiques par rapport au premier pseudo-code que nous avions. Nous avons apporté les modifications nécessaires au programme pour répondre aux situations que nous ne traitions pas dans le cadre de notre premier tableau. 
   * Nous avons fini par écrire le programme en Java et le tester sur différents tableaux. 
   */
  
  //***********************************************************************************
  //Expliquez pourquoi vous pensez que votre méthode est correcte
  //Nous pensons que notre méthode est correcte car nous avons commencé par la première case du tableau puis nous avons regardé en ajoutant une nouvelle case, tout en gardant la propriété correcte. Comme nous travaillons sur un tableau qui contient un ensemble fini d'éléments, nous pouvons adopter un raisonnement inductif pour démontrer la justesse de notre algorithme. 
}
