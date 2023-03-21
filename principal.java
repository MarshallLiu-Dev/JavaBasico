package teste;
import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
			// Ler dois numeros e mostra o resltado
		
			Scanner ler = new Scanner(System.in);
			/*	
			System.out.println("Digite o Primeiro Numero");
			int n1 = ler.nextInt();
			System.out.println("Digite o Segundo Numero");
			int n2 = ler.nextInt();
			System.out.println("O primeiro numero digitado foi  " +  n1 + " e sogundo foi  " + n2);
		    int n3;
		    n3 = n1+n2;
		    System.out.println("O resultado foi  " + n3);
		    	
			
			System.out.println("Digite o Primeiro Numero");
			float n1 = ler.nextFloat();
			System.out.println("Digite o Segundo Numero");
			float n2 = ler.nextFloat();
			// .nextInt(); guarda os números inteiros 
			System.out.println("O primeiro numero digitado foi  " +  n1 + " e sogundo foi  " + n2);
		    Float n3;
		    n3 = n1/n2;
		    System.out.println("O resultado foi  " + n3);
			*/
			
			System.out.println("Digite o Primeiro Número");
			int n1 = ler.nextInt();
			System.out.println("Digite o Segundo Número");
			int n2 = ler.nextInt();
			if(n1 > n2) {
				System.out.println("N1 é maior que N2  ");
			}else {
				System.out.println("N2 é maior que N1");
			}
			
			
			
			
			
			
	
	}

}

