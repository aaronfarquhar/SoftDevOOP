package Worksheet_2;

public class BubbleSort {

    public static void bubbleSort(int[] arrayForSorting)
    {
        int n = arrayForSorting.length;
        int temporary = 0;


        for(int i=0; i < n; i++)                                            //for loop that loops for the entire length of the array
        {
            for (int j = 1; j < (n - i); j++)                               //for loop that loops for each element
            {

                if (arrayForSorting[j - 1] > arrayForSorting[j])            //checks if a selected element is less than the element further ahead
                {

                    temporary = arrayForSorting[j - 1];                     //if j-1 is more than j this line saves j-1 as a variable for later use

                    arrayForSorting[j - 1] = arrayForSorting[j];            //this line overwrites j-1 with the value of j

                    arrayForSorting[j] = temporary;                         //this line overwrites j with the saved former j-1 value
                }

            }
        }

    }

    public static void bubbleSortDecending(int[] arrayForSorting)
    {
        int n = arrayForSorting.length;
        int temporary = 0;


        for(int i=0; i < n; i++)
        {
            for (int j = 1; j < (n - i); j++)
            {

                if (arrayForSorting[j - 1] < arrayForSorting[j])
                {

                    temporary = arrayForSorting[j - 1];

                    arrayForSorting[j - 1] = arrayForSorting[j];

                    arrayForSorting[j] = temporary;
                }

            }
        }

    }

            public static void main (String[]args){

        System.out.println("Pre sort");

                int[] arrayForSorting = {10, 2, 7, 9, 8, 6, 3, 5, 4, 1};

                for (int i = 0; i < arrayForSorting.length; i++)
                {
                    System.out.println(arrayForSorting[i]);
                }

                bubbleSort(arrayForSorting);

                System.out.println("Post sort");

                for (int i = 0; i < arrayForSorting.length; i++)
                {
                    System.out.println(arrayForSorting[i]);
                }

                System.out.println("Sorted descending");

                bubbleSortDecending(arrayForSorting);

                for (int i = 0; i < arrayForSorting.length; i++)
                {
                    System.out.println(arrayForSorting[i]);
                }




            }


}
