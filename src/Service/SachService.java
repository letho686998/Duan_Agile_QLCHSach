    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Service;

    import java.util.ArrayList;
    import model.Sach;
    import Repository.SachRepository;
    import java.util.List;

    /**
     *
     * @author THE ANH
     */
    public class SachService {
        private SachRepository sachrepository = new SachRepository();

        public ArrayList<Sach> layDanhSachQuyenSach() throws Exception {
            return this.sachrepository.laydanhsachquyensach();
    }
          public ArrayList<Sach> layQuyenSachCanTim() throws Exception {
        return this.sachrepository.layQuyenSachCanTim();
    }
        public void ThemSach(Sach quyensach){
            sachrepository.themSach(quyensach);
        }
        public void ThemQuyenSachMoi(Sach themSach)throws Exception{
            sachrepository.themQuyenSach(themSach);
        }
        public Integer xoaQuyenSachCu(String delete) throws Exception {
         return sachrepository.xoaSachCu(delete);
    }
        public void timSach(String id1) throws Exception{
       sachrepository.timQuyenSach(id1);
    }
          public void SuaQuyenSach(Sach sach1, String id) throws Exception{
       sachrepository.suaQuyenSach(sach1,id);
    }

   public void nhapThemSach(Sach sach2, String  id) throws Exception {
        sachrepository.NhapQuyenSach(sach2, id);
    }
    }
