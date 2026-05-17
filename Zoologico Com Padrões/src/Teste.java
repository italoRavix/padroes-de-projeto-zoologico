import animais.*;
import especie.*;
import gestao.*;
import cadastro.*;
import java.util.List;
import java.util.ArrayList;


public class Teste
{
    public static void main(String args[])
    {
        GestaoCadastro g = new GestaoCadastroMamifero();
        
        g.cadastrar(Especie.MICO);
        g.cadastrar(Especie.CAPIVARA);
        g.cadastrar(Especie.SERPENTE);  
        g.cadastrar(Especie.JACARE);        
        
        ArrayList<FichaCadastro> cadastros = g.getCadastros();
        
        for(FichaCadastro c : cadastros)
            System.out.println(c.getAnimal().getEspecie().getNome());
    }
}
