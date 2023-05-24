/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labt4_2;

/**
 *
 * @author phankhang
 */
public class KhachHangList {
    public KhachHang kh[] = new KhachHang[100];
    public int CountKH, sum1=0, sum2=0, dem=0, sumtien=0;
    
    public KhachHangList(){
        CountKH=0;
        for(int i=0; i<100; i++){
            kh[i] = new KhachHang();
        }
    }
    public void ThemKH(int temp){
        if(CountKH>100){
            System.out.println("Khong duoc vuot qua 100");
        }else {
            if(temp == 1){
                kh[CountKH] = new KhachHangVietNam();
                KhachHangVietNam khvn = new KhachHangVietNam();
                khvn.nhap();
                khvn.ThanhTien = khvn.TTien();
                kh[CountKH]=khvn;
                sum1+=khvn.SoLuong;
            }else {
                kh[CountKH]= new KhachHangNuocNgoai();
                KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
                khnn.nhap();
                khnn.ThanhTien = khnn.TTien();
                kh[CountKH] = khnn;
                sum2+= khnn.SoLuong;
                sumtien += khnn.ThanhTien;
            }
            dem++;
            CountKH++;
        }
    }
    public void HienThi(){
        for(int i = 0; i < CountKH; i++) {
            System.out.println("So TT" + (i+1));
            System.out.println(kh[i].toString());
        }
    }
    
    public void TongSL(){
        System.out.println("Tong so luong KW dien cua khach hang VietNam" +sum1);
        System.out.println("Tong so luong KW dien cua khach hang nuoc ngoai" +sum2);
    }
    
    public void TrungBinh(){
        System.out.println("Trung binh thanh tien cua khach hang nuoc ngoai: "+(sumtien/dem));
    }
    
    public void checkDate(){
        String Date ="5/2023", Date1;
        for(int i = 0; i < CountKH; i++) {
            Date1 = kh[i].getNgayHHD();
            String[] date1=Date.split("/");
            String[] date2=Date.split("/");
            int month1 = Integer.parseInt(date1[0]);
            int year1 = Integer.parseInt(date1[1]);
            int month2 = Integer.parseInt(date2[0]);
            int year2 = Integer.parseInt(date2[1]);
            if(month1==month2&&year1==year2){
                System.out.println(kh[i].toString());
            }
        }
    }
}