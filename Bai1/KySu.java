package Bai1;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;

    @Override
    public void nhap() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id KS: ");
        id=scanner.nextLine();
        System.out.println("Nhap ho ten KS: ");
        hoTen=scanner.nextLine();
        System.out.println("Nhap nam sinh KS: ");
        namSinh=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh KS: ");
        gioiTinh=scanner.nextLine();
        System.out.println("Nhap dia chi KS: ");
        diaChi=scanner.nextLine();
        System.out.println("Nhap nganh dao tao cua KS");
        nganhDaoTao=scanner.nextLine();
    }

    @Override
    public void xuat() {
        System.out.printf("%-15s%-15s%-15d%-15s%-15s%-15s\n",id,hoTen,namSinh,gioiTinh,diaChi,nganhDaoTao);
    }
}
