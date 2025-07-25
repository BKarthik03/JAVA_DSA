package Hashing;

import java.util.Scanner;
import java.util.HashMap;
public class CountCharacterUsingHashmap {
    public static void main(String args[]){
        String str;
        Scanner sc = new Scanner(System.in);

        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();

        System.out.println("Enter the String: ");
        str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            int frequency = hash.getOrDefault(str.charAt(i),0);
            hash.put(str.charAt(i),frequency+1);
        }
        for(Character key:hash.keySet()){
            System.out.println(key+" : "+hash.get(key));
        }
        System.out.println("Enter the number of characters to check: ");
        int cNum = sc.nextInt();
        System.out.println("Enter the characters one by one: ");
        while(cNum!=0){
            char ch = sc.next().charAt(0);
            System.out.println(ch +" is present "+hash.getOrDefault(ch,0)+" times in the String!!");
            cNum--;
        }
    }
}
