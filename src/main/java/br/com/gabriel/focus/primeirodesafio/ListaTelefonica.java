package br.com.gabriel.focus.primeirodesafio;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaTelefonica {

    private List<Contato> contatos;

    public ListaTelefonica() {
        this.contatos = new LinkedList<Contato>();
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    public List consultarContatos(String caracter) throws IllegalAccessException {
        List<Contato> resultadoConsulta = new LinkedList<Contato>();
        if (caracter == null)
            throw new IllegalAccessException("Necessita-se de um texto para busca, não pode ser nulo!");
        else {
            for (Contato contato : contatos) {
                if (contato.getNome().startsWith(caracter.trim()))
                    resultadoConsulta.add(contato);
            }
        }
        return Collections.unmodifiableList(resultadoConsulta);
    }

    public void imprimirContatos(List<Contato> contatosImprimir) {
        if (contatosImprimir == null)
            throw new NullPointerException("Lista para impressão não pode ser nula");
        else if (contatosImprimir.isEmpty()) {
            System.out.println("Desculpe, não consegui encontar nenhum contato!");
        } else {
            System.out.println("\nEncontrei estes contatos ...");
            for (Contato contato : contatosImprimir)
                System.out.println("Nome: " + contato.getNome() + " - Telefone: " + contato.getTelefone());
        }
    }
}

