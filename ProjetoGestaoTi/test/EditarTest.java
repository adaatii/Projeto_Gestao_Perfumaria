import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

import Metodos.TestClientesDao;
import model.Clientes;

public class EditarTest {
	int erro = 0;
	@Test
	public void CTestEditar() {
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
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {

			TestClientesDao test = new TestClientesDao();
			assertEquals(true, test.alterarCliente(obj));
			erro = 0;

		}
		assertEquals(0, erro);

	}
	

}
