package net.ausiasmarch.calculocalorías.modelo;

/**
 *
 * @author Julian_Martinez
 */
public enum TipoActividad {
    SEDENTARIA(1.2),
    LIGERA(1.375),
    MODERADA(1.55),
    INTENSA(1.725),
    MUY_INTENSA(1.9);
    
    double valor;
    
    private TipoActividad(double valor) {
        this.valor = valor;
    }

    
    @Override
    public String toString() {
        
        String tipo = "";
        
        switch (this) {
            case SEDENTARIA:
                tipo = "Sedentaria";
                break;
            case LIGERA:
                tipo = "Ligera";
                break;
            case MODERADA:
                tipo = "Moderada";
                break;
            case INTENSA:
                tipo = "Intensa";
                break;
            case MUY_INTENSA:
                tipo = "Muy intensa";
        }
        
        return tipo;
    }
}