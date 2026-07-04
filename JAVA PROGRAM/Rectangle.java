//Write a program to create a class Rectangle with length and breadth. Initialize them using a default constructor and display the area.

//Name: Tanna Mansi
//Div:A
//Roll no:54


class Rectangle {
    int length;
    int breadth;

   
    Rectangle() {
        length = 10;   
        breadth = 5;  
    }

    
    int area() {
        return length * breadth;
    }

  
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area());
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
     
        Rectangle rect = new Rectangle();

      
        rect.display();
    }
}