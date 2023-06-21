import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Funcionario funcionario1 = new Funcionario("Meira", 40000);
    Funcionario funcionario2 = new Funcionario("Henrique", 2000);

    funcionario1.aumentarSalario(10);
    funcionario2.aumentarSalario(20);

    scanner.close();

  }

}
