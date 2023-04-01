
package training.entities;


public class Student extends Person{
    String id; 
    double theory;
    double practice;
    
    @Override
    void purchaseParkingPass() {
        
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTheory() {
        return theory;
    }

    public void setTheory(double theory) {
        this.theory = theory;
    }

    public double getPractice() {
        return practice;
    }

    public void setPractice(double practice) {
        this.practice = practice;
    }
    
    
    public double calculateFinalMark(){
        return (theory + practice) / 2;
        
    }

    @Override
    public String toString() {
        return super.toString() + ", Id = " + id + ", Theory = " + theory + ", Practice = " + practice + " FinalMark = " + calculateFinalMark() + '}';
    }
    
    
}
