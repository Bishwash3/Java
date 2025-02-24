// Paramater Constructor

public class ParamaterConstructor{
    int length;
    int breath;
    ParamaterConstructor(int length, int breath){
        this.length = length;
        this.breath = breath;
    }

    void display(){
        System.out.println("length:" + length);
        System.out.println("breath:" + breath);
        
    }

    public static void main(String[] args){
        ParamaterConstructor prmct = new ParamaterConstructor(30,40);
        prmct.display();
    }
}