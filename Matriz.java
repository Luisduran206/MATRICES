//LUIS DURÁN FLORES - 177406
import java.util.Scanner;
public class Matriz {

	int n1;
	int m1;
	int n2;
	int m2;
	int[][]matriz;
	
	public Matriz() {
		
	}
	
	public void multiplicacionMatriz(int n1, int m1, int n2, int m2) { 
		//Se insertan las medidas de laS matrices
		Scanner scan = new Scanner(System.in);
		if(m1 != n2) {
			System.out.println("ERROR: la medida de la matrices no es válida");
			System.out.println("las columnas en A deben ser igual a las filas de B");
		} else {
			int[][] A = new int[n1][m1];
			int[][] B = new int[n2][m2]; 
			int[][] C = new int[n1][m2];
		//SE AGREGAN VALORES A LAS MATRICES
			for(int i = 0; i < n1; i++) {
				for(int j = 0; j < m1; j++) {
					System.out.println("Inserte el valor para la matriz A en la posición "+i +j);
					String str = scan.nextLine();
					int lugar = Integer.parseInt(str);
					A[i][j] = lugar;
				}
			}
			for(int i = 0; i < n2; i++) {
				for(int j = 0; j < m2; j++) {
					System.out.println("Inserte el valor para la matriz B en la posición "+i +j);
					String str = scan.nextLine();
					int lugar = Integer.parseInt(str);
					B[i][j] = lugar;
				}
			}
		//MULTIPLICACIÓN DE LAS MATRICES
			for (int i = 0; i < n1; i++)
	        {
	            for(int j = 0; j < m2; j++)
	            {
	                int temporal=0;
	                for(int k = 0; k < m1; k++)
	                {
	                    temporal += A[i][k] * B[k][j];
	                }
	                C[i][j]= temporal;
	            }
	        }
		//SE IMPRIME LA RAÍZ DE RESULTADO
			System.out.print("La Matriz C = A * B");
			System.out.print("\n");
			for (int i=0; i<n1; i++)
	        {
	            for(int j=0; j<m2; j++)
	            {
	               System.out.print(C[i][j]);
	               System.out.print(" ");
	            }
	            System.out.println("\n");
	        }
		}
		
	}
	
	public void transpuesta(int[][]matriz) {
		this.matriz = matriz;
		int n = matriz.length;
		System.out.println("Matriz C: nueva matriz transpuesta \n");
		for(int i =0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(matriz[j][i] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public void diagonal(int[][]matriz) {
		this.matriz = matriz; 
		int n = matriz.length;
		int suma = 0;
		for(int i = 0; i < n; i++)
	    {
	        for(int j = 0; j < n; j++)
	        {
	            if(i == j)
	            {
	                suma += matriz[i][j];
	            }
	        }
	    }
		System.out.println("La suma diagonal principal es: " + suma);
	}
	
	public void valorMaximo(int[][]matriz) {
		this.matriz = matriz;
		int n = matriz.length;
		int maximo = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(matriz[i][j] > maximo) {
					maximo = matriz[i][j];
				}
			}
		}
		System.out.println("El valor mayor de la matriz es: " + maximo);
	}
	
	public void sumaMatriz(int[][]A, int[][]B) {
		int n = A.length; //PARA LA SUMA DE MATRICES LA MEDIDA DEBE SER LA MISMA EN AMBAS MATRICES 
		int[][] C = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("Matriz C: A + B \n");
		for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++)
	        {
	            System.out.print(C[i][j] + "    ");
	        }
	        System.out.println("\n");
	    }
	}
	
	public void escalar(int[][]matriz, int escalar) {
		this.matriz = matriz;
		int n = matriz.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int temporal = 0;
				temporal = matriz[i][j] * escalar;
				matriz[i][j] = temporal;
			}
		}
		System.out.println("Matriz C: A * escalar \n");
		for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++)
	        {
	            System.out.print(matriz[i][j] + "    ");
	        }
	        System.out.println("\n");
	    }
	}
}