package ru.mirea.ikbo2821.aleksandrov;

class Main{
    public static void main(String[] args) {
        System.out.println(foo(10));
    }
    private static int foo(int n) {
        int r = 1;
        while (n>1){
            r*=n;
            n-=1;
        }
        return r;
    }
}
