import java.util.Scanner;
class Exercise {
      public static void main(String[] args)
    {
        int dec_num, quot, i=1, j;
        
        Scanner sc=new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        dec_num=sc.nextInt();
		
        quot = dec_num;
		
        while(quot != 0)
        {
            bin_num = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}
ry.java
