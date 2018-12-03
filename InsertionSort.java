package com.test.sort;

class InsertionSort {

     static void insertionSort(int[] arr) {
         int len=arr.length;
         int j;
         for (int i=1;i<len;i++){
             int temp=arr[i];
             for (j = i; j >0&&temp<arr[j-1] ; j--) {
                arr[j]=arr[j-1];
             }
             arr[j]=temp;
             print(arr);
         }
         print(arr);
    }

    private static void print(int[] arr) {
        for (int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr=new int[]{4,5,9,2,7,0,6,1,8,3};
        print(arr);
        System.out.println();
        insertionSort(arr);
    }
}
