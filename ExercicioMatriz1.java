package atividadejava4;

import java.util.Scanner;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		// 
		int diagonalP = 0, diagonalS = 0;
		int numeroInteiro [][] ={ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
			
			System.out.println("Elementos da Diagonal Principal: ");
			for (int linha = 0; linha <3; linha++) {
				for (int coluna = 0; coluna < 3; coluna++) {
					if (coluna == linha) {
						diagonalP += numeroInteiro[linha][coluna];
						System.out.print(numeroInteiro[linha][coluna] + "");
					}
				}
			}
			
			System.out.println("Elementos da Diagonal Secundária: ");
			for (int linha = 0; linha <3; linha++) {
				System.out.print(numeroInteiro[linha][2 - linha] + "");
			}
					
				System.out.println("Soma dos Elementos da Diagonal Principal: " + diagonalP);
				System.out.println("Soma dos Elementos da Diagonal Secundária: " + diagonalS);
			}

	}

}

