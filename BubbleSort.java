package com.test.sort;

 class BubbleSort {

   static void bubbleSort(int[] arr){
       int len=arr.length;
       for (int i=0;i<len-1;i++){
           boolean flag=true;
           for (int j=0;j<len-1-i;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   flag=false;
               }
           }
           if (flag){
               break;
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
         bubbleSort(arr);
     }
}
