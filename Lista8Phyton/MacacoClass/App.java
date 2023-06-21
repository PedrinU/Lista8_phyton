import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Macaco macaco1 = new Macaco("Macaco1");
    Macaco macaco2 = new Macaco("Macaco2");

    macaco1.comer("Banana");
    macaco2.comer("Maçã");

    macaco1.verEstomago();
    macaco2.verEstomago();

    macaco1.comer("Pêssego");
    macaco2.comer("Uva");

    macaco1.verEstomago();
    macaco2.verEstomago();

    macaco1.digerir();
    macaco2.digerir();

    macaco1.verEstomago();
    macaco2.verEstomago();

    macaco1.comer(macaco2.getNome());
    macaco1.verEstomago();

    scanner.close();

  }

}
