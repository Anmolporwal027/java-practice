class Q8{
    public static void main(String args[]){
       try{
            System.exit(0);
            throw new ArithmeticException();
       }catch(ArithmeticException e){
            System.out.println("Exception outside : "+e);
       }finally{
           System.out.println("Finally executes");        
       }
       System.out.println("End of program");
    }
}