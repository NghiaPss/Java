/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SPC.edu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class B1Arraylist {
    public static void main(String[] args) {
        System.out.println("Khai bao mang array list tu 1 den n");
        System.out.println("Nhap n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            ls.add(i);
        }
        for(int j : ls) {
            System.out.println(j);
        }
    }
    
}
