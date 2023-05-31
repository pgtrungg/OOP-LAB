package OOP_LAB1;

import  java.util.Scanner;
public class ArraySorting {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang : ");
        int n = sc.nextInt();
        System.out.print("Nhap cac phan tu cua mang : ");
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
             sum+=a[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        System.out.println("Tong cua mang la :"+sum);
        System.out.println("Trung binh cua mang la :"+(sum/n));
        System.out.print("Mang sau khi sap xep la :");
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
