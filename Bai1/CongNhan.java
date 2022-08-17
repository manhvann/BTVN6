package Bai1;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac;

    @Override
    public void nhap() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id CN: ");
        id=scanner.nextLine();
        System.out.println("Nhap ho ten CN: ");
        hoTen=scanner.nextLine();
        System.out.println("Nhap nam sinh CN: ");
        namSinh=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh CN: ");
        gioiTinh=scanner.nextLine();
        System.out.println("Nhap dia chi CN: ");
        diaChi=scanner.nextLine();
        System.out.println("Nhap bac CN: ");
        bac=scanner.nextLine();
    }

    @Override
    public void xuat() {
        System.out.printf("%-15s%-15s%-15d%-15s%-15s%-15s\n",id,hoTen,namSinh,gioiTinh,diaChi,bac);
    }
}
