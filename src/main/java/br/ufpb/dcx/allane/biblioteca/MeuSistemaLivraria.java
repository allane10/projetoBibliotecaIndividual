package br.ufpb.dcx.allane.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaLivraria implements SistemaLivrariaIndividual {
    private List<Livro> livros;

    public MeuSistemaLivraria(){
        this.livros = new ArrayList<>();
    }
    public void cadastrarLivro(String codigo, String autor, String titulo, int quantPaginas, boolean foiLido)
            throws LivroJaCadastradoException {

        Livro livro = new Livro(codigo, autor, titulo, quantPaginas,foiLido);

        for(Livro l: this.livros){
            if(l.getCodigo().equals(codigo)){
                throw new LivroJaCadastradoException("Livro de código " + codigo + "já está cadastrado!");
            }
        }
        this.livros.add(livro);
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        for(Livro l: this.livros){
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarLivrosLidosENaoLidos(boolean foiLido) {

        List<Livro> livrosEncontrados = new ArrayList<>();
        for (int i = 0; i < this.livros.size(); i++) {
            if (this.livros.get(i).isLivroLido() == foiLido) {
                livrosEncontrados.add(this.livros.get(i));
            }
        }
        return livrosEncontrados;

    }

    public void leituraFinalizada(String codigo) throws LivroNaoEncontradoException{
        for (Livro l: this.livros){
            if(l.getCodigo().equals(codigo)){
                l.setLivroLido(true);
            }
        }  throw new LivroNaoEncontradoException("Livro de código " + codigo + " não encontrado!");
    }
}
