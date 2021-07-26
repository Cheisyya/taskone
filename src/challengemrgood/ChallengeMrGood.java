/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengemrgood;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class ChallengeMrGood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int harga1, harga2=0;
            int jumlah1, jumlah2=0;
            boolean run = true;
            String pilih;
            
            while (run) {
                System.out.println ("===========TOKO BUNGA BU AYA===========");
                
                Scanner input1 = new Scanner (System.in);
                System.out.print ("Harga bunga :");
                harga1 = input1.nextInt ();
                
                Scanner input2 = new Scanner (System.in);
                System.out.print ("Jumlah yang dibeli :");
                jumlah1 = input2.nextInt ();
                
                Scanner input3 = new Scanner (System.in);
                System.out.print ("Adakah bunga lain yang ingin dibeli? [ya/tidak] : ");
                pilih = input3.next ();
                
                if (pilih.equalsIgnoreCase ("ya")){
                    run = true;
                    Scanner input4 = new Scanner (System.in);
                    System.out.print ("Harga bunga yang dibeli:");
                    harga2 = input4.nextInt ();
                    
                    Scanner input5 = new Scanner (System.in)    ;
                    System.out.print ("Jumlah bunga yang dibeli:");
                    jumlah2 = input5.nextInt ();
                    
                    int hargaTotal = harga1+harga2;
                    int jumlahTotal = jumlah1+jumlah2;
                    int totalHarga = hargaTotal*jumlahTotal;
                    int uangBayar = hargaTotal*35/100;
                    
                    if (totalHarga>=50000) {
                        int diskon = totalHarga*35/100;
                        System.out.println ("Anda mendapatkan diskon sebesar 35%, harga pembelian dipotong menjadi" + "membayar sebesar" + totalHarga);
                        System.out.println ("--------------------STRUK PEMBELIAN--------------------");
                        System.out.println ("Harga pembelian : "+hargaTotal);       
                        System.out.println ("Jumlah barang:"+jumlahTotal);  
                        System.err.println ("Total Harga "+totalHarga);
                        System.out.println ("-------------------------------------------------------");       
                        System.out.println ("Potongan Harga : 35%");       
                        System.out.println ("Jumlah uang yang harus dibayar : "+diskon);       
                        Scanner input6 = new Scanner (System.in);
                        System.out.println ("Uang yang diberikan : ");    
                        int uang = input6.nextInt();
                        int kembali = uang-diskon; 
                        System.out.println ("Kembalian : "+kembali);
                        System.out.println ("=======================================================");
                        System.out.println ("Terimakasih telah berbelanja di Toko Bu Aya ");
                        System.out.println ("=======================================================");
                    }
                     if (totalHarga<50000) {
                        System.out.println ("--------------------STRUK PEMBELIAN--------------------");
                        System.out.println ("Harga pembelian : "+hargaTotal);       
                        System.out.println ("Jumlah barang:"+jumlahTotal);  
                        System.err.println ("Total Harga"+totalHarga);
                        System.out.println ("Maaf tidak mendapatkan diskon");
                        System.out.println ("-------------------------------------------------------");             
                        System.out.println ("Jumlah uang yang harus dibayar : "+totalHarga);       
                        Scanner input6 = new Scanner (System.in);
                        System.out.println ("Uang yang diberikan : ");    
                        int uang = input6.nextInt();
                        int kembali = uang-totalHarga; 
                        System.out.println ("Kembalian : "+kembali);
                        System.out.println ("=======================================================");
                        System.out.println ("Terimakasih telah berbelanja di Toko Bu Aya");
                        System.out.println ("=======================================================");
                    }           
                        
                        
                                       
                }
                if (pilih.equalsIgnoreCase ("tidak")){
                    run = false ;
                    int hargaTotal = harga1+harga2;
                    int jumlahTotal = jumlah1+jumlah2;
                    int totalHarga = hargaTotal*jumlahTotal;
                    if (totalHarga>=50000) {
                        int diskon = totalHarga*35/100;
                        System.out.println ("Anda mendapatkan diskon sebesar 35%, harga pembelian dipotong menjadi" + "membayar sebesar" + totalHarga);
                        System.out.println ("--------------------STRUK PEMBELIAN--------------------");
                        System.out.println ("Harga pembelian : "+hargaTotal);       
                        System.out.println ("Jumlah barang:"+jumlahTotal);  
                        System.err.println ("Total Harga"+totalHarga);
                        System.out.println ("-------------------------------------------------------");       
                        System.out.println ("Potongan Harga : 35%");       
                        System.out.println ("Jumlah uang yang harus dibayar : "+diskon);       
                        Scanner input6 = new Scanner (System.in);
                        System.out.println ("Uang yang diberikan : ");    
                        int uang = input6.nextInt();
                        int kembali = uang-diskon; 
                        System.out.println ("Kembalian : "+kembali);
                        System.out.println ("=======================================================");
                        System.out.println ("Terimakasih telah berbelanja di Toko Bu Aya");
                        System.out.println ("=======================================================");
                    }
                    if (totalHarga<50000) {
                        System.out.println ("--------------------STRUK PEMBELIAN--------------------");
                        System.out.println ("Harga pembelian : "+hargaTotal);       
                        System.out.println ("Jumlah barang:"+jumlahTotal);  
                        System.err.println ("Total Harga"+totalHarga);
                         System.out.println ("Maaf tidak mendapatkan diskon");
                        System.out.println ("-------------------------------------------------------");             
                        System.out.println ("Jumlah uang yang harus dibayar : "+totalHarga);       
                        Scanner input6 = new Scanner (System.in);
                        System.out.println ("Uang yang diberikan : ");    
                        int uang = input6.nextInt();
                        int kembali = uang-totalHarga; 
                        System.out.println ("Kembalian : "+kembali);
                        System.out.println ("=======================================================");
                        System.out.println ("Terimakasih telah berbelanja di Toko Bu Aya");
                        System.out.println ("=======================================================");
                    }            
                }
            }
            
    }
    
    }



    
    
    
    
    
    
 

    

