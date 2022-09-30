// Gerente é um Funcionário, Gerente herda da class Funcionário, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE ");
		return super.getSalario(); //Olha a classe pai
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
