// ArrayIndexOutOfBoundException and StringIndexOutOfBoundException
class Q4{
    public static void main(String args[]){
        String name = "Anmol Porwal";
        int arr[] = {1,2,3,4};
        try{
            System.out.println(arr[7]);
            System.out.println(name.charAt(89));
        }
        // catch(IndexOutOfBoundsException e){
        //     System.out.println(e);
        // }
        catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            System.out.println("Exception comes "+e);
        }
    }
}