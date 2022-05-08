package pl.migibud.referenceonmethod;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        int i = multiplyThree(x->addTwo(x), 2);
        System.out.println(i);
    }

    public static int addTwo(int x){
        return 2+x;
    }

    public static int multiplyThree(Function<Integer,Integer> myFunc,int x){
        return 3*myFunc.apply(x);
    }

}
