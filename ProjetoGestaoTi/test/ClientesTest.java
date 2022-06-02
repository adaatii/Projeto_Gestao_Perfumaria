/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import dao.ClientesDao;
import static org.junit.Assert.assertEquals;
import model.Clientes;
import org.junit.Test;

/**
 *
 * @author adaatii
 */

public class ClientesTest {
	int erro;

	/*@Test
	public void TestCadastrar() {

		Clientes obj = new Clientes();
		obj.setNome("Pedro");
		obj.setRg("75.748.346-6");
		obj.setCpf("236.977.717-80");
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

		if (obj.getEmail().equals("")) {
			obj.setEmail("Não informado");
		}
		if (obj.getNome().isEmpty() || obj.getRg().isEmpty() || obj.getCpf().isEmpty() || obj.getCidade().isEmpty()
				|| obj.getBairro().isEmpty() || obj.getCep().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {
			ClientesDao test = new ClientesDao();
			erro = 0;
			assertEquals(true, test.cadastrarCliente(obj));

		}
		assertEquals(0, erro);
	}*/

	/*@Test
	public void TestEditar() {
		Clientes obj = new Clientes();
		obj.setNome("Samuel");
		obj.setRg("75.748.346-6");
		obj.setCpf("236.977.717-80");
		obj.setEmail("");
		obj.setTelefone("");
		obj.setCelular("");
		obj.setCep("80010 - 120");
		obj.setEndereco("Rua teste");
		obj.setNumero(Integer.parseInt("11"));
		obj.setComplemento("");
		obj.setBairro("jardim teste");
		obj.setCidade("Cruzeiro");
		obj.setUf("SP");
		obj.setId(Integer.parseInt("68"));

		if (obj.getEmail().equals("")) {
			obj.setEmail("Não informado");
		}
		if (obj.getNome().isEmpty() || obj.getRg().isEmpty() || obj.getCpf().isEmpty() || obj.getCidade().isEmpty()
				|| obj.getBairro().isEmpty() || obj.getCep().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
			erro = 1;
		} else {

			ClientesDao test = new ClientesDao();
			assertEquals(true, test.alterarCliente(obj));
			erro = 0;

		}
		assertEquals(0, erro);

	}*/
	
	@Test
	public void TestExcluir() {
		Clientes obj = new Clientes();

        obj.setId(Integer.parseInt("57"));

        ClientesDao test = new ClientesDao();
       assertEquals(true, test.excluirCliente(obj));
       
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}
}
