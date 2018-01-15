package br.com.focus.Desafio;

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

        for(Iterator i = phoneBook.iterator(); i.hasNext(); ){
            Pessoa pessoa = (Pessoa)i.next();
            if(pessoa.getNome().startsWith(character)){
                resultSearch.add(pessoa);
            }
        }
        return  Collections.unmodifiableList(resultSearch);
    }



}
