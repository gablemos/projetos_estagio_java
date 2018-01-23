package br.com.gabriel.focus.primeirodesafio;

public class Contato {

    private final String nome;
    private final String telefone;

    public Contato(final String nome,
                   final String telefone){

        this.nome = nome.toLowerCase();
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean verificarNome(final String caracter){
        if(nome.startsWith(caracter
                .toLowerCase()
                .replace(" ", "")
                .trim()
        )){
            return true;
        } else {
            return false;
        }
    }
}
