public class keycombination {
    public  static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public  static void  printcombo(int index,String newstring,String str){
       if(index==str.length()){
           System.out.println(newstring);
           return;
       }

         char current=str.charAt(index);

         String mapping=keypad[current-'0'];
         for(int i=0;i<mapping.length();i++){
             printcombo(index+1,newstring+mapping.charAt(i),str);
         }
    }

    public  static void main(String[]args){
     String str="23";
     printcombo(0,"",str);
    }
}
