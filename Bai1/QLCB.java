package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    public static ArrayList<NhanVien> ListNhanVien = new ArrayList<>();
    public static ArrayList<CongNhan> ListCongNhan = new ArrayList<>();
    public static ArrayList<KySu> ListKySu = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(ListNhanVien.size());
        System.out.println("\t\t\tMenu");
        System.out.println("1: Add 1 can bo vao List tuong ung");
        System.out.println("2: Hien thi danh sach cac can bo");
        System.out.println("3: Xoa 1 can bo theo id");
        System.out.println("4: Tim kiem 1 can bo theo id");
        System.out.println("5: Dung chuong trinh");
        int lc = 0;
        while (lc != 5) {
            System.out.print("Nhap lua chon cua ban: ");
            lc = scanner.nextInt();
            if (lc == 1) AddCanBo();
            else if (lc == 2) HienThi();
            else if (lc == 3) Xoa();
            else if (lc == 4) TimKiem();
        }
    }

    public static boolean check1(String str) {
        for (int i = 0; i <= ListNhanVien.size(); i++) {
            if (ListNhanVien.contains(str)) return true;

        }
        return false;
    }

    public static boolean check2(String str) {
        for (int i = 0; i <= ListCongNhan.size(); i++) {
            if (ListCongNhan.contains(str)) return true;

        }
        return false;
    }

    public static boolean check3(String str) {
        for (int i = 0; i <= ListKySu.size(); i++) {
            if (ListKySu.contains(str)) return true;

        }
        return false;
    }

    public static void AddCanBo() {
        int lcc = 0;
        System.out.println("1.Nhan vien\n2.Cong nhan\n3.Ky su\n");
        System.out.println("Nhap chuc vu can bo ban muon add: ");
        lcc = scanner.nextInt();
        if (lcc == 1) {
            NhanVien x = new NhanVien();
            x.nhap();
            if (check1(x.getId()) == false) ListNhanVien.add(x);
        } else if (lcc == 2) {
            CongNhan y = new CongNhan();
            y.nhap();
            if (check2(y.getId()) == false) ListCongNhan.add(y);
        } else if (lcc == 3) {
            KySu z = new KySu();
            z.nhap();
            if (check3(z.getId()) == false) ListKySu.add(z);
        }
    }

    public static void HienThi() {
        System.out.println("Danh sach can bo nhan vien: ");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cong viec");
        for (int i = 0; i <= ListNhanVien.size(); i++) {
            ListNhanVien.get(i).xuat();
        }
        System.out.println("Danh sach can bo Cong nhan: ");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Bac");
        for (int i = 0; i <= ListCongNhan.size(); i++) {
            ListCongNhan.get(i).xuat();
        }
        System.out.println("Danh sach can bo Ky su: ");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Nganh dao tao");
        for (int i = 0; i <= ListKySu.size(); i++) {
            ListKySu.get(i).xuat();
        }
    }

    public static void Xoa() {
        String idXoa;
        System.out.println("Nhap id can bo can xoa: ");
        idXoa = scanner.nextLine();
        for (int i = 0; i <= ListNhanVien.size(); i++) {
            if (ListNhanVien.get(i).getId().equals(idXoa)) {
                ListNhanVien.remove(i);
                i--;
            }
        }
        for (int i = 0; i <= ListCongNhan.size(); i++) {
            if (ListCongNhan.get(i).getId().equals(idXoa)) {
                ListCongNhan.remove(i);
                i--;
            }
        }
        for (int i = 0; i <= ListKySu.size(); i++) {
            if (ListKySu.get(i).getId().equals(idXoa)) {
                ListKySu.remove(i);
                i--;
            }
        }
    }

    public static void TimKiem() {
        String idTimKiem;
        System.out.println("Nhap iid can tim kiem: ");
        idTimKiem = scanner.nextLine();
        for (int i = 0; i <= ListNhanVien.size(); i++) {
            if (ListNhanVien.get(i).getId().equals(idTimKiem)) {
                ListNhanVien.get(i).xuat();

            }
        }
        for (int i = 0; i <= ListCongNhan.size(); i++) {
            if (ListCongNhan.get(i).getId().equals(idTimKiem)) {
                ListCongNhan.get(i).xuat();
            }
        }
        for (int i = 0; i <= ListKySu.size(); i++) {
            if (ListKySu.get(i).getId().equals(idTimKiem)) {
                ListKySu.get(i).xuat();
            }
        }

    }

}
