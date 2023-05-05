
package model;

import java.util.Date;


public class HoaDon {
    private String maHoaDon;
    private String maNhanVien;
    private Date ngayBan;
    private String maSachBan;
    private String tenSachBan;
    private Integer soLuongBan;
    private Double giaBan;
    private Double tongTien;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maNhanVien, Date ngayBan, String maSachBan, String tenSachBan, Integer soLuongBan, Double giaBan, Double tongTien) {
        this.maHoaDon = maHoaDon;
        this.maNhanVien = maNhanVien;
        this.ngayBan = ngayBan;
        this.maSachBan = maSachBan;
        this.tenSachBan = tenSachBan;
        this.soLuongBan = soLuongBan;
        this.giaBan = giaBan;
        this.tongTien = tongTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getMaSachBan() {
        return maSachBan;
    }

    public void setMaSachBan(String maSachBan) {
        this.maSachBan = maSachBan;
    }

    public String getTenSachBan() {
        return tenSachBan;
    }

    public void setTenSachBan(String tenSachBan) {
        this.tenSachBan = tenSachBan;
    }

    public Integer getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(Integer soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() 
    {
       
       if(tenSachBan==null)
        {
        return maNhanVien;
        }
        else if(maNhanVien==null){
            return tenSachBan;
        }
        return null;
    }            
    
  
}
