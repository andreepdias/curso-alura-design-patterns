package io.github.andreepdias.pedido.acao;

import io.github.andreepdias.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados.");
    }

}
