package consumiveis;

public class AlimentoMico implements Alimento
{
    private double carboidratos;
    private double proteinas;
    private double lipidios;
    private boolean ehPerecivel;
    
    public double getCarboidratos()
    {
        return this.carboidratos;
    }
    
    public AlimentoMico()
    {
    
    }
    
    public AlimentoMico(double carboidratos, double proteinas, double lipidios, boolean ehPerecivel)
    {
        this.carboidratos = carboidratos;
        this.proteinas = proteinas;
        this.lipidios = lipidios;
        this.ehPerecivel = ehPerecivel;
    }
    
    public void setCarboidratos()
    {
        this.carboidratos = carboidratos;
    }
    
    public double getProteinas()
    {
        return this.proteinas;
    }
    
    public void setProteinas()
    {
        this.proteinas = proteinas;
    }
    
    public double getLipidios()
    {
        return this.lipidios;
    }
    
    public void setLipidios()
    {
        this.lipidios = lipidios;
    }    
    
    @Override
    public String exibirValoresNutricionais()
    {
        return String.format("Carboidratos: %.2f%nProteinas: %.2f%n Lipidios: %.2f%n", getCarboidratos(), getProteinas(), getLipidios());
    }
}
