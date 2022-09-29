// Gerente é um Funcionário, Gerente herda da class Funcionário
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamdno o método do bonificação do Designer");
		return super.getBonificacao() + 200; //Olha a classe pai
	}
}
