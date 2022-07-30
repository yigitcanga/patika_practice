public class OgrenciBilgiSistemi {
    public static void main(String[] args) {

        Course biyo = new Course("Biyoloji", "BIYO101", "BIYO");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Kemal", "90550000000", "BIYO");
        Teacher t2 = new Teacher("Gulfer", "90550000001", "FZK");
        Teacher t3 = new Teacher("Selma", "90550000002", "KMY");

        biyo.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali", 4, "140144015", biyo, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkSozluNote(100,100,40);
        s1.isPass();

        Student s2 = new Student("Ahmet", 4, "2211133", biyo, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkSozluNote(50,20,40);
        s2.isPass();

        Student s3 = new Student("Mehmet", 4, "221121312", biyo, fizik, kimya);
        s3.addBulkExamNote(50,70,100);
        s3.addBulkSozluNote(60,100,80);
        s3.isPass();

    }
}