import java.util.Calendar;
import java.util.Date;

public class Loan {
    private Date loanDate;
    private Date devolutionDate;
    private Integer fine;

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public Integer getFine() {
        return fine;
    }

    public void setFine(Integer fine) {
        this.fine = fine;
    }

    public int calcFine(Date devolutionDate){
        Date current = new Date();
        if(current.after(devolutionDate)){
            fine = 30;
        }else{
            fine = 0;
        }
        return fine;
    }

    public Date calcDate(Date loanDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(loanDate);
        calendar.add(Calendar.DAY_OF_MONTH,30);
        return calendar.getTime();
    }

    public void history(String isbn){
        System.out.println("Historial de prestamos:");
    }
}
