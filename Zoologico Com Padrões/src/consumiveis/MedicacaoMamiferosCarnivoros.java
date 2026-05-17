package consumiveis;

public class MedicacaoMamiferosCarnivoros extends Medicacao
{      
    @Override
    public void metodoAbstrato1()
    {
        System.out.println("Fazendo alguma coisa");
    }
    
     @Override   
    public void metodoAbstrato2(int parametro1, int parametro2)
    {
        System.out.println("Fazendo alguma coisa com dois parametros.");    
    }
}
