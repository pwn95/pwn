public class Inherit1 {
    int a;
    int b;
    float c;
    String str;
    Inherit1(int ab,int cd){
        this.a=ab;
        this.b=cd;
        System.out.println(a+b);
    }
    Inherit1(int a,float c){
        System.out.println(a+c);
    }
    Inherit1(String str){
        System.out.println(str);
    }
}
