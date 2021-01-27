package io.github.andreepdias.pedido.acao;

import io.github.andreepdias.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido.");
    }

}
