public class Doctor extends Person implements Surgeryable{
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
    public void surgery() {
        System.out.println("正在手术");
    }
    public void introduce() {
        super.introduce();
        System.out.println("我在" + hospital + "工作");
    }
}
