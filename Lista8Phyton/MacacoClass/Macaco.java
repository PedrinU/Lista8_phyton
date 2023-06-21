public class Macaco {

  private String nome;
  private String estomago;

  public Macaco(String nome) {
    this.nome = nome;
    this.estomago = "";
  }

  public String getNome() {
    return nome;
  }

  public void comer(String alimento) {
    if (estomago.isEmpty()) {
      estomago += alimento;
    } else {
      estomago += ", " + alimento;
    }
  }

  public void verEstomago() {
    if (estomago.isEmpty()) {
      System.out.println(nome + " está com o estômago vazio.");
    } else {
      System.out.println(nome + " está com o seguinte conteúdo no estômago: " + estomago);
    }
  }

  public void digerir() {
    if (estomago.isEmpty()) {
      System.out.println(nome + " não tem nada no estômago para digerir.");
    } else {
      System.out.println(nome + " está digerindo " + estomago + ".");
      estomago = "";
    }
  }

}
