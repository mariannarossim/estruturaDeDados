package questao01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class q01 {

	public static void main(String[] args) {
		
		

				Scanner ler=new Scanner(System.in);
				
				busca_sequencial bb = new q01();
				
				int numeros[] = gerarNum(10);
				System.out.println(Arrays.toString(numeros));
				
				int valor;
				
				boolean encontrarValor=false;
				System.out.println("Digite com o valor que deseja encontrar: ");
				
				valor=ler.nextInt();
				
				int i=0;
				
				while(i<10 && encontrarValor==false) {
					if(numeros[i]==valor) {
						encontrarValor=true;
					}
					i++;
				}
				if(encontrarValor==false) {
				System.out.println("Valor não encontrado no vetor.");
				}
				else{
					
				}
					System.out.println("Valor encontrado na posição: ");
					
				}
			}

			private static int[] gerarNum(int tamanho) {
				int vetor[]=new int[tamanho];
				
				Random aleatorio = new Random();
				
				for(int i=0; i<vetor.length; i++) {
					vetor[i]=aleatorio.nextInt(100);
				}
				
				return vetor;

	}

}
