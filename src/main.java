import java.util.Scanner;

public class main {

    public static void main(String[] args){

        int yas,mesafe,yolculukTipi;
        double tutar,tutarIndirimi,yasIndirimi,tipIndirimi,kmFiyat,toplamFiyat;

        Scanner inp=new Scanner(System.in);

        System.out.println("Yasiniz giriniz: ");
        yas=inp.nextInt();

        System.out.println("Mesafeyi giriniz: ");
        mesafe=inp.nextInt();

        System.out.println("Yolculuk tipini giriniz: ");
        yolculukTipi=inp.nextInt();

        if(yas<0||mesafe<0 || yolculukTipi<1||yolculukTipi>2){
            System.out.println("Hatali Giris");
        }
        else{

        if(yas<=12) {
            if (yolculukTipi==1){
                kmFiyat=mesafe*0.10;
                yasIndirimi=kmFiyat*0.5;
                toplamFiyat=kmFiyat-yasIndirimi;
                System.out.println("Toplam Fiyat Tutari: "+toplamFiyat+"TL");

            }else if(yolculukTipi==2){
          kmFiyat=mesafe*0.10;
                yasIndirimi=kmFiyat*0.5;
                tutarIndirimi=kmFiyat-yasIndirimi;
                tipIndirimi=tutarIndirimi*0.20;
                toplamFiyat=tutarIndirimi-tipIndirimi;
                System.out.println("Toplam Fiyat Tutari: "+toplamFiyat+"TL");
            }
        }else if (yas>12&&yas<=24) {
            if (yolculukTipi == 1) {
                kmFiyat=mesafe*0.10;
                yasIndirimi=kmFiyat*0.1;
                toplamFiyat=kmFiyat-yasIndirimi;
                System.out.println("Toplam Fiyat Tutari: "+toplamFiyat+"TL");

            } else if (yolculukTipi == 2) {
                kmFiyat=mesafe*0.10;
                yasIndirimi=kmFiyat*0.1;
                tutarIndirimi=kmFiyat-yasIndirimi;
                tipIndirimi=tutarIndirimi*0.20;
                toplamFiyat=tutarIndirimi-tipIndirimi;
                System.out.println("Toplam Fiyat Tutari: "+toplamFiyat+"TL");
            }
        }
        else if (yas>=65) {
            if (yolculukTipi == 1) {
                kmFiyat=mesafe*0.10;
                yasIndirimi=kmFiyat*0.3;
                toplamFiyat=kmFiyat-yasIndirimi;
                System.out.println("Toplam Fiyat Tutari: "+toplamFiyat+"TL");

            } else if (yolculukTipi == 2) {
                kmFiyat=mesafe*0.10;
                yasIndirimi=kmFiyat*0.3;
                tutarIndirimi=kmFiyat-yasIndirimi;
                tipIndirimi=tutarIndirimi*0.20;
                toplamFiyat=tutarIndirimi-tipIndirimi;
                System.out.println("Toplam Fiyat Tutari: "+toplamFiyat+"TL");
            }
        }

        }


    }
}
