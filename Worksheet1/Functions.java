package Worksheet1;

public class Functions {

    public static int[] integerArray1()
    {
        int[] integerArray1 = {4,6,1,8,10,2,8,99,22,40};

        return integerArray1;
    }

    public static int[] integerArray2()
    {
        int[] integerArray2 = {1,2,3,4,5};

        return integerArray2;
    }

    public static void displayIntegerArray(int[] integerArray1, int[] integerArray2)
    {

        System.out.println("Here is the first array");

        for (int i = 0; i < integerArray1.length; i++)
        {
            System.out.println(integerArray1[i]);
        }

        System.out.println("here is the second array");

        for (int i = 0; i < integerArray2.length; i++)
        {
            System.out.println(integerArray2[i]);
        }
    }

    public static void main(String[] args)
    {

        int[] array1 = integerArray1();

        int[] array2 = integerArray2();

        displayIntegerArray(array1,array2);


}
}
