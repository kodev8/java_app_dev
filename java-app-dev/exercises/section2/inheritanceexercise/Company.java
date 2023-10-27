package exercises.section2.inheritanceexercise;
public class Company {
    
    public int compnayId;
    public String companyName;
    public float wagesPerHour;
    public int no_of_weeks;
    
    public Company(int compnayId, String companyName, float wagesPerHour, int no_of_weeks) {
        this.compnayId = compnayId;
        this.companyName = companyName;
        this.wagesPerHour = wagesPerHour;
        this.no_of_weeks = no_of_weeks;
    }

    public float wagesCalcluation( int total_duration) {
        return total_duration * wagesPerHour * no_of_weeks;
    }
    public int getCompnayId() {
        return compnayId;
    }
    public void setCompnayId(int compnayId) {
        this.compnayId = compnayId;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public float getWagesPerHour() {
        return wagesPerHour;
    }
    public void setWagesPerHour(float wagesPerHour) {
        this.wagesPerHour = wagesPerHour;
    }
    public int getNo_of_weeks() {
        return no_of_weeks;
    }
    public void setNo_of_weeks(int no_of_weeks) {
        this.no_of_weeks = no_of_weeks;
    }





}
