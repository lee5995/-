package com.test.sort;

class SelectionSort {

     static void selectionSort(int[] arr) {
         int len=arr.length;
         for (int i=0;i<len-1;i++){
             int minIndex=i;
             boolean flag=true;
             for (int j = i+1; j <len ; j++) {
                 if (arr[minIndex]>arr[j]) {
                     minIndex=j;
                     flag=false;
                 }
             }
             if (!flag){
                 int temp=arr[i];
                 arr[i]=arr[minIndex];
                 arr[minIndex]=temp;
             }
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
        selectionSort(arr);
    }
}
