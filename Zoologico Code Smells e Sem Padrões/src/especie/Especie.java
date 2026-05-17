package especie;

public enum Especie
{
    MICO(Nome.MICO, Dieta.ONIVORO),
    CAPIVARA(Nome.CAPIVARA, Dieta.HERBIVORO),
    ELEFANTE(Nome.ELEFANTE, Dieta.HERBIVORO),
    LEAO(Nome.LEAO, Dieta.CARNIVORO),
    TIGRE(Nome.TIGRE, Dieta.CARNIVORO),
    CHIMPANZE(Nome.CHIMPANZE, Dieta.ONIVORO),
    URSO_PARDO(Nome.URSO_PARDO, Dieta.ONIVORO);
    
    private Nome nome;
    private Dieta dieta;
    
    Especie(Nome nome, Dieta dieta)
    {
        this.nome = nome;
        this.dieta = dieta;
    }
    
    public Nome getNome()
    {
        return nome;
    }
    
    public Dieta getDieta()
    {
        return dieta;
    }   
}
