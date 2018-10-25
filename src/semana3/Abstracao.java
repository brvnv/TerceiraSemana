package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java
 * coloque ao menos 3 métodos e 3 atributos 
 * encapsule todos os metodos e atributos
 *
 */

public class TocaDisco {
	private boolean emFuncionamento=false;
	private String marca;
	private String modelo;
	private boolean suporta45rpm;
	//getters e setters dos atributos
	private String getMarca() {
		return marca;
	}
	
	private String getModelo() {
		return modelo;
	}

	private boolean getSuporta45rpm() {
		return suporta45rpm;
	}
	
	private boolean getEmFuncionamento() {
		return emFuncionamento;
	}
	
	private void setMarca(String marca) {
		this.marca=marca;
	}
	
	private void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	private void setSuporta45rpm(boolean suporta45rpm) {
		this.suporta45rpm=suporta45rpm;
	}
	
	private boolean setEmFuncionamento(boolean emFuncionamento) {
		if(this.emFuncionamento==emFuncionamento) break; //pula se nada mudou (evitar erros se algo na implementa��o do onoff � alterado, por padr�o isso n�o aconteceria)
		this.emFuncionamento=emFuncionamento;
	}
	

	//m�todos
	private static void onoff() {
		if(getEmFuncionamento()==false) {
			setEmFuncionamento (true);
		} else{
			Agulha.levanta();
		setEmFuncionamento (false);
		}
		System.out.println("Seu " + getMarca() + " " + getModelo() + " est� agora " + (getEmFuncionamento() ? "ligado." : "desligado."));
	}
	
	private static void insereDisco(int polegadas) {
		if((polegadas==7) && (getSuporta45rpm==false)) {
			System.out.println("Disco n�o pode ser tocado.");
			Agulha.levanta();
		}
		if(polegadas!=12) {
			System.out.println("Insira apenas discos.");
			Agulha.levanta();
		}
		setEmFuncionamento(true);
		Agulha.abaixa();
	}
}

public class Agulha {
	private String tipo;
	private int peso;
	private int precisao;
	boolean estaLevantada=true;

private String getTipo() {
	return tipo;
}

private boolean getEstaLevantada(){
	return estaLevantada;
}

private void setTipo(String tipo) {
	this.tipo=tipo;
}

private boolean setEstaLevantada(boolean estaLevantada) {
	this.estaLevantada=estaLevantada;
}

private static void levanta() {
	if(TocaDisco.getEmFuncionamento()==false) System.out.println("Sua car�ssima agulha de tipo " + getTipo() + " se perde em meio aos fios dos eletrodom�sticos. Boa sorte");
	if(getEstaLevantada()==true) System.out.println("A agulha aponta para o teto e reproduz a melodia que consegue capturar de uma l�mpada.");
	System.out.println("O pitch diminui at� finalmente chegar em 0. A m�sica para");
	setEstaLevantada(true);
}

private static void abaixa() {
	if(agulha.getEstaLevantada()==false) System.out.println("Voc� se pergunta de onde a agulha est� tirando m�sicas do Slayer");
	System.out.println("A agulha retorna ao seu habitat natural, junto com a m�sica.");
	tocaDisco.emFuncionamento=true;
	Agulha.setEstaLevantada(true);
}
}

