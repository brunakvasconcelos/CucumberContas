


import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {
	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {
		System.out.println("Passou aqui!");

	}

	@Quando("^executá-lo$")
	public void executá_lo() throws Throwable {

	}

	@Entao("^a especificação deve finalizar com sucesso$")
	public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {

	}

	private int contador = 0;

	@Dado("^que o valor do contador é 15$")
	public void que_o_valor_do_contador_é() throws Throwable {
		contador = 15;
	}

	@Quando("^eu incrementar em 3$")
	public void eu_incrementar_em() throws Throwable {
		contador = contador + 3 ;
	}

	@Então("^o valor do contador será 18$")
	public void o_valor_do_contador_será() throws Throwable {
					Assert.assertEquals(18,contador);
		
	}
	@Dado("^que o ticket (especial)? e A.(\\d+)$")
	public void que_o_ticket_é_AF(String tipo, int arg1) throws Throwable {
	    
	}

	
	@Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
	public void que_o_valor_da_passagem_é_R$(int arg1, int arg2) throws Throwable {
	   
	}

	@Dado("^que o nome do passageiro é \"(.*)\"$")
	public void que_o_nome_do_passageiro_é(String arg1) throws Throwable {
	    
	}

	@Dado("^que o telefone do passageiro é (\\d+)-(\\d+)$")
	public void que_o_telefone_do_passageiro_é(int arg1, int arg2) throws Throwable {
	    
	}

	@Quando("^criar os steps$")
	public void criar_os_steps() throws Throwable {
	    
	}

	@Então("^o teste vai funcionar$")
	public void o_teste_vai_funcionar() throws Throwable {
	    
	}

}
