package br.ufpb.dcx.allane.biblioteca;

public class livroJaCadastradoException extends Exception{

    public livroJaCadastradoException(){
        super("O Livro já está cadastrado no sistema!");
    }
}
