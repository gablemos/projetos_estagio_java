package br.com.focus.desafio;

import java.util.ArrayList;

public class Contato {

    static ArrayList pessoas = new ArrayList();

    public Contato(){
        adicionaLista();
    }
    static void adicionaLista(){

        Pessoa p1 = new Pessoa("Gabriel", "1111");
        Pessoa p2 = new Pessoa("Gustavo", "2222");
        Pessoa p3 = new Pessoa("Rafaela", "3333");
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
    }

    public void recuperarContato(String busca){
        for(int i = 0; i<pessoas.size(); i++){
            if(pessoas.get(i).toString().startsWith(busca))
            System.out.println(pessoas.get(i));
        }
    }

}
