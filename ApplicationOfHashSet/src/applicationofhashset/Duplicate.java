/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationofhashset;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author shash
 */
public class Duplicate {
    
    public static void main(String[] args) {
         int [] a= {1,2,3,4,1,2,4};
        HashSet<Integer> hs= new HashSet<>();
        ArrayList<Integer> al= new ArrayList<>();
        ArrayList<Integer> al1= new ArrayList<>();
        for (int i = 0; i <a.length; i++)
        {
            if(hs.add(a[i]))// gives array without duplicacy
            {                     // hs.add(a[i])==false): gives nos in array which is repeated 
               al.add(a[i]);
            }
            else 
            {
                al1.add(a[i]);
            }
        }
        System.out.println(al);
        System.out.println(al1);
        System.out.println(hs);
    }
}
