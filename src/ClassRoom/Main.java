package ClassRoom;


public class Main {
    public static void main(String[] args) {
        Student Rodrigo = new Student(1, "Rodrigo", "Angular");
        Student Sara = new Student(3, "Sara", "Angular");
        Student Joana = new Student(2, "Joana", "Angular");
        Student Tiago = new Student(5, "Tiago", "Angular");
        Student Ruben = new Student(6, "Ruben", "Angular");
        Student Sofia = new Student(4, "Sofia", "Angular");
        Room mainRoom = new Room(30, 'A', 101);
        mainRoom.addStudents(Rodrigo);
        mainRoom.addStudents(Sara);
        mainRoom.addStudents(Joana);
        mainRoom.addStudents(Tiago);
        mainRoom.addStudents(Ruben);
        mainRoom.addStudents(Sofia);
        mainRoom.getStudentsInRoom();
    }
}
