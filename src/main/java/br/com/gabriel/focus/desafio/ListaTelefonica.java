package br.com.gabriel.focus.desafio;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListaTelefonica {

    private List phoneBook;

    public ListaTelefonica(){
        this.phoneBook = new LinkedList();
    }

    public void addContato(Pessoa pessoa){
        phoneBook.add(pessoa);
    }

    public List search(String character){
        System.out.println("Procurando pelos contatos solicitados ...");
        final List resultSearch = new LinkedList();

        if(character == null){
            throw new NullPointerException("Necessita-se de um texto para busca, não pode ser nulo!");
        }else {
            for (Iterator i = phoneBook.iterator(); i.hasNext(); ) {
                Pessoa pessoa = (Pessoa) i.next();
                if (pessoa.getNome().startsWith(character.trim())) {
                    resultSearch.add(pessoa);
                }
            }
        }
        return  Collections.unmodifiableList(resultSearch);
    }



}
