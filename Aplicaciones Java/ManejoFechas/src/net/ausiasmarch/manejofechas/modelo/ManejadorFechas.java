package net.ausiasmarch.manejofechas.modelo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import java.util.Locale;

/**
 * ManejadorFechas.java
 *
 * @author PixelZer0
 */
public class ManejadorFechas {
    
    // Metodo de formato de tiempo
    
    private static final Locale locale = new Locale("es", "ES");
    
    // Metodos Date
    
    public static String getDiaSemanaCorto(LocalDate ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale);
    }
    
    public static String getDiaSemanaCompleto(LocalDate ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }
    
    public static int getDiaMes(LocalDate ldt) {
        return ldt.getDayOfMonth();
    }
    
    public static String getMesCorto(LocalDate ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.SHORT, locale);
    }
    
    public static String getMesCompleto(LocalDate ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.FULL, locale);
    }
    
    public static int getAnyo(LocalDate ldt) {
        return ldt.getYear();
    }
    
    public static int getHora(LocalTime ldt) {
        return ldt.getHour();
    }
    
    public static int getMinutos(LocalTime ldt) {
        return ldt.getMinute();
    }
    
    public static int getSegundos(LocalTime ldt) {
        return ldt.getSecond();
    }
    
    
    // Metodos DateTime
    
    public static String getDiaSemanaCorto(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale);
    }
    
    public static String getDiaSemanaCompleto(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }

    public static int getDiaMes(LocalDateTime ldt) {
        return ldt.getDayOfMonth();
    }
    
    public static String getMesCorto(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.SHORT, locale);
    }
    
    public static String getMesCompleto(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.FULL, locale);
    }
    
    public static int getAnyo(LocalDateTime ldt) {
        return ldt.getYear();
    }
    
    public static int getHora(LocalDateTime ldt) {
        return ldt.getHour();
    }
    
    public static int getMinutos(LocalDateTime ldt) {
        return ldt.getMinute();
    }
    
    public static int getSegundos(LocalDateTime ldt) {
        return ldt.getSecond();
    }
    
    public static String fechaActual() {
        DateTimeFormatter zonaHoraria = DateTimeFormatter.ofPattern
        (" EEEE - dd - MMMM - yyyy | hh:mm:ss a");
        String ahora = ZonedDateTime.now().format(zonaHoraria);
        return ahora;
    }
    
    
    // Metodos sumatorios y de substracción
    
    public static LocalDate sumarDias(LocalDate ld, long tiempo) {
        return ld.plusDays(tiempo);
    }
    
    public static LocalDate sumarMeses(LocalDate ld, long tiempo) {
        return ld.plusMonths(tiempo);
    }
    
    public static LocalDate sumarAnyos(LocalDate ld, long tiempo) {
        return ld.plusYears(tiempo);
    }
    
    public static LocalDateTime sumarHoras(LocalDateTime ldt, long tiempo) {
        return ldt.plusHours(tiempo);
    }
    
    public static LocalDateTime sumarMinutos(LocalDateTime ldt, long tiempo) {
        return ldt.plusMinutes(tiempo);
    }
    
    public static LocalDateTime sumarSegundos(LocalDateTime ldt, long tiempo) {
        return ldt.plusSeconds(tiempo);
    }
    
    public LocalDateTime sumarTiempo(LocalDateTime ldt, long tiempo, String unidad) {
        switch (unidad) {
            case "Dias":
                ldt.plusDays(tiempo);
                break;
            case "Meses":
                ldt.plusMonths(tiempo);
                break;
            case "Años":
                ldt.plusYears(tiempo);
                break;
            case "Horas":
                ldt.plusHours(tiempo);
                break;
            case "Minutos":
                ldt.plusMinutes(tiempo);
                break;
            case "Segundos":
                ldt.plusSeconds(tiempo);
        }
        
        return ldt;
    }
    
    public static LocalDate restarDias(LocalDate ld, long tiempo) {
        return ld.minusDays(tiempo);
    }
    
    public static LocalDate restarMeses(LocalDate ld, long tiempo) {
        return ld.minusMonths(tiempo);
    }
    
    public static LocalDate restarAnyos(LocalDate ld, long tiempo) {
        return ld.minusYears(tiempo);
    }
    
    public static LocalDateTime restarHoras(LocalDateTime ldt, long tiempo) {
        return ldt.minusHours(tiempo);
    }
    
    public static LocalDateTime restarMinutos(LocalDateTime ldt, long tiempo) {
        return ldt.minusMinutes(tiempo);
    }
    
    public static LocalDateTime restarSegundos(LocalDateTime ldt, long tiempo) {
        return ldt.minusSeconds(tiempo);
    }
    
    public LocalDateTime restarTiempo(LocalDateTime ldt, long tiempo, String unidad) {
        switch (unidad) {
            case "Dias":
                ldt.minusDays(tiempo);
                break;
            case "Meses":
                ldt.minusMonths(tiempo);
                break;
            case "Años":
                ldt.minusYears(tiempo);
                break;
            case "Horas":
                ldt.minusHours(tiempo);
                break;
            case "Minutos":
                ldt.minusMinutes(tiempo);
                break;
            case "Segundos":
                ldt.minusSeconds(tiempo);
        }
        
        return ldt;
    }
    
    public static String diferenciaFechas(LocalDate ldt1, LocalDate ldt2) {
        return "Años: " + ldt1.until(ldt2).getYears() + " | " + "Meses: " + 
                ldt1.until(ldt2, MONTHS) + " | " + "Días: " + 
                ldt1.until(ldt2, DAYS);
    }
    
}