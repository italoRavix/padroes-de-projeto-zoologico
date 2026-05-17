package cadastro;

import animais.*;

/* Essa classe poderia ter diversos atributos relativos à relatorios medicos, alergias, observaçoes, etc */
/* Também poderia ter diversos métodos para lidar com esses atributos */
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
    
    @Override
    public String toString()
    {
        return String.format("FICHA: %d%n%s", getId(), getAnimal().toString());
    }    
}
