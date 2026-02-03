package main.services;

import main.dao.IClienteDAO;
import main.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    // O segredo está aqui:
    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO; // Agora ele vai usar o que você mandar no teste!
    }

    @Override
    public Boolean salvar(Cliente cliente) {
       clienteDAO.salvar(cliente);
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) {
        clienteDAO.alterar(cliente);
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }
}
