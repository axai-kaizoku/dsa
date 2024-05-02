//Interface

interface Animal{
    public void travel();
}

public class MammalInt implements Animal{
    public void travel(){
        System.out.println("Mammal travels");
    }
    public static void main (String args[]){
        MammalInt m = new MammalInt();
        m.travel();
    }
}