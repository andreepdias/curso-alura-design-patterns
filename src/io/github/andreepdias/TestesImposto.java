package io.github.andreepdias;

import io.github.andreepdias.desconto.CalculadoraDeDescontos;
import io.github.andreepdias.imposto.CalculadoraDeImpostos;
import io.github.andreepdias.imposto.ICMS;
import io.github.andreepdias.imposto.ISS;
import io.github.andreepdias.orcamento.ItemOrcamento;
import io.github.andreepdias.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }

}
