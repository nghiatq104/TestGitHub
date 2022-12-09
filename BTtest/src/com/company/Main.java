package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 chuoi:");
        String chuoi = sc.nextLine();
        System.out.println("Nhap 1 ky tu:");
        char a = sc.nextLine().charAt(0);
        char[] KT = chuoi.toCharArray();
        int dem = 0;
        for(int i=0;i<KT.length;i++){
            if(a == KT[i]){
                dem ++;
            }
        }
        if(dem == 0){
            System.out.println("Khong co "+a+ " trong "+chuoi);
        }else {
            System.out.println("Co "+dem+" lan "+a+" trong "+chuoi);
        }
    }
}
