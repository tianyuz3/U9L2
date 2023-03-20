public class Main {
    public static void main(String[] args) {
        Exam exam = new Exam("Chemistry",100,50);
        SAT exam2 = new SAT("English Math",1600,1300,"Reading,Writing,Math");
        APComputerScienceA exam3 = new APComputerScienceA("Computer Science",5,4,10,81.2);
        exam.testInfo();
        exam2.testInfo();
        exam2.reviewForSections();
        exam3.practiceMaterial();
    

    }
}