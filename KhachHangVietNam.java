/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labt4_2;

/**
 *
 * @author phankhang
 */
public class KhachHangVietNam extends KhachHang{
    public int dinhMuc;
    public int doiTuongKH;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(int dinhMuc, int doiTuongKH, int MaKH, int SoLuong, double DonGia, double ThanhTien, String NgayHHD, String HoTenKH) {
        super(MaKH, SoLuong, DonGia, ThanhTien, NgayHHD, HoTenKH);
        this.dinhMuc = dinhMuc;
        this.doiTuongKH = doiTuongKH;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public int getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(int doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }
    
    public void nhap(){
        super.nhap();
        System.out.println("Loai khach hang (1. Sinh hoat 2. Kinh doanh 3. San xuat ");
        doiTuongKH= sc.nextInt();
        System.out.println("Dinh muc: ");
        dinhMuc = sc.nextInt();
    }
    
    public double TTien() {
        if(SoLuong <= dinhMuc){
            return this.DonGia*this.SoLuong;
        }else {
            return this.dinhMuc*this.DonGia+(this.SoLuong-this.dinhMuc)*this.DonGia*2.5;
        }
    }

    @Override
    public String toString() {
        String temp;
        if(doiTuongKH == 1){
            temp="Sinh Hoat";
        }else if(doiTuongKH == 2){
            temp="Kinh Doanh";
        }else{
            temp="San Xuat";
        }
        return "KhachHangVietNam{" +super.toString()+ "dinhMuc=" + dinhMuc + ", doiTuongKH=" + temp + '}';
    }
    
    
}
    
    

