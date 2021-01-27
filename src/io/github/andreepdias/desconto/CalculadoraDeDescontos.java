package io.github.andreepdias.desconto;

import io.github.andreepdias.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDescontos =
                new DescontoParaOrcamentoComMaisDe5Itens(
                    new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                         new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
