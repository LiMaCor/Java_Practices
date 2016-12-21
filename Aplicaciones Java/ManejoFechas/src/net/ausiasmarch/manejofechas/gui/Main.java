/*
 * Fechas.java
 */
package net.ausiasmarch.manejofechas.gui;

import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import net.ausiasmarch.common.Convert;
import java.time.*;
import net.ausiasmarch.manejofechas.modelo.*;

/**
 * Main.java
 * @author PixelZer0
 */
public class Main extends javax.swing.JFrame {
    
    // Variables
    
    private LocalDateTime partesFechaHora;
    private LocalDate fechaModificada, fechaInicio, fechaFin;
    private int tiempoA�adir;
    
    /** Creates new form Fechas */
    public Main() {
        initComponents();
        
        jComboBoxUnidades.addItem(UnidadTiempo.DIAS.toString());
        jComboBoxUnidades.addItem(UnidadTiempo.MESES.toString());
        jComboBoxUnidades.addItem(UnidadTiempo.A�OS.toString());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldFechaHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jTextFieldAnyo = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldMinutos = new javax.swing.JTextField();
        jTextFieldSegundos = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jComboBoxUnidades = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonSumar = new javax.swing.JButton();
        jTextFieldFechaHora1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAgregar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldResultado = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonAhora = new javax.swing.JButton();
        jTextFieldAhora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldDiaSemana = new javax.swing.JTextField();
        jButtonRestar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldFechaInicio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldFechaFin = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldDiferenciaFechas = new javax.swing.JTextField();
        jButtonCalcularAnyos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de Fechas");
        setResizable(false);

        jLabel1.setText("Fecha y hora:");

        jTextFieldFechaHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFechaHoraFocusGained(evt);
            }
        });

        jLabel2.setText("D�a Mes");

        jLabel3.setText("Mes");

        jLabel4.setText("A�o");

        jLabel5.setText("Hora");

        jLabel6.setText("Minutos");

        jLabel7.setText("Segundos");

        jTextFieldDia.setEditable(false);
        jTextFieldDia.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldMes.setEditable(false);
        jTextFieldMes.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldAnyo.setEditable(false);
        jTextFieldAnyo.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldAnyo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldHora.setEditable(false);
        jTextFieldHora.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldMinutos.setEditable(false);
        jTextFieldMinutos.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMinutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldSegundos.setEditable(false);
        jTextFieldSegundos.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldSegundos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonSumar.setText("Sumar");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });

        jTextFieldFechaHora1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFechaHora1FocusGained(evt);
            }
        });

        jLabel8.setText("Fecha:");

        jLabel9.setText("A�adir");

        jLabel10.setText("Resultado:");

        jTextFieldResultado.setEditable(false);
        jTextFieldResultado.setBackground(new java.awt.Color(204, 204, 255));

        jButtonAhora.setText("Ahora");
        jButtonAhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAhoraActionPerformed(evt);
            }
        });

        jTextFieldAhora.setEditable(false);
        jTextFieldAhora.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldAhora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setText("D�a Semana");

        jTextFieldDiaSemana.setEditable(false);
        jTextFieldDiaSemana.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDiaSemana.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonRestar.setText("Restar");
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });

        jLabel12.setText("Fecha Inicio:");

        jTextFieldFechaInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFechaInicioFocusGained(evt);
            }
        });

        jLabel13.setText("Fecha Fin:");

        jTextFieldFechaFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFechaFinFocusGained(evt);
            }
        });

        jLabel14.setText("Resultado:");

        jTextFieldDiferenciaFechas.setEditable(false);
        jTextFieldDiferenciaFechas.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDiferenciaFechas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonCalcularAnyos.setText("Calcular");
        jButtonCalcularAnyos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularAnyosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldResultado)
                            .addComponent(jTextFieldFechaHora1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRestar))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonAhora)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAhora))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(76, 76, 76)
                                                        .addComponent(jLabel3))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(25, 25, 25)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel11)
                                                            .addComponent(jLabel2))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextFieldMes)
                                                        .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldSegundos)
                                            .addComponent(jTextFieldHora)
                                            .addComponent(jTextFieldMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldFechaHora)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonCalcular)))
                                .addGap(86, 86, 86)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDiferenciaFechas))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldFechaInicio)
                                    .addComponent(jTextFieldFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addComponent(jButtonCalcularAnyos)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalcular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextFieldAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextFieldMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldFechaHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSumar)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButtonRestar)))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCalcularAnyos)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldDiferenciaFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAhora)
                    .addComponent(jTextFieldAhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Calcular
     * @param evt 
     */
    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        
        // Validamos los datos de entrada
        
        if (!Convert.isValidDateTime(jTextFieldFechaHora.getText())) {
            mensaje("Formato de fecha/hora no v�lido.");
            jTextFieldFechaHora.setForeground(Color.RED);
            return;
        }
        
        // Hacemos la conversi�n de los datos
        
        partesFechaHora = Convert.parseLocalDateTime(jTextFieldFechaHora.getText());
        
        /* Hasta aqu�, TODO es correcto
        * Mostramos los datos por pantalla 
        * (Como los m�todos de la clase "ManejadorFechas" son est�ticos
        * llamamos a la clase directamente, pasandole el metodo y un par�metro)
        */
        
        jTextFieldDiaSemana.setText(ManejadorFechas.
                getDiaSemanaCompleto(partesFechaHora));
        jTextFieldDia.setText(Convert.format(ManejadorFechas.
                getDiaMes(partesFechaHora)));
        jTextFieldMes.setText(ManejadorFechas.getMesCompleto(partesFechaHora));
        jTextFieldAnyo.setText(Convert.format(ManejadorFechas.
                getAnyo(partesFechaHora)));
        jTextFieldHora.setText(Convert.format(ManejadorFechas.
                getHora(partesFechaHora)));
        jTextFieldMinutos.setText(Convert.format(ManejadorFechas.
                getMinutos(partesFechaHora)));
        jTextFieldSegundos.setText(Convert.format(ManejadorFechas.
                getSegundos(partesFechaHora)));
        
        jTextFieldFechaHora.setForeground(Color.BLUE);
        
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    /**
     * Sumar
     * @param evt 
     */
    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed

        // Validamos los datos de entrada
        
        if (!Convert.isValidDateTime(jTextFieldFechaHora1.getText())) {
            mensaje("Formato de fecha no v�lido.");
            jTextFieldFechaHora1.setForeground(Color.RED);
            return;
        }
        
        if (!Convert.isValidInt(jTextFieldAgregar.getText())) {
            mensaje("Cantidad no v�lida.");
            return;
        }
        
        // Hacemos la conversi�n de los datos
        
        fechaModificada = Convert.parseLocalDate(jTextFieldFechaHora1.getText());
        tiempoA�adir = Convert.parseInt(jTextFieldAgregar.getText());
        
        /* Hasta aqu�, TODO es correcto
        * Mostramos los datos por pantalla 
        * (Como los m�todos de la clase "ManejadorFechas" son est�ticos
        * llamamos a la clase directamente, pasandole el metodo y un par�metro)
        */
        
        String ut = jComboBoxUnidades.getSelectedItem().toString();
        
        String resultado = "";
        
        switch(ut){
            case "Dias":
                resultado = Convert.format(ManejadorFechas.
                    sumarDias(fechaModificada, tiempoA�adir));
                break;
            case "Meses":
                resultado = Convert.format(ManejadorFechas.
                    sumarMeses(fechaModificada, tiempoA�adir));
                break;
            case "A�os":
                resultado = Convert.format(ManejadorFechas.
                    sumarAnyos(fechaModificada, tiempoA�adir));
        }
        
        jTextFieldResultado.setText(resultado);
        
    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void jButtonAhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAhoraActionPerformed

        jTextFieldAhora.setText(ManejadorFechas.fechaActual());
    }//GEN-LAST:event_jButtonAhoraActionPerformed

    private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed
        
        // Validamos los datos de entrada
        
        if (!Convert.isValidDateTime(jTextFieldFechaHora1.getText())) {
            mensaje("Formato de fecha no v�lido.");
            return;
        }
        
        if (!Convert.isValidInt(jTextFieldAgregar.getText())) {
            mensaje("Cantidad no v�lida.");
            return;
        }
        
        // Hacemos la conversi�n de los datos
        
        fechaModificada = Convert.parseLocalDate(jTextFieldFechaHora1.getText());
        tiempoA�adir = Convert.parseInt(jTextFieldAgregar.getText());
        
        /* Hasta aqu�, TODO es correcto
        * Mostramos los datos por pantalla 
        * (Como los m�todos de la clase "ManejadorFechas" son est�ticos
        * llamamos a la clase directamente, pasandole el metodo y un par�metro)
        */
        
        String ut = jComboBoxUnidades.getSelectedItem().toString();
        
        String resultado = "";
        
        switch(ut){
            case "Dias":
                resultado = Convert.format(ManejadorFechas.
                    restarDias(fechaModificada, tiempoA�adir));
                break;
            case "Meses":
                resultado = Convert.format(ManejadorFechas.
                    restarMeses(fechaModificada, tiempoA�adir));
                break;
            case "A�os":
                resultado = Convert.format(ManejadorFechas.
                    restarAnyos(fechaModificada, tiempoA�adir));
        }
        
        jTextFieldResultado.setText(resultado);
        
    }//GEN-LAST:event_jButtonRestarActionPerformed

    private void jTextFieldFechaHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFechaHoraFocusGained
        jTextFieldFechaHora.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldFechaHoraFocusGained

    private void jTextFieldFechaHora1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFechaHora1FocusGained
        jTextFieldFechaHora1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldFechaHora1FocusGained

    private void jButtonCalcularAnyosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularAnyosActionPerformed
        
        // Validamos los datos de entrada
        
        if (!Convert.isValidDateTime(jTextFieldFechaInicio.getText())) {
            mensaje("Formato de fecha no v�lido.");
            jTextFieldFechaInicio.setForeground(Color.RED);
            return;
        }
        
        if (!Convert.isValidDateTime(jTextFieldFechaFin.getText())) {
            mensaje("Formato de fecha no v�lido.");
            jTextFieldFechaFin.setForeground(Color.RED);
            return;
        }
        
        // Hacemos la conversi�n de los datos
        
        fechaInicio = Convert.parseLocalDate(jTextFieldFechaInicio.getText());
        fechaFin = Convert.parseLocalDate(jTextFieldFechaFin.getText());
        
        /* Hasta aqu�, TODO es correcto
        * Mostramos los datos por pantalla 
        * (Como los m�todos de la clase "ManejadorFechas" son est�ticos
        * llamamos a la clase directamente, pasandole el metodo y un par�metro)
        */
        
        jTextFieldDiferenciaFechas.setText(ManejadorFechas
                .diferenciaFechas(fechaInicio, fechaFin));
    }//GEN-LAST:event_jButtonCalcularAnyosActionPerformed

    private void jTextFieldFechaInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFechaInicioFocusGained
        jTextFieldFechaInicio.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldFechaInicioFocusGained

    private void jTextFieldFechaFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFechaFinFocusGained
        jTextFieldFechaFin.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldFechaFinFocusGained

    /**
     * Mensaje
     * @param mensaje 
     */
    private void mensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Main fechas = new Main();
                fechas.pack();
                fechas.setLocationRelativeTo(null);
                fechas.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAhora;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonCalcularAnyos;
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JComboBox jComboBoxUnidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldAgregar;
    private javax.swing.JTextField jTextFieldAhora;
    private javax.swing.JTextField jTextFieldAnyo;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldDiaSemana;
    private javax.swing.JTextField jTextFieldDiferenciaFechas;
    private javax.swing.JTextField jTextFieldFechaFin;
    private javax.swing.JTextField jTextFieldFechaHora;
    private javax.swing.JTextField jTextFieldFechaHora1;
    private javax.swing.JTextField jTextFieldFechaInicio;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldMinutos;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldSegundos;
    // End of variables declaration//GEN-END:variables
}