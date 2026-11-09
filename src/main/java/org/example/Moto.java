package org.example;

public class Moto implements Veiculo {

    private String placa;
    private String modelo;
    private int cilindradas;

    public Moto(String placa, String modelo, int cilindradas) {
        this.placa = placa;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public String aceitar(VisitorVeiculo visitor) {
        return visitor.exibirMoto(this);
    }

}
