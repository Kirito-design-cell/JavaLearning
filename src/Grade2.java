public class Grade2 {
    public static String getGrade(int score){
        if(score >=90){
            return "A";
        }else if(score >= 80){
            return "B";
        }else if(score >= 70){
            return "C";
        }else if(score >=60){
            return "D";
        }else{
            return "E";
        }
    }
    public static void main(String[] args){
        int[] scores={85,92,76,60,58};
        for(int score : scores){
            System.out.println(score + " -> " + getGrade(score));
        }

    }
}
