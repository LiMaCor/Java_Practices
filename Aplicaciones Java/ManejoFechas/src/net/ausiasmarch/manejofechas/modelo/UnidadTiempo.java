package net.ausiasmarch.manejofechas.modelo;

/**
 *
 * @author PixelZer0
 */
public enum UnidadTiempo {
    
    DIAS,
    MESES,
    AÑOS,
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
            case AÑOS:
                tipo = "Años";
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
