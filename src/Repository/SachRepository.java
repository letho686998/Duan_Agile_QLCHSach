/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.ArrayList;
import helper.DbConnector;
import model.Sach;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import View.QuanLySach;
import java.sql.Date;

/**
 *
 * @author THE ANH
 */
public class SachRepository {

    private static ArrayList<Sach> danhsachquyensach = new ArrayList<>();
    // tạo ra 1 list chứa tất cả các quyển sách của database
    private static ArrayList<Sach> danhsachquyensachcantim = new ArrayList<>();

    public ArrayList<Sach> layQuyenSachCanTim() throws Exception {
        return danhsachquyensachcantim;
    }

    public ArrayList<Sach> laydanhsachquyensach() throws Exception {
        Connection conn = DbConnector.getConnection();
        Statement stm = conn.createStatement();
        String LenhQuery = "select IDSach,TenSach,TheLoai,TacGia,NhaXB,NgayNhap,SoLuongNhap,GiaNhap from QUANLYSACH ";
        ResultSet rs = stm.executeQuery(LenhQuery);
        danhsachquyensach = new ArrayList<>();
        while (rs.next()) {
            String idSach = rs.getString("IDSach");
            String tenSach = rs.getString("TenSach");
            String theLoai = rs.getString("TheLoai");
            String tacGia = rs.getString("TacGia");
            String nhaXB = rs.getString("NhaXB");
            Date ngayNhap = rs.getDate("NgayNhap");
            Integer soLuong = rs.getInt("SoLuongNhap");
            Float giaNhap = rs.getFloat("GiaNhap");

            Sach ql = new Sach();
            ql.setIDSach(idSach);
            ql.setTenSach(tenSach);
            ql.setTheLoai(theLoai);
            ql.setTacGia(tacGia);
            ql.setNhaXB(nhaXB);
            ql.setNgayNhap(ngayNhap);
            ql.setSoLuong(soLuong);
            ql.setGiaNhap(giaNhap);
            danhsachquyensach.add(ql);
        }
        return danhsachquyensach;
    }

    public void themSach(Sach quyenSach) {
        danhsachquyensach.add(quyenSach);
    }

//    public Integer themQuyenSach(Sach quyensach) throws Exception {
//        // viết câu lệnh insert
//        try (Connection conn = DbConnector.getConnection()) {
//            // viết câu lệnh insert
//            String sql = "INSERT INTO QUANLYSACH(IDSach,TenSach,TheLoai,TacGia,NhaXB,NgayNhap,SoLuongNhap,GiaNhap)" +
//                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//            
//            try (PreparedStatement statement = conn.prepareStatement(sql)) {
//                statement.setString(1, quyensach.getIDSach());
//                statement.setString(2, quyensach.getTenSach());
//                statement.setString(3, quyensach.getTheLoai());
//                statement.setString(4, quyensach.getTacGia());
//                statement.setString(5, quyensach.getNhaXB());
//                statement.setDate(6, java.sql.Date.valueOf(quyensach.getNgayNhap()));
//                statement.setInt(7, quyensach.getSoLuong());
//                statement.setDouble(8, quyensach.getGiaNhap());
//                
//                int executeUpdate = statement.executeUpdate();
//                this.themSach(quyensach);
//            }
//        }
//        return 0;
//    }
    public Integer themQuyenSach(Sach quyensach) throws Exception {
        // viết câu lệnh insert
        try ( Connection conn = DbConnector.getConnection();  
   PreparedStatement statement = conn.prepareStatement("INSERT INTO QUANLYSACH"
                + "(IDSach,TenSach,TheLoai,TacGia,NhaXB,NgayNhap,SoLuongNhap,GiaNhap)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {

            statement.setString(1, quyensach.getIDSach());
            statement.setString(2, quyensach.getTenSach());
            statement.setString(3, quyensach.getTheLoai());
            statement.setString(4, quyensach.getTacGia());
            statement.setString(5, quyensach.getNhaXB());
            statement.setDate(6, new java.sql.Date(quyensach.getNgayNhap().getTime()));
            statement.setInt(7, quyensach.getSoLuong());
            statement.setDouble(8, quyensach.getGiaNhap());

            int executeUpdate = statement.executeUpdate();
            this.themSach(quyensach);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public Integer xoaSachCu(String ID) throws Exception {
        int result = -1;
        try {
            Connection connection = DbConnector.getConnection();
            String query = "delete from QUANLYSACH where IDSach = '" + ID+"'";
            System.out.println(query);
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(query);
          
        } catch (Exception ex) {
        }
        return result;
    }

    public void timQuyenSach(String id) throws Exception {

        try {

            Connection conn = DbConnector.getConnection();
            Statement statement = conn.createStatement();
            String select = "select IDSach, TenSach, TheLoai, TacGia, NhaXB, NgayNhap, SoLuongNhap, GiaNhap \n"
                    + "from QUANLYSACH\n"
                    + "where IDSach like '" + id + "%'";
            System.out.println(id);
            ResultSet rs = statement.executeQuery(select);
            Sach sp = new Sach();
            while (rs.next()) {
                String idSach = rs.getString("IDSach");
                String tenSach = rs.getString("TenSach");
                String theLoai = rs.getString("TheLoai");
                String tacGia = rs.getString("TacGia");
                String nhaXB = rs.getString("NhaXB");
                Date ngayNhap = rs.getDate("NgayNhap");
                Integer soLuong = rs.getInt("SoLuongNhap");
                Float giaNhap = rs.getFloat("GiaNhap");

                Sach ql = new Sach();
                ql.setIDSach(idSach);
                ql.setTenSach(tenSach);
                ql.setTheLoai(theLoai);
                ql.setTacGia(tacGia);
                ql.setNhaXB(nhaXB);
                ql.setNgayNhap(ngayNhap);
                ql.setSoLuong(soLuong);
                ql.setGiaNhap(giaNhap);
                danhsachquyensachcantim.add(new Sach(idSach, tenSach, theLoai, tacGia, nhaXB, ngayNhap, soLuong, giaNhap));
            }
            rs.close();
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//
//    public static  List<String> laydulieucbb() throws Exception {
//        ArrayList<String> list1 = new ArrayList<String>();
//        Connection conn = DbConnector.getConnection();
//        String sql = "select TheLoai from QUANLYSACH";
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery(sql);
//while (rs.next()) {
//list1.add(rs.getString("TheLoai"));
//        }
//        return list1;
//    }

    public void suaQuyenSach(Sach quyenSach, String id) throws SQLException, Exception {
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Connection conn = DbConnector.getConnection();
        Statement statement = conn.createStatement();
        // Thêm dữ liệu vào bảng
        String Update = "UPDATE QUANLYSACH SET IDSach = ?, TenSach = ?, TheLoai = ?, TacGia = ?,"
                + " NhaXB = ?, NgayNhap = ?, SoLuongNhap = ?, GiaNhap = ? WHERE IDSach = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(Update);
        preparedStatement.setString(1, quyenSach.getIDSach());
        preparedStatement.setString(2, quyenSach.getTenSach());
        preparedStatement.setString(3, quyenSach.getTheLoai());
        preparedStatement.setString(4, quyenSach.getTacGia());
        preparedStatement.setString(5, quyenSach.getNhaXB());
        preparedStatement.setDate(6, new java.sql.Date(quyenSach.getNgayNhap().getTime()));
        preparedStatement.setInt(7, quyenSach.getSoLuong());
        preparedStatement.setDouble(8, quyenSach.getGiaNhap());
        preparedStatement.setString(9, id);
        preparedStatement.executeUpdate();

        System.out.println();
        JOptionPane.showMessageDialog(null, "Cập Nhật thành công");
        statement.close();
        conn.close();
    }
   public void NhapQuyenSach(Sach sach2, String id) throws SQLException, Exception {
    Connection conn = DbConnector.getConnection();
    Statement statement = conn.createStatement();
    // Thêm dữ liệu vào bảng
    String Update = "UPDATE QUANLYSACH SET SoLuongNhap = + ? WHERE IDSach = ?";
    PreparedStatement preparedStatement = conn.prepareStatement(Update);
    preparedStatement.setInt(1, sach2.getSoLuong());
    preparedStatement.setString(2, (id));
    preparedStatement.executeUpdate();
    JOptionPane.showMessageDialog(null, "Cập Nhật thành công");
    preparedStatement.close();
    conn.close();
   }
}
