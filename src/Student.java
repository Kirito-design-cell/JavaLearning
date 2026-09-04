public class Student extends Person {
        private int score;

        public Student(String name, int age, int score) {
            super(name, age);
            setScore(score);
        }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
            if(score < 0 || score > 100){
                System.out.println("分数不合法, 拒绝修改: " + score);
                return;
            }
            this.score = score;
        }

        @Override
        public void introduce() {
            super.introduce();
            System.out.println("我还是一名学生, 成绩" + score + "分");
        }

}