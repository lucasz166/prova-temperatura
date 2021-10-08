
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scannerTemperatura = new Scanner(System.in);
        int num, cont = 0;
        int inferior =  0, entre = 0, superior = 0;
         
        do {
            System.out.println("Digite um valor de temperatura: "); 
            cont++;
            num = scannerTemperatura.nextInt();
            
            if(num<18){
                inferior+=1;
            }
            else if (num>18 && num<30){
                entre+=1;
            }
            else {
                superior+=1;
            }
        }while(cont <10);
        System.out.println("A quantidade de temperatura inferior á 18 é: "+inferior);
        System.out.println("A quantidade de temperatura entre 18 e 30 é: "+entre);
        System.out.println("A quantidade de temperatura superior a 30 é: "+superior);
    }
}
