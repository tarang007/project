/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;
import java.util.Scanner;


public class Search {
     int binary_search(int a[],int l,int r ,int x) {
         
         //System.out.println("l "+ l+"r " + r + "x "+x);
         if(r >= l) {
            int mid = l + (r-l)/2;
            if(a[mid] == x) {
                 return mid;
            }
            if(a[mid] > x) {
                return binary_search(a,l,mid-1,x);
            }else{
                return binary_search(a,mid+1,r,x);
            }
       
        }
   return -1;
}


      public static void main(String[] args) {
        
        Search st = new Search();
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int[] a=new int[m];
        
        for(int i = 0; i < m ; i++) {
            a[i] = s.nextInt();
        }
        int x = s.nextInt();  
        int p = st.binary_search(a,0,m-1,x);
        System.out.println(p);
        
        
    }
      
}
