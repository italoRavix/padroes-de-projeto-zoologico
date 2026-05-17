package cadastro;

import animais.Animal;
import animais.Mamifero;

/* Classe concreta com metodos especificos */
public class FichaCadastroMamifero extends FichaCadastro
{
    public void atualizaNecessitaDesmame(Mamifero mamifero)
    {
        mamifero.setNecessitaDesmame(!(mamifero.getNecessitaDesmame()));
    }
    
    public FichaCadastroMamifero(Animal mamifero)
    {
        super.incrementaId();
        this.setAnimal(mamifero);
    }
}
