public class Grade {
    public static void main(String[] args) {
        int[] scores = {85, 92, 76, 60, 58};
        for (int score : scores) {
            if (score >= 90) {
                System.out.println(score + " -> A");
            } else if (score >= 80) {
                System.out.println(score + " -> B");
            } else if (score >= 70) {
                System.out.println(score + " -> C");
            } else if (score >= 60) {
                System.out.println(score + " -> D");
            } else {
                System.out.println(score + " -> E");
            }
        }
    }
}