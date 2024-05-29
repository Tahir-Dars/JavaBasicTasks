import java.util.Scanner;

public class TemperatureCalc{
    public static void main(String[] args){
        System.out.println("\t\tTemperature calculator");
        System.out.println("1.Centegrade to Kelvin\n2.Kelvin to Centegrade\n3.Centegrade to Farenhiet\n4.Farenhiet to Centegrade\n5.Farenhiet to Kelvin\n6.Kelvin to Farenhiet");
        System.out.println("Select the conversion ");
        Scanner Hel= new Scanner(System.in);
        int k= Hel.nextInt();
        switch(k){
            case 1:{
                System.out.println("Enter the Temperature in Centegrade ");
                float i=Hel.nextFloat();
                float l=i+ 273.15f;
                System.out.print("Temperature in Kelvin is: ");
                System.out.println(l);
                break ;}
            case 2:{
                System.out.println("Enter the Temperature in Kelvin ");
                float i=Hel.nextFloat();
                float l=i-273.15f;
                System.out.print("Temperature in Centegrade is: ");
                System.out.println(l);
                break ;}
            case 3:{
                System.out.println("Enter the Temperature in Centegrade ");
                float i=Hel.nextFloat();
                float l=(i* 9/5) + 32;
                System.out.print("Temperature in Farenhiet is: ");
                System.out.println(l);
                break ;}
            case 4:{
                System.out.println("Enter the Temperature in Farenhiet");
                float i=Hel.nextFloat();
                float l=(i- 32)* 5/9;
                System.out.print("Temperature in Centigrade is: ");
                System.out.println(l);
                break ;}
            case 5:{
                System.out.println("Enter the Temperature in Farenhiet ");
                float i=Hel.nextFloat();
                float l=((i-32)* 5/9)+273.15f;
                System.out.print("Temperature in Kelvin is: ");
                System.out.println(l);
                break ;}
            case 6:{
                System.out.println("Enter the Temperature in Kelvin ");
                float i=Hel.nextFloat();
                float l=((i-273.15f)*9/5)+32;
                System.out.print("Temperature in Farenhiet is: ");
                System.out.println(l);
                break ;}
        }
    }
}
