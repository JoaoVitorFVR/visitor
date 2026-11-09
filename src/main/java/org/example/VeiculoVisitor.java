package org.example;

public class VeiculoVisitor implements VisitorVeiculo {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirMoto(Moto moto) {
        return "Moto{" +
                "placa='" + moto.getPlaca() + '\'' +
                ", modelo='" + moto.getModelo() + '\'' +
                ", cilindradas=" + moto.getCilindradas() +
                '}';
    }

    @Override
    public String exibirBicicleta(Bicicleta bicicleta) {
        return "Bicicleta{" +
                "codigo=" + bicicleta.getCodigo() +
                ", modelo='" + bicicleta.getModelo() + '\'' +
                ", eletrica=" + bicicleta.isEletrica() +
                '}';
    }

    @Override
    public String exibirCarro(Carro carro) {
        return "Carro{" +
                "placa='" + carro.getPlaca() + '\'' +
                ", modelo='" + carro.getModelo() + '\'' +
                ", capacidadeKg=" + carro.getCapacidadeKg() +
                '}';
    }
}
