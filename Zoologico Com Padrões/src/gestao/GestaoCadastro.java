package gestao;

import java.util.List;
import java.util.ArrayList;
import animais.*;
import especie.*;
import cadastro.*;

/* Essa classe poderia ter diversos métodos para lidar com a gestão de fichas de cadastro */
public abstract class GestaoCadastro
{
    private List<FichaCadastro> cadastros = new ArrayList<>();
    
    /* Regra de negocio */
    public void cadastrar(Especie especie) 
    {   
        Animal animal = createAnimal(); /* Cria o animal usando o Factory Method, independentemente de qual classe concreta esteja usando */
        animal.setEspecie(especie);
    
        FichaCadastro fichaCadastro = createFichaCadastro(animal); /* Cria o cadastro usando o Factory Method, independentemente de qual classe concreta esteja usando */
        
        /* ...Outros metodos e operaçoes relacionados à lógica para cadastro de um animal... */
        
        inserir(fichaCadastro);
    }
    
    public List<FichaCadastro> getCadastros()
    {
        return cadastros;
    }
    
    private void inserir(FichaCadastro fichaCadastro)
    {
        cadastros.add(fichaCadastro);
    }
    
    /* Factory Methods */
    /* Separam a lógica de criação da lógica do negócio */
    public abstract Animal createAnimal();
    public abstract FichaCadastro createFichaCadastro(Animal animal);
}
