package semana3;

public class TocaDisco {
	private boolean emFuncionamento=false;
	private String marca;
	private String modelo;
	private boolean suporta45rpm;
	//getters e setters dos atributos
	protected String getMarca() {
		return marca;
	}
	
	protected String getModelo() {
		return modelo;
	}

	protected boolean getSuporta45rpm() {
		return suporta45rpm;
	}
	
	protected boolean getEmFuncionamento() {
		return emFuncionamento;
	}
	
	protected void setMarca(String marca) {
		this.marca=marca;
	}
	
	protected void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	protected void setSuporta45rpm(boolean suporta45rpm) {
		this.suporta45rpm=suporta45rpm;
	}
	
	protected boolean setEmFuncionamento(boolean emFuncionamento) {
		if(this.emFuncionamento==emFuncionamento) break; //pula se nada mudou (evitar erros se algo na implementa��o do onoff � alterado, por padr�o isso n�o aconteceria)
		this.emFuncionamento=emFuncionamento;
	}
	

	//m�todos
	protected void onoff() {
		if(getEmFuncionamento()==false) {
			setEmFuncionamento (true);
		} else{
			Agulha.levanta();
		setEmFuncionamento (false);
		}
		System.out.println("Seu " + getMarca() + " " + getModelo() + " est� agora " + (getEmFuncionamento() ? "ligado." : "desligado."));
	}
	
	protected void insereDisco(int polegadas) {
		if((polegadas==7) && (getSuporta45rpm==false)) {
			System.out.println("Disco n�o pode ser tocado.");
			Agulha.levanta();
		}
		if(polegadas!=12) {
			System.out.println("Insira apenas discos.");
			Agulha.levanta();
		}
		Agulha.abaixa();
	}
}
