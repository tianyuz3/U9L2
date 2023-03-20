public class SAT extends Exam{
    String sections;
    public SAT(String subject , int maximum, double average , String sections){
        super(subject,maximum,average);
        this.sections = sections;
    }
    public String getSections(){
        return "There are four sections in the SAT: " + sections;
    }
    public void reviewForSections() {
        System.out.println("Here is an exam in March 2020 for you to practice.");
        System.out.println("Reading Section...............");
        System.out.println("Writing Section...............");
        System.out.println("Math no calculator section..................");
        System.out.println("Math with calculator section..");
    }
}
