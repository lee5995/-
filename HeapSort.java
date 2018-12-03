package com.test.sort;

public class HeapSort {

    private  static int leftChild(int i){
        return 2*i+1;
    }

    private static void percDown(int[] arr,int parent,int len){

        int child;
        int temp;

        for (temp=arr[parent]; leftChild(parent)<len;parent=child) {

            child=leftChild(parent);

            if (child < len-1&&arr[child]<arr[child+1]) {
                child++;
            }
            if(arr[child]>temp){
                arr[parent]=arr[child];
            }else {
                break;
            }
        }
        arr[parent]=temp;
    }

    private static void heapSort(int[] arr) {
        int len=arr.length;

        for(int i=len/2-1;i>=0;i--){
            percDown(arr,i,len);
        }

        for (int j = len-1; j >0; j--) {
            swap(arr,0,j);
            percDown(arr,0,j);
        }
        print(arr);
    }

    private static void swap(int[] arr, int first, int last) {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
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
        heapSort(arr);
    }
}
