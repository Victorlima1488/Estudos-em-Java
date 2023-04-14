public class Carro extends Veiculo{
    private int quantPortas;
    private String marca;
    private float motor;

    public Carro(int quantPortas, String marca, float motor) {
        this.quantPortas = quantPortas;
        this.marca = marca;
        this.motor = motor;
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
