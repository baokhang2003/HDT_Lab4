/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labt4_2;

/**
 *
 * @author phankhang
 */
public class KhachHangNuocNgoai extends KhachHang{
    public String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String quocTich, int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHHD, String HoTenKH) {
        super(MaKH, SoLuong, DonGia, ThanhTien, NgayHHD, HoTenKH);
        this.quocTich = quocTich;
    }

    

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
    public void Nhap(){
        super.nhap();
        System.out.println("Nhap quoc tich: ");
        quocTich = sc.nextLine();
    }
    
    public double TTien(){
        return this.SoLuong*this.DonGia;
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" +super.toString() + "quocTich=" + quocTich + '}';
    }
    
    
}
