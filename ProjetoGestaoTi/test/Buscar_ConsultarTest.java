import static org.junit.Assert.*;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Metodos.TestClientesDao;
import Metodos.TestFornecedoresDao;
import Metodos.TestFuncionariosDao;
import Metodos.TestProdutosDao;
import model.Clientes;
import model.Fornecedores;
import model.Funcionarios;
import model.Produtos;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Buscar_ConsultarTest {

	@Test
	public void ABuscarClientePorNome() {
		String nome = "%" + "Pedro" + "%";

		TestClientesDao dao = new TestClientesDao();
		List<Clientes> listatest = dao.buscaClienteNome(nome);
		assertNotEquals("[]", listatest);
	}

	@Test
	public void BBuscarClientePorNomeNaoCadastrado() {
		String nome = "%" + "Afonso" + "%";

		TestClientesDao dao = new TestClientesDao();
		List<Clientes> listatest = dao.buscaClienteNome(nome);
		//System.out.println(listatest.toString());
		assertEquals("[]", listatest.toString());
	}
	
	@Test
	public void CBuscarClientePorNomeCampoVazio() {
		String nome = "%" + "" + "%";

		TestClientesDao dao = new TestClientesDao();
		List<Clientes> listatest = dao.buscaClienteNome(nome);
		//System.out.println(listatest.toString());
		assertNotNull(listatest.toString());
	}

	@Test
	public void DBuscarClientePorCpf() {

		Clientes obj = new Clientes();
		TestClientesDao dao = new TestClientesDao();
		obj = dao.buscaClienteCpf("896.424.374-34");
		assertEquals("Alberto", obj.getNome());
		
	}
	
	@Test
	public void EBuscarClientePorCpfNaoCadastrado() {

		Clientes obj = new Clientes();
		TestClientesDao dao = new TestClientesDao();
		obj = dao.buscaClienteCpf("956.001.745-19");
		assertEquals(null, obj.getNome());
		
	}
	
	@Test
	public void FBuscarClientePorCpfCampoVazio() {

		Clientes obj = new Clientes();
		TestClientesDao dao = new TestClientesDao();
		obj = dao.buscaClienteCpf("");		
		assertEquals(null, obj.getNome());
		
	}
	
	@Test
	public void GBuscarFornecedorPorNome() {
		String nome = "%" + "Dell ltda" + "%";

		TestFornecedoresDao dao = new TestFornecedoresDao();
		List<Fornecedores> listatest = dao.buscaFornecedorNome(nome);
		//System.out.println(listatest);
		assertNotEquals("[]", listatest);
	}
	
	@Test
	public void HBuscarFornecedorPorNomeNaoCadastrado() {
		String nome = "%" + "GNU" + "%";

		TestFornecedoresDao dao = new TestFornecedoresDao();
		List<Fornecedores> listatest = dao.buscaFornecedorNome(nome);
		//System.out.println(listatest);
		assertEquals("[]", listatest.toString());
	}
	
	@Test
	public void IBuscarFornecedorPorNomeCampoVazio() {
		String nome = "%" + "" + "%";

		TestFornecedoresDao dao = new TestFornecedoresDao();
		List<Fornecedores> listatest = dao.buscaFornecedorNome(nome);
		//System.out.println(listatest);
		assertNotNull(listatest.toString());
	}
	
	@Test
	public void JBuscarFuncionarioPorNome() {
		String nome = "%" + "Savio Castro" + "%";

		TestFuncionariosDao dao = new TestFuncionariosDao();
		List<Funcionarios> listatest = dao.buscaFuncionarioNome(nome);
		//System.out.println(listatest);
		assertNotEquals("[]", listatest);
	}
	
	@Test
	public void KBuscarFuncionarioPorNomeNaoCadastrado() {
		String nome = "%" + "Tibia" + "%";

		TestFuncionariosDao dao = new TestFuncionariosDao();
		List<Funcionarios> listatest = dao.buscaFuncionarioNome(nome);
		//System.out.println(listatest);
		assertEquals("[]", listatest.toString());
	}
	
	@Test
	public void LBuscarFuncionarioPorNomeCampoVazio() {
		String nome = "%" + "" + "%";

		TestFuncionariosDao dao = new TestFuncionariosDao();
		List<Funcionarios> listatest = dao.buscaFuncionarioNome(nome);
		//System.out.println(listatest);
		assertNotNull(listatest.toString());
	}
	
	@Test
	public void MBuscarProdutoPorNome() {
		String nome = "%" + "Notebook Inspiron" + "%";

		TestProdutosDao dao = new TestProdutosDao();
		List<Produtos> listatest = dao.buscaProdutosNome(nome);
		//System.out.println(listatest);
		assertNotEquals("[]", listatest);
	}
	
	@Test
	public void NBuscarProdutosPorNomeNaoCadastrado() {
		String nome = "%" + "Tibia" + "%";

		TestProdutosDao dao = new TestProdutosDao();
		List<Produtos> listatest = dao.buscaProdutosNome(nome);
		//System.out.println(listatest);
		assertEquals("[]", listatest.toString());
	}
	
	@Test
	public void OBuscarProdutosPorNomeCampoVazio() {
		String nome = "%" + "" + "%";

		TestProdutosDao dao = new TestProdutosDao();
		List<Produtos> listatest = dao.buscaProdutosNome(nome);
		//System.out.println(listatest);
		assertNotNull(listatest.toString());
	}
	
	@Test
	public void PBuscarProdutosPorCodigo() {
		
		Produtos obj = new Produtos();
		TestProdutosDao dao = new TestProdutosDao();
		
		int cod = Integer.parseInt("1");
		obj = dao.buscaProdutosCodigo(cod);
		//System.out.println(obj);
		assertNotEquals("[]", obj);
	}
	
	@Test
	public void QConsultaFornecedorPorNome() {
		String nome = "Dell ltda";
		Fornecedores obj = new Fornecedores();
		TestFornecedoresDao dao = new TestFornecedoresDao();
		obj = dao.consultaFornecedorNome(nome);
		System.out.println(obj.getNome());
		assertNotEquals(null, obj);
	}
	
	@Test
	public void RConsultaFornecedorPorNomeVazio() {
		String nome = "Dell";
		Fornecedores obj = new Fornecedores();
		TestFornecedoresDao dao = new TestFornecedoresDao();
		obj = dao.consultaFornecedorNome(nome);
		System.out.println(obj.getNome());
		assertEquals(null, obj.toString());
	}
	
		
	

}
