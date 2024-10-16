import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class IOTests {

    MembershipController mc = new MembershipController();

    public IOTests() throws IOException {
    }

    @Test
    public void assertFileIsRead() throws ParseException {
        Member excpectedMember = new Member("Alhambra Aromes", "7703021234", "2024-07-01");
        ArrayList<Member> listOfMembers = mc.getList();
        Member member = listOfMembers
                .stream()   // needed
                .filter(m -> m.getSocialSecurity().equals(excpectedMember.getSocialSecurity())) // Finds the member based on social security from expected member
                .findFirst() // Filter returns List of one, we want Member
                .get(); // needed
        assertEquals(excpectedMember, member);


    }

}