package animais;

import especie.Especie;

public class Animal
{
    private int id;
    private Especie especie;
    private char sexo;
    private int idadeMeses;
    private static int count = 0;
    private boolean necessitaDesmame;
    
    public int getId()
    {
        return id;
    }
    
    public Especie getEspecie()
    {
        return especie;
    }
    
    public void setEspecie(Especie especie)
    {
        this.especie = especie;
    }
    
    public char getSexo()
    {
        return sexo;
    }
    
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }
    
    public int getIdadeMeses()
    {
        return idadeMeses;
    }
    
    public void setIdadeMeses(int idadeMeses)
    {
        this.idadeMeses = idadeMeses;
    }   
    
    public boolean getNecessitaDesmame()
    {
        return necessitaDesmame;
    }
    
    public void setNecessitaDesmame(boolean necessitaDesmame)
    {
        this.necessitaDesmame = necessitaDesmame;
    }      
    
    // deve ser protected para permitir que as subclassem incrementem o id   
    protected void incrementaId()
    {
        this.id = ++count;
    } 
}
