package org.example;

public class Carro implements Veiculo {

    private String placa;
    private String modelo;
    private float capacidadeKg;

    public Carro(String placa, String modelo, float capacidadeKg) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeKg = capacidadeKg;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public float getCapacidadeKg() {
        return capacidadeKg;
    }

    public String aceitar(VisitorVeiculo visitor) {
        return visitor.exibirCarro(this);
    }

}
