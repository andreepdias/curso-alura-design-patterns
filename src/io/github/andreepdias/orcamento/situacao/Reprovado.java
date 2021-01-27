package io.github.andreepdias.orcamento.situacao;

import io.github.andreepdias.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends  SituacaoOrcamento{

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }

}
