package net.ausiasmarch.manejofechas.modelo;

/**
 *
 * @author PixelZer0
 */
public enum UnidadTiempo {
    
    DIAS,
    MESES,
    A�OS,
    HORAS,
    MINUTOS,
    SEGUNDOS;
    
    public String toString() {
        
        String tipo = "";
        
        switch (this) {
            case DIAS:
                tipo = "Dias";
                break;
            case MESES:
                tipo = "Meses";
                break;
            case A�OS:
                tipo = "A�os";
                break;
            case HORAS:
                tipo = "Horas";
                break;
            case MINUTOS:
                tipo = "Minutos";
                break;
            case SEGUNDOS:
                tipo = "Segundos";
        }
        
        return tipo;
    }
    
}
