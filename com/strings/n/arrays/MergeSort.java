package com.strings.n.arrays;

import java.util.*;

class MergeSort
{
   
    public static void main(String args[])
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of strings");
        int n1=sc.nextInt();
        String arr[]=new String[n1];
       
        System.out.print("Enter Names/Words : ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.next();
        }
       
        System.out.println("Given Array");
        //Utility.printArray(arr);
        int n = arr.length;
        for (int i=0; i<n; ++i)
               System.out.print(arr[i] + " ");

        sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        //Utility.printArray(arr); 
           for (int i=0; i<n; ++i)
               System.out.print(arr[i] + " ");
           System.out.println();
    }



    static void merge(String arr[], int l, int m, int r)
               {
                  
                   int n1 = m - l + 1;
                   int n2 = r - m;

                   String L[] = new String[n1];
                   String R[] = new String[n2];

                   for (int i=0; i<n1; ++i)
                       L[i] = arr[l + i];
                   for (int j=0; j<n2; ++j)
                       R[j] = arr[m + 1+ j];

                   int i = 0, j = 0;
                   int k = l;
                   while (i < n1 && j < n2)
                   { 
                       int comp=L[i].compareTo(R[j]);
                       if (comp<0)
                       {
                           arr[k] = L[i];
                           i++;
                       }
                       else
                       {
                           arr[k] = R[j];
                           j++;
                       }
                       k++;
                   }

                   while (i < n1)
                   {
                       arr[k] = L[i];
                       i++;
                       k++;
                   }

                   while (j < n2)
                   {
                       arr[k] = R[j];
                       j++;
                       k++;
                   }
               }

              
           static void sort(String arr[], int l, int r)
               {
                   if (l < r)
                   {
                       int m = (l+r)/2;

                       sort(arr, l, m);
                       sort(arr , m+1, r);

                       merge(arr, l, m, r);
                   }
               } 
}