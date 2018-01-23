package br.com.gabriel.focus.primeirodesafio;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaTelefonica {

    private final List<Contato> contatos;

    public ListaTelefonica() {
        this.contatos = new LinkedList<Contato>();
    }

    public void addContato(final Contato contato) {
        contatos.add(contato);
    }

    public List consultarContatos(final String caracter) {
        List<Contato> resultadoConsulta = new LinkedList<Contato>();
        for (final Contato contato : contatos) {
            if (contato.verificarNome(caracter.trim())) {
                resultadoConsulta.add(contato);
            }
        }
        return Collections.unmodifiableList(resultadoConsulta);
    }
}

