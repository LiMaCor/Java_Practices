package net.ausiasmarch.validaciones.modelo;

/**
 * Nif.java Validador NIF-NIE
 *
 * @author Pixel_Zer0
 */
public class Nif {
    
    // private static String mensaje;
    
    
    public static void valida(String nifnie) throws Exception {
        final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        final String regExp = "^[XYZxyz](-|\\s)*?\\d{7}(-|\\s)*?[A-Za-z]|"
                + "\\d?\\d{7}(-|\\s)?[A-Za-z]$";
        int dni = 0;
        char letra;
        StringBuilder sb;
        

        sb = new StringBuilder();
        
        // Si no tiene un formato valido
        if (!nifnie.matches(regExp)) {
            throw new RuntimeException("NIF/NIE con formato no valido");
        }

        nifnie = nifnie.toUpperCase();
        
        // Si comienza por X, Y o Z, se reemplaza por su valor correspondiente
        if (nifnie.startsWith("X") || nifnie.startsWith("Y") || 
                nifnie.startsWith("Z")) {
            
            switch (nifnie.charAt(0)) {
                case 'X':
                    nifnie = nifnie.replace('X', '0');
                    break;
                case 'Y':
                    nifnie = nifnie.replace('Y', '1');
                    break;
                case 'Z':
                    nifnie = nifnie.replace('Z', '2');
                    break;
            }        
            
            /* ES UN NIE
             * Si hay '-' o ' ', almacena su posición en el contenedor
             * y después la concatena
             */
            
            if (nifnie.charAt(1) == ' ' || nifnie.charAt(1) == '-') {
                
                // En este caso el nie tiene un '-' o ' ', al principio
                
                sb.append(nifnie.charAt(0));
                
                    if (nifnie.charAt(9) == ' ' || nifnie.charAt(9) == '-') {
                        
                        // En este caso, también hay un '-' o ' ' al final
                
                        sb.append(nifnie.substring(2, nifnie.length() - 2));
                dni = Integer.parseInt(sb.toString());
                System.out.println(sb.toString());
                
                    } else {
                        
                        sb.append(nifnie.substring(2, nifnie.length() - 1));
                        dni = Integer.parseInt(sb.toString());
                        System.out.println(sb.toString());
                    
                    }
                    
            } else if (nifnie.indexOf(' ') > 1 || nifnie.indexOf('-') > 1) {
                
                // En este caso, el nie tiene un '-' o ' ', al final
                
                sb.append(nifnie.substring(0, nifnie.length() - 2));
                dni = Integer.parseInt(sb.toString());
                
            } else {
                
                // En este caso, el nie no tiene guiones o espacios
                
                sb.append(nifnie.substring(0, nifnie.length() - 1));
                dni = Integer.parseInt(sb.toString());
            }
            
        } else if (nifnie.indexOf(' ') > 0 || nifnie.indexOf('-') > 0) {
            
            // ES UN NIF
            // Si hay un '-' o ' ', se elimina junto con la letra
            
            dni = Integer.parseInt(nifnie.substring(0, nifnie.length() - 2));
            
        } else {
            
            // En este caso el nif no tiene guiones o espacios
            
            dni = Integer.parseInt(nifnie.substring(0, nifnie.length() - 1));
        }
        
        letra = letras.charAt(dni % 23);
        nifnie = nifnie.toUpperCase();
        
        if (!nifnie.endsWith(" " + letra) && !nifnie.endsWith("-" + letra)
                && !nifnie.endsWith("" + letra)) {
            throw new RuntimeException("La letra del NIF o NIE no es correcta");
        }
    }
}