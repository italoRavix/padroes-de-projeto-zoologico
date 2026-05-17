package especie;

public enum Especie
{
    MICO(Nome.MICO, Dieta.ONIVORO, Grupo.MAMIFERO),
    CAPIVARA(Nome.CAPIVARA, Dieta.HERBIVORO, Grupo.MAMIFERO),
    ELEFANTE(Nome.ELEFANTE, Dieta.HERBIVORO, Grupo.MAMIFERO),
    LEAO(Nome.LEAO, Dieta.CARNIVORO, Grupo.MAMIFERO),
    TIGRE(Nome.TIGRE, Dieta.CARNIVORO, Grupo.MAMIFERO),
    CHIMPANZE(Nome.CHIMPANZE, Dieta.ONIVORO, Grupo.MAMIFERO),
    URSO_PARDO(Nome.URSO_PARDO, Dieta.ONIVORO, Grupo.MAMIFERO),
    IGUANA(Nome.IGUANA, Dieta.HERBIVORO, Grupo.REPTIL),
    TARTARUGA_VERDE(Nome.TARTARUGA_VERDE, Dieta.HERBIVORO, Grupo.REPTIL),
    JACARE(Nome.JACARE, Dieta.CARNIVORO, Grupo.REPTIL),
    SERPENTE(Nome.SERPENTE, Dieta.CARNIVORO, Grupo.REPTIL),
    JABUTI(Nome.JABUTI, Dieta.ONIVORO, Grupo.REPTIL),
    TEIU(Nome.TEIU, Dieta.ONIVORO, Grupo.REPTIL);
    
    private Nome nome;
    private Dieta dieta;
    private Grupo grupo;
    
    Especie(Nome nome, Dieta dieta, Grupo grupo)
    {
        this.nome = nome;
        this.dieta = dieta;
        this.grupo = grupo;
    }
    
    public Nome getNome()
    {
        return nome;
    }
    
    public Dieta getDieta()
    {
        return dieta;
    }
    
    public Grupo getGrupo()
    {
        return grupo;
    }    
}
