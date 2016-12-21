package net.ausiasmarch.validaciones.modelo;

/**
 *
 * @author Pixel_Zer0
 */
public class Email {

    public static void valida(String email) throws Exception {
        
        final String expReg = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+"
                + "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        // Si no tiene un formato válido
        if (!email.matches(expReg)){
            throw new RuntimeException("El formato del email no es válido.");
        }
    }
}