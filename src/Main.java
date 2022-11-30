import Model.*;
import Util.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i ;
        String choose = null;
        int x;
        String id;

        List<Document> documentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Manager mn = new Manager(documentList);
        do {
            Menu.Menu();
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Them sach : 1");
                    System.out.println("Them bao : 2");
                    System.out.println("Them tap chi : 3");
                    int it = scanner.nextInt();
                    mn.add(it);
                    break;
                case 2:
                    System.out.println("Nhap id de xoa: ");
                    x = scanner.nextInt();
                    mn.deleteDocument(x);
                    break;
                case 3:
                    mn.showAllDocument();
                    break;
                case 4:
                    System.out.println("nhap loai danh muc muon tim: ");
                    id = scanner.next();
                    mn.searchDocument(id);
                    break;
            }

        }
        while (i != 5);



    }
}