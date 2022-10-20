public class DuplicateElement {
    public static void main(String[] args)
    {
        String[] a = {"abc", "java", "javahungry", "java", "javahungry"};

        for (int i = 0; i < a.length-1; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if( (a[i] == a[j]) );
                {
                    System.out.println("all the duplicate elements in the array are "+a[j]);
                }
            }
        }
    }
}