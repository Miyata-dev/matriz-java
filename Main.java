import classes.Matriz;

public class Main {
  public static void main(String[] args) {
    Matriz uno = new Matriz(3, 4);

    uno.imprimirMatriz();
    uno.rellenarColumnaConNumero(0, 5);
    uno.imprimirMatriz();

    uno.rellenarConCeros();
    uno.imprimirMatriz();

  }
}