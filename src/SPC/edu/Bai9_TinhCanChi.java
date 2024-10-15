/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SPC.edu;
import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class Bai9_TinhCanChi {
    public static void main(String[]args){
       String[] arrCan = {"Canh", "Tan", "Nham", "Quy", "Giap", "At", "Binh", "Dinh", "Mau", "Ky"};
       String[] arrChi = {"Than", "Dau", "Tuat", "Hoi", "Ty", "Suu", "Dan", "Mao", "Thin", "Ty", "Ngo", "Mui"};
        System.out.println("Nhap nam bat dau");
        var sc = new Scanner (System.in);
        var namBD = sc.nextInt();
        System.out.println("Nhap nam ket thuc");
        var namKT = sc.nextInt();
       
        var ketQua = "";
        for(int i = namBD; i <= namKT; i++) {
            ketQua = arrCan[i % 10];
            ketQua += arrChi[i % 12];
            System.out.println(ketQua);
        }
    }
    
}
