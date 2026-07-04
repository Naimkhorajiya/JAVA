//NAME: TANNA MANSI
//DIV- A

class S1 {
    int id;         
    String name;    

   
    S1() {
        id = 1;                
        name = "Tanna Mansi";     
    }

 
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}


public Class s1Demo {
    public static void main(String[] args) {
       
        S1 s1 = new S1();
        
      
        s1.display();
    }
}