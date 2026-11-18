package br.ufpb.dcx.allane.biblioteca;

import java.util.List;

public interface SistemaLivrariaIndividual {
    public void cadastrarLivro(String codigo, String autor, String titulo, int quantPaginas, boolean foiLido) throws LivroJaCadastradoException;
    public List<Livro> pesquisarLivrosPorAutor(String autor);
    public List<Livro> pesquisarLivrosLidos(boolean foiLido);
    public String inicioFimLeitura(String codigo, String dataInicio, String dataFim);
    public void leituraFinalizada(String codigo) throws LivroNaoEncontradoException;
}
