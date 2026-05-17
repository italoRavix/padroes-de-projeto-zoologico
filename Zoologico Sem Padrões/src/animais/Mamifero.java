package animais;

public class Mamifero extends Animal
{
    private boolean necessitaDesmame;
    
    public Mamifero()
    {
        super.incrementaId();
    }
    
    public boolean getNecessitaDesmame()
    {
        return necessitaDesmame;
    }
    
    public void setNecessitaDesmame(boolean necessitaDesmame)
    {
        this.necessitaDesmame = necessitaDesmame;
    }
}
