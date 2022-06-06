import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import Metodos.TestClientesDao;
import Metodos.TestFornecedoresDao;
import Metodos.TestFuncionariosDao;
import model.Clientes;
import model.Fornecedores;
import model.Funcionarios;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EditarTest {
	int erro = 0;

	@Test
	public void ATestEditar() {
		Clientes obj = new Clientes();
		obj.setNome("Samuel");
		obj.setRg("90.040.346-6");
		obj.setCpf("123.040.717-80");
		obj.setEmail("");
		obj.setTelefone("");
		obj.setCelular("");
		obj.setCep("80010 - 120");
		obj.setEndereco("Rua teste");
		obj.setNumero(Integer.parseInt("500"));
		obj.setComplemento("");
		obj.setBairro("jardim teste");
		obj.setCidade("São Paulo");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("40"));

		if (obj.getEmail().equals("")) {
			obj.setEmail("Não informado");
		}
		if (obj.getNome().isEmpty() || obj.getRg().isEmpty() || obj.getCpf().isEmpty() || obj.getCidade().isEmpty()
				|| obj.getBairro().isEmpty() || obj.getCep().isEmpty()) {
			// JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {

			TestClientesDao test = new TestClientesDao();
			assertEquals(true, test.alterarCliente(obj));
			erro = 0;

		}
		assertEquals(0, erro);

	}

	@Test
	public void BTestEditarClienteCampoObrigatorioVazio() {

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
			// JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestClientesDao test = new TestClientesDao();
			erro = 0;
			assertEquals(false, test.alterarCliente(obj));

		}
		assertEquals(1, erro);
	}

	@Test
	public void CTestEditarFuncionario() {
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
			// JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFuncionariosDao test = new TestFuncionariosDao();
			erro = 0;
			assertEquals(true, test.alterarFuncionarios(obj));

		}
		assertEquals(0, erro);
	}

	@Test
	public void DTestEditarFuncionarioCampoObrigatoriVazio() {
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
			// JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFuncionariosDao test = new TestFuncionariosDao();
			erro = 0;
			assertEquals(true, test.alterarFuncionarios(obj));

		}
		assertEquals(1, erro);
	}

	@Test
	public void ETestEditarFornecedor() {

		Fornecedores obj = new Fornecedores();
		obj.setNome("AcerAlterado");
		obj.setCnpj("89.816.200/0001-94");
		obj.setEmail("acer@acer");
		obj.setTelefone("");
		obj.setCelular("(12)98784-3745");
		obj.setCep("80010 - 120");
		obj.setEndereco("Rua Acer");
		obj.setNumero(Integer.parseInt("75"));
		obj.setComplemento("");
		obj.setBairro("jardim teste");
		obj.setCidade("AcerAlterado");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("3"));

		if (obj.getNome().isEmpty() || obj.getCnpj().isEmpty() || obj.getCidade().isEmpty() || obj.getBairro().isEmpty()
				|| obj.getCep().isEmpty() || obj.getEmail().isEmpty() || obj.getCelular().isEmpty()) {
			// JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFornecedoresDao test = new TestFornecedoresDao();
			erro = 0;
			assertEquals(true, test.alterarFornecedor(obj));

		}
		assertEquals(0, erro);
	}

	@Test
	public void FTestEditarFornecedorCampoObrigatorioVazio() {

		Fornecedores obj = new Fornecedores();
		obj.setNome("AcerAlterado");
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
			// JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			TestFornecedoresDao test = new TestFornecedoresDao();
			erro = 0;
			assertEquals(true, test.alterarFornecedor(obj));

		}
		assertEquals(1, erro);
	}

}
