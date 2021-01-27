package io.github.andreepdias;

import io.github.andreepdias.orcamento.Orcamento;
import io.github.andreepdias.pedido.GeraPedido;
import io.github.andreepdias.pedido.GeradoPedidoHandler;
import io.github.andreepdias.pedido.Pedido;
import io.github.andreepdias.pedido.acao.EnviarEmailPedido;
import io.github.andreepdias.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "André";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeradoPedidoHandler handler = new GeradoPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido()));
        handler.execute(gerador);
    }

}
