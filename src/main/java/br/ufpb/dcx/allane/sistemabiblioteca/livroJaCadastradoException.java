package br.ufpb.dcx.allane.sistemabiblioteca;

public class livroJaCadastradoException extends Exception{

    public livroJaCadastradoException(){
        super("O Livro já está cadastrado no sistema!");
    }
}
