package net.ausiasmarch.hipoteca.modelo;

/**
 * Calcular una hipoteca
 * @author Julián_Martínez
 */

public class Hipoteca {

  // VARIABLES (Propiedades) ............................................
    private double ingresosMensuales;
    private double importePrestamo;
    private double euribor;
    private double diferencial;
    private int anyos;
    private int edad;
    private boolean funcionario;
    private boolean contratadoSeguroVida;
    private boolean contratadoNomina;
    private boolean contratadoTarjeta;
    private boolean contratadoPension;
    private String mensaje;
    private StringBuilder sb;

    // MÉTODOS (Funciones) set (poner) / get (obtener) las propiedades

    /**
     * Obtiene los Ingresos Mensuales
     * @return Los Ingresos Mensuales
     */
    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    /**
     * Establece los IngresosMensuales
     * @param ingresosMensuales Los Ingresos Mensuales
     */
    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    /**
     * Obtiene la edad
     * @return la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad
     * @param edad La edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene si la persona que solicita la hipoteca es funcionaria
     * @return Si la persona es funcionaria.
     */
    public boolean isFuncionario() {
        return funcionario;
    }

    /**
     * Establece si la persona que solicita la hipoteca es funcionaria
     * @param funcionario Si la persona es funcionaria.
     */
    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * Obtiene el importe que se solicita de préstamo
     * @return El importe que se solicita de préstamo
     */
    public double getImportePrestamo() {
        return importePrestamo;
    }

    /**
     * Establece el importe que se solicita de préstamo
     * @param importePrestamo El importe que se solicita de préstamo
     */
    public void setImportePrestamo(double importePrestamo) {
        this.importePrestamo = importePrestamo;
    }

    /**
     * Obtiene el valor del Euribor
     * @return El valor del Euribor
     */
    public double getEuribor() {
        return euribor;
    }

    /**
     * Establece el valor del Euribor
     * @param euribor El valor del Euribor
     */
    public void setEuribor(double euribor) {
        this.euribor = euribor;
    }

    /**
     * Obtiene el diferencial que aplica el banco al euribor
     * @return el diferencial que aplica el banco al euribor
     */
    public double getDiferencial() {
        return diferencial;
    }

    /**
     * Establece el diferencial que aplica el banco al euribor
     * @param diferencial El diferencial que aplica el banco al euribor
     */
    public void setDiferencial(double diferencial) {
        this.diferencial = diferencial;
    }

    /**
     * Obtiene el nº de años a devolver el préstamo
     * @return el nº de años a devolver el préstamo
     */
    public int getAnyos() {
        return anyos;
    }
    
    /**
    * Obtiene un mensaje de error
     * @return String
    */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Establece el nº de años a devolver el préstamo
     * @param anyos El nº de años a devolver el préstamo
     */
    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }

    /**
     * Obtiene si se ha contratado el Seguro de Vida
     * @return Si se ha contratado el Seguro de Vida
     */
    public boolean isContratadoSeguroVida() {
        return contratadoSeguroVida;
    }

    /**
     * Establece si se ha contratado el Seguro de Vida
     * @param contratadoSeguroVida Si se ha contratado el Seguro de Vida
     */
    public void setContratadoSeguroVida(boolean contratadoSeguroVida) {
        this.contratadoSeguroVida = contratadoSeguroVida;
    }

    /**
     * Obtiene si se ha contratado la Nomina
     * @return si se ha contratado la Nomina
     */
    public boolean isContratadoNomina() {
        return contratadoNomina;
    }

    /**
     * Establece si se ha contratado la Nomina
     * @param contratadoNomina Si se ha contratado la Nomina
     */
    public void setContratadoNomina(boolean contratadoNomina) {
        this.contratadoNomina = contratadoNomina;
    }

    /**
     * Obtiene si se ha contratado la tarjeta de crédito
     * @return Si se ha contratado la tarjeta de crédito
     */
    public boolean isContratadoTarjeta() {
        return contratadoTarjeta;
    }

    /**
     * Establece si se ha contratado la tarjeta de crédito
     * @param contratadoTarjeta Si se ha contratado la tarjeta de crédito
     */
    public void setContratadoTarjeta(boolean contratadoTarjeta) {
        this.contratadoTarjeta = contratadoTarjeta;
    }

    /**
     * Obtiene si se ha contratado el plan de pensiones
     * @return Si se ha contratado el plan de pensiones
     */
    public boolean isContratadoPension() {
        return contratadoPension;
    }

    /**
     * Establece si se ha contratado el plan de pensiones
     * @param contratadoPension Si se ha contratado el plan de pensiones
     */
    public void setContratadoPension(boolean contratadoPension) {
        this.contratadoPension = contratadoPension;
    }

  /***************************************************************************
   * METODOS (Funciones)
   ***************************************************************************/

   // Método para reglas de validación ......................................
    /**
     * Obtiene si la hipoteca está o no concedida.
     * @return Retorna true si la hipoteca está concedida o false
     * si no lo está, según los las siguientes reglas de validación:
     * 
     * 1: La suma de los años y el tiempo de la hipoteca deben ser menor de 80
     * 2: Los años de la hipoteca deben ser mayor que 1
     * 3: La edad debe ser mayor de 18 años
     * 4: El 40% de tu sueldo es menor que la cuota mensual
     * 5: El 30% de tu sueldo es menor que la cuota mensual
     * 6: Si tiene más de 50 años debe contratar el seguro de vida
     * 7: El diferencial no puede ser menor de 0,6
     * 8: El Euribor no puede ser menor de 3
     * 9: Tienes que contratar por lo menos 1 producto
     *10: Tienes que contratar por lo menos 2 productos
     */
    public boolean validate() {
  sb = new StringBuilder();
        //1: La suma de la Edad y los años de hipoteca deben ser menor de 80
        if (edad + anyos > 80) {
            sb.append("- La suma de la Edad y los años de hipoteca deben ser menor de 80.\n");
        }

        //2: Los años de hipoteca deben ser mayor que 1
        if (anyos < 1) {
            sb.append("- Los años de la hipoteca no pueden ser menor que 1.\n");
        }
           
        //3: La edad debe ser mayor de 18 años
        if (edad < 18) {
            sb.append("- La edad debe ser mayor de 18 años.\n");
        }
        
        // 4: Si es funcionario, el 40% del saldo debe ser mayor que la cuota mensual.
        if (funcionario && getCuotaMensual() > ingresosMensuales * 0.4) {
            sb.append("- El 40% de tu sueldo es menor que la cuota mensual.\n");
        }
        
        // 5: Si NO es funcionario,el 30% del saldo debe ser menor que la cuota mensual.
        if (funcionario != true && getCuotaMensual() > ingresosMensuales * 0.3) {
            sb.append("- El 30% de tu sueldo es menor que la cuota mensual.\n");
        }

        //6: Si tienes más de 50 años debe contratar el seguro de vida.
        if (edad > 50) {
            sb.append("- Si tiene más de 50 años, debe contratar el seguro de vida.\n");
        }

        //7: El diferencial debe ser mayor o igual de 0,6
        if (diferencial < 0.6) {
            sb.append("- El diferencial no puede ser menor de 0.6\n");
        }
        
        //8: El Euribor debe ser mayor que 0
        if (euribor < -0.071) {
            sb.append("- El Euribor no puede ser menor que -0.071\n");
        }

        // 9: Si es funcionario debe contratar al menos 1 producto.
        // Primero creamos un contador de los productos contratados.
        int numContratados = 0;
        
        // Por cada producto contratado, incrementamos el contador en 1.
        if (contratadoSeguroVida) {
            numContratados++;
        }
        
        if (contratadoNomina) {
            numContratados++;
        }
        
        if (contratadoTarjeta) {
            numContratados++;
        }
        
        if (contratadoPension) {
            numContratados++;
        }
        
        // Y ahora lo comprobamos:
        if (funcionario && numContratados < 1) {
            sb.append("- Tienes que contratar al menos 1 producto.\n");
        }
        
        // 10: Si no es funcionario debe contratar al menos 2 productos.
        if (funcionario != true && numContratados < 2) {
            sb.append("- Tienes que contratar al menos 2 productos.\n");
        }
        
        mensaje = sb.toString();     
        return mensaje.isEmpty();
    }

    
   // Metodos para cálculos ..................................................

    /**
     * Obtiene el importe a pagar mensualmente por el préstamo.
     * @return El importe a pagar mensualmente por el préstamo.
     */
    public double getCuotaMensual() {
        double cuotaMensual = 0;
        
        // Calcula la cuota mensual
        cuotaMensual = (importePrestamo * (getInteresAnual() / 12) / 
                (100 * (1 - Math.pow(1 + (getInteresAnual() / 1200), 
                        -(anyos * 12)))));
        
        return cuotaMensual;

    }

     /**
     * Obtiene el % interes anual que aplicará a la hipoteca, sumando al  
     * euribor el diferencial real
     * @return El % interes anual
     */
    public double getInteresAnual() {
        double interesAnual = 0;    
        
        // Calcula el interes anual
        interesAnual = euribor + getDiferencialReal();
        
        return interesAnual;       
    }
    
     /**
     * Obtiene el diferencial real para el calculo de los intereses
     * @return El diferencial real
     */
    public double getDiferencialReal() {      
        double diferencialReal = diferencial;
        
        //calculo del diferencial real en funcion de los productos contratados
        if (contratadoSeguroVida) {
            diferencialReal = diferencialReal - 0.1;
        }
        if (contratadoNomina) {
            diferencialReal = diferencialReal - 0.1;
        }
        if (contratadoTarjeta) {
            diferencialReal = diferencialReal - 0.1;
        }
        if (contratadoPension) {
            diferencialReal = diferencialReal - 0.1;
        }
        
        return diferencialReal;
    }


}// fin class Hipoteca
