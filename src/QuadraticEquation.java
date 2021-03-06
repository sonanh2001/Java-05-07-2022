public class QuadraticEquation {
    public static void solve(int a,int b,int c){
        if (a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Vô số nghiệm");
                }
                else{
                    System.out.println("Vô nghiệm");
                }
            }
            else {
                System.out.println(-c/(b*1.0));
            }
        }
        else{
            int delta=b*b-4*a*c;
            if(delta>0){
                System.out.println((-b+Math.sqrt(delta))/(2*a*1.0) + " " + (-b-Math.sqrt(delta))/(2*a*1.0));
            }
            else if (delta==0){
                System.out.println(-b/(2*a*1.0));
            }
            else{
                System.out.println("Vô nghiệm");
            }
        }
    }
    public static void main(String[] args) {
        solve(1,4,3);
    }
}
