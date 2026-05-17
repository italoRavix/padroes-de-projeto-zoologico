package cadastro;

import animais.Animal;

public class FichaCadastroReptil extends FichaCadastro
{
    public FichaCadastroReptil(Animal reptil)
    {
        super.incrementaId();
        this.setAnimal(reptil);
    }
}
