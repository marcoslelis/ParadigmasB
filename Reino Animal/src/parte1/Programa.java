package parte1;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero Cachorro = new Mamifero ("Canis Lupus Familiaris", 30, 0.5, 4);
		Ave Coruja = new Ave ("Strigiformes", 4, 0.2, 2);
		Peixe Salmao = new Peixe("Salmo salar", 1, 0.1, 0);
		
		Cachorro.locomover();
		Coruja.locomover();
		Salmao.locomover();
	
		
	}

}
