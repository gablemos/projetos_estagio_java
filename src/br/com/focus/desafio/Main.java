package br.com.focus.desafio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Contato contato = new Contato();
        Scanner scanner = new Scanner(System.in);
        contato.recuperarContato(scanner.next());
    }
}
