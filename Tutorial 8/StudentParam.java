class StudentParam {
    int id;
    String name;

    StudentParam(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}