public class Student {
    String name,stuNo;
    int classes;
    Course biyo;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course biyo,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.biyo = biyo;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }


    public void addBulkExamNote(int biyo, int fizik, int kimya) {

        if (biyo >= 0 && biyo <= 100) {
            this.biyo.note = biyo;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkSozluNote(int biyo_s, int fizik_s, int kimya_s) {

        if (biyo_s >= 0 && biyo_s <= 100) {
            this.biyo.sozlu = biyo_s;
        }

        if (fizik_s >= 0 && fizik_s <= 100) {
            this.fizik.sozlu = fizik_s;
        }

        if (kimya_s >= 0 && kimya_s <= 100) {
            this.kimya.sozlu = kimya_s;
        }

    }

    public void isPass() {
        if (this.biyo.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAverage() {
        this.average = (((this.fizik.note + this.kimya.note + this.biyo.note)*0.8)+((this.fizik.sozlu + this.kimya.sozlu + this.biyo.sozlu)*0.2)) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Biyoloji Sinav Notu : " + this.biyo.note + " Biyoloji Sozlu Notu : " + this.biyo.sozlu);
        System.out.println("Fizik Sinav Notu : " + this.fizik.note + " Fizik Sozlu Notu : " + this.fizik.sozlu);
        System.out.println("Kimya Sinav Notu : " + this.kimya.note + " Kimya Sozlu Notu : " + this.kimya.sozlu);
    }



}