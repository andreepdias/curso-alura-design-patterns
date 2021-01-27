package io.github.andreepdias.pedido;

import io.github.andreepdias.orcamento.ItemOrcamento;
import io.github.andreepdias.orcamento.Orcamento;
import io.github.andreepdias.pedido.acao.AcaoAposGerarPedido;
import io.github.andreepdias.pedido.acao.EnviarEmailPedido;
import io.github.andreepdias.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeradoPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeradoPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(x -> x.executarAcao(pedido));
    }

}
