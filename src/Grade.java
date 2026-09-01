public class Grade {
    public static void main(String[] args){
        int[] scores = {85,92,76,60,58};
        for(int i =0;i<scores.length;i++) {
            if (scores[i] >= 90) {
                System.out.println(scores[i] + " -> A");
            } else if (scores[i] >= 80) {
                System.out.println(scores[i] + " -> B");
            } else if(scores[i] >=70){
                System.out.println(scores[i] + " -> C");
            }else if(scores[i] >=60){
                System.out.println(scores[i] + " -> D");
            }else{
                System.out.println(scores[i] + " -> E");
            }
        }

    }

}
