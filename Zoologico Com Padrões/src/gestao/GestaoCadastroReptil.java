package gestao;

import animais.*;
import cadastro.*;

public class GestaoCadastroReptil extends GestaoCadastro
{
    @Override
    public Animal createAnimal()
    {
        return new Reptil();
    }

    @Override
    public FichaCadastro createFichaCadastro(Animal animal)
    {
        return new FichaCadastroReptil(animal);
    } 
    
}
