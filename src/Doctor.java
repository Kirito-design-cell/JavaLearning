public class Doctor extends Person {
    private String hospital;

    public Doctor(String name, int age, String hospital){
        super(name,age);
        this.hospital = hospital;
    }
    public String getHospital(){
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("我在" + hospital + "工作");
    }
}
