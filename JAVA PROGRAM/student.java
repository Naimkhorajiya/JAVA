//NAME: TANNA MANSI
//DIV- A

class S1 {
    int id;         
    String name;    

   
    Student() {
        id = 1;                
        name = "Tanna Mansi";     
    }

 
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}


public class studentDemo {
    public static void main(String[] args) {
       
        Student s1 = new S1();
        
      
        s1.display();
    }
}