package TrabalhoAutonomo.Aula11;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    DaysOfWeek(){

    }

    public boolean isWeekDay(){
        if(this != SATURDAY && this != SUNDAY){
            return true;
        } else {
            return false;
        }
    }

    public boolean isWeekend(){
        if(this == SATURDAY || this == SUNDAY){
            return true;
        } else{
            return false;
        }
    }
}
