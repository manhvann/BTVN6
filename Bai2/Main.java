package Bai2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner =new Scanner(System.in);
    public static Xe[] a =new Xe[10000];
    public static int n;
    public static void main(String[] args)
    {
        System.out.println("\t\t\tMenu");
        System.out.println("a.Nhap thong tin va tao danh sach xe.");
        System.out.println("b.Xuat bang ke khai tien thue truoc ba cua cac xe.");
        System.out.println("c.Xuat bang ke khai tien thue truoc ba cua cac xe voi tien thue giam dan");
        System.out.println("d.Xuat bang ke khai tien thue voi  tri gia cua cac xe tang dan.");
        System.out.println("e.Thoat.");
        String lc="";
        while (lc.equals("e")==false)
        {
            System.out.printf("Hay nhap lua chon cua ban: ");
            lc=scanner.nextLine();
            if (lc.equals("a")) NhapThongTin();
            else if(lc.equals("b")) Xuat1();
            else if(lc.equals("c")) Xuat2();
            else if(lc.equals("d")) Xuat3();
        }
    }
    //phan a
    public static void NhapThongTin()
    {
        System.out.print("Nhap so luong xe: ");
        n=scanner.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.println("nhap thong tin xe thu "+(i+1));
            a[i]=new Xe();
            a[i].nhap();
        }
    }
    //phan b
    public static void Xuat1()
    {
        System.out.println("Bang ke khai tien thue truoc ba cua cac xe");
        System.out.printf("%-15s%-10s%-10s%-15s%-15s\n","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
        for (int i=0;i<n;i++)
        {
            a[i].xuat();
        }
    }
    //phan c
    public static void Xuat2()
    {
        Xe tg;
        for(int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (a[i].getThue()<a[j].getThue())
                {
                    tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
        System.out.println("Bang ke khai tien thue truoc ba cua cac xe voi tien thue giam dan");
        System.out.printf("%-15s%-10s%-10s%-15s%-15s\n","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
        for (int i=0;i<n;i++)
        {
            a[i].xuat();
        }
    }
    //phan d
    public static void Xuat3()
    {
        Xe tg;
        for(int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (a[i].getTriGia()>a[j].getTriGia())
                {
                    tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
        System.out.println("Bang ke khai tien thue truoc ba cua cac xe voi tri gia tang dan");
        System.out.printf("%-15s%-10s%-10s%-15s%-15s\n","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
        for (int i=0;i<n;i++)
        {
            a[i].xuat();
        }

    }
}
