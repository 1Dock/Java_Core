package lesson6;

public class Task_2 {
    public static void main(String[] args) {
        Staff a1 = new Staff(0, "aa1", "aa1", 2000);
        Staff a2 = new Staff(1, "a1a", "a1a", 5000);
        Staff a3 = new Staff(2, "1aa", "1aa", 3500);
        Staff a4 = new Staff(3, "aa1", "1aa", 3700);
        Staff a5 = new Staff(4, "a1a", "a1a", 4120);

        HRManagers b1 = new HRManagers(5, "aa1 aa1", 2000);
        HRManagers b2 = new HRManagers(6, "a1a a1a", 5000);
        HRManagers b3 = new HRManagers(7, "1aa 1aa", 3500);
        HRManagers b4 = new HRManagers(8, "aa1 1aa", 3700);
        HRManagers b5 = new HRManagers(9, "a1a a1a", 4120);

        Programmers c1 = new Programmers(10, "aa1 aa1", 2000, 1000, 0.5);
        Programmers c2 = new Programmers(11, "a1a a1a", 5000, 1000, 1);
        Programmers c3 = new Programmers(12, "1aa 1aa", 3500, 2340, 0.2);
        Programmers c4 = new Programmers(13, "aa1 1aa", 3700, 1420, 0.3);
        Programmers c5 = new Programmers(14, "a1a a1a", 4120, 1429, 0.3);

        Workers peoples[] = {a1, a2, a3, a4, a5, b1, b2, b3, b4, b5, c1, c2, c3, c4, c5};

        double maxSalary = 0;
        int index = 0;

        for (int i = 0; i < peoples.length; i++) {
            if (maxSalary < peoples[i].getSalary()) {
                maxSalary = peoples[i].getSalary();
                index = i;
            }
        }

        System.out.println("person with max salary: "+maxSalary+"$");
        System.out.println(peoples[index].getWorkerData());

        for (int i = 0; i < peoples.length - 1; i++) {
            for (int n = 0; n < peoples.length - 1; n++) {
                if (peoples[n].getSalary() < peoples[n + 1].getSalary()) {
                    Workers temp = peoples[n];
                    peoples[n] = peoples[n + 1];
                    peoples[n + 1] = temp;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i].getWorkerData());
        }
    }
}
