public class Quadrado {

  public int ladoUm;
  public int ladoDois;

  public int calcularArea() {

    return ladoUm * ladoDois;

   }

  public void mudarValorLadoUm(int ladoUm){

    this.ladoUm = ladoUm;

  }

  public void mudarValorLadoDois(int ladoDois){

    this.ladoDois = ladoDois;

  }

  public int retornarValorLadoUm(){

    return ladoUm;

  }

  public int retonarValorLadoDois(){

    return ladoDois;

  }

  }

