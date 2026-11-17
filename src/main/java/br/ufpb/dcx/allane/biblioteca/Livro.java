package br.ufpb.dcx.allane.biblioteca;

public class Livro {
    private String codigo;
    private String autor;
    private String titulo;
    private int quantPaginas;
    private boolean livroLido;

    public Livro(String codigo, String autor, String titulo, int quantPaginas, boolean livroLido){
        this.codigo = codigo;
        this.autor = autor;
        this.titulo= titulo;
        this.quantPaginas = quantPaginas;
        this.livroLido = livroLido;
    }
    public Livro(){
        this("" ,"" , "", 0, false);
    }
}
