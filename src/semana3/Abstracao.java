package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java
 * coloque ao menos 3 métodos e 3 atributos 
 * encapsule todos os metodos e atributos
 *
 *Naturalmente os m�todos n�o funcionam aqui, da forma que eu pensei classes como Automatico extends TocaDisco, e isso � para o pr�ximo exerc�cio.
 */

public class TocaDisco {
	private boolean emFuncionamento=false;
	private String marca;
	private String modelo;
	private boolean suporta45rpm;
	
	private static boolean onoff() {
		if(onoff==false) {
			return true;
			System.out.println("Seu " + marca + " " + modelo + " est� agora ligado.");
		}
		return false;
		if(emFuncionamento==true) System.out.println("O pitch da m�sica diminui conforme o bra�o equipado com sua " + Agulha.getTipo() + " repousa e o toca disco desliga.");
		System.out.println("Seu " + marca + " " + modelo + " est� agora desligado.");
	}
	
	private static void insereDisco(int polegadas) {
		if((polegadas==7) && (suporta45rpm==false)) {
			System.out.println("Disco n�o pode ser tocado.");
			emFuncionamento=false;
		}
		if(polegadas!=12) {
			System.out.println("Insira apenas discos.");
			emFuncionamento=false;
		}
		emFuncionamento=true;
		System.out.println("O bra�o repousa sobre o prato");
	}
	
	private boolean getEmFuncionamento() {
		return emFuncionamento;
	}
}

public class Agulha {
	private String tipo;
	private int peso;
	private int precisao;
	boolean estaLevantada;

private boolean getEstaLevantada(){
	return estaLevantada;
}

private static void levanta() {
	if(TocaDisco.getEmFuncionamento==false) System.out.println("Sua car�ssima agulha de tipo " + tipo + " se perde em meio aos fios dos eletrodom�sticos. Boa sorte");
	if(estaLevantada==true) System.out.println("A agulha aponta para o teto e reproduz a melodia que consegue capturar de uma l�mpada.");
	System.out.println("O pitch diminui at� finalmente chegar em 0. A m�sica para");
	TocaDisco.emFuncionamento=false;
	estaLevantada=false;
}

private static void abaixa() {
	if(TocaDisco.getEmFuncionamento()==false) System.out.println("A agulha se abaixa. Nada acontece");
	if(agulha.getEstaLevantada()==false) System.out.println("Voc� se pergunta de onde a agulha est� tirando m�sicas do Slayer");
	System.out.println("A agulha retorna ao seu habitat natural, junto com a m�sica.");
	tocaDisco.emFuncionamento=true;
	Agulha.setEstaLevantada(true);
}
}

