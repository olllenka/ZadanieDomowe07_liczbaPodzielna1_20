public class Main {
    public static void main(String[] args) {

        int endOfRange=20;
        int nww=2;
        for(int i=1; i<endOfRange; i++){
            nww = nww(i,nww);
        }
        System.out.println(nww);
    }

    private static int nww(int a, int b) {
        int nwd = nwd(a,b);
        return (a*b)/nwd;
    }

    private static int nwd(int a, int b) {
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
}
