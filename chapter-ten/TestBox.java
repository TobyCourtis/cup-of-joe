public class TestBox {

    public Integer i;
    public int j;

    public static void main(String[] args){
        TestBox t = new TestBox();
        t.go();
    }
    
    public void go(){
        j=i; // causes null pointer exception
        System.out.println(i); 
        System.out.println(j);
    }
}
