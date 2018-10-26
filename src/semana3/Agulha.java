package semana3;

public class Agulha {
	private String tipo;
	private int peso;
	private int precisao;
	boolean estaLevantada=true;

protected String getTipo() {
	return this.tipo;
}

protected boolean getEstaLevantada(){
	return this.estaLevantada;
}

protected void setTipo(String tipo) {
	this.tipo=tipo;
}

protected void setPeso(int peso) {
	this.peso=peso;
}

protected void setPrecisao(int precisao) {
	this.precisao=precisao;
}

protected void setEstaLevantada(boolean estaLevantada) {
	this.estaLevantada=estaLevantada;
}

protected static void levanta() {
	if(TocaDisco.getEmFuncionamento()==false) System.out.println("Sua car�ssima agulha de tipo " + this.getTipo() + " se perde em meio aos fios dos eletrodom�sticos. Boa sorte");
	if(this.getEstaLevantada()==true) System.out.println("A agulha aponta para o teto e reproduz a melodia que consegue capturar de uma l�mpada.");
	System.out.println("O pitch diminui at� finalmente chegar em 0. A m�sica para");
	this.setEstaLevantada(true);
}

protected static void abaixa() {
	if(this.getEstaLevantada()==false) System.out.println("Voc� se pergunta de onde a agulha est� tirando m�sicas do Slayer");
	System.out.println("A agulha retorna ao seu habitat natural, junto com a m�sica.");
	this.setEstaLevantada(false);
}
}
