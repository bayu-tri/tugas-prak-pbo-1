/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

// Import Library Scanner
//import java.util.Scanner;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class Main {
    static String nama, nim, usia;
    static float uts, uas;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int closeStatus = 0, menu;
//        
        Mahasiswa Mahasiswa = new Mahasiswa();
        System.out.println("\n");
        do {
            System.out.println("Opsi Menu :\n1. Tampilkan Data\n2. Edit Data\n3. Exit\nPilih : ");
            menu = Mahasiswa.sc.nextInt();
            Mahasiswa.sc.nextLine();
            System.out.println("\n");
            switch(menu)
            {
                case 1 :
                    Mahasiswa.showData();
                    System.out.println("\n");
                    break;
                case 2 :
                    Mahasiswa.inputData();
                    System.out.println("\n");
                    break;
                case 3 :
                    System.exit(0);
                    break;
            }
        } while (closeStatus == 0);        
    }
    
}
