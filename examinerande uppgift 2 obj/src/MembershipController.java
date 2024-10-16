import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MembershipController {

    public MembershipController() {

    }

    public ArrayList<Member> getList() {
        try (
                BufferedReader br = new BufferedReader(new FileReader("src\\medlemar.txt"));
        ) {
            String line;
            ArrayList<Member> members = new ArrayList<Member>();

            while ((line = br.readLine()) != null) {
                String lastPayment;
                Member member = new Member();
                if (line.contains(", ")) {
                    String[] arr = line.split(", ");
                    member.setSocialSecurity(arr[0]);
                    member.setName(arr[1]);
                }
                else if (!line.isEmpty()) {
                    member.setLastPayment(line);
                }
                members.add(member);
            }
            return members;


        }catch (IOException e){
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

