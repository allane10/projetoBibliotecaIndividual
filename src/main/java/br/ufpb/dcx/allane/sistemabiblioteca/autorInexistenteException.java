package br.ufpb.dcx.allane.sistemabiblioteca;

public class autorInexistenteException extends Exception{

    public autorInexistenteException(){
        super("O autor não existe no sistema!");
    }
}
