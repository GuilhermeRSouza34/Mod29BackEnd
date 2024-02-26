package br.com.rpires.dao.jdbc;

import java.util.List;

public interface IProdutoDAO {

    Integer cadastrar(Produto produto) throws Exception;

    Produto consultar(String codigo) throws Exception;

    Integer excluir(Produto produto) throws Exception;

    List<Produto> buscarTodos() throws Exception;
}