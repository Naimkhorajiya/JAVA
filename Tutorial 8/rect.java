 class Rect{
    int length;
    int breadth;
     yash() {
        length = 10;     
        breadth = 5;
    }

    public void displayArea() {
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void main(String[] args) {
        yash rect = new yash();
        rect.displayArea();
    }
}
