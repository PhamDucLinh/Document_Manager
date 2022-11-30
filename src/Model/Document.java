package Model;

import java.util.List;
import java.util.Scanner;

public abstract class Document {
    private int MaTaiLieu;
    private String Ten;
    private int SoBan;

    Scanner scanner = new Scanner(System.in);

    public Document(int maTaiLieu, String ten, int soBan) {
        MaTaiLieu = maTaiLieu;
        Ten = ten;
        SoBan = soBan;
    }

    public Document() {
    }

    public int getMaTaiLieu() {
        return MaTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        MaTaiLieu = maTaiLieu;
    }

    public String getTen(String Ten) {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getSoBan() {
        return SoBan;
    }

    public void setSoBan(int soBan) {
        SoBan = soBan;
    }

    public abstract void Input(List<Document> documentList);



    public String toString(){
        return "MaTaiLieu: "+ this.MaTaiLieu + " Ten tai lieu: "+this.Ten+ " So Ban: "+ this.SoBan;
    }



}
