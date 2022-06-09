import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Metodos.TestFuncionariosDao;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {

	@Test
	public void ATestLoginDadosCorretosAdm() {
		 String email, senha;
         email = "savio@fatec";
         senha = "123456";

         TestFuncionariosDao dao = new TestFuncionariosDao();

         assertEquals(true, dao.efetuaLogin(email, senha)); 
	}
	
	@Test
	public void BTestLoginDadosCorretosUsuario() {
		 String email, senha;
         email = "gabriel@fatec.com.br";
         senha = "123456";

         TestFuncionariosDao dao = new TestFuncionariosDao();

         assertEquals(true, dao.efetuaLogin(email, senha)); 
	}
	
	@Test
	public void CTestLoginDadosIncorretos() {
		 String email, senha;
         email = "gabriel@fatec";
         senha = "1234";

         TestFuncionariosDao dao = new TestFuncionariosDao();

         assertEquals(false, dao.efetuaLogin(email, senha)); 
	}

}
