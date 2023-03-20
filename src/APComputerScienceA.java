public class APComputerScienceA extends Exam{
    int units;
    double levelOfDifficulty;
    public APComputerScienceA(String subject, int max, double average,int units, double l){
    super(subject,max,average);
    this.units = units;
    levelOfDifficulty = l;

    }

    public int getUnits() {
        return units;
    }

    public double getLevelOfDifficulty() {
        return levelOfDifficulty;
    }
    public void practiceMaterial(){
        System.out.println("The best practice is to do practice tests!");
        for(int i = 0 ; i<5 ; i++){
            System.out.println("Practice Test #" + i  + "\n" + ".........");
        }
    }

}
