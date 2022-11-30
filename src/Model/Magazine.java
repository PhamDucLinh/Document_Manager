package Model;

import java.util.List;

public class Magazine extends Document {

    public Magazine(int maTaiLieu, String ten, int soBan) {
        super(maTaiLieu, ten, soBan);
    }

    public Magazine() {

    }

    @Override
    public void Input(List<Document> documentList) {
        System.out.println("Ten nha xuat ban: ");
        super.setTen(scanner.next());
        super.setMaTaiLieu((documentList.size()>0)?(documentList.size()+1):1);
        System.out.println("Ten so ban: ");
        super.setSoBan(scanner.nextInt());
        System.out.println("Nhap so phart hanh: ");
        setSoPhatHanh(scanner.next());
        System.out.println("Nhap thang phat hanh: ");
        setThangPhatHanh(scanner.next());
    }


    public String toString(){

        return super.toString()+ " So Phat Hanh: "+this.SoPhatHanh+" Thang Phat hanh: "+this.ThangPhatHanh;
    }

    private String SoPhatHanh;
    private String ThangPhatHanh;

    public Magazine(int maTaiLieu, String ten, int soBan, String soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, ten, soBan);
        SoPhatHanh = soPhatHanh;
        ThangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return SoPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        SoPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return ThangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        ThangPhatHanh = thangPhatHanh;
    }
}
