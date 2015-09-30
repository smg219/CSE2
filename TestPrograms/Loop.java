public class Loop{
    
    public static void main(String[] args){
        
        int x = 1;
        int sum = 0;
        while (x <= 10){
            sum += x;
            x= x + 2;
        }
        System.out.println(sum);
    }
}