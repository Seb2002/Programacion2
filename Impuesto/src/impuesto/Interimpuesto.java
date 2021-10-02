/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuesto;

import javax.swing.JOptionPane;

/**
 *
 * @author BRAYAN
 */
public class Interimpuesto extends javax.swing.JFrame {

    /**
     * Creates new form Interimpuesto
     */
    public Interimpuesto() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ford", "Fiat", "Hyundai", "Chevrolet", "Mercedes", "Ferrari", "Tesla", "Volvo", "Misubichi", "Lamborgini", "Opel" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018-2015", "2014-2009", "2008-2000", "otro" }));

        jLabel1.setText("Marca ");

        jLabel2.setText("Año");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel3.setText("mes a pagar");

        jLabel5.setText("¿Es de servicio publico?");

        jCheckBox1.setText("Si");

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(95, 95, 95))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jCheckBox1)
                                .addContainerGap(88, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
int descuento=0;
int valor=0;
int impuesto=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String s = jComboBox1.getSelectedItem().toString();
       String x = jComboBox2.getSelectedItem().toString();
       String n = jComboBox3.getSelectedItem().toString();
       String m =JOptionPane.showInputDialog(rootPane, "¿Su carro es version pro?\n 1.SI \n 2.No");   
        String v =JOptionPane.showInputDialog(rootPane, "¿Usted a trasladado su cuenta?\n 1.SI \n 2.No");
        if(s.equals("Ford")&& x.equals("2021")&& n.equals("Enero")){
         
        
        
        
        if(m.equals("1")){
            valor=50000000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=20000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
       
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+((valor*5)/100);
        System.out.print(descuento);
        }
        }
        
        
        
        //segundo 
        
         if(s.equals("Ford")&& x.equals("2020")){
         
        
        
        
        if(m.equals("1")){
            valor=45000000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=18000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
        }else{
         valor=15000000;
         impuesto=(valor*50)/100;
         }
         
          if(s.equals("Fiat")){
         
        
        
        
        if(m.equals("1")){
            valor=3000000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=15000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
          }
          
          if(s.equals("Hyundai")){
         
        
        
        
        if(m.equals("1")){
            valor=4000000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=22000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
          }
          
          
          if(s.equals("Chevrolet")){
         
        
        
        
        if(m.equals("1")){
            valor=6000000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=25000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
          }
          
          if(s.equals("Mercedes")){
         
        
        
        
        if(m.equals("1")){
            valor=6000000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=25000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
          }
          
          if(s.equals("Tesla")){
         
        
        
        
        if(m.equals("1")){
            valor=6000000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=25000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
          }
          
          
          if(s.equals("Volvo")){
         
        
        
        
        if(m.equals("1")){
            valor=6500000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=2000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
          }
          
          if(s.equals("Misubichi")){
         
        
        
        
        if(m.equals("1")){
            valor=6500000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=2000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
          }
          
          
          if(s.equals("Lamborgini")){
         
        
        
        
        if(m.equals("1")){
            valor=6500000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=2000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
          }
          
           if(s.equals("Opel")){
         
        
        
        
        if(m.equals("1")){
            valor=6500000;
            impuesto=(valor/100)*50;
        
        }
         if(m.equals("2")){
         valor=2000000;
         impuesto=(valor*50)/100;
        
         }
        if(v.equals("1")){
       descuento=descuento+((valor/100)*5);
      
        }
        if(jCheckBox1.isSelected()){
        descuento=descuento+(valor*5)/100;
        System.out.print(descuento);
        }
          }
          
        
        JOptionPane.showMessageDialog(rootPane, "el valor comercial de su auto es: "+valor+"\n el valor del impuesto es: "+ impuesto+ "\n su descuento es:"
                + descuento+"\n SU TOTAL A PAGAR ES:"+(impuesto-descuento));
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interimpuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
