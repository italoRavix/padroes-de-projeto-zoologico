package gestao;

import animais.*;
import cadastro.*;

/* Classe concreta */
public class GestaoCadastroMamifero extends GestaoCadastro
{
    @Override
    public Animal createAnimal()
    {
        return new Mamifero();
    }
    
    @Override
    public FichaCadastro createFichaCadastro(Animal animal)
    {
        return new FichaCadastroMamifero(animal);
    }    
    
}
