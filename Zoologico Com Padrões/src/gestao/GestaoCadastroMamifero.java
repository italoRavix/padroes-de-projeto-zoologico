package gestao;

import animais.*;
import cadastro.*;

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
