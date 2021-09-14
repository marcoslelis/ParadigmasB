package parte1;

public class Ave extends Vertebrados {
	
	public void locomover ()
	{
		System.out.printf("%s voa pelos ares!\n", NomeCientifico);
	}

	public void Ave () {}
	
	public Ave (String NomeCientifico, int Peso, double Altura, int NumeroPernas) 
	{
		this.NomeCientifico = NomeCientifico;
		this.Peso = Peso;
		this.Altura = Altura;
		this.NumeroPernas = NumeroPernas;
	}

	
	
	
	
	
	
	
}
