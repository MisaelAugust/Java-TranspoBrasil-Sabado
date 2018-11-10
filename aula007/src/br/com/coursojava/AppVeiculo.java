package br.com.coursojava;

public class AppVeiculo {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo(1);
		
		v1.setMarca("Honda");
		v1.setModelo("Civic");
		//v1.setId(1);
		v1.setAnoFabricacao(2018);
		v1.setAnoModelo(2019);
		
		Veiculo v2 = new Veiculo();
		v2.setMarca("Honda");
		v2.setModelo("Civic");
		v2.setId(1);
		v2.setAnoFabricacao(2018);
		v2.setAnoModelo(2019);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.equals(v2));
		System.out.println("oi".equals("oi"));
		
		Automovel auto = new Automovel();
		auto.setMarca("BMW");
		auto.getMarca();
		auto.retornaMarca();
		
		System.out.println(auto.getMarca() +" - " + v1.getMarca()+" - "+auto.retornaMarca());
	}
}
