package ClassRoom;

public class Room {
    private int capacity;
    private char building;
    private int number;
    private Student[] students;
    private int studentCount;

    public Room(int capacity, char building, int number){
        this.capacity = capacity;
        this.building = building;
        this.number = number;
        students = new Student[capacity];
    }

    public void addStudents(Student student){
            if(studentCount<capacity){
                students[studentCount] = student;
                studentCount++;
                System.out.println("Aluno adicionado à sala.");
        }else{
                System.out.println("Capacidade ultrapassada, não foi possivel adicionar aluno.");
            }
    }

    public void removeStudent(Student student){
        for (int i = 0; i < capacity; i++) {
            if(student==students[i]){
                students[i] = null;
            }
        }
    }

    public void getStudentsInRoom(){
        for (int i = 0; i < capacity; i++) {
            Student a = students[i];
            System.out.println("Lugar " + a);
        }
    }
}
