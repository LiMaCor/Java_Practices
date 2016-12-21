package net.ausiasmarch.validaciones.modelo;

import java.text.*;

/**
 * Convert.java
 * @author Pixel_Zer0
 */
public class Convert {

    /**
     * Transforma un String a un número entero 
     * @param s
     * @return
     * @throws java.lang.Exception
     */
    public static int parseInt(String s) throws Exception {
        if (!s.matches("^(-)?\\d{1,3}(\\.\\d{3})*|\\d+$")) {
            throw new RuntimeException("Formato numérico no válido");
        }

        NumberFormat nf = NumberFormat.getInstance();
        try {
            Number n = nf.parse(s);
            int i = Integer.parseInt(n.toString());
            return i;
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    /** ^(-)?[0-9]+((,)[0-9]+)?$
     * Transforma un String a un número decimal
     * @param s
     * @return
     * @throws java.lang.Exception
     */
    public static double parseDouble(String s) throws Exception {
        if (!s.matches("^(-)?([0-9](((\\.\\d{3})*)?))+((,)[0-9]+)$|\\d+$")) {
            throw new RuntimeException("Formato numérico no válido");
        }
        
        NumberFormat nf = NumberFormat.getInstance();
        try {
            Number n = nf.parse(s);
            double d = Double.parseDouble(n.toString());
            return d;
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Comprueba si un String es un número int valido
     * @param s
     * @return
     */
    public static boolean isValidInt(String s) throws Exception {
        try {
            parseInt(s);
            //System.out.println(s);
            return true;
        } catch (Exception ex) {
            throw new RuntimeException("Formato numérico no válido");
        }
    }
    
    /**
     * Comprueba si un String es un número double válido
     * @param s
     * @return 
     */
    public static boolean isValidDouble(String s) throws Exception {
        try {
            parseDouble(s);
            //System.out.println(s);
            return true;
        } catch (Exception ex) {
            throw new RuntimeException("Formato numérico no válido");
        }
    }

    /**
     * Obtiene un String de un número int
     * @param i
     * @return String mostrable al usuario
     */
    public static String format(int i) {
        NumberFormat nf = NumberFormat.getInstance();
        return nf.format(i);
    }
    
    /**
     * Obtiene un String de un número double
     * @param d
     * @return 
     */
    public static String format(double d) {
        NumberFormat nf = NumberFormat.getInstance();
        return nf.format(d);
    }

}