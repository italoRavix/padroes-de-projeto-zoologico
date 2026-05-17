package fabricas;

import consumiveis.*;

public class MicoFactory implements ConsumiveisFactory
{
    @Override
    public Alimento createAlimento()
    {
        return new AlimentoMico();
    }
    
    @Override    
    public CoberturaSolo createCoberturaSolo()
    {
        return new CoberturaSoloMico();
    }
    
    @Override    
    public Suplemento createSuplemento()
    {
        return new SuplementoMico();
    }
}
