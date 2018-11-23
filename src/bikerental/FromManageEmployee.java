/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bikerental;

/**
 *
 * @author firstx
 */
public class FromManageEmployee extends javax.swing.JFrame {

    /** Creates new form FromManageEmployee */
    public FromManageEmployee() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        line = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tx_time = new javax.swing.JLabel();
        tx_Date = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_emp = new javax.swing.JTable();
        bt_addemp = new javax.swing.JButton();
        bt_del = new javax.swing.JButton();
        tx_id = new javax.swing.JTextField();
        tx_pass = new javax.swing.JTextField();
        combo_level = new javax.swing.JComboBox<>();
        bt_edit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuMainMenu = new javax.swing.JMenu();
        menuBikeInfo = new javax.swing.JMenu();
        menuCusInfo = new javax.swing.JMenu();
        menuRentBike = new javax.swing.JMenu();
        menuReturnBike = new javax.swing.JMenu();
        menuIncome = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        line.setBackground(new java.awt.Color(238, 88, 40));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 907, -1));

        head.setBackground(new java.awt.Color(255, 255, 255));
        head.setPreferredSize(new java.awt.Dimension(902, 600));
        head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("DB Narai X", 1, 36)); // NOI18N
        jLabel9.setText("RENTAL CARS");
        head.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/R (1).png"))); // NOI18N
        head.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 88, 72));

        tx_time.setFont(new java.awt.Font("DB Narai X", 1, 18)); // NOI18N
        tx_time.setText("HH:MM:SS A");
        head.add(tx_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        tx_Date.setFont(new java.awt.Font("DB Narai X", 1, 18)); // NOI18N
        tx_Date.setText("dd-MM-yyyy");
        head.add(tx_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        getContentPane().add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_emp.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        tb_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_empMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_emp);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 780, 240));

        bt_addemp.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        bt_addemp.setText("เพิ่ม");
        bt_addemp.setBorderPainted(false);
        bt_addemp.setContentAreaFilled(false);
        bt_addemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addempActionPerformed(evt);
            }
        });
        jPanel1.add(bt_addemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 128, 64));

        bt_del.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        bt_del.setText("ลบ");
        bt_del.setBorder(null);
        bt_del.setBorderPainted(false);
        bt_del.setContentAreaFilled(false);
        bt_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delActionPerformed(evt);
            }
        });
        jPanel1.add(bt_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 143, 50));

        tx_id.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        tx_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_idActionPerformed(evt);
            }
        });
        jPanel1.add(tx_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 188, 35));

        tx_pass.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        jPanel1.add(tx_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 188, 35));

        combo_level.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        combo_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        jPanel1.add(combo_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        bt_edit.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        bt_edit.setText("เปลี่ยนรหัสผ่าน");
        bt_edit.setBorder(null);
        bt_edit.setBorderPainted(false);
        bt_edit.setContentAreaFilled(false);
        bt_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editActionPerformed(evt);
            }
        });
        jPanel1.add(bt_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 248, 50));

        jLabel2.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        jLabel2.setText("ชื่อผู้ใช้งาน :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 95, -1));

        jLabel3.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        jLabel3.setText("รหัสผ่าน :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 95, -1));

        jLabel4.setFont(new java.awt.Font("DB Narai X", 0, 24)); // NOI18N
        jLabel4.setText("สถานะ :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 69, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 880, 440));

        menuBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        menuBar.setEnabled(false);

        menuMainMenu.setBorder(null);
        menuMainMenu.setText("เมนูหลัก");
        menuMainMenu.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        menuMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMainMenuMouseClicked(evt);
            }
        });
        menuBar.add(menuMainMenu);

        menuBikeInfo.setBorder(null);
        menuBikeInfo.setText("ข้อมูลรถ");
        menuBikeInfo.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        menuBar.add(menuBikeInfo);

        menuCusInfo.setText("ข้อมูลลูกค้า");
        menuCusInfo.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        menuBar.add(menuCusInfo);

        menuRentBike.setBorder(null);
        menuRentBike.setText("การเช่า");
        menuRentBike.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        menuRentBike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuRentBikeMousePressed(evt);
            }
        });
        menuBar.add(menuRentBike);

        menuReturnBike.setBorder(null);
        menuReturnBike.setText("การคืน");
        menuReturnBike.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        menuReturnBike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuReturnBikeMousePressed(evt);
            }
        });
        menuBar.add(menuReturnBike);

        menuIncome.setBorder(null);
        menuIncome.setText("รายได้");
        menuIncome.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        menuBar.add(menuIncome);

        menuLogout.setBorder(null);
        menuLogout.setText("ออกจากระบบ");
        menuLogout.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuLogoutMousePressed(evt);
            }
        });
        menuBar.add(menuLogout);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_empMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_empMouseClicked

    private void bt_addempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addempActionPerformed
        // TODO add your handling code here:
        if(!tx_id.getText().equals("")&&!tx_pass.getText().equals("")){

            try {

                BasicDBObject whereQuery = new BasicDBObject();
                whereQuery.put("ID", tx_id.getText());
                DBCursor cursor = coll.find(whereQuery);

                boolean ck = false;

                while(cursor.hasNext()) {

                    JLabel text = new JLabel("มีรหัสผู้ใช้นี้อยู่แล้ว");
                    text.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
                    JOptionPane.showMessageDialog(this, text, "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
                    tx_id.setText("");
                    tx_pass.setText("");
                    ck = true;
                    break;
                }
                if(!ck){
                    In();
                }

            } catch (Exception e) {

            }
        }else if(tx_id.getText().equals("")&&tx_pass.getText().equals("")){
            JLabel text = new JLabel("กรุณาใส่ชื่อผู้ใช้และรหัสผ่าน");
            text.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this, text);

        }else if(tx_id.getText().equals("")){
            JLabel text = new JLabel("กรุณาใส่ชื่อผู้ใช้");
            text.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this, text);
        }else if(tx_pass.getText().equals("")){
            JLabel text = new JLabel("กรุณาใส่รหัสผ่าน");
            text.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this, text);
        }
    }//GEN-LAST:event_bt_addempActionPerformed

    private void bt_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delActionPerformed
        // TODO add your handling code here:
        ckdel();
        if(tx_id.getText().equals("")){
            JLabel text = new JLabel("กรุณากรอก ID พนักงาน");
            text.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
            JOptionPane.showMessageDialog(this, text);
        }else if(ckdel){
            Delete();
        }
    }//GEN-LAST:event_bt_delActionPerformed

    private void tx_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_idActionPerformed

    private void bt_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editActionPerformed
        // TODO add your handling code here:
        Edit();
    }//GEN-LAST:event_bt_editActionPerformed

    private void menuMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMainMenuMouseClicked
        // TODO add your handling code here:
        new FormMenuMain().show();
        dispose();
    }//GEN-LAST:event_menuMainMenuMouseClicked

    private void menuRentBikeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRentBikeMousePressed
        // TODO add your handling code here:
        new FormRent().show();
        dispose();
    }//GEN-LAST:event_menuRentBikeMousePressed

    private void menuReturnBikeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuReturnBikeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuReturnBikeMousePressed

    private void menuLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMousePressed

        // TODO add your handling code here:*/
    }//GEN-LAST:event_menuLogoutMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FromManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromManageEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addemp;
    private javax.swing.JButton bt_del;
    private javax.swing.JButton bt_edit;
    private javax.swing.JComboBox<String> combo_level;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel line;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBikeInfo;
    private javax.swing.JMenu menuCusInfo;
    private javax.swing.JMenu menuIncome;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuMainMenu;
    private javax.swing.JMenu menuRentBike;
    private javax.swing.JMenu menuReturnBike;
    private javax.swing.JTable tb_emp;
    private javax.swing.JLabel tx_Date;
    private javax.swing.JTextField tx_id;
    private javax.swing.JTextField tx_pass;
    private javax.swing.JLabel tx_time;
    // End of variables declaration//GEN-END:variables

}
