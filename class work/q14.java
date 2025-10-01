class Student{
    int rno;
    String name;
    int marks;

    Student(){
        this(100);
        System.out.println("No argument constructor");
    }
    Student(int rno){
        this(rno,"Andrew");
        System.out.println("1st parameterixed constructor "+rno);
    }
    Student(int rno , String name){
        this(rno,name,50);
        System.out.println("2nd paramenterized constrctor "+rno+" name : "+name);
    }

    Student(int rno, String name , int marks){
        System.out.println("3rd paramenterized constrctor "+rno+" name : "+name+" marks : "+marks);
    }
}
class TestMain{
    public static void main(String args[]){
        new Student(100);
    }
}