
import java.util.Scanner;

public class StudentRecord {
    private int _quiz1;
    private int _quiz2;
    private int _quiz3;
    private int _midterm;
    private int _final;
    private double _numericScore;
    private char _letterGrade;

    private static final int A_GRADE = 90;
    private static final int B_GRADE = 80;
    private static final int C_GRADE = 70;
    private static final int D_GRADE = 60;

    public StudentRecord(int q1, int q2, int q3, int mid, int fin) {
        this._quiz1 = q1;
        this._quiz2 = q2;
        this._quiz3 = q3;
        this._midterm = mid;
        this._final = fin;
    }

    public int getQuiz1() {
        Scanner keyboard = new Scanner(System.in);
        int q1 = keyboard.nextInt();
        return q1;
    }

    public int getQuiz2() {
        Scanner keyboard = new Scanner(System.in);
        int q2 = keyboard.nextInt();
        return q2;
    }

    public int getQuiz3() {
        Scanner keyboard = new Scanner(System.in);
        int q3 = keyboard.nextInt();
        return q3;
    }

    public int getMidterm() {
        Scanner keyboard = new Scanner(System.in);
        int mid = keyboard.nextInt();
        return mid;
    }

    public int getFinal() {
        Scanner keyboard = new Scanner(System.in);
        int fin = keyboard.nextInt();
        return fin;
    }

    public void setQuiz1(int q1) {
        this._quiz1 = q1;
    }

    public void setQuiz2(int q2) {
        this._quiz2 = q2;
    }

    public void setQuiz3(int q3) {
        this._quiz3 = q3;
    }

    public void setMidterm(int mid) {
        this._midterm = mid;
    }

    public void setFinal(int fin) {
        this._final = fin;
    }

    public void computeNumericScore() {
        this._numericScore = this._final * 0.4 + this._midterm * 0.35
                + (this._quiz1 + this._quiz2 + this._quiz3) * 10 * 0.25 / 3;
    }

    public void computeLetterGrade() {
        if (this._numericScore >= A_GRADE)
            this._letterGrade = 'A';
        else if (this._numericScore >= B_GRADE)
            this._letterGrade = 'B';
        else if (this._numericScore >= C_GRADE)
            this._letterGrade = 'C';
        else if (this._numericScore >= D_GRADE)
            this._letterGrade = 'D';
        else
            this._letterGrade = 'F';
    }

    public boolean equals(StudentRecord record) {
        if (this._letterGrade == record._letterGrade)
            return true;
        else
            return false;
    }

    public String toString() {
        computeNumericScore();
        computeLetterGrade();

        return "퀴즈1: " + this._quiz1 +
                "\n퀴즈2: " + this._quiz2 +
                "\n퀴즈3: " + this._quiz3 +
                "\n중간: " + this._midterm +
                "\n기말: " + this._final +
                "\n성적: " + String.format("%.2f",this._numericScore) +
                "\n등급: " + this._letterGrade;
    }
}