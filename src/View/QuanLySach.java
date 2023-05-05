/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import static java.nio.file.Files.list;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;
import Service.SachService;
import Repository.SachRepository;
import static java.util.Collections.list;
import javax.swing.DefaultComboBoxModel;
import helper.DbConnector;

public class QuanLySach extends javax.swing.JFrame {

    private final ArrayList<Sach> List = new ArrayList<>();
    private Service.SachService serv;

    /**
     * Creates new form QuanLySach
     */
    public QuanLySach() throws Exception {

        initComponents();
        datacbb();
        this.serv = new SachService();
        loadTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNhaXuatBan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbbTheLoai = new javax.swing.JComboBox<>();
        txtTacGia = new javax.swing.JTextField();
        txttenSach = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtgiaTien = new javax.swing.JTextField();
        txtSLCL = new javax.swing.JTextField();
        txtngayNhapHang = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnNhap = new javax.swing.JButton();
        btnThem2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sách");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(85, 72, 242));
        jLabel11.setText("Tên sách");
        jLabel11.setPreferredSize(new java.awt.Dimension(151, 33));

        cbbTheLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTheLoaiActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(85, 72, 242));
        jLabel14.setText("Nhà Xuất Bản ");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(85, 72, 242));
        jLabel15.setText("Ngày nhập hàng");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(85, 72, 242));
        jLabel16.setText("Số lượng");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(85, 72, 242));
        jLabel17.setText("Giá tiền");

        btnThem.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(85, 72, 242));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        btnThem.setText("Thêm mới");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(85, 72, 242));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(85, 72, 242));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnTim.setForeground(new java.awt.Color(85, 72, 242));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Sách", "Tên Sách", "Thể loại", "Tác giả", "Nhà Xuất Bản  ", "Ngày Nhập", "Số lương sách", "Giá Nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSach.setRowHeight(30);
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSach);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 72, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ SÁCH");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Anh1_Fix5.jpg"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ql1.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(85, 72, 242));
        jLabel18.setText("ID sách");
        jLabel18.setPreferredSize(new java.awt.Dimension(151, 33));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(85, 72, 242));
        jLabel19.setText("Thể loại");

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(85, 72, 242));
        jLabel20.setText("Tác giả");

        btnNhap.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnNhap.setForeground(new java.awt.Color(85, 72, 242));
        btnNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Create.png"))); // NOI18N
        btnNhap.setText("Nhập ");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        btnThem2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnThem2.setForeground(new java.awt.Color(85, 72, 242));
        btnThem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh.png"))); // NOI18N
        btnThem2.setText("Làm mới");
        btnThem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtngayNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSLCL, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThem2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtgiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(543, 543, 543)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSua, btnThem, btnTim, btnXoa});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel14, jLabel15, jLabel16, jLabel17});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(cbbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(btnTim))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem2))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtngayNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNhap))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtSLCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtgiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel14, jLabel15, jLabel16, jLabel17});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbbTheLoai, txtNhaXuatBan, txtSLCL, txtTacGia, txtgiaTien, txtngayNhapHang, txttenSach});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayNhap = null;
        String ID = txtID.getText().trim();
        String tenSach = txttenSach.getText().trim();
        String tacGia = txtTacGia.getText().trim();
        String theLoai = (String) cbbTheLoai.getSelectedItem();
        String soLuong = txtSLCL.getText().trim();
        String nhaXB = txtNhaXuatBan.getText().trim();
        String giaNhap = txtgiaTien.getText().trim();

        if (ID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập ID", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (tenSach.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (tacGia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên tác giả", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (theLoai == null || theLoai.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thể loại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (nhaXB.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên nhà xuất bản", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (soLuong.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (giaNhap.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập giá tiền", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            try {
                Integer number = Integer.parseInt(soLuong);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Số lượng sách phải là số nguyên", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        try {
            Float number = Float.parseFloat(giaNhap);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Giá tiền phải là số", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            ngayNhap = sdf.parse(txtngayNhapHang.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày nhập hàng không đúng định dạng", "Lỗi", JOptionPane.ERROR_MESSAGE);
            txtngayNhapHang.requestFocus();
            return;
        }

        Float giaNhap1 = Float.parseFloat(giaNhap);
        Sach sach1 = new Sach();
        sach1.setIDSach(ID);
        sach1.setTenSach(tenSach);
        sach1.setTacGia(tacGia);
        sach1.setTheLoai(theLoai);
        sach1.setNhaXB(nhaXB);
        sach1.setNgayNhap(ngayNhap);
        sach1.setSoLuong(Integer.parseInt(soLuong));
        sach1.setGiaNhap(giaNhap1);

        try {
            serv.ThemQuyenSachMoi(sach1);
            JOptionPane.showMessageDialog(null, "Thêm sách mới thành công");
            loadTable();

        } catch (Exception ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Thêm sách mới thất bại: ");
        }

    }//GEN-LAST:event_btnThemActionPerformed


    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        int selectedRow = tblSach.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng để xóa");
            return;
        } else {
            int confirmed = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa dữ liệu này không?");
            if (confirmed == JOptionPane.YES_OPTION) {
                
                String id =  txtID.getText();
                try {
                    this.serv.xoaQuyenSachCu(id);
                    JOptionPane.showMessageDialog(this, "Đã xóa thành công");
                } catch (Exception ex) {
                    Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Xóa không thành công");
                return;
            }

            try {
                loadTable();
            } catch (Exception ex) {
                Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.clean();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        int row = this.tblSach.getSelectedRow();
        String idsach = this.tblSach.getValueAt(row, 0).toString();
        String tenSach = this.tblSach.getValueAt(row, 1).toString();
        String tacGia = this.tblSach.getValueAt(row, 3).toString();
        String theLoai = this.tblSach.getValueAt(row, 2).toString();
        String NXB = this.tblSach.getValueAt(row, 4).toString();
        String ngayNhap = this.tblSach.getValueAt(row, 5).toString();
        String soLuongNhap = this.tblSach.getValueAt(row, 6).toString();
        String giaNhap = this.tblSach.getValueAt(row, 7).toString();

        this.txtID.setText(idsach);
        this.txttenSach.setText(tenSach);
        this.txtTacGia.setText(tacGia);
        this.cbbTheLoai.setSelectedItem(theLoai);
        this.txtNhaXuatBan.setText(NXB);
        this.txtngayNhapHang.setText(ngayNhap);
        this.txtSLCL.setText(soLuongNhap);
        this.txtgiaTien.setText(giaNhap);
    }//GEN-LAST:event_tblSachMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        String id1 = JOptionPane.showInputDialog(this, "Nhập mã", "Tìm kiếm", JOptionPane.YES_OPTION);

        try {
            this.serv.timSach(id1);
        } catch (Exception ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            loadTable1();
        } catch (Exception ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.clean();
    }//GEN-LAST:event_btnTimActionPerformed

    private void cbbTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTheLoaiActionPerformed

    }//GEN-LAST:event_cbbTheLoaiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        try {

            int TTA = 0;
            int vitri;
            vitri = tblSach.getSelectedRow();
            if (vitri == -1) {
                JOptionPane.showMessageDialog(this, "Chọn 1 dòng để sửa");
            }
            String idSp = (tblSach.getValueAt(vitri, 0).toString());
            Sach sach = new Sach();

            int theLoai = 0;
            String theloai = this.cbbTheLoai.getSelectedItem().toString();
            if (theloai.equals("Văn học")) {
                theLoai = 1;
            } else if (theloai.equals("Đời Sống")) {
                theLoai = 2;
            } else if (theloai.equals("Thiếu Nhi")) {
                theLoai = 3;
            } else if (theloai.equals("Kinh tế - Chính trị")) {
                theLoai = 4;
            } else if (theloai.equals("Lịch sử")) {
                theLoai = 5;
            }

            String idSach = this.txtID.getText();
            String tenSach = this.txttenSach.getText();
            String tacGia = this.txtTacGia.getText();
            String NXB = this.txtNhaXuatBan.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date ngayNhap = null;

            String soLuong = this.txtSLCL.getText();
            Integer soLuong1 = Integer.parseInt(soLuong);
            String gia = this.txtgiaTien.getText();
            Float giaTien = Float.parseFloat(gia);
            if (txtID.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập ID");
            } else if (txttenSach.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập tên sách");
            } else if (txtTacGia.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập tên tác giả");
            } else if (cbbTheLoai.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn thể loại");
            } else if (txtNhaXuatBan.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập tên nhà xuất bản");
            } else if (txtSLCL.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng sách");
            } else if (txtgiaTien.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập giá tiền");
            } else {
                // Kiểm tra định dạng dữ liệu của số lượng sách và giá tiền
                try {
                    Integer number = Integer.parseInt(txtSLCL.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Số lượng sách phải là số nguyên");
                    return;
                }

                try {
                    Float number = Float.parseFloat(txtgiaTien.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Giá tiền phải là số");
                    return;
                }
                try {
                    ngayNhap = sdf.parse(txtngayNhapHang.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Ngày nhập hàng không đúng định dạng");
                    txtngayNhapHang.requestFocus();
                    return;
                }
            }
            sach.setIDSach(idSach);
            sach.setTenSach(tenSach);
            sach.setTacGia(tacGia);
            sach.setTheLoai(theloai);
            sach.setNhaXB(NXB);
            sach.setNgayNhap(ngayNhap);
            sach.setSoLuong(soLuong1);
            sach.setGiaNhap(giaTien);

            try {
                this.serv.SuaQuyenSach(sach, idSp);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            loadTable();

        } catch (Exception ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.clean();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main ma = new Main();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        int vitri;
        vitri = tblSach.getSelectedRow();
        String id1 = JOptionPane.showInputDialog(this, "Nhập số lượng sách", "Nhập sách", JOptionPane.YES_OPTION);
        int id2 = Integer.parseInt(id1);
        int soLuong = Integer.parseInt(txtSLCL.getText()) + id2;
        String idSp = (tblSach.getValueAt(vitri, 0).toString());
        Sach sach = new Sach();
        sach.setSoLuong(soLuong);
        try {
            this.serv.nhapThemSach(sach, idSp);
        } catch (Exception ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            loadTable();
        } catch (Exception ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNhapActionPerformed

    private void btnThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem2ActionPerformed
        clean();
    }//GEN-LAST:event_btnThem2ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLySach().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem2;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbTheLoai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNhaXuatBan;
    private javax.swing.JTextField txtSLCL;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtgiaTien;
    private javax.swing.JTextField txtngayNhapHang;
    private javax.swing.JTextField txttenSach;
    // End of variables declaration//GEN-END:variables

    private void loadTable() throws Exception {
        DefaultTableModel dtm = (DefaultTableModel) tblSach.getModel();
//        dtm.setColumnCount(0);
//        dtm.addColumn("ID");
//        dtm.addColumn("Tên sách");
//        dtm.addColumn("Thể Loại");
//        dtm.addColumn("Tác giả ");
//        dtm.addColumn("Nhà Xuất Bản ");
//        dtm.addColumn("Ngày Nhập");
//        dtm.addColumn("Số lượng nhập");
//        dtm.addColumn("Giá Nhập");
        dtm.setRowCount(0);
        // vì dòng đầu tiên trong table tính là 0
        for (Sach sach1 : this.serv.layDanhSachQuyenSach()) {
            Object[] row = new Object[]{
                // tạo ra 1 đối tượng có tên là row
                sach1.getIDSach(),
                sach1.getTenSach(),
                sach1.getTheLoai(),
                sach1.getTacGia(),
                sach1.getNhaXB(),
                sach1.getNgayNhap(),
                sach1.getSoLuong(),
                sach1.getGiaNhap()
            };
            dtm.addRow(row);
            // thêm đối tượng vào DefaultTableModel

        }
    }

    private void loadTable1() throws Exception {
        DefaultTableModel dtm = (DefaultTableModel) tblSach.getModel();
        dtm.setColumnCount(0);
        dtm.addColumn("ID");
        dtm.addColumn("Tên sách");
        dtm.addColumn("Thể Loại ");
        dtm.addColumn("Tác giả");
        dtm.addColumn("Nhà Xuất Bản ");
        dtm.addColumn("Ngày Nhập");
        dtm.addColumn("Số lượng nhập");
        dtm.addColumn("Giá Nhập");
        dtm.setRowCount(0);
        for (Sach sach1 : this.serv.layQuyenSachCanTim()) {
            Object[] row = new Object[]{
                sach1.getIDSach(),
                sach1.getTenSach(),
                sach1.getTheLoai(),
                sach1.getTacGia(),
                sach1.getNhaXB(),
                sach1.getNgayNhap(),
                sach1.getSoLuong(),
                sach1.getGiaNhap()
            };
            dtm.addRow(row);
        }
    }

    private void datacbb() throws Exception {
        DefaultComboBoxModel cbbmodel = (DefaultComboBoxModel) cbbTheLoai.getModel();
        cbbmodel.removeAllElements();// xóa trắng dữ liệu trong cbb
        Connection conn = DbConnector.getConnection();
        String sql = "select TheLoai from QUANLYSACH";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String TheLoai = rs.getString("TheLoai");
            cbbmodel.addElement(TheLoai);
        }
    }

    private void clean() {
        this.txtID.setText("");
        this.txttenSach.setText("");
        this.cbbTheLoai.setSelectedItem("'");
        this.txtTacGia.setText("");
        this.txtNhaXuatBan.setText("");
        this.txtngayNhapHang.setText("");
        this.txtSLCL.setText("");
        this.txtgiaTien.setText("");
    }
}
