
class Chelsea{
    // method parameter
    public void calc(int x){
        if(x%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

    }
}

public class Parameters {
    public static void main(String[] args){
        Chelsea mount = new Chelsea();
        mount.calc(46);
    }
}
