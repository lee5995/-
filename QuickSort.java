package com.test.sort;


class QuickSort {

    private static void  quickSort(int[] arr){

        quickSort(arr,0,arr.length-1);

    }

    private static void quickSort(int[] arr,int left,int right){
        int pivot=pivot(arr,left,right);
        int front=left;
        int rear=right-1;
        final int CUTOFF=10;

        if(left+CUTOFF<right) {

            for (; ; ) {
                while (arr[++front] < pivot) {
                }
                while (arr[--rear] > pivot) {
                }

                if (front < rear) {
                    swap(arr, front, right);

                } else {
                    break;
                }
            }
            swap(arr, front, right - 1);
            quickSort(arr, left, front - 1);
            quickSort(arr, front + 1, right);
        }else {
            InsertionSort.insertionSort(arr);
        }
        print(arr);
    }

    private static void swap(int[] arr, int first, int last) {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    private static int pivot(int[] arr,int left,int right) {
        int mid=(left+right)/2;

        if(arr[left]>arr[mid]){
           swap(arr,left,mid);
        }
        if (arr[mid]>arr[right]){
            swap(arr,mid,right);
        }
       if (arr[left]>arr[mid]){
           swap(arr,left,mid);
       }
        swap(arr,mid, right-1);
        return arr[right-1];
    }

    private static void print(int[] arr) {
        for (int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr=new int[]{12,4,32,5,9,2,7,0,6,1,8,3,17,35,68,95,14,75,25,4,8,2,15,24,23};
        print(arr);
        System.out.println();
        quickSort(arr);
    }
}
