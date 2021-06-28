public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ozan Başkan", "555", "FZK");
        Teacher t2 = new Teacher("Şamil Fidan", "555", "MAT");
        Teacher t3 = new Teacher("Recep Şen", "555", "BIY");

        Course fizik = new Course("Fizik", "001", "FZK", t1, 20);
        Course mat =  new Course("Matematik", "002", "MAT", t2, 30);
        Course biyo = new Course("Biyoloji", "003", "BIY", t3, 40);

        Student s1 = new Student("Baykuş", "16040129", "4", fizik,mat,biyo);
        s1.addExamNotes(40,40,40);
        s1.addVerbalExam(100,100,100);
        s1.isPassed();
    }
}
