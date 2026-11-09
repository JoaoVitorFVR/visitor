package org.example;

public class Bicicleta implements Veiculo {

    private int codigo;
    private String modelo;
    private boolean eletrica;

    public Bicicleta(int codigo, String modelo, boolean eletrica) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.eletrica = eletrica;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public String aceitar(VisitorVeiculo visitor) {
        return visitor.exibirBicicleta(this);
    }

}
