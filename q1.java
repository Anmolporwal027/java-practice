import java.util.Scanner;
import java.util.*;
class Product{
    int pid;
    String pname;
    int price;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Product Id ");
        pid = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the name of the product ");
        pname = sc.nextLine();

        System.out.println("Enter the price of the product ");
        price = sc.nextInt();
    }

    void display(){
        System.out.println("\nProduct Details");
        System.out.println("\nProduct Id : "+pid);
        System.out.println(" Product Name : "+pname);
        System.out.println(" Product Price : "+price);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of the product ");
        int n = sc.nextInt();

        Product p[] = new Product[n];
        for(int i=0; i<n; i++){
            p[i] = new Product();
            p[i].getData();
        } 
        for(Product e : p){
            e.display();
        }

        System.out.println("If you want product with lowest price enter L ");
        System.out.println("If you want product with maximum price enter M ");
        System.out.println("If you want product in low to high range enter A ");
        char choice = sc.next().charAt(0);

        
        switch(choice){
            case 'L':
                int low = Integer.MAX_VALUE;
                for(int i=0; i<n; i++){
                    if(p[i].price < low)
                        low = p[i].price;
                }
                for(Product e : p ){
                    if(e.price == low){
                        System.out.println("Product with lowest price is : "+(e.pname)+" and its price is "+e.price);
                        break;
                    }
                }
                break;

            case 'M':
                int max = Integer.MIN_VALUE;
                for(int i=0; i<n; i++){
                    if(p[i].price > max)
                        max = p[i].price;
                }
                for(Product e : p ){
                    if(e.price == max){
                        System.out.println("Product with maximum price is : "+(e.pname)+" and its price is "+e.price);
                        break;
                    }
                }
                break;
            case 'A':
                Arrays.sort(p, (a,b)-> a.price-b.price);
                System.out.println("Price of products in ascending order ");
                for(Product i : p){
                    System.out.println("Product id : "+i.pid+"\nProduct name : "+i.pname+"\n and its price : "+i.price);
                }
            default:
                System.out.println("Enter correct choice");
                break;
        }

    }
}