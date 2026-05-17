/* GESTAO CADASTRO PARA SER MODIFICADO!!!!!!!!!!!*/

package gestao;

import java.util.List;
import java.util.ArrayList;
import animais.*;
import especie.*;
import cadastro.*;

/* GESTAO CADASTRO PARA SER MODIFICADO!!!!!!!!!!!*/

public class GestaoCadastro
{
    ArrayList<FichaCadastro> cadastros = new ArrayList<>();
    
    public void cadastrar(Especie especie) 
    {   
        Animal animal = new Animal(); /* Inicio do ponto acoplamento, codigo depende de Animal para tudo */
        animal.setEspecie(especie);
        
        FichaCadastro = new FichaCadastro(animal);
        
        inserir(fichaCadastro);
    }
    
/* GESTAO CADASTRO PARA SER MODIFICADO!!!!!!!!!!!*/    
    
    public ArrayList<FichaCadastro> getCadastros()
    {
        return cadastros;
    }
    
    private void inserir(FichaCadastro fichaCadastro)
    {
        cadastros.add(fichaCadastro);
    }
/* GESTAO CADASTRO PARA SER MODIFICADO!!!!!!!!!!!*/    
}
