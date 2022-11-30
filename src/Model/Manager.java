package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    Scanner scanner = new Scanner(System.in);
    private List<Document> documentList = new ArrayList<>();

    public void add(int i) {

        switch (i) {
            case 1:
                Book bk = new Book();
                bk.Input(documentList);
                documentList.add(bk);
                break;
            case 2:
                News news = new News();
                news.Input(documentList);
                documentList.add(news);
                break;
            case 3:
                Magazine mg = new Magazine();
                mg.Input(documentList);
                documentList.add(mg);
                break;
        }
    }

    public void showAllDocument() {
        for (Document document : documentList)
            //kiem tra doi tuowng tuong them vao cos phai book hay k
            if (document instanceof Book) {       // neu doi tuong = book ep kieu su dung upcasting ep document sang book
                Book bk = (Book) document;

                System.out.println(bk.toString());
            } else if (document instanceof News) {
                News news = (News) document;
                System.out.println(news.toString());
            } else {
                Magazine magazine = (Magazine) document;
                System.out.println(magazine.toString());
            }
    }

    public void deleteDocument(int id) {
        for (int i = 0; i < documentList.size(); i++) {
            if (id == documentList.get(i).getMaTaiLieu()) {
                documentList.remove(i);
                System.out.println("Delete succsess");
            }
        }
    }

    public void searchDocument(String id) {

            if (id.equals("book") ) {
                for (Document document : documentList){
                    Book bk = (Book) document;

                    System.out.println(bk.toString());
                }

            } else if (id.equals("news") ) {
                for (Document document : documentList){
                    News news = (News) document;

                    System.out.println(news.toString());
                }
            } else {
                for (Document document : documentList){
                    Magazine magazine = (Magazine) document;
                    System.out.println(magazine.toString());
                }
            }
    }


    public Manager(List<Document> documentList) {
        this.documentList = documentList;
    }
}
