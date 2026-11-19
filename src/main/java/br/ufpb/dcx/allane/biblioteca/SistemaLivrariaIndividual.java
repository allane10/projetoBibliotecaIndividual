package br.ufpb.dcx.allane.biblioteca;

import java.util.List;

public interface SistemaLivrariaIndividual {
    public void cadastrarLivro(String codigo, String autor, String titulo, int quantPaginas, boolean foiLido) throws LivroJaCadastradoException;
    public List<Livro> pesquisarLivrosPorAutor(String autor);
    public List<Livro> pesquisarLivrosLidosENaoLidos(boolean foiLido);
    public void leituraFinalizada(String codigo) throws LivroNaoEncontradoException;
    //public String inicioFimLeitura(String codigo, String dataInicio, String dataFim);
}
