/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import helper.DbConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

import model.HoaDon;
/**
 *
 * @author admin
 */
public class HoaDonRepository {
    private static ArrayList<HoaDon> dsHoaDon = new ArrayList<>();
    private static ArrayList<HoaDon> dsMaNV = new ArrayList<>();
    private static ArrayList<HoaDon> dstenSach = new ArrayList<>();

//Hiển thị lên Combobox
     public ArrayList<HoaDon> layMaNV(){
         
        try{
        
            Connection cnn = DbConnector.getConnection(); //tạo đối tượng cnn kết nối đến csdl đã tạo
            String query= "select IDNhanVien from QUANLYNHANVIEN";
            System.out.println(query);
            Statement st = cnn.createStatement();// tạo đối tương st từ đối tương cnn = cách sử dụng phương thức createStatement() qua đó thực thi các câu lệnh SQL đến cơ sở dữ liệu
            ResultSet rs=st.executeQuery(query); //tạo đối tương rs từ đối tượng st sử dụng phương thức executeQuery() được gọi với truy vấn SQL 
                                            //và kết quả trả về được lưu trữ trong đối tượng ResultSet được gán cho biến rs
            dsMaNV=new ArrayList<>();
            while(rs.next()){
                String maNhanVien=rs.getString("IDNhanVien");  
                HoaDon maNV = new HoaDon();
                maNV.setMaNhanVien(maNhanVien);
                dsMaNV.add(maNV);
            }          
        }
        catch(Exception e){
            e.printStackTrace();
        }

            return dsMaNV;
    }
     
     public ArrayList<HoaDon> laySach(){ 
        try{
        
            Connection cnn = DbConnector.getConnection(); //tạo đối tượng cnn kết nối đến csdl đã tạo
            String query= "select TenSach from QUANLYSACH";
            System.out.println(query);
            Statement st = cnn.createStatement();// tạo đối tương st từ đối tương cnn = cách sử dụng phương thức createStatement() qua đó thực thi các câu lệnh SQL đến cơ sở dữ liệu
            ResultSet rs=st.executeQuery(query); //tạo đối tương rs từ đối tượng st sử dụng phương thức executeQuery() được gọi với truy vấn SQL 
                                            //và kết quả trả về được lưu trữ trong đối tượng ResultSet được gán cho biến rs
            dstenSach=new ArrayList<>();
            while(rs.next()){
                String sach=rs.getString("TenSach");  
                HoaDon tenSach = new HoaDon();
                tenSach.setTenSachBan(sach);
                dstenSach.add(tenSach);
            }
        }
        catch(Exception e){
            e.printStackTrace();
             }

            return dstenSach;
        }
     
    
//HIỂN THỊ LÊN TABLE
    public ArrayList<HoaDon> layHoaDon(){
        try{
        
            Connection cnn = DbConnector.getConnection(); //tạo đối tượng cnn kết nối đến csdl đã tạo
            String query= "select IDHoaDon,IDNhanVien,NgayBan,IDSach,TenSachBan,SoLuongBan,GiaBan, SoLuongBan*GiaBan as N'TongTien' from HOADON";
            System.out.println(query);
            Statement st = cnn.createStatement();// tạo đối tương st từ đối tương cnn = cách sử dụng phương thức createStatement() qua đó thực thi các câu lệnh SQL đến cơ sở dữ liệu
            ResultSet rs=st.executeQuery(query); //tạo đối tương rs từ đối tượng st sử dụng phương thức executeQuery() được gọi với truy vấn SQL 
                                            //và kết quả trả về được lưu trữ trong đối tượng ResultSet được gán cho biến rs
            dsHoaDon=new ArrayList<>();
            while(rs.next()){
                String maHoaDon=rs.getString(1);
                String maNhanVien=rs.getString(2);
                Date ngayBan=rs.getDate(3);
                String maSachBan=rs.getString(4);
                String tenSachBan=rs.getString(5);
                Integer soLuongBan=rs.getInt(6);
                Double giaBan=rs.getDouble(7);
                Double tongTien=rs.getDouble(8);
                dsHoaDon.add(new HoaDon(maHoaDon, maNhanVien, ngayBan, maSachBan, tenSachBan, soLuongBan, giaBan, tongTien));
            }          
        }
        catch(Exception e){
            e.printStackTrace();
        }

            return dsHoaDon;
    }
    
//TÍNH TỔNG DOANH THU THEO THÁNG
    public Double TongDoanhThuThang (int thang){
        Double tong = null ;
        try
        {
            Connection cnn=DbConnector.getConnection();
            String query="select SUM(SoLuongBan*GiaBan) as 'TongTien1Thang' from HOADON where month(NgayBan) =" + thang ;
            System.out.println(query);
            Statement st=cnn.createStatement();
            ResultSet rs=st.executeQuery(query);     
         while(rs.next()){
               tong = rs.getDouble("TongTien1Thang");
         }      
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return tong;
    }
    
    
    //Thêm
    public Integer themDanhSach(HoaDon hoaDonMoi){
        try{
            Connection cnn=DbConnector.getConnection();
            String query="INSERT INTO HOADON (IDHoaDon,IDNhanVien,NgayBan,IDSach,TenSachBan,SoLuongBan,GiaBan) VALUES ('"+hoaDonMoi.getMaHoaDon()+"','"+hoaDonMoi.getMaNhanVien()+"',getDate(),'"+hoaDonMoi.getMaSachBan()+"',N'"+hoaDonMoi.getTenSachBan()+"',"+hoaDonMoi.getSoLuongBan()+","+hoaDonMoi.getGiaBan()+")"+
                    "update  QUANLYSACH  set SoLuongNhap=QUANLYSACH.SoLuongNhap-"+hoaDonMoi.getSoLuongBan()+" FROM QUANLYSACH JOIN HOADON ON QUANLYSACH.IDSach=HOADON.IDSach where QUANLYSACH.IDSach='"+hoaDonMoi.getMaSachBan()+"'";                    
            System.out.println(query);
            Statement st=cnn.createStatement();
            int result= st.executeUpdate(query);
            st.close();
            cnn.close();
            JOptionPane.showMessageDialog(null, "Thanh toán thành công, dữ liệu đã được lưu vào lịch sử giao dịch!");
        
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Mã hóa đơn bị trùng, Vui lòng nhập lại!");
            e.printStackTrace();
        }
        dsHoaDon.add(hoaDonMoi);
        return 1;
    }

//TÌM HÓA ĐƠN
    public ArrayList<HoaDon> timTheoTen(HoaDon timHD) {
        try{
           Connection cnn = DbConnector.getConnection();
        String query = "select IDHoaDon,IDNhanVien,NgayBan,IDSach,TenSachBan,SoLuongBan,GiaBan, SoLuongBan*GiaBan as N'TongTien' from HOADON where TenSachBan like N'%" + timHD.getTenSachBan() + "%'"+"";
        Statement st = cnn.createStatement();
        ResultSet rs = st.executeQuery(query);

        dsHoaDon = new ArrayList<>();
        while (rs.next()) {
             String maHoaDon=rs.getString(1);
                String maNhanVien=rs.getString(2);
                Date ngayBan=rs.getDate(3);
                String maSachBan=rs.getString(4);
                String tenSachBan=rs.getString(5);
                Integer soLuongBan=rs.getInt(6);
                Double giaBan=rs.getDouble(7);
                Double tongTien=rs.getDouble(8);
                dsHoaDon.add(new HoaDon(maHoaDon, maNhanVien, ngayBan, maSachBan, tenSachBan, soLuongBan, giaBan, tongTien));
            }
        st.close();
        cnn.close(); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return dsHoaDon;
    }
    
    //TÌM tháng
    public ArrayList<HoaDon> timTheoThang(int thang) {
        try{
        Connection cnn = DbConnector.getConnection();
        String query = "select IDHoaDon,IDNhanVien,NgayBan,IDSach,TenSachBan,SoLuongBan,GiaBan, SoLuongBan*GiaBan as N'TongTien' from HOADON where month(NgayBan) ="+ thang;
        Statement st = cnn.createStatement();
        ResultSet rs = st.executeQuery(query);

        dsHoaDon = new ArrayList<>();
        while (rs.next()) {
             String maHoaDon=rs.getString(1);
                String maNhanVien=rs.getString(2);
                Date ngayBan=rs.getDate(3);
                String maSachBan=rs.getString(4);
                String tenSachBan=rs.getString(5);
                Integer soLuongBan=rs.getInt(6);
                Double giaBan=rs.getDouble(7);
                Double tongTien=rs.getDouble(8);
                dsHoaDon.add(new HoaDon(maHoaDon, maNhanVien, ngayBan, maSachBan, tenSachBan, soLuongBan, giaBan, tongTien));
            }
        st.close();
        cnn.close(); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return dsHoaDon;
    }
    
    
    
   
    
    
}
