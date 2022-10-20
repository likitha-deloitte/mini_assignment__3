import java.util.*;
public class Main {
    public static void SeparateZeroes(int input[])
    {
        int n = 0;
        for(int i = 0;i<input.length;i++)
        {
            if(input[i]!=0)
            {
                input[n] = input[i];
                n++;
            }
        }
        while(n<input.length)
        {
            input[n]=0;
            n++;
        }

        System.out.println(Arrays.toString(input));

    }
    public static void main(String[] args)
    {
        SeparateZeroes(new int[] {0,10,43,27,0,98,75,59,191,0 });
    }
}