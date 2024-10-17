package basic;

class A{ //A is the class
    private int num;
    private int num1;

    //constructor
    public A(int num, int num1) {
        this.num = num;
        this.num1 = num1;
    }

    public void sum(){
        int c = num+num1;
        System.out.println("sum of "+ num +" + "+ num1 +" is: "+ c);
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        A a = new A(10, 20); //here "a" is the object
        a.sum();
    }
}


/*NOTE
* Class : It is a blueprint of the object to be created.
* Object: It is a instance of a class.
* */