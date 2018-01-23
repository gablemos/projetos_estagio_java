package br.com.gabriel.focus.primeirodesafio;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        inicializarListaTelefonica(listaTelefonica);

        System.out.println("Informe a(s) inicial(is) do nome da pessoa que deseja encontrar o contato: ");

        final List<Contato> contatosConsulta = listaTelefonica.consultarContatos(scanner.next());

        imprimirNoSysout(contatosConsulta);
    }

    private static void imprimirNoSysout(final List<Contato> contatosImprimir){
        if (contatosImprimir.isEmpty())
            System.out.println("Desculpe, não consegui encontar nenhum contato!");
        else {
            System.out.println("\nEncontrei estes contatos ...");
            for (Contato contato : contatosImprimir)
                System.out.println("Nome: " + contato.getNome() + " - Telefone: " + contato.getTelefone());
        }
    }

    private static void inicializarListaTelefonica(final ListaTelefonica listaTelefonica){
        listaTelefonica.addContato(
                new Contato("Rafaela",  "111111"));
        listaTelefonica.addContato(
                new Contato("Gabriel",  "222222"));
        listaTelefonica.addContato(
                new Contato("Lucas",    "333333"));
        listaTelefonica.addContato(
                new Contato("Maisa",    "444444"));
        listaTelefonica.addContato(
                new Contato("Guilherme","555555"));
        listaTelefonica.addContato(
                new Contato("Romulo",   "666666"));
        listaTelefonica.addContato(
                new Contato("Remo",     "777777"));
        listaTelefonica.addContato(
                new Contato("Rafael",   "888888"));
    }
}
