
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] dizi=new int[6]; //dizi tanımlama
        dizi[0]=100; //dizi elemanına değer atama
        dizi[2]=90;
        dizi[3]=80;
        dizi[4]=70;
        dizi[5]=60;

        System.out.println(dizi[2]); //dizi elemanı çağırma



    }
}



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int[] dizi=new int[10];
        dizi[0]=100; //dizi elemanına değer atama
        dizi[2]=90;
        dizi[3]=80;
        dizi[4]=70;
        dizi[5]=60;
        dizi[6]=90;
        dizi[7]=80;
        dizi[8]=70;
        dizi[9]=60;

        System.out.println("Hangi elemanın notunu görmek istiyorsun.");
        int a = giris.nextInt();
        System.out.println(dizi[a]);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int[] dizi=new int[10];
        dizi[0]=100; //dizi elemanına değer atama
        dizi[2]=90;
        dizi[3]=80;
        dizi[4]=70;
        dizi[5]=60;
        dizi[6]=90;
        dizi[7]=80;
        dizi[8]=70;
        dizi[9]=60;

        System.out.println("Hangi elemanın notunu görmek istiyorsun.");
        int a = giris.nextInt();

        for(i=0; i<10;i++){
            System.out.println(i);
        }



    }
}


  int[] dizi=new int[]{100,90,80,70,75,60,65,30,10,15,0}; //bu şekilde de yazabiliriz diziyi

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        for(k=0; k<10;k++){
            System.out.println("Bir sayı girin: ");
            dizi[k]= giris.nextInt();
        }

        for(i=0; i<10;i++){
            System.out.println(dizi[i]);
        }



    }
}





import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        for(k=0; k<10;k++)
        {
            System.out.println("Bir sayı girin: ");
            dizi[k]= giris.nextInt();
        }

        for(i=0; i<10;i++)
        {
            toplam=toplam+dizi[i];
        }

        System.out.println("Toplam: "+ toplam);
        System.out.println("Ortalama: "+ toplam/10);


    }
}

