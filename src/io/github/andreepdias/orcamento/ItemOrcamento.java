package io.github.andreepdias.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel{

    private BigDecimal valor;

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
