// You have write a function that accepts, a string which length is “len”, the string has some “#”, 
// in it you have to move all the hashes to the front of the string and return the whole string back and print it.

import java.util.*;
class Hash{
    public static String  hashResult(String str){
        
        String str1 ="";
        String str2 ="";

        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                str1 +=str.charAt(i);
            }
            else{
                str2 +=str.charAt(i);
            }
        }
        return  str1+str2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(hashResult(str));
    }
}