import static org.junit.Assert.*;

import org.junit.Test;

import Metodos.TestClientesDao;
import dao.ClientesDao;
import model.Clientes;

public class ExcluirTest {

	@Test
	public void DTestExcluir() {
		Clientes obj = new Clientes();

		obj.setId(Integer.parseInt("40"));

		TestClientesDao test = new TestClientesDao();
		assertEquals(true, test.excluirCliente(obj));

	}

}
