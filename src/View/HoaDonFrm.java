/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;




import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import model.HoaDon;
import Service.HoaDonService;
import java.sql.Connection;
import helper.DbConnector;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;
import java.sql.ResultSet;




/**
 *
 * @author LENOVO
 */
public class HoaDonFrm extends javax.swing.JFrame {

    
    private HoaDonService service = new HoaDonService();
    
    public HoaDonFrm() {
        initComponents();
        setLocationRelativeTo(null);
        loadTable();
        loadMaNV();
        loadSach();
    }
    
 
    private void loadMaNV(){
        DefaultComboBoxModel modelMaNV= (DefaultComboBoxModel) cbbMaNV.getModel();
        modelMaNV.removeAllElements(); //xóa dữ liệu cũ
        //Thêm dữ liệu mới    
        
        ArrayList<HoaDon> dsMaNV = service.xemMaNV();
        modelMaNV.addAll(dsMaNV);
        
        //đổ dữ liệu lên cbb
        cbbMaNV.setSelectedItem(modelMaNV);
        
        cbbMaNV.setSelectedIndex(0); //mặc định chọn đối tượng đàu tiên
        
        
        
    }

    private void loadSach(){
        DefaultComboBoxModel modelSach= (DefaultComboBoxModel) cbbTenSach.getModel();
        modelSach.removeAllElements(); //xóa dữ liệu cũ
        
        //Thêm dữ liệu mới
         ArrayList<HoaDon> dsSach = service.xemSach();
       
        modelSach.addAll(dsSach);
        
        //đổ dữ liệu lên cbb
        cbbTenSach.setSelectedItem(modelSach);
        
        cbbTenSach.setSelectedIndex(0); //mặc định chọn đối tượng đàu tiên
    }
    
    private void loadTable(){
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        
        model.setColumnCount(0);
        model.addColumn("Mã Hóa đơn");
        model.addColumn("Mã NV bán");
        model.addColumn("Ngày bán");
        model.addColumn("Mã sách");
        model.addColumn("Tên sách");
        model.addColumn("Số lượng");
        model.addColumn("Giá bán");
        model.addColumn("Tổng tiền");
        
        model.setRowCount(0);
        ArrayList<HoaDon> danhSachHoaDon = service.xemDanhSach();
        for (HoaDon hoaDon : service.xemDanhSach()){
            Object[] row = new Object[]
            {
                hoaDon.getMaHoaDon(), hoaDon.getMaNhanVien(), hoaDon.getNgayBan(),
                hoaDon.getMaSachBan(), hoaDon.getTenSachBan(), hoaDon.getSoLuongBan(),
                hoaDon.getGiaBan(),hoaDon.getTongTien()
            };
        model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtMaSach = new javax.swing.JTextField();
        txtNgayBan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnTongDTThang = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        txtTongDoanhThu = new javax.swing.JTextField();
        cbbThang = new javax.swing.JComboBox<>();
        btnTim = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        cbbMaNV = new javax.swing.JComboBox();
        cbbTenSach = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hóa đơn");

        jLabel6.setText("Ngày bán");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(85, 72, 242));
        jLabel3.setText("Mã NV bán");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(85, 72, 242));
        jLabel4.setText("Mã Hóa đơn");
        jLabel4.setPreferredSize(new java.awt.Dimension(151, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(85, 72, 242));
        jLabel5.setText("Mã sách");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(85, 72, 242));
        jLabel7.setText("Tên sách");

        txtMaHD.setPreferredSize(new java.awt.Dimension(206, 33));
        txtMaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHDActionPerformed(evt);
            }
        });

        txtMaSach.setEnabled(false);

        txtNgayBan.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 72, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HÓA ĐƠN BÁN HÀNG");

        btnThanhToan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(85, 72, 242));
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Price list.png"))); // NOI18N
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(85, 72, 242));
        jLabel2.setText("Ngày bán");
        jLabel2.setPreferredSize(new java.awt.Dimension(151, 33));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa đơn", "Mã NV bán", "Ngày bán", "Mã sách", "Tên sách", "Số lượng", "Giá bán", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.setRowHeight(29);
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        btnTongDTThang.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnTongDTThang.setForeground(new java.awt.Color(85, 72, 242));
        btnTongDTThang.setText("Tổng doanh thu tháng");
        btnTongDTThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongDTThangActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Anh1_Fix5.jpg"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ql1.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(85, 72, 242));
        jLabel9.setText("Số lượng");

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(85, 72, 242));
        jLabel10.setText("Tổng tiền");

        txtTongTien.setEnabled(false);
        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(85, 72, 242));
        jLabel11.setText("Giá bán");

        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        txtTongDoanhThu.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtTongDoanhThu.setText("Tổng doanh thu tháng");
        txtTongDoanhThu.setEnabled(false);

        cbbThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        btnTim.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnTim.setForeground(new java.awt.Color(85, 72, 242));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        btnTim.setText("Tìm kiếm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(85, 72, 242));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        cbbTenSach.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTenSachItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(527, 527, 527)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbMaNV, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgayBan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(54, 54, 54)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSoLuong)
                                        .addComponent(cbbTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTongDTThang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel4, jLabel5, jLabel7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTongDoanhThu)
                            .addComponent(btnTongDTThang, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(cbbThang)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThanhToan))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(166, 166, 166))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMaHD, txtMaSach, txtNgayBan});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel7});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1276, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(709, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(219, 219, 219)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHDActionPerformed

    private void btnTongDTThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongDTThangActionPerformed
        int thangCanTim=Integer.parseInt(cbbThang.getSelectedItem().toString());
        Double tongDoanhThuThang=this.service.tongTienTheoThang(thangCanTim);
        txtTongDoanhThu.setText(String.valueOf(tongDoanhThuThang));
        
        try {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        
        model.setColumnCount(0);
        model.addColumn("Mã Hóa đơn");
        model.addColumn("Mã NV bán");
        model.addColumn("Ngày bán");
        model.addColumn("Mã sách");
        model.addColumn("Tên sách");
        model.addColumn("Số lượng");
        model.addColumn("Giá bán");
        model.addColumn("Tổng tiền");
        
        model.setRowCount(0);
        ArrayList<HoaDon> danhSachSachCanTim = service.timThang(thangCanTim);
        for (HoaDon hd : danhSachSachCanTim){
            Object[] row = new Object[]
            {
                hd.getMaHoaDon(), hd.getMaNhanVien(), hd.getNgayBan(),
                hd.getMaSachBan(), hd.getTenSachBan(), hd.getSoLuongBan(),
                hd.getGiaBan(),hd.getTongTien()
            };
            model.addRow(row);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnTongDTThangActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
           
        String maHoaDon=txtMaHD.getText();
        String maNVBan=cbbMaNV.getSelectedItem().toString();
        String maSach=txtMaSach.getText();
        String tensach=cbbTenSach.getSelectedItem().toString();
        Integer soLuong=Integer.valueOf(txtSoLuong.getText());
        Double giaBan=Double.valueOf(txtGiaBan.getText());
        Double tongTien=soLuong*giaBan;
            
        
        JOptionPane.showMessageDialog(this, "Tổng tiền của quý khách cần thành toán là: " +tongTien);
        
        int yesno=JOptionPane.showConfirmDialog(this, "Xác nhận thanh toán?");
        if(yesno!=JOptionPane.YES_OPTION)
        {
            return;
        }
        
        try{
            if(txtMaHD.getText().trim().equals("")||cbbMaNV.getSelectedItem().toString().trim().equals("")||txtMaSach.getText().trim().equals("")||
                    cbbTenSach.getSelectedItem().toString().trim().equals("")||txtSoLuong.getText().trim().equals("")||txtGiaBan.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Thanh toán không thành công, không được bỏ trống!");
                return;
            }
            
            
            if(soLuong<=0||giaBan<=0){
                JOptionPane.showMessageDialog(this, "Số lượng và Giá bán phải >0");
                return;
            }
            
          
            
            HoaDon hoaDonThem=new HoaDon();
            hoaDonThem.setMaHoaDon(maHoaDon);
            hoaDonThem.setMaNhanVien(maNVBan);
            hoaDonThem.setMaSachBan(maSach);
            hoaDonThem.setTenSachBan(tensach);
            hoaDonThem.setSoLuongBan(soLuong);
            hoaDonThem.setGiaBan(giaBan);
            hoaDonThem.setTongTien(tongTien);
            
            this.service.themHoaDonMoi(hoaDonThem);
            
            this.loadTable();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Thanh toán không thành công, dữ liệu nhập không hợp lệ!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
            int row= tblHoaDon.getSelectedRow();
            
            if(row==-1){
                return;
            }
            
            String maHoaDon=tblHoaDon.getValueAt(row, 0).toString();

            String date=tblHoaDon.getValueAt(row, 2).toString();
            String maSach=tblHoaDon.getValueAt(row, 3).toString();

            String soLuong=tblHoaDon.getValueAt(row, 5).toString();
            String giaBan=tblHoaDon.getValueAt(row, 6).toString();
            String tongTien2=tblHoaDon.getValueAt(row, 7).toString();
            
            txtMaHD.setText(maHoaDon);

            txtNgayBan.setText(date);
            txtMaSach.setText(maSach);
    
            txtSoLuong.setText(soLuong);
            txtGiaBan.setText(giaBan);
            txtTongTien.setText(tongTien2);
            
            String maNV= (String) tblHoaDon.getValueAt(row, 1);
            int soLNV= cbbMaNV.getItemCount();
            for(int i=0;i<soLNV;i++)
            {
                String m=  cbbMaNV.getItemAt(i).toString();
                if (maNV.equals(m))
                {
                    cbbMaNV.setSelectedIndex(i);
                }
            }
            
            String tensach= tblHoaDon.getValueAt(row, 4).toString();
            int soSach= cbbTenSach.getItemCount();
            for(int i=0;i<soSach;i++)
            {
                String y= cbbTenSach.getItemAt(i).toString();
                if (tensach.equals(y))
                {
                    cbbTenSach.setSelectedIndex(i);
                }
            }
          
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Main ma = new Main();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        try {
            String sachCanTim = JOptionPane.showInputDialog(this,"Mời nhập tên sách cần tìm:");
           if(sachCanTim.equals(JOptionPane.CANCEL_OPTION)){
               loadTable();
           }
            HoaDon hoaDon = new HoaDon();
            hoaDon.setTenSachBan(sachCanTim);


            
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        
        model.setColumnCount(0);
        model.addColumn("Mã Hóa đơn");
        model.addColumn("Mã NV bán");
        model.addColumn("Ngày bán");
        model.addColumn("Mã sách");
        model.addColumn("Tên sách");
        model.addColumn("Số lượng");
        model.addColumn("Giá bán");
        model.addColumn("Tổng tiền");
        
        model.setRowCount(0);
        ArrayList<HoaDon> danhSachSachCanTim = service.timSach(hoaDon);
        for (HoaDon hd : danhSachSachCanTim){
            Object[] row = new Object[]
            {
                hd.getMaHoaDon(), hd.getMaNhanVien(), hd.getNgayBan(),
                hd.getMaSachBan(), hd.getTenSachBan(), hd.getSoLuongBan(),
                hd.getGiaBan(),hd.getTongTien()
            };
            model.addRow(row);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
            txtMaHD.setText("");
            cbbMaNV.setSelectedIndex(0);
            txtNgayBan.setText("");
            txtMaSach.setText("");
            cbbTenSach.setSelectedIndex(0);
            txtSoLuong.setText("");
            txtGiaBan.setText("");
            txtTongTien.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed
        
    }//GEN-LAST:event_txtTongTienActionPerformed

    private void cbbTenSachItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTenSachItemStateChanged
         try{
        Connection cnn =  DbConnector.getConnection();
        String query = "select IDSach  from QUANLYSACH where TenSach =?";
        PreparedStatement ps= cnn.prepareStatement(query);
        ps.setString(1,cbbTenSach.getSelectedItem().toString());
        ResultSet  rs=ps.executeQuery();  
        while (rs.next()) {
             txtMaSach.setText(rs.getString(1));
            }
        ps.close();
        cnn.close(); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_cbbTenSachItemStateChanged

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTongDTThang;
    private javax.swing.JComboBox cbbMaNV;
    private javax.swing.JComboBox cbbTenSach;
    private javax.swing.JComboBox<String> cbbThang;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNgayBan;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTongDoanhThu;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
