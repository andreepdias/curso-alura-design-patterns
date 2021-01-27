package io.github.andreepdias;

import io.github.andreepdias.desconto.CalculadoraDeDescontos;
import io.github.andreepdias.imposto.CalculadoraDeImpostos;
import io.github.andreepdias.imposto.ISS;
import io.github.andreepdias.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));
    }
}
