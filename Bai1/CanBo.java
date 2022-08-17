package Bai1;

import java.util.Scanner;

public class CanBo {
    protected String id,hoTen,gioiTinh,diaChi;
    protected int namSinh;

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void nhap()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id: ");
        id=scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen=scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh=scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=scanner.nextLine();
    }
    public void xuat()
    {
        System.out.printf("%-15s%-15s%-15d%-15s%-15s\n",id,hoTen,namSinh,gioiTinh,diaChi);

    }
}
