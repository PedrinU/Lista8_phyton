public class Televisao {

  public int numeroDoCanal;
  public int volumeDoCanal;

  public void aumentarVolumeDoCanal() {
    if (volumeDoCanal < 100) {
      volumeDoCanal++;
    }
  }

  public void diminuirVolumeDoCanal() {
    if (volumeDoCanal > 0) {
      volumeDoCanal--;
    }

  }

  public int getNumeroCanal() {
    return numeroDoCanal;
  }

  public void setNumeroCanal(int novoNumeroCanal) {
    this.numeroDoCanal = novoNumeroCanal;
  }

  public int getVolume() {
    return volumeDoCanal;
  }

}
