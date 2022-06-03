/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import model.Clientes;
import model.Fornecedores;
import model.Funcionarios;

import org.junit.Test;
import org.junit.runners.MethodSorters;

import Metodos.TestClientesDao;
import Metodos.TestFornecedoresDao;
import Metodos.TestFuncionariosDao;

import org.junit.FixMethodOrder;

/**
 *
 * @author adaatii
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastrarTest {
	int erro;

	@Test
	public void ATestCadastrarCliente() {

		Clientes obj = new Clientes();
		obj.setNome("Pedro");
		obj.setRg("90.040.346-6");
		obj.setCpf("123.040.717-80");
		obj.setEmail("");
		obj.setTelefone("");
		obj.setCelular("");
		obj.setCep("80010 - 120");
		obj.setEndereco("Rua teste");
		obj.setNumero(Integer.parseInt("10"));
		obj.setComplemento("");
		obj.setBairro("jardim teste");
		obj.setCidade("Cruzeiro");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("40"));

		if (obj.getEmail().equals("")) {
			obj.setEmail("Não informado");
		}
		if (obj.getNome().isEmpty() || obj.getRg().isEmpty() || obj.getCpf().isEmpty() || obj.getCidade().isEmpty()
				|| obj.getBairro().isEmpty() || obj.getCep().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestClientesDao test = new TestClientesDao();
			erro = 0;
			assertEquals(true, test.cadastrarCliente(obj));

		}
		assertEquals(0, erro);
	}

	@Test
	public void BTestCadastrarClienteDuplicado() {

		Clientes obj = new Clientes();
		obj.setNome("Pedro");
		obj.setRg("90.040.346-6");
		obj.setCpf("123.040.717-80");
		obj.setEmail("");
		obj.setTelefone("");
		obj.setCelular("");
		obj.setCep("80010 - 120");
		obj.setEndereco("Rua teste");
		obj.setNumero(Integer.parseInt("10"));
		obj.setComplemento("");
		obj.setBairro("jardim teste");
		obj.setCidade("Cruzeiro");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("40"));

		if (obj.getEmail().equals("")) {
			obj.setEmail("Não informado");
		}
		if (obj.getNome().isEmpty() || obj.getRg().isEmpty() || obj.getCpf().isEmpty() || obj.getCidade().isEmpty()
				|| obj.getBairro().isEmpty() || obj.getCep().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestClientesDao test = new TestClientesDao();
			erro = 0;
			assertEquals(false, test.cadastrarCliente(obj));

		}
		assertEquals(0, erro);
	}

	@Test
	public void CTestCadastrarClienteCampoObrigatorioVazio() {

		Clientes obj = new Clientes();
		obj.setNome("Pedro");
		obj.setRg("");
		obj.setCpf("");
		obj.setEmail("");
		obj.setTelefone("");
		obj.setCelular("");
		obj.setCep("80010 - 120");
		obj.setEndereco("Rua teste");
		obj.setNumero(Integer.parseInt("10"));
		obj.setComplemento("");
		obj.setBairro("jardim teste");
		obj.setCidade("Cruzeiro");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("40"));

		if (obj.getEmail().equals("")) {
			obj.setEmail("Não informado");
		}
		if (obj.getNome().isEmpty() || obj.getRg().isEmpty() || obj.getCpf().isEmpty() || obj.getCidade().isEmpty()
				|| obj.getBairro().isEmpty() || obj.getCep().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestClientesDao test = new TestClientesDao();
			erro = 0;
			assertEquals(false, test.cadastrarCliente(obj));

		}
		assertEquals(1, erro);
	}

	@Test
	public void DTestCadastrarFuncionario() {
		Funcionarios obj = new Funcionarios();
		obj.setNome("Salomão");
		obj.setRg("77.205.376-9");
		obj.setCpf("185.040.815-82");
		obj.setEmail("salomao@fatec");
		obj.setSenha("123456");
		obj.setCargo("Vendedor");
		obj.setNivel_acesso("Usuário");
		obj.setTelefone("(12)3154-3636");
		obj.setCelular("(12)98784-3745");
		obj.setCep("12700-000");
		obj.setEndereco("Teste de rua");
		obj.setNumero(Integer.parseInt("10"));
		obj.setComplemento("");
		obj.setBairro("Jardim do teste");
		obj.setCidade("Cruzeiro");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("4"));

		if (obj.getNome().isEmpty() || obj.getEndereco().isEmpty() || obj.getBairro().isEmpty()
				|| obj.getCidade().isEmpty() || obj.getRg().isEmpty() || obj.getCpf().isEmpty()
				|| obj.getCep().isEmpty() || obj.getEmail().isEmpty() || obj.getCargo().isEmpty()
				|| obj.getSenha().isEmpty() || obj.getCelular().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFuncionariosDao test = new TestFuncionariosDao();
			erro = 0;
			assertEquals(true, test.cadastrarFuncionarios(obj));

		}
		assertEquals(0, erro);
	}

	@Test
	public void ETestCadastrarFuncionarioDuplicado() {
		Funcionarios obj = new Funcionarios();
		obj.setNome("Salomão");
		obj.setRg("77.205.376-9");
		obj.setCpf("185.040.815-82");
		obj.setEmail("salomao@fatec");
		obj.setSenha("123456");
		obj.setCargo("Vendedor");
		obj.setNivel_acesso("Usuário");
		obj.setTelefone("(12)3154-3636");
		obj.setCelular("(12)98784-3745");
		obj.setCep("12700-000");
		obj.setEndereco("Teste de rua");
		obj.setNumero(Integer.parseInt("10"));
		obj.setComplemento("");
		obj.setBairro("Jardim do teste");
		obj.setCidade("Cruzeiro");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("4"));

		if (obj.getNome().isEmpty() || obj.getEndereco().isEmpty() || obj.getBairro().isEmpty()
				|| obj.getCidade().isEmpty() || obj.getRg().isEmpty() || obj.getCpf().isEmpty()
				|| obj.getCep().isEmpty() || obj.getEmail().isEmpty() || obj.getCargo().isEmpty()
				|| obj.getSenha().isEmpty() || obj.getCelular().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFuncionariosDao test = new TestFuncionariosDao();
			erro = 0;
			assertEquals(false, test.cadastrarFuncionarios(obj));

		}
		assertEquals(0, erro);
	}

	@Test
	public void FTestCadastrarFuncionarioCampoObrigatoriVazio() {
		Funcionarios obj = new Funcionarios();
		obj.setNome("Salomão");
		obj.setRg("");
		obj.setCpf("");
		obj.setEmail("salomao@fatec");
		obj.setSenha("123456");
		obj.setCargo("Vendedor");
		obj.setNivel_acesso("Usuário");
		obj.setTelefone("(12)3154-3636");
		obj.setCelular("(12)98784-3745");
		obj.setCep("12700-000");
		obj.setEndereco("Teste de rua");
		obj.setNumero(Integer.parseInt("10"));
		obj.setComplemento("");
		obj.setBairro("Jardim do teste");
		obj.setCidade("Cruzeiro");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("4"));

		if (obj.getNome().isEmpty() || obj.getEndereco().isEmpty() || obj.getBairro().isEmpty()
				|| obj.getCidade().isEmpty() || obj.getRg().isEmpty() || obj.getCpf().isEmpty()
				|| obj.getCep().isEmpty() || obj.getEmail().isEmpty() || obj.getCargo().isEmpty()
				|| obj.getSenha().isEmpty() || obj.getCelular().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFuncionariosDao test = new TestFuncionariosDao();
			erro = 0;
			assertEquals(true, test.cadastrarFuncionarios(obj));

		}
		assertEquals(1, erro);
	}

	@Test
	public void GTestCadastrarFornecedor() {

		Fornecedores obj = new Fornecedores();
		obj.setNome("Acer");
		obj.setCnpj("89.816.200/0001-94");
		obj.setEmail("acer@acer");
		obj.setTelefone("");
		obj.setCelular("(12)98784-3745");
		obj.setCep("80010 - 120");
		obj.setEndereco("Rua Acer");
		obj.setNumero(Integer.parseInt("75"));
		obj.setComplemento("");
		obj.setBairro("jardim teste");
		obj.setCidade("Acer");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("3"));

		if (obj.getNome().isEmpty() || obj.getCnpj().isEmpty() || obj.getCidade().isEmpty() || obj.getBairro().isEmpty()
				|| obj.getCep().isEmpty() || obj.getEmail().isEmpty() || obj.getCelular().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFornecedoresDao test = new TestFornecedoresDao();
			erro = 0;
			assertEquals(true, test.cadastrarFornecedores(obj));

		}
		assertEquals(0, erro);
	}
	
	@Test
	public void HTestCadastrarFornecedorDuplicado() {

		Fornecedores obj = new Fornecedores();
		obj.setNome("Acer");
		obj.setCnpj("89.816.200/0001-94");
		obj.setEmail("acer@acer");
		obj.setTelefone("");
		obj.setCelular("(12)98784-3745");
		obj.setCep("80010 - 120");
		obj.setEndereco("Rua Acer");
		obj.setNumero(Integer.parseInt("75"));
		obj.setComplemento("");
		obj.setBairro("jardim teste");
		obj.setCidade("Acer");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("3"));

		if (obj.getNome().isEmpty() || obj.getCnpj().isEmpty() || obj.getCidade().isEmpty() || obj.getBairro().isEmpty()
				|| obj.getCep().isEmpty() || obj.getEmail().isEmpty() || obj.getCelular().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFornecedoresDao test = new TestFornecedoresDao();
			erro = 0;
			assertEquals(false, test.cadastrarFornecedores(obj));

		}
		assertEquals(0, erro);
	}
	
	@Test
	public void ITestCadastrarFornecedorCampoObrigatorioVazio() {

		Fornecedores obj = new Fornecedores();
		obj.setNome("Acer");
		obj.setCnpj("");
		obj.setEmail("acer@acer");
		obj.setTelefone("");
		obj.setCelular("(12)98784-3745");
		obj.setCep("80010 - 120");
		obj.setEndereco("Rua Acer");
		obj.setNumero(Integer.parseInt("75"));
		obj.setComplemento("");
		obj.setBairro("jardim teste");
		obj.setCidade("Acer");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("3"));

		if (obj.getNome().isEmpty() || obj.getCnpj().isEmpty() || obj.getCidade().isEmpty() || obj.getBairro().isEmpty()
				|| obj.getCep().isEmpty() || obj.getEmail().isEmpty() || obj.getCelular().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFornecedoresDao test = new TestFornecedoresDao();
			erro = 0;
			assertEquals(true, test.cadastrarFornecedores(obj));

		}
		assertEquals(1, erro);
	}
	
	

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}
}
