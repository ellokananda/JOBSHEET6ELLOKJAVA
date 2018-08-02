/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6Ellok.java;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DataSiswa {
        public static void main (String [] args) {
//deklarasi variabel
    String nama,alamat;
    int usia ,absen ;
    //membuat scanner baru
    Scanner keyboard = new Scanner(System.in);
    //Tampilkan output ke user
    System.out.println("###DATA SISWA SMK TELKOM MALANG###");
    System.out.print("NAMA SISWA:");
    //Menggunakan scanner dan menyimpan apa yang diketik di variabel nama,
    nama=keyboard.next();
    //Tampilkan output lagi
    System.out.print("ALAMAT:");
    //Menggunakan scanner lagi
    alamat=keyboard.next();
    System.out.print("ABSEN:");
    usia = keyboard.nextInt();
    System.out.print("USIA:");
    absen=keyboard.nextInt();
    //Menampilkan apa yang sudah simpan di variabel
    System.out.println("--------------------");
    System.out.println("NAMA SISWA:"+nama);
    System.out.println("ALAMAT:"+alamat);
    System.out.println("ABSEN:"+absen);
    System.out.println("USIA:"+absen+"tahun");
    
        
    } 
    
}
    
