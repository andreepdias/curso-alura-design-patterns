package io.github.andreepdias.pedido.acao;

import io.github.andreepdias.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
