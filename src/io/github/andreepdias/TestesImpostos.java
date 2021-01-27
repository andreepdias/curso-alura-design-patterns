package io.github.andreepdias;

import io.github.andreepdias.imposto.CalculadoraDeImpostos;
import io.github.andreepdias.imposto.ISS;
import io.github.andreepdias.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
