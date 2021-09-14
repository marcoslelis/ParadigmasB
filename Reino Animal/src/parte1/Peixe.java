package parte1;

public class Peixe extends Vertebrados {
	
	public void locomover ()
	{
		System.out.printf("%s nada pelas aguas!\n", NomeCientifico);
	}
	
	public Peixe () {}
	
	public Peixe(String NomeCientifico, int Peso, double Altura, int NumeroPernas)
	{
		this.NomeCientifico = NomeCientifico;
		this.Peso = Peso;
		this.Altura = Altura;
		this.NumeroPernas = NumeroPernas;
	}

}
