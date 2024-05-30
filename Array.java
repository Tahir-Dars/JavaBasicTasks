import java.util.Scanner;
//import java.lang.String;
import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner sc= new Scanner(System.in);
      //  threee ways of array usage
     //1.Declaration and than memory allocation
        //int marks[];
        //marks = new int[5];
        //2.Declaration and memory allocation at same time
       // int marks[]= new int[7];
        //3.Declaration+initialization
    //  int marks[]={10,6,89,9};
     //   Arrays.sort(marks);
      // System.out.println(Arrays.toString(marks));

;

       /* // --->>>>   print elements in reverse order
        System.out.println("Enter ten number its reverse will be printed ");
        int marks[]= new int[10];
        for(int i=0;i<=9;i++){
            marks[i]= sc.nextInt();
        }
        for(int i=9;i>=0;i--){
            System.out.print(marks[i]+" ");
        }*/
       // Find Maximum Element
       /* int entry[]= new int[5];
        for(int i=0;i<=4;i++){
            entry[i]= sc.nextInt();
        }
        int max= entry[0];
        for(int i=1;i<=4;i++){
            if(entry[0]>entry[i]) {
                max=entry[i];
           }
        }
        System.out.println(max);*/
      //  Enter an array and check if they are forming a palindrome
      /*  char pal[]= new char[5];
        for (int i=0;i<pal.length;i++){
            pal[i] = sc.next().charAt(0);

        }
       if(pal[0]==pal[pal.length-1] && pal[1]==pal[pal.length-2]  ){
           System.out.println("Its a palindrome");
       }
       else System.out.println("It is not a palindrome");*/


              //  int numbers[]= {5,7,9,2,1};
               // Arrays.sort(numbers);
               // System.out.println("Sorted array: " + Arrays.toString(numbers));

                //int[] copythArray = Arrays.copyOf(numbers, numbers.length);
                //System.out.println("Copied array: " + Arrays.toString(copythArray));

               // int indices = Arrays.binarySearch(numbers, 5);
              // System.out.println("Index of 5 ibn sorted array: " + indices);

               // int[] therArray = {1, 2, 5, 7, 9};
                //boolean isEqual = Arrays.equals(numbers, therArray);
                //System.out.println("Are the arrays equal? " + isEqual);


                //int[] fill= new int[5];
                //Arrays.fill(fill, 10);
                //System.out.println("Filled array: " + Arrays.toString(fill));
       /* int arr[][]={{2,3},{4,5}};
            int il=0;
          for(int i=0;i<2;i++){
              for(int j=0;j<2;j++){
                  i++;
                  if(il==2){
                      System.out.println();
                  }
                  System.out.println(" "+arr[i][j]);
              }
          }*/
     }
}