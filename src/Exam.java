public class Exam {
    String subject;
    int maximumScore;
    double average;

    public Exam(String s , int m , double a){
        subject = s;
        maximumScore = m;
        average = a;
    }

    public String getSubject() {
        return subject;
    }

    public int getMaximumScore() {
        return maximumScore;
    }

    public double getAverage() {
        return average;
    }
    public void testInfo(){
        System.out.println("This exam may contains subjects that are related to " + subject);
        System.out.println("The maximum score for this exam is: " + maximumScore);
        System.out.println("The average score for this exam in the United States last year is: " + average);
    }
}
