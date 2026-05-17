package cadastro;

import animais.*;

public class FichaCadastro
{
    private int id;
    private Animal animal;
    
    private static int count = 100;
    
    /*  Demais atributos como relatorios medicos, alergias, observações */
    
    public FichaCadastro(Animal animal)
    {
        this.id = ++count;
        this.animal = animal;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }
    
    public Animal getAnimal()
    {
        return animal;
    }
    
    public void atualizaNecessitaDesmame(Animal animal)
    {
        animal.setNecessitaDesmame(!(animal.getNecessitaDesmame()));
    }    
    
    /*  Demais metodos como relatorios medicos, alergias, observações */
}
