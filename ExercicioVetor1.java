package atividadejava4;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeroInteiro [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		Arrays.sort(numeroInteiro);
		int entrada;
//		for(int indice = 0; indice < numeroInteiro.length; indice++) {
//			System.out.println(numeroInteiro[indice]);
//		}
			System.out.println("Digite o número que você deseja encontrar: ");
		entrada = leia.nextInt();
		
		int posicao = Arrays.binarySearch(numeroInteiro, entrada);
		
		if (posicao >= 0) {
			System.out.println("O número " + entrada +  " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + entrada + " não foi encontrado!");
		}
		}


	}


