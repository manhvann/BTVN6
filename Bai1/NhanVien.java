package Bai1;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;

    public String getCongViec() {
        return congViec;
    }

    @Override
    public void nhap() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id NV: ");
        id=scanner.nextLine();
        System.out.println("Nhap ho ten NV: ");
        hoTen=scanner.nextLine();
        System.out.println("Nhap nam sinh NV: ");
        namSinh=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh NV: ");
        gioiTinh=scanner.nextLine();
        System.out.println("Nhap dia chi NV: ");
        diaChi=scanner.nextLine();
        System.out.println("Nhap cong viec cua NV: ");
        congViec=scanner.nextLine();
    }

    @Override
    public void xuat() {
        System.out.printf("%-15s%-15s%-15d%-15s%-15s%-15s\n",id,hoTen,namSinh,gioiTinh,diaChi,congViec);
    }
}
