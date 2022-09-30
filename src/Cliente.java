
public class Cliente implements Autenticavel { // Como estou herdando métodos de uma classe Interface, tenho que implements os métodos

	private int senha;
	
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
