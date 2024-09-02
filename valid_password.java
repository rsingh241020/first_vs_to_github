import java.util.*;
class valid_password{

public static boolean CheckPassword(int n , String str){

    boolean ans = true;
    int c_count = 0 ; //At least 4 characters Done
    boolean cap_chek = false ; //  At Least one Capital Letter
    boolean chek_num = false; // At least one numeric digit
    boolean chek_capital_Letter = false; //At Least one Capital Letter


    if(Character.isDigit(str.charAt(0))){ // Starting character must not be a number
        return false;
    }
    if (str.length()<4){ //At least 4 characters
        return false;
    }

    for(int i =0;i<n;i++){
        c_count +=1;
    if(str.charAt(i) == ' ' || str.charAt(i) == '/' ){ ////  Must not have space or slash (/)
        return false ;
    }
    if(Character.isUpperCase(str.charAt(i)))
        cap_chek = true;
    if(Character.isDigit(str.charAt(i)))
        chek_num = true;
    }
        return c_count > 4 && cap_chek && chek_num ;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String st = sc.nextLine();
    System.out.println(CheckPassword(n,st));
}
}