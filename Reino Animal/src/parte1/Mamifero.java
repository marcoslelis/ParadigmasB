package parte1;

public  class Mamifero extends Vertebrados {
	
	public void locomover ()
	{
		System.out.printf("%s anda pela terra!\n", NomeCientifico);
	}
	
	public void Mamifero() {}
	
	public Mamifero (String NomeCientifico, int Peso, double Altura, int NumeroPernas) 
	{
		this.NomeCientifico = NomeCientifico;
		this.Peso = Peso;
		this.Altura = Altura;
		this.NumeroPernas = NumeroPernas;
	}
	
	
	
}
