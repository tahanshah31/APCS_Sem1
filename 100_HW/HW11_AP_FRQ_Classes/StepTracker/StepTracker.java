public class StepTracker {
    int min1;
    double steps;
    int days;
    int active;
    public StepTracker(int minimum){
        min1 = minimum;
        steps = 0.0;
        days = 0;
        active = 0;
    }
    public void addDailySteps(int amountofdays){
        days = days + 1;
        steps = steps + amountofdays;
        
        if (amountofdays >= min1){
            active = active + 1;
        }
    }
    
    public int activeDays(){
        return active;
    }
    
    public double averageSteps(){
        if (days == 0){
            return 0;
        }
        double x = steps/days;
        return x;
    }
}