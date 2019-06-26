package com.company;

public class Main
{

    public static void main(String[] args)
      {
          int sum = 0;
          int kol=0;
          int[] array = new int[10];
          System.out.print("MASSIV:");
          for(int i = 0; i < array.length; i++)
          {
              array[i] = (int) (Math.random() * 5  + 1);
              sum += array[i];
              if(array[i] == 3) kol++;
              System.out.print(" ");
              System.out.print(array[i]);
          }
          System.out.println();
          System.out.println("SUMMA=" + sum);
          System.out.println("KOLICHESTVO TROEC=" + kol);
          int a1=0, a2=0, a3=0, a4=0, a5=0;
          for(int i = 0; i < array.length; i++)
        {
            switch(array[i])
                {
                    case 1: a1++;
                    case 2: a2++;
                    case 3: a3++;
                    case 4: a4++;
                    case 5: a5++;
                                    }
                                        }
         System.out.println("KOLICHESTVO 1:" +a1);
         System.out.println("KOLICHESTVO 2:" +a2);
         System.out.println("KOLICHESTVO 3:" +a3);
         System.out.println("KOLICHESTVO 4:" +a4);
         System.out.println("KOLICHESTVO 5:" +a5);
}
}