/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;
/** 
 *
 * @author kululouvuyo
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Index\tValue");
        int stiles[]={32,44,55,66,77};
        for(int counter=0;counter<stiles.length;counter++){
            System.out.println(counter + "\t" + stiles[counter]);
          
            
        }
    }
    
}
