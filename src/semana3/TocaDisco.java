package semana3;

public class TocaDisco {
	private boolean emFuncionamento=false;
	private String marca;
	private String modelo;
	private boolean suporta45rpm;
	private String agulhaTipo;
	private int agulhaPeso;
	private int agulhaPrecisao;
	private boolean agulhaLevantada;
	
	//getters e setters dos atributos
	protected String getMarca() {
		return this.marca;
	}
	
	protected String getModelo() {
		return this.modelo;
	}

	protected boolean getSuporta45rpm() {
		return this.suporta45rpm;
	}
	
	protected boolean getEmFuncionamento() {
		return this.emFuncionamento;
	}
	
	protected String getAgulhaTipo() {
		return agulhaTipo;
	}
	//n�o precisamos saber do peso nem precis�o da agulha
	protected boolean getAgulhaLevantada() {
		return agulhaLevantada;
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
	
	protected void setEmFuncionamento(boolean emFuncionamento) {
		if(this.emFuncionamento==emFuncionamento) System.out.println("O que voc� acha que acontece?");
		this.emFuncionamento=emFuncionamento;
	}

	protected void setAgulhaTipo (String tipo) {
		this.agulhaTipo=tipo;
	}
	
	protected void setAgulhaPrecisao(int precisao) {
		this.agulhaPrecisao=precisao;
	}
	
	protected void setAgulhaPeso(int peso) {
		this.agulhaPeso=peso;
	}
	//setAgulhaLevantada vem a�

	//m�todos
	protected void onoff() {
		if(this.getEmFuncionamento()==false) {
			this.setEmFuncionamento (true);
		} else{
			this.agulhaLevanta();
		this.setEmFuncionamento (false);
		}
		System.out.println("Seu " + this.getMarca() + " " + this.getModelo() + " est� agora " + (this.getEmFuncionamento() ? "ligado." : "desligado."));
	}
	
	protected void insereDisco(int polegadas) {
		if((polegadas==7) && (this.getSuporta45rpm==false)) {
			System.out.println("Disco n�o pode ser tocado.");
			this.agulhaLevanta();
		}
		if(polegadas!=12) {
			System.out.println("Insira apenas discos.");
			this.agulhaLevanta();
		}
		this.agulhaAbaixa(); //disco � reconhecido e come�a a girar
	}
	
	protected void agulhaLevanta() {
		if(this.getEmFuncionamento()==false) System.out.println("Sua car�ssima agulha de tipo " + this.getAgulhaTipo() + " se perde em meio aos fios dos eletrodom�sticos. Boa sorte");
		if(this.getAgulhaLevantada()) System.out.println("A agulha aponta para o teto e reproduz a melodia que consegue capturar de uma l�mpada.");
		System.out.println("O pitch diminui at� finalmente chegar em 0. A m�sica para");
		this.agulhaLevantada=true;
	}

	protected void agulhaAbaixa() {
		if(this.getAgulhaLevantada()==false) System.out.println("Voc� se pergunta de onde a agulha est� tirando m�sicas do Slayer");
		System.out.println("A agulha retorna ao seu habitat natural, junto com a m�sica.");
		this.agulhaLevantada=false;
	}
}
