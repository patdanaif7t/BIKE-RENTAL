/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author firstx
 */
public class FormRent extends javax.swing.JFrame implements FormTableInterface {

    private final ServiceRent service;

    /**
     * Creates new form FormRent
     */
    public FormRent() {

        initComponents();
        service = new ServiceRent();
        renderTable();
        txtRentId.setText("R" + service.invDao.incrementInvoiceId());
        txtRentDate.setText(getCurrentDate());
        showDate();
        showTime();

    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        labelShowDate.setText(s.format(d));

    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                labelShowTime.setText(s.format(d));
            }

        }
        ).start();
    }

    @Override
    public void renderTable() {
        List<Bike> bikeList = service.getAllBike();
        Iterator<Bike> cursor = bikeList.iterator();

        String[] column = {"รหัสรถ", "สถานะ"};
        tableBikeStatus.getTableHeader().setFont(new Font("TH Sarabun New", Font.BOLD, 18));

        DefaultTableModel model = new DefaultTableModel(column, 0);

        try {
            while (cursor.hasNext()) {
                Bike bike = cursor.next();
                String bikeId = bike.getBikeId();
                String bikeStatus = bike.getBikeStatus();
                model.addRow(new Object[]{bikeId, bikeStatus});
            }
        } finally {

        }
        tableBikeStatus.setModel(model);
    }

    public void setCustomer() {
        List<Customer> customerList = service.getAllCustomer();
        Iterator<Customer> cursor = customerList.iterator();

        try {
            while (cursor.hasNext()) {
                Customer customer = cursor.next();
                System.out.println(customer.getCustomerCitizenId());
                if (customer.getCustomerCitizenId().equals(txtCitizenId.getText())) {
                    txtFName.setText(customer.getCustomerFName());
                    txtLName.setText(customer.getCustomerLName());
                    txtTel.setText(customer.getCustomerTel());
                }
            }

        } finally {

        }
    }

    public void search() {
        try {
            Bike cursor = service.findBikeById(txtSearch.getText());

            String[] column = {"รหัสรถ", "สถานะ"};
            tableBikeStatus.getTableHeader().setFont(new Font("TH Sarabun New", Font.BOLD, 18));

            DefaultTableModel model = new DefaultTableModel(column, 0);
            Bike bike = cursor;
            String bikeId = bike.getBikeId();
            String bikeStatus = bike.getBikeStatus();
            model.addRow(new Object[]{bikeId, bikeStatus});

            tableBikeStatus.setModel(model);
        } catch (Exception e) {
            alertMessage("ไม่มีรหัสรถคันนี้อยู่ในระบบ");
            txtSearch.setText("");
        }

    }

    public boolean isFill(String field) {
        return !field.equals("");
    }

    public static String getCurrentDate() {
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    public boolean isFieldAllFill(String bikeId, String citizenId, String fName, String lName, String Tel, String rentId, String rentDate, String returnDate, String fee) {

        if (!isFill(bikeId)
                || !isFill(citizenId)
                || !isFill(fName)
                || !isFill(lName)
                || !isFill(Tel)
                || !isFill(rentId)
                || !isFill(rentDate)
                || !isFill(returnDate)
                || !isFill(fee)) {
            return false; //กรอกข้อมูลไม่ครบ
        } else {
            return true; //กรอกข้อมูลครบ
        }

    }

    public boolean isCitizenIdValid(String citizenId) {
        return citizenId.length() == 13;
    }

    public boolean isBikeAvailable(Bike bike) {
        return bike.getBikeStatus().equals("ว่าง");
    }

    public boolean isTelvalid(String telField) {
        return telField.length() == 10;
    }

    public void alertMessage(String message) {
        JLabel label = new JLabel(message);
        label.setFont(new Font("TH Sarabun New", Font.BOLD, 18));
        JOptionPane.showMessageDialog(null, label, "แจ้งเตือน", JOptionPane.DEFAULT_OPTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        head = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelShowTime = new javax.swing.JLabel();
        iconLogo = new javax.swing.JLabel();
        labelShowDate = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        line = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBikeStatus = new javax.swing.JTable();
        labelRentId = new javax.swing.JLabel();
        labelRentDate = new javax.swing.JLabel();
        labelCitizenId = new javax.swing.JLabel();
        btnRent = new javax.swing.JButton();
        labelFName = new javax.swing.JLabel();
        labelBikeId = new javax.swing.JLabel();
        labelLName = new javax.swing.JLabel();
        labelTel = new javax.swing.JLabel();
        labelReturnDate = new javax.swing.JLabel();
        labelFee = new javax.swing.JLabel();
        txtRentId = new javax.swing.JTextField();
        txtRentDate = new javax.swing.JTextField();
        txtReturnDate = new javax.swing.JTextField();
        txtFee = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        txtCitizenId = new javax.swing.JTextField();
        txtBikeId = new javax.swing.JTextField();
        btnVerify = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuMainMenu = new javax.swing.JMenu();
        menuBikeInfo = new javax.swing.JMenu();
        menuCusInfo = new javax.swing.JMenu();
        menuEmployeeInfo = new javax.swing.JMenu();
        menuRentBike = new javax.swing.JMenu();
        menuReturnBike = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("การเช่า");
        setResizable(false);

        head.setBackground(new java.awt.Color(255, 255, 255));
        head.setMinimumSize(new java.awt.Dimension(900, 600));
        head.setPreferredSize(new java.awt.Dimension(902, 600));
        head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelName.setFont(new java.awt.Font("TH Sarabun New", 1, 36)); // NOI18N
        labelName.setText("RENTAL CARS");
        head.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        labelShowTime.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        labelShowTime.setText("HH:MM:SS A");
        head.add(labelShowTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        iconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        head.add(iconLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        labelShowDate.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        labelShowDate.setText("dd-MM-yyyy");
        head.add(labelShowDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        head.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 900, -1));

        line.setBackground(new java.awt.Color(238, 88, 40));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        head.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 920, -1));

        txtSearch.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txtSearch.setToolTipText("");
        txtSearch.setName(""); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        head.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 470, 30));

        btnSearch.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnSearch.setText("ค้นหา");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        head.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 130, 40));

        btnAll.setBackground(new java.awt.Color(255, 255, 255));
        btnAll.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        btnAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all.png"))); // NOI18N
        btnAll.setText("ดูทั้งหมด");
        btnAll.setBorderPainted(false);
        btnAll.setContentAreaFilled(false);
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });
        head.add(btnAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 140, 40));

        tableBikeStatus.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        tableBikeStatus.setModel(new javax.swing.table.DefaultTableModel(
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
        tableBikeStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBikeStatusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBikeStatus);

        head.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 780, 170));

        labelRentId.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        labelRentId.setText("รหัสการเช่า-คืน :");
        head.add(labelRentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        labelRentDate.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        labelRentDate.setText("วันที่เช่า :");
        head.add(labelRentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        labelCitizenId.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        labelCitizenId.setText("เลขประจำตัวประชาชน :");
        head.add(labelCitizenId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 170, -1));

        btnRent.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        btnRent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rent.png"))); // NOI18N
        btnRent.setText("เช่ารถ");
        btnRent.setBorderPainted(false);
        btnRent.setContentAreaFilled(false);
        btnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentActionPerformed(evt);
            }
        });
        head.add(btnRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        labelFName.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        labelFName.setText("ชื่อ :");
        head.add(labelFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        labelBikeId.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        labelBikeId.setText("รหัสรถ :");
        head.add(labelBikeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        labelLName.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        labelLName.setText("นามสกุล :");
        head.add(labelLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        labelTel.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        labelTel.setText("หมายเลขโทรศัพท์ :");
        head.add(labelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        labelReturnDate.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        labelReturnDate.setText("วันที่คืน :");
        head.add(labelReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        labelFee.setFont(new java.awt.Font("TH Sarabun New", 1, 24)); // NOI18N
        labelFee.setText("ค่าเช่า :");
        head.add(labelFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        txtRentId.setEditable(false);
        txtRentId.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        head.add(txtRentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 157, -1));

        txtRentDate.setEditable(false);
        txtRentDate.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        txtRentDate.setText("          วันที่ปัจจุบัน");
        head.add(txtRentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 157, -1));

        txtReturnDate.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        txtReturnDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtReturnDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReturnDateFocusLost(evt);
            }
        });
        txtReturnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReturnDateActionPerformed(evt);
            }
        });
        head.add(txtReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 157, -1));

        txtFee.setEditable(false);
        txtFee.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        txtFee.setText("200");
        txtFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeeActionPerformed(evt);
            }
        });
        head.add(txtFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 157, -1));

        txtTel.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        head.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 157, -1));

        txtLName.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        head.add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 157, -1));

        txtFName.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        head.add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 157, -1));

        txtCitizenId.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        txtCitizenId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCitizenIdFocusLost(evt);
            }
        });
        head.add(txtCitizenId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 157, -1));

        txtBikeId.setEditable(false);
        txtBikeId.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        txtBikeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBikeIdActionPerformed(evt);
            }
        });
        txtBikeId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBikeIdKeyReleased(evt);
            }
        });
        head.add(txtBikeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 157, -1));

        btnVerify.setText("ตรวจสอบ");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });
        head.add(btnVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

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
        menuBikeInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBikeInfoMouseClicked(evt);
            }
        });
        menuBar.add(menuBikeInfo);

        menuCusInfo.setText("ข้อมูลลูกค้า");
        menuCusInfo.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        menuCusInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCusInfoMouseClicked(evt);
            }
        });
        menuBar.add(menuCusInfo);

        menuEmployeeInfo.setBorder(null);
        menuEmployeeInfo.setText("ข้อมูลพนักงาน");
        menuEmployeeInfo.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        menuEmployeeInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmployeeInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuEmployeeInfoMouseEntered(evt);
            }
        });
        menuBar.add(menuEmployeeInfo);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (!isFill(txtSearch.getText())) {
            System.out.println("ไม่กรอก");
        } else {
            search();
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        // TODO add your handling code here:
        searchAll();

    }//GEN-LAST:event_btnAllActionPerformed

    private void searchAll() {
        renderTable();
        txtSearch.setText("");
    }
    
    public void rentBike(){
         String bikeId = txtBikeId.getText();
        String citizenId = txtCitizenId.getText();
        String fName = txtFName.getText();
        String lName = txtLName.getText();
        String Tel = txtTel.getText();
        String rentId = txtRentId.getText();
        String dateRent = txtRentDate.getText();
        String dateReturn = txtReturnDate.getText();
        String fee = txtFee.getText();
        String bikeStatus = tableBikeStatus.getModel().getValueAt(tableBikeStatus.getSelectedRow(), 1).toString();

        Customer customer = new Customer(citizenId, fName, lName, Tel);
        Invoice invoice = new Invoice(rentId, bikeId, dateRent, dateReturn, "ยังไม่คืน", customer, Float.parseFloat(fee));

        // ตรวจสอบว่ากรอกข้อมูลครบถ้วนหรือไม่
        if (!isFieldAllFill(bikeId, citizenId, fName, lName, Tel, rentId, dateRent, dateReturn, fee)) {

            if (!isFill(bikeId)) {
                //ไม่ได้เลือกรถในตาราง
                alertMessage("กรุณาเลือกรถที่ต้องการเช่าในตาราง");
            } else {
                //กรอกข้อมูลไม่ครบ
                alertMessage("กรุณากรอกข้อมูลให้ครบถ้วน");
            }
        } else {
            //กรอกข้อมูลครบ

            // ตรวจสอบว่าช่องเบอร์โทร กรอกครบ10หลักหรือไม่
            if (!isTelvalid(Tel)) {
                //กรอกไม่ครบ
                alertMessage("กรุณากรอกหมายเลขโทรศัพท์จำนวน 10 หลัก");
            } else if (!isCitizenIdValid(citizenId)) {
                //กรอกบัตรประจำตัวประชาชนไม่ครบ
                alertMessage("กรุณากรอกหมายเลขประจำตัวประชาชนให้ครบ 13 หลัก");
            } else {
                // กรอกข้อมูลถูกต้อง และ ครบทุกช่อง
                System.out.println("เช่า");
                if (bikeStatus.equals("ว่าง")) {

                    if (service.Rent(bikeId, bikeStatus, customer, invoice)) {
                        alertMessage("เช่ารถสำเร็จ");
                        clear();
                        renderTable();
                        txtRentId.setText("R" + service.invDao.incrementInvoiceId());
                    } else {
                        alertMessage("เช่าไม่สำเร็จ");
                        clear();
                    }
                } else {
                    alertMessage("รถคันนี้ถูกเช่าแล้ว");
                    clear();
                }
            }
        }
    }
    private void btnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentActionPerformed
        // TODO add your handling code here:
        rentBike();

    }//GEN-LAST:event_btnRentActionPerformed

    private void txtFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeeActionPerformed

    private void txtBikeIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBikeIdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBikeIdKeyReleased

    private void txtBikeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBikeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBikeIdActionPerformed

    private void tableBikeStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBikeStatusMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableBikeStatus.getModel();
        int rowIndex = tableBikeStatus.getSelectedRow();

        txtBikeId.setText(model.getValueAt(rowIndex, 0).toString());

    }//GEN-LAST:event_tableBikeStatusMouseClicked

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        // TODO add your handling code here:

        if (!isCitizenIdValid(txtCitizenId.getText())) {
            alertMessage("กรุณากรอกหมายเลขประจำตัวประชาชนให้ครบ 13 หลัก");
        } else {
            try {
                if (service.findCustomerById(txtCitizenId.getText()) != null) {
                    setCustomer();
                    System.out.println("เจอ");
                } else {
                    alertMessage("กรุณากรอกข้อมูลเพิ่มเติม");

                }
            } catch (Exception e) {
                alertMessage("ไม่สามารถเชื่อมต่อข้อมูลในดาต้าเบสได้");
            }
        }

    }//GEN-LAST:event_btnVerifyActionPerformed

    private void txtReturnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReturnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReturnDateActionPerformed

    private void txtReturnDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReturnDateFocusGained
        // TODO add your handling code here:
        txtReturnDate.setText("");
    }//GEN-LAST:event_txtReturnDateFocusGained

    private void txtReturnDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReturnDateFocusLost
        // TODO add your handling code here:
        if (txtReturnDate.getText().equals("")) {
            txtReturnDate.setText("dd/mm/yyyy");
        }
    }//GEN-LAST:event_txtReturnDateFocusLost

    private void menuMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMainMenuMouseClicked
        new FormBikeStatus().show();
        dispose();
    }//GEN-LAST:event_menuMainMenuMouseClicked

    private void menuBikeInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBikeInfoMouseClicked
        // TODO add your handling code here:
        new FormManageBike().show();
        dispose();
    }//GEN-LAST:event_menuBikeInfoMouseClicked

    private void menuCusInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCusInfoMouseClicked
        // TODO add your handling code here:
        new FormShowCustomer().show();
        dispose();
    }//GEN-LAST:event_menuCusInfoMouseClicked

    private void menuEmployeeInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmployeeInfoMouseClicked
        // TODO add your handling code here:
        new FormManageEmployee().show();
        dispose();

    }//GEN-LAST:event_menuEmployeeInfoMouseClicked

    private void menuEmployeeInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmployeeInfoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_menuEmployeeInfoMouseEntered

    private void menuRentBikeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRentBikeMousePressed
        // TODO add your handling code here:
        new FormRent().show();
        dispose();
    }//GEN-LAST:event_menuRentBikeMousePressed

    private void menuReturnBikeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuReturnBikeMousePressed
        new FormReturn().show();
        dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_menuReturnBikeMousePressed

    private void menuLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMousePressed

        // TODO add your handling code here:*/
    }//GEN-LAST:event_menuLogoutMousePressed

    private void txtCitizenIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCitizenIdFocusLost
        // TODO add your handling code here:
        if (!isCitizenIdValid(txtCitizenId.getText())) {
            
        } else {
            try {
                if (service.findCustomerById(txtCitizenId.getText()) != null) {
                    setCustomer();
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_txtCitizenIdFocusLost

    public void get() {
        List<Bike> bikeList = service.getAllBike();
        Iterator<Bike> cursor = bikeList.iterator();

        try {
            while (cursor.hasNext()) {
                Bike bike = cursor.next();
                String bikeId = bike.getBikeId();
                String bikeStatus = bike.getBikeStatus();

            }
        } finally {

        }
    }

    public void clear() {
        txtBikeId.setText("");
        txtCitizenId.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtReturnDate.setText("");
        txtTel.setText("");

    }

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
            java.util.logging.Logger.getLogger(FormRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnRent;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnVerify;
    private javax.swing.JPanel head;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBikeId;
    private javax.swing.JLabel labelCitizenId;
    private javax.swing.JLabel labelFName;
    private javax.swing.JLabel labelFee;
    private javax.swing.JLabel labelLName;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelRentDate;
    private javax.swing.JLabel labelRentId;
    private javax.swing.JLabel labelReturnDate;
    private javax.swing.JLabel labelShowDate;
    private javax.swing.JLabel labelShowTime;
    private javax.swing.JLabel labelTel;
    private javax.swing.JPanel line;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBikeInfo;
    private javax.swing.JMenu menuCusInfo;
    private javax.swing.JMenu menuEmployeeInfo;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuMainMenu;
    private javax.swing.JMenu menuRentBike;
    private javax.swing.JMenu menuReturnBike;
    private javax.swing.JTable tableBikeStatus;
    private javax.swing.JTextField txtBikeId;
    private javax.swing.JTextField txtCitizenId;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFee;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtRentDate;
    private javax.swing.JTextField txtRentId;
    private javax.swing.JTextField txtReturnDate;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
