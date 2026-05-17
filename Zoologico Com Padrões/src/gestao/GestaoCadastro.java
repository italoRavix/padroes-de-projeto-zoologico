package gestao;

import java.util.List;
import java.util.ArrayList;
import animais.*;
import especie.*;
import cadastro.*;

public abstract class GestaoCadastro
{
    ArrayList<FichaCadastro> cadastros = new ArrayList<>();
    
    public void cadastrar(Especie especie) 
    {   
        Animal animal = createAnimal(); /* Cria o animal usando o Factory Method */
        animal.setEspecie(especie);
    
        FichaCadastro fichaCadastro = createFichaCadastro(animal); /* Cria o cadastro usando o Factory Method */
        
        inserir(fichaCadastro);
    }
    
    public ArrayList<FichaCadastro> getCadastros()
    {
        return cadastros;
    }
    
    private void inserir(FichaCadastro fichaCadastro)
    {
        cadastros.add(fichaCadastro);
    }
    
    public abstract Animal createAnimal();
    
    public abstract FichaCadastro createFichaCadastro(Animal animal);
}
