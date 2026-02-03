package test;

import dao.ClienteDaoMock;
import main.dao.IClienteDAO;
import main.domain.Cliente;
import main.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest(){
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Rafael Nadal");
        cliente.setCidade("Londrina");
        cliente.setEndereco("Rua Tremembés");
        cliente.setEstado("RJ");
        cliente.setNumero("45");
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarClient(){
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDao.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente(){
        clienteDao.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Cilia");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Cilia", cliente.getNome());
    }

}