/*
 * Hipoteca.java
 */
package net.ausiasmarch.hipoteca.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.ausiasmarch.common.Convert;
import net.ausiasmarch.hipoteca.modelo.*;

/**
 *
 * @author PixelZer0
 */
public class Main extends javax.swing.JFrame {

    private final Hipoteca hipoteca;

    public Main() {
        initComponents();

        hipoteca = new Hipoteca();

        setSize(699, 375);
        setLocationRelativeTo(null);
        jPanelErrores.setVisible(true);
        jTextAreaListaErrores.setEditable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldEuribor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDiferencial = new javax.swing.JTextField();
        jTextFieldInteresAnual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIngresosMes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldImportePrestamo = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCuotaMensual = new javax.swing.JTextField();
        jCheckBoxFuncionario = new javax.swing.JCheckBox();
        jCheckBoxSeguroVida = new javax.swing.JCheckBox();
        jCheckBoxTarjeta = new javax.swing.JCheckBox();
        jCheckBoxNomina = new javax.swing.JCheckBox();
        jCheckBoxPension = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDiferencialReal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldAnyos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jPanelErrores = new javax.swing.JPanel();
        jButtonCerrarListado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListaErrores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo Hipoteca Double");
        setResizable(false);

        jLabel1.setText("Nombre:");

        jLabel4.setText("Euribor:");

        jLabel6.setText("Diferencial:");

        jTextFieldDiferencial.setNextFocusableComponent(jCheckBoxSeguroVida);

        jTextFieldInteresAnual.setEditable(false);
        jTextFieldInteresAnual.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldInteresAnual.setFocusable(false);

        jLabel8.setText("Interes Anual");

        jLabel9.setText("Ingresos Mensuales:");

        jLabel10.setText("Importe Prestamo:");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabel11.setText("Cuota mensual:");

        jTextFieldCuotaMensual.setEditable(false);
        jTextFieldCuotaMensual.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldCuotaMensual.setFocusable(false);

        jCheckBoxFuncionario.setText("Funcionario");

        jCheckBoxSeguroVida.setText("Seguro Vida");

        jCheckBoxTarjeta.setText("Tarjeta");

        jCheckBoxNomina.setText("Nómina");
        jCheckBoxNomina.setNextFocusableComponent(jCheckBoxTarjeta);

        jCheckBoxPension.setText("Plan pensiones");

        jLabel7.setText("Diferencial Real:");

        jTextFieldDiferencialReal.setEditable(false);
        jTextFieldDiferencialReal.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDiferencialReal.setFocusable(false);

        jLabel12.setText("Años");

        jTextFieldAnyos.setNextFocusableComponent(jTextFieldEuribor);

        jLabel5.setText("Edad");

        jPanelErrores.setFocusable(false);

        jButtonCerrarListado.setText("Cerrar");
        jButtonCerrarListado.setFocusable(false);
        jButtonCerrarListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarListadoActionPerformed(evt);
            }
        });

        jScrollPane1.setFocusable(false);

        jTextAreaListaErrores.setEditable(false);
        jTextAreaListaErrores.setBackground(new java.awt.Color(255, 153, 102));
        jTextAreaListaErrores.setColumns(20);
        jTextAreaListaErrores.setLineWrap(true);
        jTextAreaListaErrores.setRows(5);
        jTextAreaListaErrores.setToolTipText("");
        jTextAreaListaErrores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102)), "Se han encontrado los siguientes errores:"));
        jTextAreaListaErrores.setFocusable(false);
        jTextAreaListaErrores.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTextAreaListaErrores);

        javax.swing.GroupLayout jPanelErroresLayout = new javax.swing.GroupLayout(jPanelErrores);
        jPanelErrores.setLayout(jPanelErroresLayout);
        jPanelErroresLayout.setHorizontalGroup(
            jPanelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelErroresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCerrarListado)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );
        jPanelErroresLayout.setVerticalGroup(
            jPanelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelErroresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCerrarListado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldEuribor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDiferencial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxSeguroVida)
                            .addComponent(jCheckBoxTarjeta))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxPension)
                            .addComponent(jCheckBoxNomina))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldIngresosMes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addComponent(jCheckBoxFuncionario))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldImportePrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldAnyos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jButtonCalcular)
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldDiferencialReal)
                                            .addComponent(jLabel7))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldInteresAnual)
                                            .addComponent(jLabel8))
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldCuotaMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)))
                                    .addComponent(jPanelErrores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIngresosMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxFuncionario))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldImportePrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldAnyos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDiferencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxNomina)
                            .addComponent(jCheckBoxSeguroVida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxTarjeta)
                            .addComponent(jCheckBoxPension)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEuribor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDiferencialReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCalcular)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldInteresAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCuotaMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanelErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
    // Declaramos variables de entrada y salida .....................
    double ingresosMensuales;
    double importePrestamo;
    double euribor;
    double diferencial;
    // Las siguientes tres variables corresponden a los cálculos realizados
    // por la clase "Hipoteca".
    double diferencialReal;
    double interesAnual;
    double cuotaMensual;
    int edad;
    int anyos;
    boolean funcionario;
    boolean contratadoSeguroVida;
    boolean contratadoNomina;
    boolean contratadoTarjeta;
    boolean contratadoPension;

    StringBuilder sb = new StringBuilder();

    // Limpiamos los datos de salida o resultados ................
    jTextFieldDiferencialReal.setText("");
    jTextFieldInteresAnual.setText("");
    jTextFieldCuotaMensual.setText("");
    
    // Obtenemos y validamos los datos de entrada ...................
    
    if (jTextFieldNombre.getText().isEmpty()) {
        sb.append("  - El nombre no puede quedar en blanco.\n");
    }
    
    // El nombre debe tener un formato correcto
    if (!jTextFieldNombre.getText().matches("(([a-zA-ZÁÉÍÓÚáéíóúñÑ]+)(-{1})?"
            + "(((\\s|-)[a-zA-ZÁÉÍÓÚáéíóúñÑ]+)?)*)")) {
        sb.append("  - El nombre no tiene un formato correcto.\n");
    }

    // Si ingresos mensuales no es un numero real valido
    if (!Convert.isValidDouble(jTextFieldIngresosMes.getText())) {
        sb.append("  - Ingresos no validos.\n");
    } 

    /* Los ingresos solo pueden ser números y empezar a partir de 1
    *if (!jTextFieldIngresosMes.getText().matches("^([1-9])+([0-9])*")) {
        sb.append("  - Solo se admiten números. Los ingresos no deben comenzar"
                + " por 0.\n");
    }*/
    
    // Si edad no es un numero entero (int) valido 
    if (!Convert.isValidInt(jTextFieldEdad.getText())) {
        sb.append("  - Edad no valida.\n");
    } 

    /* La edad solo puede ser numérica y no empezar por 0
    if (!jTextFieldEdad.getText().matches("^([1-9])+([0-9])*")) {
        sb.append("  - Solo se admiten números. La edad no puede comenzar"
                + " por 0.\n");
    }*/
    
    // Si el importe de prestamo no es un número (int) válido
    if (!Convert.isValidInt(jTextFieldImportePrestamo.getText())) {
        sb.append("  - Importe no válido.\n");
    }
    
    /* El importe del préstamo solo puede ser númerico y no comenzar por 0
    if (!jTextFieldImportePrestamo.getText().matches("^([1-9])+([0-9])*")) {
        sb.append("  - Solo se admiten números. El importe no debe comenzar"
                + " por 0.\n");
    }*/
    
    // Si los años de hipoteca no es un número (int) válido
    if (!Convert.isValidInt(jTextFieldAnyos.getText())) {
        sb.append("  - Años de hipoteca no válidos.\n");
    }
    
    /* Los años deben ser números y no deben empezar por 0
    if (!jTextFieldAnyos.getText().matches("^([1-9])+([0-9])*")) {
        sb.append("  - Solo se admiten números. Los años no pueden comenzar"
                + " por 0.\n");
    }*/
    
    // Si el euribor no es un número (double) válido
    if (!Convert.isValidDouble(jTextFieldEuribor.getText())) {
        sb.append("  - Euribor no válido.\n");
    }
    
    /* El euribor debe numérico
    if (!jTextFieldEuribor.getText().matches("^[0-9]+(,[0-9])*")) {
        sb.append("  - En el Euribor solo se admiten números y una coma decimal.\n");
    }*/
    
    // Si el diferencial no es un número (double) válido
    if (!Convert.isValidDouble(jTextFieldDiferencial.getText())) {
        sb.append("  - Diferencial no válido.\n");
    }
    
    /* El diferencial debe ser numérico
    if (!jTextFieldDiferencial.getText().matches("^[0-9]+(,[0-9])*")) {
        sb.append("  - En el Diferencial solo se admiten"
                + " números y una coma decimal.\n");
    }*/
    
    // Si hay errores de entrada (sintacticos) .................
    if (sb.length() > 0) {
        setSize(699, 652);
        jTextAreaListaErrores.setText("");
        jTextAreaListaErrores.append(sb.toString());
        jTextAreaListaErrores.setCaretPosition(0);
        return;
    }
    
    // Hacemos las conversiones de datos numericos ...................
    ingresosMensuales = Convert.parseDouble(jTextFieldIngresosMes.getText());
    importePrestamo = Convert.parseDouble(jTextFieldImportePrestamo.getText());
    euribor = Convert.parseDouble(jTextFieldEuribor.getText());
    diferencial = Convert.parseDouble(jTextFieldDiferencial.getText());
    edad = Convert.parseInt(jTextFieldEdad.getText());
    anyos = Convert.parseInt(jTextFieldAnyos.getText());
    
    
    
    // Pasamos los datos de entrada a hipoteca ..........................  
    // Pasamos los datos numericos
    hipoteca.setIngresosMensuales(ingresosMensuales);
    hipoteca.setDiferencial(diferencial);
    hipoteca.setImportePrestamo(importePrestamo);
    hipoteca.setEuribor(euribor);
    hipoteca.setEdad(edad);
    hipoteca.setAnyos(anyos);
    
    // Pasamos los datos booleanos
    hipoteca.setFuncionario(jCheckBoxFuncionario.isSelected());
    hipoteca.setContratadoSeguroVida(jCheckBoxSeguroVida.isSelected());
    hipoteca.setContratadoTarjeta(jCheckBoxTarjeta.isSelected());
    hipoteca.setContratadoPension(jCheckBoxPension.isSelected());
    hipoteca.setContratadoNomina(jCheckBoxNomina.isSelected());
    
    // Comprobamos si la hipoteca es válida
    if (hipoteca.validate() == false) {
        sb.append(hipoteca.getMensaje());
        setSize(699, 652);
        jTextAreaListaErrores.setText("");
        jTextAreaListaErrores.append(sb.toString());
        jTextAreaListaErrores.setCaretPosition(0);
        return;
    }
    
    // Si llegamos aqui todo es CORRECTO
    // Obtenemos cálculos desde el objeto hipoteca
    diferencialReal = hipoteca.getDiferencialReal();
    interesAnual = hipoteca.getInteresAnual();
    cuotaMensual = hipoteca.getCuotaMensual();
    

    // Mostramos los resultados con el formato adecuado .......................
    jTextFieldDiferencialReal.setText(Convert.format(diferencialReal, 2));
    jTextFieldInteresAnual.setText(Convert.format(interesAnual, 2));
    jTextFieldCuotaMensual.setText(Convert.format(cuotaMensual, 2));
    setSize(699, 375);
}//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonCerrarListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarListadoActionPerformed
        setSize(699, 375);
    }//GEN-LAST:event_jButtonCerrarListadoActionPerformed

    //private void mensaje(String mensaje) {
    //    JOptionPane.showMessageDialog(this, mensaje);
    //}

    /**
     * *********************************************************************
     * /** Método principal del JFrame donde se inicia la aplicación
     * /
     *
     **********************************************************************
     * @param args
     */
    public static void main(String args[]) {
        try {
            String look = UIManager.getSystemLookAndFeelClassName();
            javax.swing.UIManager.setLookAndFeel(look);
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.setVisible(true);
            }
        });
    } // fin de main ................
    /**
     * *********************************************************************
     * /* Componentes visuales (Controles)de JFrame. NO se puede modificar.
     * /*********************************************************************
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonCerrarListado;
    private javax.swing.JCheckBox jCheckBoxFuncionario;
    private javax.swing.JCheckBox jCheckBoxNomina;
    private javax.swing.JCheckBox jCheckBoxPension;
    private javax.swing.JCheckBox jCheckBoxSeguroVida;
    private javax.swing.JCheckBox jCheckBoxTarjeta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelErrores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextAreaListaErrores;
    private javax.swing.JTextField jTextFieldAnyos;
    private javax.swing.JTextField jTextFieldCuotaMensual;
    private javax.swing.JTextField jTextFieldDiferencial;
    private javax.swing.JTextField jTextFieldDiferencialReal;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldEuribor;
    private javax.swing.JTextField jTextFieldImportePrestamo;
    private javax.swing.JTextField jTextFieldIngresosMes;
    private javax.swing.JTextField jTextFieldInteresAnual;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
