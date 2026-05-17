package animais;

import java.time.LocalDate;

public class Reptil extends Animal
{
    private LocalDate dataUltimaEcdise;
    
    public Reptil()
    {
        super.incrementaId();
    }
    
    public LocalDate getDataUltimaEcdise()
    {
        return dataUltimaEcdise;
    }
    
    public void setDataUltimaEcdise(LocalDate dataUltimaEcdise)
    {
        this.dataUltimaEcdise = dataUltimaEcdise;
    }
}
