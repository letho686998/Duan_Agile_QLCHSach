/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import static Repository.NhanVienRepository.lsNhanVien;
import Service.NhanVienService;
import assgnment1.UHelper.Uheper;
import helper.DbConnector;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LENOVO
 */
public class QuanLyNhanVien extends javax.swing.JFrame {

    private NhanVienService service = new NhanVienService();

    public QuanLyNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        loadDaTaToTable();
    }

    private void loadDaTaToTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setColumnCount(0);
        model.addColumn("Mã NV");
        model.addColumn("Họ tên");
        model.addColumn("Giới tính");
        model.addColumn("Ngày sinh");
        model.addColumn("SDT");
        model.addColumn("Email");
        model.addColumn("Địa chỉ");
        model.addColumn("Chức vụ");
        model.addColumn("Số năm làm việc");
        model.addColumn("Lương");

        model.setRowCount(0);
        ArrayList<NhanVien> danhSach = service.xemDanhSach();
        for (NhanVien nv : danhSach) {
            model.addRow(new Object[]{nv.getMaNv(), nv.getHoTen(),
                nv.getGioiTinh(), nv.getNgaySinh(), nv.getSoDt(), nv.getEmail(),
                nv.getDiaChi(), nv.getChucVu(), nv.getSoNamLamViec(),
                nv.luong(nv.getSoNamLamViec())});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSonamlamviec = new javax.swing.JTextField();
        txtChucvu = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        txtGioitinh = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtXoa = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        txtSua = new javax.swing.JButton();
        txtThem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý nhân viên");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(85, 72, 242));
        jLabel2.setText("Mã NV");
        jLabel2.setPreferredSize(new java.awt.Dimension(151, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(85, 72, 242));
        jLabel3.setText("Họ tên");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(85, 72, 242));
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(85, 72, 242));
        jLabel5.setText("Ngày sinh");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(85, 72, 242));
        jLabel6.setText("SĐT");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(85, 72, 242));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(85, 72, 242));
        jLabel8.setText("Địa chỉ");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(85, 72, 242));
        jLabel9.setText("Chức vụ");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(85, 72, 242));
        jLabel10.setText("Số năm làm việc");

        txtSonamlamviec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSonamlamviecActionPerformed(evt);
            }
        });

        txtChucvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChucvuActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtMaNV.setPreferredSize(new java.awt.Dimension(212, 36));
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        txtXoa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        txtXoa.setForeground(new java.awt.Color(85, 72, 242));
        txtXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        txtXoa.setText("Xóa");
        txtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXoaActionPerformed(evt);
            }
        });

        btnTimkiem.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnTimkiem.setForeground(new java.awt.Color(85, 72, 242));
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        txtSua.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        txtSua.setForeground(new java.awt.Color(85, 72, 242));
        txtSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        txtSua.setText("Sửa");
        txtSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuaActionPerformed(evt);
            }
        });

        txtThem.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        txtThem.setForeground(new java.awt.Color(85, 72, 242));
        txtThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        txtThem.setText("Thêm");
        txtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 72, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Anh1_Fix5.jpg"))); // NOI18N

        tblNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblNhanVien.setForeground(new java.awt.Color(85, 72, 242));
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "Ngày sinh", "Sđt", "Email", "Địa chỉ", "Chức vụ", "Số năm lv", "Lương"
            }
        ));
        tblNhanVien.setRowHeight(29);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ql1.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(85, 72, 242));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh.png"))); // NOI18N
        btnClear.setText("Làm Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtSonamlamviec, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(586, 586, 586)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnTimkiem, txtSua, txtThem, txtXoa});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThem))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSua))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtXoa)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiem))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSonamlamviec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtChucvu, txtDiachi, txtEmail, txtGioitinh, txtHoTen, txtMaNV, txtNgaysinh, txtSdt, txtSonamlamviec});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnTimkiem, txtSua, txtThem, txtXoa});

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        try {
            String maNv = JOptionPane.showInputDialog("Mời Nhập mã nhân viên cần tìm:");
            if (maNv.equals(JOptionPane.CANCEL_OPTION)) {
                loadDaTaToTable();
            }
            NhanVien nvCanTim = new NhanVien();
            nvCanTim.setMaNv(maNv);
            System.out.println(maNv);

            DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
            model.setColumnCount(0);
            model.addColumn("Mã NV");
            model.addColumn("Họ tên");
            model.addColumn("Giới tính");
            model.addColumn("Ngày sinh");
            model.addColumn("SDT");
            model.addColumn("Email");
            model.addColumn("Địa chỉ");
            model.addColumn("Chức vụ");
            model.addColumn("Số năm làm việc");
            model.addColumn("Lương");

            model.setRowCount(0);
            ArrayList<NhanVien> danhSach = service.timNv(nvCanTim);
            for (NhanVien nv : danhSach) {
                model.addRow(new Object[]{nv.getMaNv(), nv.getHoTen(),
                    nv.getGioiTinh(), nv.getNgaySinh(), nv.getSoDt(), nv.getEmail(),
                    nv.getDiaChi(), nv.getChucVu(), nv.getSoNamLamViec(),
                    nv.luong(nv.getSoNamLamViec())});
            }

        } catch (Exception e) {
           // e.printStackTrace();
        }


    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void txtSonamlamviecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSonamlamviecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSonamlamviecActionPerformed

    private void txtChucvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChucvuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChucvuActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed
    private NhanVien getNhanVienFromInput() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String manv = txtMaNV.getText();
        String tenNv = txtHoTen.getText();
        String gioiTinh = txtGioitinh.getText();
        Date ngaySinh = sdf.parse(txtNgaysinh.getText());
        String sdt = txtSdt.getText();
        String email = txtEmail.getText();
        String diaChi = txtDiachi.getText();
        String chucVu = txtChucvu.getText();
        Integer soNamLamViec = Integer.parseInt(txtSonamlamviec.getText());
        NhanVien nv = new NhanVien();
        nv.setMaNv(manv);
        nv.setHoTen(tenNv);
        nv.setGioiTinh(gioiTinh);
        nv.setNgaySinh(ngaySinh);
        nv.setSoDt(sdt);
        nv.setEmail(email);
        nv.setDiaChi(diaChi);
        nv.setChucVu(chucVu);
        nv.setSoNamLamViec(soNamLamViec);
        return nv;

    }
    private void txtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThemActionPerformed
        try {
//            if(txtMaNV.getText().equals("")){
//                JOptionPane.showMessageDialog(this, "Mã nhân viên không được rỗng");
//                txtMaNV.requestFocus();
//                return;
//            }
            if (Uheper.checkRong(txtMaNV, "Mã nhân viên không được rỗng")) {
                return;
            }
            if (Uheper.checkRong(txtHoTen, "Họ tên nhân viên không được rỗng")) {
                return;
            }
            if (Uheper.checkRong(txtGioitinh, "Giới tính nhân viên không được rỗng")) {
                return;
            }
            if (Uheper.checkRong(txtNgaysinh, "Ngày sinh nhân viên không được rỗng")) {
                return;
            }
            if (Uheper.checkRong(txtSdt, "Số điện thoại nhân viên không được rỗng")) {
                return;
            }
            if (Uheper.checkRong(txtEmail, "Email nhân viên không được rỗng")) {
                return;
            }
            if (Uheper.checkRong(txtDiachi, "Địa chỉ nhân viên không được rỗng")) {
                return;
            }
            if (Uheper.checkRong(txtChucvu, "Chức vụ nhân viên không được rỗng")) {
                return;
            }
            if (Uheper.checkRong(txtSonamlamviec, "Số năm làm việc nhân viên không được rỗng")) {
                return;
            }

            Integer soNamLamViec;
            try {
                soNamLamViec = Integer.parseInt(txtSonamlamviec.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Số năm làm việc phải là số");
                txtSonamlamviec.requestFocus();
                return;
            }

            String ten = txtHoTen.getText();
            try {
                double ten1 = Double.parseDouble(ten);
                JOptionPane.showMessageDialog(this, "Giá trị nhập vào phải là chữ");
                txtHoTen.requestFocus();
                return;
            } catch (Exception e) {

            }

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = sdf.parse(txtNgaysinh.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không đúng định dạng");
                txtNgaysinh.requestFocus();
                return;
            }
            String input = txtSdt.getText();
            String phoneNumberPattern = "^0\\d{9,10}$";
            Pattern pattern = Pattern.compile(phoneNumberPattern);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                //JOptionPane.showMessageDialog(this, "SDT hợp lệ");
            } else {
                JOptionPane.showMessageDialog(this, "SDT không hợp lệ,phải nhập 9-10 số");
                txtSdt.requestFocus();
                return;
            }

            String sdthoai = txtSdt.getText();
            try {
                double sdt1 = Double.parseDouble(sdthoai);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Số điện thoại nhập vào phải là số");
                txtSdt.requestFocus();
                return;

            }

            NhanVien nv = getNhanVienFromInput();
            int kq = service.themNhanVien(nv);
            if (kq > -1) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "Trùng mã nhân viên mời nhập lại mã khác");
            }

            loadDaTaToTable();
        } catch (Exception e) {
            System.out.println("Mời nhập lại");
        }


    }//GEN-LAST:event_txtThemActionPerformed
    private void showDetail() {
        Integer selectedRow = tblNhanVien.getSelectedRow();
        txtMaNV.setText(tblNhanVien.getValueAt(selectedRow, 0).toString());
        txtHoTen.setText(tblNhanVien.getValueAt(selectedRow, 1).toString());
        txtGioitinh.setText(tblNhanVien.getValueAt(selectedRow, 2).toString());
        txtNgaysinh.setText(tblNhanVien.getValueAt(selectedRow, 3).toString());
        txtSdt.setText(tblNhanVien.getValueAt(selectedRow, 4).toString());
        txtEmail.setText(tblNhanVien.getValueAt(selectedRow, 5).toString());
        txtDiachi.setText(tblNhanVien.getValueAt(selectedRow, 6).toString());
        txtChucvu.setText(tblNhanVien.getValueAt(selectedRow, 7).toString());
        txtSonamlamviec.setText(tblNhanVien.getValueAt(selectedRow, 8).toString());
    }


    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        showDetail();
    }//GEN-LAST:event_tblNhanVienMouseClicked
    private String maNVFromTable() {
        int selectedRow = tblNhanVien.getSelectedRow();
        String maNv = tblNhanVien.getValueAt(selectedRow, 0).toString();
        return maNv;
    }
    private void txtSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuaActionPerformed

        try {
            NhanVien nv = getNhanVienFromInput();
            String manvtim = maNVFromTable();
            nv.setMaNv(manvtim);

            if (service.suaNhanVien(nv) != null) {
                JOptionPane.showMessageDialog(this, "Update thành công");
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "Update thất bại");
            }
            loadDaTaToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtSuaActionPerformed
    private String getIdNhanVienFromRow() {
        Integer row = tblNhanVien.getSelectedRow();
        String manv = tblNhanVien.getValueAt(row, 0).toString();
        System.out.println(manv);
        return manv;
    }

    private void clearForm() {
        txtChucvu.setText("");
        txtDiachi.setText("");
        txtEmail.setText("");
        txtGioitinh.setText("");
        txtHoTen.setText("");
        txtMaNV.setText("");
        txtNgaysinh.setText("");
        txtSdt.setText("");
        txtSonamlamviec.setText("");

    }
    private void txtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXoaActionPerformed

        try {
            int selectedRow = tblNhanVien.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Mời bạn chọn bản ghi");
                return;
            }
            String manv = getIdNhanVienFromRow();
            int ketqua = service.xoaNhanVien(manv);
            if (ketqua > -1) {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");

            }
            loadDaTaToTable();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_txtXoaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Main ma = new Main();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtChucvu;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGioitinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSonamlamviec;
    private javax.swing.JButton txtSua;
    private javax.swing.JButton txtThem;
    private javax.swing.JButton txtXoa;
    // End of variables declaration//GEN-END:variables

}
