import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Metodos.*;
import model.Clientes;
import model.ItemVenda;
import model.Produtos;
import model.Vendas;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VendaTest {
	int erro = 0;
	Clientes cliente = new Clientes();

	@Test
	public void ATestVendaValorMaiorIgualQueTotal() {
		double pagcartao, pagdinheiro, pagcheque, totalpago, totalvenda, troco;

		pagcartao = Double.parseDouble("50");
		pagcheque = Double.parseDouble("50");
		pagdinheiro = Double.parseDouble("50");
		totalvenda = Double.parseDouble("150");

		// Calculo do Troco
		totalpago = pagcartao + pagcheque + pagdinheiro;

		troco = totalpago - totalvenda;

		if (totalpago >= totalvenda) {

			// Dados do cliente (ID)
			Clientes obj = new Clientes();
			TestClientesDao dao = new TestClientesDao();
			obj = dao.buscaClienteCpf("155.040.900-80");
			cliente = obj;

			Vendas objvenda = new Vendas();
			objvenda.setCliente(cliente);

			// Pega data atual
			Date data = new Date();
			SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd");
			String datamysql = dataEUA.format(data);

			objvenda.setData_venda(datamysql);

			// Total da venda
			objvenda.setTotal_venda(totalvenda);

			// Observações
			objvenda.setObs("");

			TestVendasDao dao_venda = new TestVendasDao();

			assertEquals(true, dao_venda.cadastrarVenda(objvenda));

			// Retornar o ID da ultima venda realizada
			objvenda.setId(dao_venda.retornaUltimaVenda());
			System.out.println("Id da ultima venda: "+ objvenda.getId());
			// Cadastrando os produtos na tabela itensvendas

			for (int i = 0; i < 1; i++) {
				int qtd_estoque, qtd_comprada, qtd_atualizada;

				Produtos objp = new Produtos();
				TestProdutosDao dao_produtos = new TestProdutosDao();

				ItemVenda item = new ItemVenda();
				item.setVenda(objvenda);

				objp.setId(Integer.parseInt("1"));
				item.setProduto(objp);
				item.setQtd(Integer.parseInt("1"));
				item.setSubtotal(Double.parseDouble("150"));

				// Baixa no estoque
				qtd_estoque = dao_produtos.retornaEstoqueAtual(objp.getId());
				qtd_comprada = Integer.parseInt("1");
				qtd_atualizada = qtd_estoque - qtd_comprada;
//                System.out.println(qtd_estoque);
//                System.out.println(qtd_atualizada);

				dao_produtos.baixarEstoque(objp.getId(), qtd_atualizada);
				

				TestItemVendaDao daoitem = new TestItemVendaDao();
				daoitem.cadastrarItem(item);

			}

			//JOptionPane.showMessageDialog(null, "Venda registrada com sucesso com sucesso!");

		} else {
			//JOptionPane.showMessageDialog(null, "Operação cancelada: valor menor que o total da compra.");
		}

	}
	
	@Test
	public void BTestVendaValorMenorQueTotal() {
		double pagcartao, pagdinheiro, pagcheque, totalpago, totalvenda, troco;

		pagcartao = Double.parseDouble("50");
		pagcheque = Double.parseDouble("5");
		pagdinheiro = Double.parseDouble("10");
		totalvenda = Double.parseDouble("150");

		// Calculo do Troco
		totalpago = pagcartao + pagcheque + pagdinheiro;

		troco = totalpago - totalvenda;

		if (totalpago >= totalvenda) {

			// Dados do cliente (ID)
			Clientes obj = new Clientes();
			TestClientesDao dao = new TestClientesDao();
			obj = dao.buscaClienteCpf("155.040.900-80");
			cliente = obj;

			Vendas objvenda = new Vendas();
			objvenda.setCliente(cliente);

			// Pega data atual
			Date data = new Date();
			SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd");
			String datamysql = dataEUA.format(data);

			objvenda.setData_venda(datamysql);

			// Total da venda
			objvenda.setTotal_venda(totalvenda);

			// Observações
			objvenda.setObs("");

			TestVendasDao dao_venda = new TestVendasDao();

			assertEquals(true, dao_venda.cadastrarVenda(objvenda));

			// Retornar o ID da ultima venda realizada
			objvenda.setId(dao_venda.retornaUltimaVenda());
			System.out.println("Id da ultima venda: "+ objvenda.getId());
			// Cadastrando os produtos na tabela itensvendas

			for (int i = 0; i < 1; i++) {
				int qtd_estoque, qtd_comprada, qtd_atualizada;

				Produtos objp = new Produtos();
				TestProdutosDao dao_produtos = new TestProdutosDao();

				ItemVenda item = new ItemVenda();
				item.setVenda(objvenda);

				objp.setId(Integer.parseInt("1"));
				item.setProduto(objp);
				item.setQtd(Integer.parseInt("1"));
				item.setSubtotal(Double.parseDouble("150"));

				// Baixa no estoque
				qtd_estoque = dao_produtos.retornaEstoqueAtual(objp.getId());
				qtd_comprada = Integer.parseInt("1");
				qtd_atualizada = qtd_estoque - qtd_comprada;
//                System.out.println(qtd_estoque);
//                System.out.println(qtd_atualizada);

				dao_produtos.baixarEstoque(objp.getId(), qtd_atualizada);

				TestItemVendaDao daoitem = new TestItemVendaDao();
				daoitem.cadastrarItem(item);

			}

			//JOptionPane.showMessageDialog(null, "Venda registrada com sucesso com sucesso!");
			erro = 0;

		} else {
			//JOptionPane.showMessageDialog(null, "Operação cancelada: valor menor que o total da compra.");
			erro = 1;
		}
		assertEquals(1, erro);
	}
	
	@Test
	public void CTestBaixaDeEstoque() {
		int qtd_estoque, qtd_comprada, qtd_atualizada;
		
		Produtos objp = new Produtos();
		TestProdutosDao dao_produtos = new TestProdutosDao();
		

		objp.setId(Integer.parseInt("1"));
		
		// Baixa no estoque
		qtd_estoque = dao_produtos.retornaEstoqueAtual(objp.getId());
		qtd_comprada = Integer.parseInt("1");
		qtd_atualizada = qtd_estoque - qtd_comprada;
//        System.out.println(qtd_estoque);
//        System.out.println(qtd_atualizada);

		assertEquals(true, dao_produtos.baixarEstoque(objp.getId(), qtd_atualizada)); 
	}

}
