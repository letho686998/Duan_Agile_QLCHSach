/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import helper.DbConnector;
import java.util.ArrayList;
import model.NhanVien;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class NhanVienRepository {

    public static ArrayList<NhanVien> lsNhanVien = new ArrayList<>();

    public ArrayList<NhanVien> getAll() {
        try {
            Connection connection = DbConnector.getConnection();
            String query = "select IDNhanVien,HoTenNV,GioiTinh,NgaySinh,SĐT,Email,"
                    + "DiaChi,ChucVu,SoNamLamViec from QUANLYNHANVIEN";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            lsNhanVien = new ArrayList<>();
            while (rs.next()) {
                String IDNhanVien = rs.getString("IDNhanVien");
                String HoTenNV = rs.getString("HoTenNV");
                String GioiTinh = rs.getString("GioiTinh");
                Date NgaySinh = rs.getDate("NgaySinh");
                String SĐT = rs.getString("SĐT");
                String Email = rs.getString("Email");
                String DiaChi = rs.getString("DiaChi");
                String ChucVu = rs.getString("ChucVu");
                Integer soNamLamViec = rs.getInt("SoNamLamViec");
                NhanVien qlnv = new NhanVien();
                qlnv.setMaNv(IDNhanVien);
                qlnv.setHoTen(HoTenNV);
                qlnv.setGioiTinh(GioiTinh);
                qlnv.setNgaySinh(NgaySinh);
                qlnv.setSoDt(SĐT);
                qlnv.setEmail(Email);
                qlnv.setDiaChi(DiaChi);
                qlnv.setChucVu(ChucVu);
                qlnv.setSoNamLamViec(soNamLamViec);
                lsNhanVien.add(qlnv);
            }
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lsNhanVien;
    }

    public Integer addNhanVien(NhanVien nhanVien) {
        Integer ketqua = -1;
        try {

            Connection connection = DbConnector.getConnection();
            String query = "INSERT INTO QUANLYNHANVIEN (IDNhanVien,HoTenNV,GioiTinh,NgaySinh,"
                    + "SĐT,Email,DiaChi,ChucVu,sonamlamviec)\n"
                    + "VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nhanVien.getMaNv());
            statement.setString(2, nhanVien.getHoTen());
            statement.setString(3, nhanVien.getGioiTinh());
            statement.setDate(4, new java.sql.Date(nhanVien.getNgaySinh().getTime()));
            statement.setString(5, nhanVien.getSoDt());
            statement.setString(6, nhanVien.getEmail());
            statement.setString(7, nhanVien.getDiaChi());
            statement.setString(8, nhanVien.getChucVu());
            statement.setInt(9, nhanVien.getSoNamLamViec());

            // Kiểm tra xem bản ghi đã được thêm thành công hay không
            if (ketqua > 0) {
                System.out.println("Bản ghi đã được thêm thành công.");
            } else {
                System.out.println("Không thể thêm bản ghi do trùng khóa chính.");
            }

//            ketqua = statement.executeUpdate();
            try {
                ketqua = statement.executeUpdate();
                if (ketqua > 0) {
                    System.out.println("Bản ghi đã thêm thành công");
                }
            } catch (SQLException e) {
                if (e.getSQLState().equals("23505")) {
                    System.out.println("Không thể thêm bản ghi do trùng khóa chính.");

                } else {
                    //e.printStackTrace();
                }
            }
            statement.close();
            connection.close();

        } catch (Exception e) {
            // e.printStackTrace();

        }

        return ketqua;
    }

    public Integer updateNhanVien(NhanVien nhanVien) {
        Integer ketqua = -1;
        try {

            Connection connection = DbConnector.getConnection();
            String query = "update QUANLYNHANVIEN\n"
                    + "set HoTenNV=?,GioiTinh=?,NgaySinh=?,SĐT=?,Email=?,DiaChi=?,ChucVu=?,sonamlamviec=?\n"
                    + "where IDNhanVien=?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, nhanVien.getHoTen());
            statement.setString(2, nhanVien.getGioiTinh());
            statement.setDate(3, new java.sql.Date(nhanVien.getNgaySinh().getTime()));
            statement.setString(4, nhanVien.getSoDt());
            statement.setString(5, nhanVien.getEmail());
            statement.setString(6, nhanVien.getDiaChi());
            statement.setString(7, nhanVien.getChucVu());
            statement.setInt(8, nhanVien.getSoNamLamViec());
            statement.setString(9, nhanVien.getMaNv());

            ketqua = statement.executeUpdate();

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();

        }

        return ketqua;
    }

    public ArrayList<NhanVien> timNhanVien(NhanVien timNv) throws Exception {

        Connection connection = DbConnector.getConnection();
        String query = "select IDNhanVien,HoTenNV,GioiTinh,NgaySinh,SĐT,Email,DiaChi,ChucVu,SoNamLamViec"
                + " from QUANLYNHANVIEN where IDNhanVien like '%" + timNv.getMaNv() + "%'";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);

        lsNhanVien = new ArrayList<>();
        while (rs.next()) {
            String IDNhanVien = rs.getString(1);
            String HoTenNV = rs.getString(2);
            String GioiTinh = rs.getString(3);
            Date NgaySinh = rs.getDate(4);
            String SDT = rs.getString(5);
            String Email = rs.getString(6);
            String DiaChi = rs.getString(7);
            String ChucVu = rs.getString(8);
            Integer soNamLamViec = rs.getInt(9);
            System.out.println("idnv" + IDNhanVien + "hoten" + HoTenNV);
            lsNhanVien.add(new NhanVien(IDNhanVien, HoTenNV, GioiTinh, NgaySinh,
                    SDT, Email, DiaChi, ChucVu, soNamLamViec));
        }
        statement.close();
        connection.close();

        return lsNhanVien;
    }

    public Integer deleteNhanVien(String idnv) {
        Integer ketqua = -1;
        try {
            Connection connection = DbConnector.getConnection();
            String query = "delete from QUANLYNHANVIEN where IDNhanVien =?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, idnv);
            ketqua = statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketqua;
    }
    
    
    public void tinhLuongNhanVien(int sonamlamviec){
        try {
            
        } catch (Exception e) {
        }
    }
}
