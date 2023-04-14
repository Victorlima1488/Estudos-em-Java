public class Moto extends Veiculo{
    private int cilindrada;
    private int machas;

    public Moto(int cilindrada, int machas) {
        this.cilindrada = cilindrada;
        this.machas = machas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getMachas() {
        return machas;
    }

    public void setMachas(int machas) {
        this.machas = machas;
    }
}
