class RectangleParam {
    int length;
    int breadth;

    RectangleParam(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void displayArea() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}