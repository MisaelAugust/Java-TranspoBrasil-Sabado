package br.com.coursojava;

public class Automovel extends Veiculo{

	public Automovel() {
		super((Integer)null);
	}
	public String retornaMarca(){
		return super.getMarca();
	}
	
	public String getMarca(){
		return "Marca sobrescrita";
	}
	
}
