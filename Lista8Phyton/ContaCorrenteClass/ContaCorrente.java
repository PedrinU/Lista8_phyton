public class ContaCorrente {

  public double numeroDaConta;
  public String nomeDoCorrentista;
  public double saldo;

  public double deposito() {

    return saldo++;

  }

  public double saque() {

    return saldo--;

  }

  public ContaCorrente(double numeroDaConta, String nomeDoCorrentista, double saldo) {

    this.numeroDaConta = numeroDaConta;
    this.nomeDoCorrentista = nomeDoCorrentista;
    this.saldo = 0.0;
  }

}
