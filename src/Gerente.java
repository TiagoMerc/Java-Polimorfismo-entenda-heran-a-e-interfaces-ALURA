// Gerente é um Funcionário, Gerente herda da class Funcionário, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
	private int senha;
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE ");
		return super.getSalario(); //Olha a classe pai
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
}
