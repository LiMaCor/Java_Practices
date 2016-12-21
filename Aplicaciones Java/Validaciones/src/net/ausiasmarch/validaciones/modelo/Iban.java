package net.ausiasmarch.validaciones.modelo;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Pixel_Zer0
 */
public class Iban {
    
    // Variables
    private static ArrayList<Integer> ar1 = new ArrayList<>();
    private int dc = 0;
    private String dcOriginal = "";
    
    public static boolean validaCCC(String s) throws Exception {
        
        ar1.add(1);
        ar1.add(2);
        ar1.add(4);
        ar1.add(8);
        ar1.add(5);
        ar1.add(10);
        ar1.add(9);
        ar1.add(7);
        ar1.add(3);
        ar1.add(6);

        if (!s.matches("\\d{20}$|((\\d{4}(-|\\s)?)+(\\d{2}((-|\\s)?))"
                + "(\\d{10}$))")) {
            throw new RuntimeException("Formato de CCC no válido.");
        } else {
            return true;
        }
    }
    
    public static String calculaIban(String s) throws Exception {
        
        System.out.println("ola");

        s = s.replaceAll("-", "");
        s = s.replaceAll(" ", "");
        
        System.out.println(s);
        
        String pais = "ES";
        String preIban = s.concat(pais);
        
        preIban = preIban.replaceFirst("E", "14");
        preIban = preIban.replaceFirst("S", "28");
        preIban = preIban.concat("00");
        
        BigInteger ccc = new BigInteger(preIban);
        BigInteger noventa_y_siete = new BigInteger("97");
        
        ccc = ccc.mod(noventa_y_siete);
        
        int dControl = ccc.intValue();
        
        dControl = 98 - dControl;
        
        String IBAN = pais + dControl + s;
        System.out.println(IBAN);
        
        return IBAN;
    }
}