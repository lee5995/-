package com.test.sort;

class MergeSort {

    private static void mergeSort(int[] arr) {
        int[] temp=new int[arr.length];

        mergeSort(arr,temp,0,arr.length-1);
        print(arr);
    }

    private static void mergeSort(int[] arr,int[] temp,int left, int right) {

        if(left<right) {
            int mid = ( left+right) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid + 1, right);
        }
    }

    private static void merge(int[] arr,int[] temp,int left,int rightLeft,int right) {
        int element=left;
        int leftEnd=rightLeft-1;
        int len=right-left+1;

        while (left<=leftEnd&&rightLeft<=right){
            if(arr[left]<arr[rightLeft]){
                temp[element++]=arr[left++];
            }else{
                temp[element++]=arr[rightLeft++];
            }
        }
        while(left<=leftEnd){
            temp[element++]=arr[left++];
        }
        while (rightLeft<=right){
            temp[element++]=arr[rightLeft++];
        }

        for (int i = 0; i<len; i++,right--) {
            arr[right]=temp[right];
            System.out.print(temp[right]);
        }
        System.out.println();
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
        mergeSort(arr);
    }
}
