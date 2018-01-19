package br.com.gabriel.focus.primeirodesafio;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListaTelefonica {

    private List<Contato> contatos;

    public ListaTelefonica(){
        this.contatos = new LinkedList();
    }

    public void addContato(Contato contato){
        contatos.add(contato);
    }

    public List consultaContato(String caracter){
        System.out.println("Procurando pelos contatos solicitados ...");
        final List<Contato> resultadoProcura = new LinkedList();

        if(caracter == null){
            throw new NullPointerException("Necessita-se de um texto para busca, não pode ser nulo!");
        }else {
            for (Iterator i = contatos.iterator(); i.hasNext(); ) {
                Contato contato = (Contato) i.next();
                if (contato.getNome().startsWith(caracter.trim())) {
                    resultadoProcura.add(contato);
                }
            }
        }
        return  Collections.unmodifiableList(resultadoProcura);
    }



}
