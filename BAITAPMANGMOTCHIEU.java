/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitapmangmotchieu;

/**
 *
 * @author MINH PHUC
 */
import java.util.Scanner;
public class BAITAPMANGMOTCHIEU 
{
    static int [] M;
    static int N;
    static Scanner sc;
    
    static void Nhap()
    {
        for(int i=0;i<N;i++){
                
            System.out.print("M["+i+"]=");
            M[i]=sc.nextInt();
        }
    }
    static void Xuat()
    {
        for(int i=0; i<N; i++)
            System.out.println("M["+i+"]="+M[i]);
    }
    static int Tim(int x)
    {
        int Vitri=N+1;
        boolean found=false; 
        for(int i=0;i<N && !found; i++)
            if(M[i]==x)
            {
                found=true;
                Vitri=i;
            }
    if(found)
        System.out.printf("Tìm thấy X trong M", Vitri);
    else
        System.out.print("Không tìm thấy X trong M");
    return Vitri;
    }
    static void Xoa(int x)
    {
        int k=Tim(x);
        for(int j=k; j<N-1;j++)
            M[j]=M[j+1];
        M[N-1]=0;
        N--;
    }
    static void Sapxep()
    {
        for(int i=0;i<N;i++)
            for(int j=0;j<N-1;j++)
                if(M[j]>M[j+1])
                {
                    int tam=M[j];
                    M[j]=M[j];
                    M[j+1]=tam;
                }
    }
    public static void main(String[] args) 
    {
        sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu mang M:");
        N=sc.nextInt();
        M=new int [N];
        Nhap();
        Xuat();
        System.out.println("Nhập vị trí cần tìm và xóa: ");
        int x= sc.nextInt();
        Tim(x);
        Xoa(x);
        System.out.println("Mang sau khi xoa");
        Xuat();
        System.out.println("Mảng sắp xếp tăng dần: ");
        Xuat();
    }
}
   

  
//