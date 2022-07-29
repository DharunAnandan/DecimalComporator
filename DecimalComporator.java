public class DecimalComporator {
    public static void main(String[]args){
        areEqualByThreeDecimalPlaces(1.777,1.777);

    }


        public static boolean areEqualByThreeDecimalPlaces(double numone,double numtwo){
            int numone1=(int)(numone*1000);
            int numtwo2=(int)(numtwo*1000);
            if(numone1 - numtwo2==0){
                System.out.println("it's equal");
                return true;
            }
            else{
                System.out.println("it's not equal");
                return false;
            }

        }

}
