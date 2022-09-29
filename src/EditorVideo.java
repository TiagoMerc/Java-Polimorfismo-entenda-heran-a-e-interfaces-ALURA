// Gerente é um Funcionário, Gerente herda da class Funcionário
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método do bonificação do Editor de video");
		return super.getBonificacao() + 100; //Olha a classe pai
	}
}
