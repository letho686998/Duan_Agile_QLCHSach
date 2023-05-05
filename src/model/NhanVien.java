/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class NhanVien {

    private String maNv;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String soDt;
    private String email;
    private String diaChi;
    private String chucVu;
    private Integer soNamLamViec;

    public NhanVien() {
    }

    public NhanVien(String maNv, String hoTen, String gioiTinh, Date ngaySinh, String soDt, String email, String diaChi, String chucVu, Integer soNamLamViec) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDt = soDt;
        this.email = email;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.soNamLamViec = soNamLamViec;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public Integer getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(Integer soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public float luong(Integer soNamLamViec ) {
        float luongCs =1390000;
        float luong;
        if (soNamLamViec <= 0) {
           luong = (float) (2.34 * luongCs);
        } else if (soNamLamViec <= 5) {
            luong = (float) (2.34 + 0.6 * soNamLamViec)*luongCs;
        } else if (soNamLamViec <= 10) {
            luong = (float) (2.34 + 0.6 * 5 + 0.9 * (soNamLamViec - 5))*luongCs;
        } else {
            luong = (float) (2.34 + 0.6 * 5 + 0.9 * 5 + 1 * (soNamLamViec - 10))*luongCs;
        }
        return luong;

    }
}
