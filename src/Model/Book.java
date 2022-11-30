package Model;

import java.util.List;
import java.util.Scanner;

public class Book extends Document {
    private String TenTacGia;
    private int SoTrang;

    public Book(int maTaiLieu, String ten, int soBan) {
        super(maTaiLieu, ten, soBan);
    }

    public Book() {
        super();
    }



    @Override
    public void Input(List<Document> documentList) {
        System.out.println("Ten nha xuat ban: ");
        super.setTen(scanner.next());
        super.setMaTaiLieu((documentList.size() > 0) ? (documentList.size() + 1) : 1);
        System.out.println("Ten so ban: ");
        super.setSoBan(scanner.nextInt());
        System.out.println("Nhap ten tac gia: ");
        setTenTacGia(scanner.next());
        System.out.println("Nhap so trang: ");
        setSoTrang(scanner.nextInt());
    }

    public String toString() {
        return "Ten tac gia: " + this.TenTacGia + " So Trang: " + this.SoTrang + super.toString();

    }


    Scanner scanner = new Scanner(System.in);


    public Book(int maTaiLieu, String ten, int soBan, String tenTacGia, int soTrang) {
        super(maTaiLieu, ten, soBan);
        TenTacGia = tenTacGia;
        SoTrang = soTrang;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        TenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }


}
