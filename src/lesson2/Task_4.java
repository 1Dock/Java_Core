//package lesson8;
//
//public class Task_7 {
//    public static void main(String[] args) {
//        Student s1 = new Student(0, "Olzhas", "Ainabek", 2.4);
//        Student s2 = new Student(1, "Zhandos", "Ainabek", 1.5);
//        Student s3 = new Student(2, "Ilyas", "Zhuanyshev", 3.9);
//        Student s4 = new Student(3, "Aibek", "Bagyt", 3.7);
//        Student s5 = new Student(4, "Rayn", "Sabyt", 2.7);
//        Student s6 = new Student(5, "Timur", "Yslamgalyev", 4);
//        Student s7 = new Student(6, "Azamat", "Tolegenov", 1.4);
//        Student s8 = new Student(7, "Amanzhan", "Jygytov", 3.5);
//        Student s9 = new Student(8, "Via", "Adamo", 2.6);
//        Student s10 = new Student(9, "Sanya", "S1mple", 3.8);
//
//        Student studentsArr[] = new Student[10];
//        studentsArr[0] = s1;
//        studentsArr[1] = s2;
//        studentsArr[2] = s3;
//        studentsArr[3] = s4;
//        studentsArr[4] = s5;
//        studentsArr[5] = s6;
//        studentsArr[6] = s7;
//        studentsArr[7] = s8;
//        studentsArr[8] = s9;
//        studentsArr[9] = s10;
//
//        int index = 0;
//        double max = s1.gpa;
//
//        for (int i = 0; i < studentsArr.length; i++) {
//
//            if (max < studentsArr[i].gpa) {
//                max = studentsArr[i].gpa;
//                index = i;
//            }
//        }
//
//        System.out.println(studentsArr[index].getData());
//    }
//}