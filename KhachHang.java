/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labt4_2;

import java.util.Scanner;

/**
 *
 * @author phankhang
 */
public class KhachHang {
    protected int MaKH, SoLuong;
    protected double DonGia, ThanhTien;
    protected String NgayHHD,HoTenKH;
    Scanner sc = new Scanner(System.in);
    
    public KhachHang(){
    }

    public KhachHang(int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHHD, String HoTenKH) {
        this.MaKH = MaKH;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
        this.NgayHHD = NgayHHD;
        this.HoTenKH = HoTenKH;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getNgayHHD() {
        return NgayHHD;
    }

    public void setNgayHHD(String NgayHHD) {
        this.NgayHHD = NgayHHD;
    }

    public String getHoTenKH() {
        return HoTenKH;
    }

    public void setHoTenKH(String HoTenKH) {
        this.HoTenKH = HoTenKH;
    }
    
    public void nhap(){
        System.out.println("Nhap ma khach hang: ");
       MaKH = sc.nextInt();
       System.out.println("Nhap ho ten khach hang: ");
       HoTenKH = sc.nextLine();
       System.out.println("Nhap ngay ra hoa don: ");
       NgayHHD = sc.nextLine();
       System.out.println("So luong KW: ");
       SoLuong = sc.nextInt();
       System.out.println("Don gia; ");
       DonGia = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "MaKH=" + MaKH + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", ThanhTien=" + ThanhTien + ", NgayHHD=" + NgayHHD + ", HoTenKH=" + HoTenKH;
    }
    
}