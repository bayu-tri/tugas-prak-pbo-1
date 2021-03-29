/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
import java.util.Scanner;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class Mahasiswa {
    // Variabel to save the data
    static String nama, nim, usia;
    static float uts, uas;
    static Scanner sc = new Scanner(System.in);
    
    // Constuctor to store the data
    public Mahasiswa()
    {
        inputData();
    }
    
    public void inputData()
    {
        System.out.println("== Input Data ==");
        System.out.println("Nama    : "); 
        Mahasiswa.nama = sc.nextLine();
        System.out.println("NIM    : "); 
        Mahasiswa.nim = sc.nextLine();
        System.out.println("Usia    : "); 
        Mahasiswa.usia = sc.nextLine();
        System.out.println("UTS    : "); 
        Mahasiswa.uts = sc.nextFloat();
        System.out.println("UAS    : "); 
        Mahasiswa.uas = sc.nextFloat();
        
    }
    
    public void showData()
    {
        String response = "Perkenalkan Nama Saya "+Mahasiswa.nama+", NIM "+Mahasiswa.nim+",\nUsia        : "+Mahasiswa.usia+"\nNilai Akhir : "+countAverageNilai(Mahasiswa.uts, Mahasiswa.uas);
        System.out.println(response);
    }
    
    private float countAverageNilai(float A, float B)
    {
        return (A+B)/2;
    }
}
