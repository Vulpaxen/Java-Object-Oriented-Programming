class test124
{
 
    static int MAX = 100;
 
    public static void sortStrings(String[] arr)
    {
    	int n = arr.length;
        String temp;
 
        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (arr[j].compareTo(arr[i]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String[] arr = { "GeeksforGeeks", "Quiz",
                        "Practice", "Gblogs", "Coding" };
        sortStrings(arr);
        System.out.println("Strings in sorted order are : ");
        for (int i = 0; i < arr.length; i++)
            System.out.println("String " + (i + 1) + " is " + arr[i]);
    }
}