package cadastro;

import animais.*;

/* Essa classe poderia ter diversos atributos relativos à relatorios medicos, alergias, observaçoes, etc */
/* Também poderia ter diversos métodos para lidar com esses atributos */
public abstract class FichaCadastro
{
    private int id;
    private Animal animal;
    
    private static int count = 100;
    
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
    
}
