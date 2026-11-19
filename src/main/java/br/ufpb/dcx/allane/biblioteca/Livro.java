package br.ufpb.dcx.allane.biblioteca;

import java.util.Objects;

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
    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getQuantPaginas(){
        return this.quantPaginas;
    }
    public void setQuantPaginas(int quantPaginas){
        this.quantPaginas = quantPaginas;
    }
    public boolean isLivroLido(){
        return this.livroLido;
    }
    public void setLivroLido(boolean livroLido){
        this.livroLido = livroLido;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "codigo = " + codigo + '\'' +
                ", autor = " + autor + '\'' +
                ", título = " + titulo + '\'' +
                ", quantidade de páginas = " + quantPaginas +
                ", livro lido = " + livroLido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return quantPaginas == livro.quantPaginas && livroLido == livro.livroLido &&
                Objects.equals(codigo, livro.codigo) && Objects.equals(autor, livro.autor) &&
                Objects.equals(titulo, livro.titulo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigo, autor, titulo, quantPaginas, livroLido);
    }
}