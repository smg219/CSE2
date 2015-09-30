public class Variables{
    
        /////////////////////////////////
        //
        //  Desription of method
        //
        /////////////////////////////////
        
        int count=0;
        
        public static void computeSpeed(){
            
            // TODD Auto-generated method stub
            
            float processorSpeed;
            byte numberProcessors;
            float computerSpeed;
            
            processorSpeed = 2.3f;
            numberProcessors = 4;
            
            computerSpeed = processorSpeed * numberProcessors;
            count=5;
            System.out.println("Computer Speed =" + computerSpeed);
            System.out.println("Count =" + count);

            
        }    
            
        public static void addInterest(){
            
            float balance=45;
            //float interestRate=0.05f;
            
            float newBalance=balance+(int)(balance*interestRate);
            System.out.println("new balance = "+newBalance);
            
        }
            
        public static void main(String[] args){
            
            computeSpeed();
            addInterest(0.05f);
            
        
        }
        
}