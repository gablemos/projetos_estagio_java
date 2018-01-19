package br.com.gabriel.focus.primeirodesafio;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        inicializarListaTelefonica(listaTelefonica);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");

        try {
            List<Contato> contatosConsulta = listaTelefonica.consultaContato(scanner.next());
            if (!contatosConsulta.isEmpty()){
                System.out.println("\nEncontrei estes contatos ...");

                for (Iterator i = contatosConsulta.iterator(); i.hasNext(); ){
                    Contato contato = (Contato)i.next();

                    System.out.println("Nome: " + contato.getNome() + " - Telefone: " + contato.getTelefone());
                }
            }else{
                System.out.println("Desculpe, não consegui encontar nenhum contato!");
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }


    }

    public static void inicializarListaTelefonica(ListaTelefonica listaTelefonica){
        listaTelefonica.addContato(new Contato("Rafaela", "111111"));
        listaTelefonica.addContato(new Contato("Gabriel", "222222"));
        listaTelefonica.addContato(new Contato("Lucas", "333333"));
        listaTelefonica.addContato(new Contato("Maisa", "444444"));
        listaTelefonica.addContato(new Contato("Guilherme", "555555"));
        listaTelefonica.addContato(new Contato("Romulo", "666666"));
        listaTelefonica.addContato(new Contato("Remo", "777777"));
        listaTelefonica.addContato(new Contato("Rafael", "888888"));

    }
}
