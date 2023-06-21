import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Retangulo retangulo = new Retangulo();

    System.out.println("Informe, por gentileza, o valor do lado A: ");
    double ladoUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor do lado B: ");
    double ladoDois = scanner.nextDouble();

    double resultado = retangulo.calcularAreaRetangulo(ladoDois, ladoUm);

    System.out.println("O resultado do cálculo da área do retangulo é: " + resultado);

  
    scanner.close();

  }

}
