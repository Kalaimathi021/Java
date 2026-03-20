import java.util.*;
class EncodeDecode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Integer> countStack=new Stack<>();
        Stack<String> stringStack=new Stack<>();
        String current="";
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                countStack.push(num);
                stringStack.push(current);
                num=0;
                current="";
            }
            else if(ch==']'){
                int repeat=countStack.pop();
                String prev=stringStack.pop();
                String temp="";
                for(int j=0;j<repeat;j++){
                    temp+=current;
                }
                current=prev+temp;
            }
            else{
                current+=ch;
            }
        }
        System.out.println(current);
        sc.close();
    }
} 