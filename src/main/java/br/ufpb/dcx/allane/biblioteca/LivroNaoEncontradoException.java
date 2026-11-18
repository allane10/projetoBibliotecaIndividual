package br.ufpb.dcx.allane.biblioteca;

public class LivroNaoEncontradoException extends Exception{

    public LivroNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}
