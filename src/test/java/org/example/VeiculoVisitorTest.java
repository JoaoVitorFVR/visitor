package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoVisitorTest {

    @Test
    void deveExibirMoto() {
        Moto moto = new Moto("ABC1D23", "CG 160", 160);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Moto{placa='ABC1D23', modelo='CG 160', cilindradas=160}", visitor.exibir(moto));
    }

    @Test
    void deveExibirBicicleta() {
        Bicicleta bicicleta = new Bicicleta(7, "Caloi Elétrica", true);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Bicicleta{codigo=7, modelo='Caloi Elétrica', eletrica=true}", visitor.exibir(bicicleta));
    }

    @Test
    void deveExibirBicicletaNaoEletrica() {
        Bicicleta bicicleta = new Bicicleta(8, "Monark", false);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Bicicleta{codigo=8, modelo='Monark', eletrica=false}", visitor.exibir(bicicleta));
    }

    @Test
    void deveExibirCarro() {
        Carro carro = new Carro("XYZ9K88", "Fiorino", 650.0f);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro{placa='XYZ9K88', modelo='Fiorino', capacidadeKg=650.0}", visitor.exibir(carro));
    }


}
