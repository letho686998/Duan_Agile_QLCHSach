/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import model.HoaDon;
import Repository.HoaDonRepository;


/**
 *
 * @author admin
 */
public class HoaDonService {
    private HoaDonRepository hoaDonRepository = new HoaDonRepository();
    
    //chức năng xem
    public ArrayList<HoaDon> xemDanhSach(){
        return hoaDonRepository.layHoaDon();
    }
    
    //xem Mã NV
    public ArrayList<HoaDon> xemMaNV(){
        return hoaDonRepository.layMaNV();
    }
    //xem tên sách
     public ArrayList<HoaDon> xemSach(){
         return hoaDonRepository.laySach();
    }
    //tính tổng DOANH THU
    public Double tongTienTheoThang (int thangCanTinh){
       return hoaDonRepository.TongDoanhThuThang(thangCanTinh);
    }
    
    //thêm
    public Integer themHoaDonMoi(HoaDon hoaDonCanThem){
        return hoaDonRepository.themDanhSach(hoaDonCanThem);
    }
    
    //tìm tên
    public ArrayList<HoaDon> timSach(HoaDon sachCanTim) {
        return hoaDonRepository.timTheoTen(sachCanTim);
    }
    
    //tìm tháng
    public ArrayList<HoaDon> timThang(int thangCanTim) {
        return hoaDonRepository.timTheoThang(thangCanTim);
    }
}


