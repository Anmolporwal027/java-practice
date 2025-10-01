//example showing the concept of composition
import java.util.Scanner;

class People {
    String name;
    int age;

    void SetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        this.name = sc.nextLine();
        System.out.println("Enter age ");
        this.age = sc.nextInt();
    }
}

class Country {
    People p[];

    Country(){
        p = new People[5];
        for(int i=0; i<5; i++) {
            p[i] = new People(); 
            p[i].SetData();
        }
    }

    void getData() {
        for(int i=0; i<5; i++) {
            System.out.println("Name : " + p[i].name + "\t Age : " + p[i].age);
        }
    }
}

class TestMain {
    public static void main(String args[]) {
        Country c = new Country(); // Country makes its own People
        c.getData();
    }
}
