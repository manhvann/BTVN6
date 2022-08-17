package Bai2;

import java.util.Scanner;

public class Xe {
    private String tenChuXe,loaiXe;
    private double dungTich,thue,triGia;

    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public double getDungTich() {
        return dungTich;
    }

    public double getThue() {
        return thue;
    }

    public double getTriGia() {
        return triGia;
    }

    public void nhap()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten chu xe: ");
        tenChuXe=scanner.nextLine();
        System.out.println("Nhap loai xe: ");
        loaiXe=scanner.nextLine();
        System.out.println("Nhap dung tich xe: ");
        dungTich=scanner.nextDouble();
        System.out.println("Nhap gia tri xe: ");
        triGia=scanner.nextDouble();
        if(dungTich<100) thue=2.0/100* triGia;
        else if(dungTich>200) thue=10.0/100*triGia;
        else thue=triGia*(6.0/100);

    }
    public void xuat()
    {
        System.out.printf("%-15s%-10s%-10.0f%-15.2f%-15.2f\n",tenChuXe,loaiXe,dungTich,triGia,thue);
    }
}
