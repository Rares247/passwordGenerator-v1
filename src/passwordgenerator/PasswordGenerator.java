/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author rares
 */
public class PasswordGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arrays for the selection
        int[] ar1 = new int[]{'0','1','2','3','4','5','6','7','8','9'};
        char[] ar2 = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] ar3 = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] ar4 = new char[]{'!','"','#','$','%','&','*','+','-','/',':',';','<','=','>','?','@','[',']','^','_','{','}','|'};
        char[] pass = new char[10];
        
        //random number
        Random random = new Random();
        
        
        for(int i=0; i<10; i++){
            int r = random.nextInt(4);
            int r2 = random.nextInt(26);
            int r4 = random.nextInt(24);
            int r1 = random.nextInt(10);
            
            if(r == 0){
                pass[i] = (char) ar1[r1];      
            }
            
            if(r == 1){
                pass[i] = ar2[r2];
            }
            
            if(r == 2){
                pass[i] = ar3[r2];  
            }
            
            if(r == 3){
                pass[i] = ar4[r4];
            } 
            
            
        }
        
        for(int i=0; i<10; i++){
           
           System.out.print(pass[i]);
       }
    }
}
            
            
