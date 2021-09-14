package parte1;

public abstract class Vertebrados extends Cordados {
	
	public int NumeroPernas;
	
	
	public int getNumeroPernas()
	{
		return NumeroPernas;
	}
	public String getNomeCientifico()
	{
		return NomeCientifico;
	}
	public int getPeso()
	{
		return Peso;
	}
	public double getAltura()
	{
		return Altura;
	}
	
	public void setNumeroPernas (int NumeroPernas)
	{
		this.NumeroPernas = NumeroPernas;
	}
	public void setNomeCientifico (String NomeCientifico)
	{
		this.NomeCientifico = NomeCientifico;
	}
	public void setPeso (int Peso)
	{
		this.Peso = Peso;
	}
	public void setAltura (float Altura)
	{
		this.Altura = Altura;
	}
	
	
	
	
	
	
	
	
	

}
