public class base {
    public static void main(String args[]){
        Boy  b1 = new Boy();
        b1.setname("ranit");
        System.out.println(b1.name);
    }
}

class Boy {
    String name;
    void setname(String name){
        this.name = name;
    }
    Boy(){
        System.out.println("boy called");
    }
 }
