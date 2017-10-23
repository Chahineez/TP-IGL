package TP;


import java.util.Scanner;

/**
 * 
 * Bienvenue au programe du TP d'IGL
 * @author MCS
 * Binome : Slatnia/Mehenni/G02
 *
 */

public class VectorHelper  {
	
	    
	
	/**
	 * Cette methode permet de sommer deux vecteurs de meme taille
	 * @param vect1 : vecteur 1
	 * @param vect2 : vecteur2
	 * @param vect3 : le resultat de la somme sera dans le vecteur 3
	 * @throws LengthException : exception tailles des vecteurs differentes
	 */


    	public static void sommer(int[] vect1,int[] vect2, int[] vect3) throws LengthException{
		int i=0;
		
	  if( vect1.length != vect2.length) 
	  {
		 throw new LengthException();
	  }	
	  else
	  {
		 while ( i < vect1.length)
		 {
			 vect3[i]= vect1[i]+vect2[i];
			 
			 System.out.println("tableau3["+i+"]="+vect3[i]);
			 i++;
			 
		 }
	  }
	}

	
	/**
	 * Cette méthode permet d'inverser les elements du vecteur1 en generant le vecteur2
	 * @param vect1 : vecteur1 a inverser
	 * @param vect2 : vecteur2 qui le vecteur 1 qui a été inversé
	 * @throws LengthException : exception de taille
	 */
	public static void inverser (int[] vect1, int[] vect2) throws LengthException{ 
		
		int i=0;
		if ( vect1.length != vect2.length) { throw new LengthException() ;}
		else {
			while (i< vect1.length)
			{
				vect2[i]=vect1[9-i];
				System.out.println("tab3 inversée="+vect2[i]);
				i++;
			}
		}
	}
	
	
	/**
	 * Cette méthode permet de multiplier les elements du vecteur par "x" qui est choisit par l'utilisateur
	 * @param vect : le vecteur qui va etre multiplié par x
	 * @param x : l'entier multiplieur
	 */
	public static void multiplier(int[] vect,int x){
		int i=0;
		while (i< vect.length)
		{
			vect[i]*=x;
			System.out.println(" vecteur multiplié=" +vect[i]);
			i++;
		}
		
	} 


}