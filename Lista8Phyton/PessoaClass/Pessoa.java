public class Pessoa {

  public String nome;
  public int peso;
  public int idade;
  public double altura;

  public int envelhecer() {
    return idade++;
  }

  public int engordar() {

    return peso++;

  }

  public int emagrecer() {

    return peso--;

  }

  public double crescer(double altura) {
    if (idade < 21) {
      return altura + 0.5;
    } else {

      return altura++;

    }

  }

}
