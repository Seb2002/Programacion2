
package autolavadolaestrella;


public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1LavadoEsp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1TipoVehiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Funcionario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2CantidadLavado = new javax.swing.JTextField();
        jLabel5LavadoEsp = new javax.swing.JLabel();
        jTextField2LavadoEsp = new javax.swing.JTextField();
        jLabel5DesinfeccionBas = new javax.swing.JLabel();
        jTextField3DesinfeccionBas = new javax.swing.JTextField();
        jLabel5DesinfeccionAvanz = new javax.swing.JLabel();
        jTextField3DesinfeccionAvanz = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3Combo1 = new javax.swing.JTextField();
        jTextField3Combo2 = new javax.swing.JTextField();
        jTextField3Combo3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonCalcular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3TotalLavadoBas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3TotalLavadoEspecial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField3TotalDesinfeccionBasica = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField3TotalDesinfeccionAvanzada = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField3TotalCombos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField1TotalFuncionario = new javax.swing.JTextField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1LavadoEsp.setBackground(new java.awt.Color(244, 241, 193));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LAVADERO DE AUTOS LA ESTRELLA");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione el tipo de vehículo (Camioneta / Automovil)");

        jTextField1TipoVehiculo.setBackground(new java.awt.Color(244, 241, 193));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Funcionario");

        jTextField1Funcionario.setBackground(new java.awt.Color(244, 241, 193));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Lavado Básico ");

        jTextField2CantidadLavado.setBackground(new java.awt.Color(244, 241, 193));
        jTextField2CantidadLavado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2CantidadLavadoActionPerformed(evt);
            }
        });

        jLabel5LavadoEsp.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5LavadoEsp.setText("Lavado Especial");

        jTextField2LavadoEsp.setBackground(new java.awt.Color(244, 241, 193));
        jTextField2LavadoEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2LavadoEspActionPerformed(evt);
            }
        });

        jLabel5DesinfeccionBas.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5DesinfeccionBas.setText("Desinfección Básica");

        jTextField3DesinfeccionBas.setBackground(new java.awt.Color(244, 241, 193));

        jLabel5DesinfeccionAvanz.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5DesinfeccionAvanz.setText("Desinfección Avanzada");

        jTextField3DesinfeccionAvanz.setBackground(new java.awt.Color(244, 241, 193));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Combo 1");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Combo 2");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Combo 3");

        jTextField3Combo1.setBackground(new java.awt.Color(244, 241, 193));

        jTextField3Combo2.setBackground(new java.awt.Color(244, 241, 193));

        jTextField3Combo3.setBackground(new java.awt.Color(244, 241, 193));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonCalcular.setBackground(new java.awt.Color(237, 109, 127));
        jButtonCalcular.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(131, 213, 208));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Total Lavados Básicos");

        jTextField3TotalLavadoBas.setEditable(false);
        jTextField3TotalLavadoBas.setBackground(new java.awt.Color(244, 241, 193));
        jTextField3TotalLavadoBas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3TotalLavadoBasActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total Lavado Especial");

        jTextField3TotalLavadoEspecial.setEditable(false);
        jTextField3TotalLavadoEspecial.setBackground(new java.awt.Color(244, 241, 193));
        jTextField3TotalLavadoEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3TotalLavadoEspecialActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Total Desinfección Básica");

        jTextField3TotalDesinfeccionBasica.setEditable(false);
        jTextField3TotalDesinfeccionBasica.setBackground(new java.awt.Color(244, 241, 193));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Total Desinfección Avanzada");

        jTextField3TotalDesinfeccionAvanzada.setEditable(false);
        jTextField3TotalDesinfeccionAvanzada.setBackground(new java.awt.Color(244, 241, 193));
        jTextField3TotalDesinfeccionAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3TotalDesinfeccionAvanzadaActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total Combos");

        jTextField3TotalCombos.setEditable(false);
        jTextField3TotalCombos.setBackground(new java.awt.Color(244, 241, 193));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Total Funcionario");

        jTextField1TotalFuncionario.setEditable(false);
        jTextField1TotalFuncionario.setBackground(new java.awt.Color(244, 241, 193));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3TotalCombos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3TotalDesinfeccionAvanzada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3TotalDesinfeccionBasica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3TotalLavadoEspecial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3TotalLavadoBas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1TotalFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField3TotalLavadoBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField3TotalLavadoEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField3TotalDesinfeccionBasica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3TotalDesinfeccionAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3TotalCombos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1TotalFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1LavadoEspLayout = new javax.swing.GroupLayout(jPanel1LavadoEsp);
        jPanel1LavadoEsp.setLayout(jPanel1LavadoEspLayout);
        jPanel1LavadoEspLayout.setHorizontalGroup(
            jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3DesinfeccionAvanz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1LavadoEspLayout.createSequentialGroup()
                                    .addComponent(jLabel5DesinfeccionAvanz)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2CantidadLavado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                                    .addComponent(jLabel5DesinfeccionBas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3DesinfeccionBas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                                    .addComponent(jLabel5LavadoEsp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2LavadoEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCalcular)
                                    .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)))))))
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jTextField3Combo3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1TipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1LavadoEspLayout.setVerticalGroup(
            jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1TipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1LavadoEspLayout.createSequentialGroup()
                        .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2CantidadLavado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5LavadoEsp)
                            .addComponent(jTextField2LavadoEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3DesinfeccionBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5DesinfeccionBas))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5DesinfeccionAvanz)
                            .addComponent(jTextField3DesinfeccionAvanz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1LavadoEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField3Combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalcular))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1LavadoEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1LavadoEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2CantidadLavadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2CantidadLavadoActionPerformed
      
    }//GEN-LAST:event_jTextField2CantidadLavadoActionPerformed

    private void jTextField2LavadoEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2LavadoEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2LavadoEspActionPerformed

    private void jTextField3TotalLavadoBasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3TotalLavadoBasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3TotalLavadoBasActionPerformed

    private void jTextField3TotalDesinfeccionAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3TotalDesinfeccionAvanzadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3TotalDesinfeccionAvanzadaActionPerformed

    private void jTextField3TotalLavadoEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3TotalLavadoEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3TotalLavadoEspecialActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCalcularActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCalcular;
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
    public javax.swing.JLabel jLabel5DesinfeccionAvanz;
    public javax.swing.JLabel jLabel5DesinfeccionBas;
    public javax.swing.JLabel jLabel5LavadoEsp;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JPanel jPanel1LavadoEsp;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTextField1Funcionario;
    public javax.swing.JTextField jTextField1TipoVehiculo;
    public javax.swing.JTextField jTextField1TotalFuncionario;
    public javax.swing.JTextField jTextField2CantidadLavado;
    public javax.swing.JTextField jTextField2LavadoEsp;
    public javax.swing.JTextField jTextField3Combo1;
    public javax.swing.JTextField jTextField3Combo2;
    public javax.swing.JTextField jTextField3Combo3;
    public javax.swing.JTextField jTextField3DesinfeccionAvanz;
    public javax.swing.JTextField jTextField3DesinfeccionBas;
    public javax.swing.JTextField jTextField3TotalCombos;
    public javax.swing.JTextField jTextField3TotalDesinfeccionAvanzada;
    public javax.swing.JTextField jTextField3TotalDesinfeccionBasica;
    public javax.swing.JTextField jTextField3TotalLavadoBas;
    public javax.swing.JTextField jTextField3TotalLavadoEspecial;
    // End of variables declaration//GEN-END:variables
}
