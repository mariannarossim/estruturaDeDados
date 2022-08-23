package questao02;

import java.util.Random;

public class q02 {

	public static void main(String[] args) {
		
		int[][] numAleatorio = new int [3][4];
	     
		Random numeroRandom = new Random();
	  
	     for (int i = 0; i < numAleatorio.length; i++){
	         for (int j = 0; j < numAleatorio[i].length; j++){
	             numAleatorio[i][j] = numeroRandom.nextInt;
	         }
	     }
	  
	  int maior = 0, linha = 0, col = 0;
	  
	  for (int i = 0; i < numAleatorio.length; i++){
	      for (int j = 0; j < numAleatorio[i].length; j++){
	          if(numAleatorio[i][j] > maior){
	              maior = numAleatorio[i][j];
	              linha = i;
	              col = j;
	          }
	      }
	  }
	  
	  System.out.print("\t\tMatriz\n");
	  for (int i = 0; i < numAleatorio.length; i++){
	      for (int j = 0; j < numAleatorio[i].length; j++){
	          System.out.print("\t"+numAleatorio[i][j]+" ");
	      }
	      System.out.println();
	  }
	  
	  System.out.println("\nMaior valor = "+maior);
	  System.out.println("Linha: "+linha);
	  System.out.println("Coluna:"+col);

	}

}
