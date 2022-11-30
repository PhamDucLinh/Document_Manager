package Model;

import java.util.List;

public class News extends Document {
    public News(int maTaiLieu, String ten, int soBan) {
        super(maTaiLieu, ten, soBan);
    }

    public News() {

    }

    @Override
    public void Input(List<Document> documentList) {
        System.out.println("Ten nha xuat ban: ");
        super.setTen(scanner.next());
        super.setMaTaiLieu((documentList.size()>0)?(documentList.size()+1):1);
        System.out.println("Ten so ban: ");
        super.setSoBan(scanner.nextInt());
        System.out.println("Nhap ngay phat hanh: ");
        setNgayPhatHanh(scanner.next());
    }

   public String toString(){

        return " Ngay phat hanh"+this.NgayPhatHanh+super.toString();
   }

    private String NgayPhatHanh;

    public News(int maTaiLieu, String ten, int soBan, String ngayPhatHanh) {
        super(maTaiLieu, ten, soBan);
        NgayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        NgayPhatHanh = ngayPhatHanh;
    }
}
