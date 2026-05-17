package fabricas;

import consumiveis.*;

public interface ConsumiveisFactory
{
    Alimento createAlimento();
    CoberturaSolo createCoberturaSolo();
    Suplemento createSuplemento();
}
