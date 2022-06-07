import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import Metodos.TestClientesDao;
import Metodos.TestFornecedoresDao;
import Metodos.TestFuncionariosDao;
import Metodos.TestProdutosDao;
import dao.ProdutosDao;
import model.Clientes;
import model.Fornecedores;
import model.Funcionarios;
import model.Produtos;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ExcluirTest {

	@Test
	public void ATestExcluirCliente() {
		Clientes obj = new Clientes();

		obj.setId(Integer.parseInt("50"));

		TestClientesDao test = new TestClientesDao();
		assertEquals(true, test.excluirCliente(obj));
	}

	@Test
	public void BTestExcluirClienteVinculadoVenda() {
		Clientes obj = new Clientes();

		obj.setId(Integer.parseInt("8"));

		TestClientesDao test = new TestClientesDao();
		assertEquals(false, test.excluirCliente(obj));
	}

	@Test
	public void CTestExcluirFornecedor() {
		Fornecedores obj = new Fornecedores();

		obj.setId(Integer.parseInt("3"));

		TestFornecedoresDao test = new TestFornecedoresDao();
		assertEquals(true, test.excluirFornecedor(obj));
	}

	@Test
	public void DTestExcluirFornecedorVinculadoVenda() {
		Fornecedores obj = new Fornecedores();

		obj.setId(Integer.parseInt("1"));

		TestFornecedoresDao test = new TestFornecedoresDao();
		assertEquals(false, test.excluirFornecedor(obj));
	}

	@Test
	public void ETestExcluirFuncionario() {
		Funcionarios obj = new Funcionarios();

		obj.setId(Integer.parseInt("4"));

		TestFuncionariosDao test = new TestFuncionariosDao();
		assertEquals(true, test.excluirFuncionarios(obj));
	}
	
	@Test
	public void FTestExclirProduto() {
		 Produtos obj = new Produtos();

         obj.setId(Integer.parseInt("13"));

         TestProdutosDao dao = new TestProdutosDao();
         assertEquals(true, dao.excluirProduto(obj));
	}
	
	@Test
	public void GTestExclirProdutoVinculadoVenda() {
		 Produtos obj = new Produtos();

         obj.setId(Integer.parseInt("2"));

         TestProdutosDao dao = new TestProdutosDao();
         assertEquals(false, dao.excluirProduto(obj));
	}

}
