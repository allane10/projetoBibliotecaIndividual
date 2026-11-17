package br.ufpb.dcx.allane.biblioteca;

public class livroNaoEncontradoException extends Exception{

    public livroNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}
