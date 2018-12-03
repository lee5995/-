package com.test.sort;

class ShellSort {

     static void shellSort(int[] arr) {
         int len=arr.length;
         int j;
         for (int gap=len/2; gap>0;gap/=2){
             for (int i = gap; i <len ; i++) {
                 int temp=arr[i];
                 for(j=i;j>=gap&&temp<arr[j-gap];j-=gap){
                     arr[j]=arr[j-gap];
                 }
                 arr[j]=temp;
                 print(arr);
             }
             System.out.println("--------------");
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
        shellSort(arr);
    }
}
