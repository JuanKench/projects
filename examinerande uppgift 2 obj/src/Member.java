import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Member {
    private String name;

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public void setName(String name) {
        this.name = name;
    }

    // unable to parse example numbers to int, contains corrupt characters.
    // work around , keep socialSecurity as String
    private String socialSecurity;
    private Date lastPayment;

    public Member() {

    }

    public Member(String name, String socialSecurity, String lastPayment) throws ParseException {
        this.name = name;
        this.socialSecurity = socialSecurity;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.lastPayment = simpleDateFormat.parse(lastPayment);
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public Date getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(String lastPayment) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.lastPayment = simpleDateFormat.parse(lastPayment);
    }


}
