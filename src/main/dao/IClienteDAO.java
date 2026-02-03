package main.dao;

import main.dao.generics.IGenericDAO;
import main.domain.Cliente;
import main.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public interface IClienteDAO  {
    boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);


    Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException;

    void excluir(Long cpf);

    void alterar(Cliente cliente);

    Cliente consultar(Long cpf);

    Collection<Cliente> buscarTodos();
}
