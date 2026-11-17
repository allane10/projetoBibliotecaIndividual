package br.ufpb.dcx.allane.sistemabiblioteca;

public interface SistemaLivrariaIndividual {
    public void cadastrarLivro(String codigo, String autor, String titulo, int quantPaginas, boolean foiLido) throws livroJaCadastradoException;
    public List<Livro> pesquisarLivrosPorAutor(String autor) throws autorInexistenteException;
    public List<Livro> pesquisarLivrosLidos(boolean foiLido) throws nenhumLivroLidoException;
    public String inicioFimLeitura(String codigo, String dataInicio, String dataFim);
    public boolean livroLido(String codigo, boolean foiLido);
}
