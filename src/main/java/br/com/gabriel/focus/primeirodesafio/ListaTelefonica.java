package br.com.gabriel.focus.primeirodesafio;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaTelefonica{

    private List<Contato> contatos;

    public ListaTelefonica() {
        this.contatos = new LinkedList<Contato>();
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    private List consultarContatos(String caracter) {
        List<Contato> resultadoConsulta = new LinkedList<Contato>();
        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(caracter.trim()))
                resultadoConsulta.add(contato);
        }
        return Collections.unmodifiableList(resultadoConsulta);
    }

    public void imprimirContatos(String caracter) {
        final List<Contato> contatosImprimir = consultarContatos(caracter);
        if (contatosImprimir.isEmpty())
            System.out.println("Desculpe, não consegui encontar nenhum contato!");
        else {
            System.out.println("\nEncontrei estes contatos ...");
            for (Contato contato : contatosImprimir)
                System.out.println("Nome: " + contato.getNome() + " - Telefone: " + contato.getTelefone());
        }
    }
}

