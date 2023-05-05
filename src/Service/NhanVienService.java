/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.NhanVienRepository;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author LENOVO
 */
public class NhanVienService {
    private NhanVienRepository repository= new NhanVienRepository();
    public ArrayList<NhanVien> xemDanhSach(){
        return repository.getAll();
    }
    public Integer themNhanVien(NhanVien nhanVien){
        return repository.addNhanVien(nhanVien);
    }
    
     public Integer suaNhanVien(NhanVien nhanVien){
        return repository.updateNhanVien(nhanVien);
    }
     public ArrayList<NhanVien> timNv(NhanVien timnv) throws Exception{
        return repository.timNhanVien(timnv);
    }
     public Integer xoaNhanVien(String nhanVien){
        return repository.deleteNhanVien(nhanVien);
    }
    
}
