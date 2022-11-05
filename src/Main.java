public class Main {
    public static void main(String[] args) {
        // Task 1
        int age = 15;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");
        }

        // Task 2
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Ребенку " + childAge + " лет. Он не может кататься на атракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Ребенку " + childAge + " лет. Он может кататься только в сопровождении взрослого. " +
                    "Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Ребенку " + childAge + " лет. Он может кататься без сопровождения взрослых");
        }

        // Task 3
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}