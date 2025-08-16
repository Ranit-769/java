public class MoveallX {
    public static void moveallx(int index,String str,int count,String newstring){

        if(index==str.length()){
            for(int i=1;i<=count;i++){
                newstring+='x';

            }
            System.out.println(newstring);
            return;
        }


        char currvalue=str.charAt(index);
        if(currvalue=='x'){
            count++;
            moveallx(index+1,str,count,newstring);
        }
        else{
            newstring+=currvalue;
            moveallx(index+1,str,count,newstring);
        }
    }
    public static void main(String[]args){
        String str="abxdxjshxxw";
        moveallx(0,str,0,"");

    }
}
