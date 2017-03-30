package com.example.android.reportcarduda;

/**
 * Created by johan on 30/03/2017.
 */

public class UdareportCard {


    private int androidBasics;
    private int webDeveloped;
    private int Robotics;
    private int deepLearning;
    private int AI;
    private int your_Report;
    private String udaStudent;


    public UdareportCard(int androidGrades, int webGrades, int RoboticsGrades, int deepLearningGrades, int AIgrades, int your_ReportGrades,String Name){

        androidBasics = androidGrades;
        webDeveloped = webGrades;
        Robotics = RoboticsGrades;
        deepLearning = deepLearningGrades;
        AI = AIgrades;
        your_Report = your_ReportGrades;
        udaStudent = Name;

    }

    public int getAndroidBasics(){
        return  androidBasics;

    }
public void setAndroidBasics(int androidBasics_grade ){
    androidBasics = androidBasics_grade;
}
    public int getWebDeveloped(){
        return webDeveloped;
    }
    public void setWebDeveloped(int webDeveloped_grade){
        webDeveloped = webDeveloped_grade;

    }
    public  int getRobotics(){
        return Robotics;

    }
    public void  setRobotics(int robotics_grede){
        Robotics= robotics_grede;
    }
    public  int getDeepLearning(){
return deepLearning;

    }
    public  void setDeepLearning(int deepLearning_grade){
        deepLearning = deepLearning_grade;


    }
   public int getAI() {
       return AI;
   }
    public  void setAI(int ai_grade){
        AI =ai_grade;
    }
    public int getyour_Report(){
        return your_Report;
    }
    public  void setyour_Report(int yourReportGrade){
        your_Report = yourReportGrade;
    }
    public String getudaStudent(){
        return udaStudent;
    }
    public void setudaStudent(String name){
        udaStudent =name;
    }

@Override
    public String toString(){
        return
        "androidBasics" + (getAndroidBasics()) + "\n" +
                " webDeveloped " + (getWebDeveloped()) + "\n" +
                "Robotics" + (getRobotics()) + "\n"+
                "deepLearning" +(getDeepLearning()) +"\n" +
                "AI" + (getAI()) + "\n"+
                "your report card" +(getyour_Report()) + ( getAndroidBasics()) + (getRobotics())+ (getWebDeveloped())+ (getAI())+ (getDeepLearning()) + "\n"+
                "Udacity Student" + (getudaStudent());
}
}
