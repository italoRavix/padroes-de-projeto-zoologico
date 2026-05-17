package cadastro;

import animais.*;

public abstract class FichaCadastro
{
    private int id;
    private Animal animal;
    
    private static int count = 100;
    
    /*  Demais atributos como relatorios medicos, alergias, observações */
    
    public int getId()
    {
        return id;
    }
    
    public Animal getAnimal()
    {
        return animal;
    }      
    
    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }  
    
    protected void incrementaId()
    {
        this.id = ++count;    
    }
    
    /*  Demais metodos como relatorios medicos, alergias, observações */
}
