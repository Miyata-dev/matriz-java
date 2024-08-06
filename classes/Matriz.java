package classes;

public class Matriz {
  private int[][] matrix;

  public Matriz(int filas, int columnas) {
    this.matrix = crearMatriz(filas, columnas);
  }

  public static int[][] crearMatriz(int filas, int columnas) {
    int[][] matriz = new int[filas][columnas];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = 0;
      }
    }

    return matriz;
  }

  public void rellenarColumnaConNumero(int indiceColumna, int numero) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][indiceColumna] = numero;
      }
    }
  }


  public static void rellenarColumnaConNumero(int[][] matriz, int indiceColumna, int numero) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = 0;
      }
    }
  }

  public void imprimirMatriz() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    } 
  }
}