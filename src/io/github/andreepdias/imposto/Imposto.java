package io.github.andreepdias.imposto;

import io.github.andreepdias.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
