package io.github.andreepdias;

import io.github.andreepdias.http.JavaHttpClient;
import io.github.andreepdias.orcamento.ItemOrcamento;
import io.github.andreepdias.orcamento.Orcamento;
import io.github.andreepdias.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));

        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
