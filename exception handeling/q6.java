// multiple try inside one another and finally
class Q6{
    static String s;
    public static void main(String args[]){
        try{
            try{
                System.out.println(s.length());
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }finally{
                System.out.println("Statement 1");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Outer statement");
        }
    }
}