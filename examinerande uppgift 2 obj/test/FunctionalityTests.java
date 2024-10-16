import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.*;

public class FunctionalityTests {

    MembershipController mc = new MembershipController();

    public FunctionalityTests() throws IOException {
    }

    @Test
    public void assertMemberHasPayedFromName(){
        String name = "Greger Ganache";
        Member member = mc.getMemberFromName(name);
        boolean hasPayed = mc.getHasPayed(member);
        assertTrue(hasPayed);


        /*7512166544, Greger Ganache
        2024-03-23

         */
    }

    @Test
    public void assertMemberHasPayedFromSocialSecurity(){
        String socialSecurity = "7805211234";
        Member member = mc.getMemberFromSocialSecurity(socialSecurity);
        boolean hasPayed = mc.getHasPayed(member);
        assertTrue(hasPayed);

        /* 7805211234, Nahema Ninsson
           2024-08-04

         */
    }
    @Test
    public void assertNameNotInSystem(){
        String name = "Johan Eriksson";
        assertThrows(MissingMemberException.class, () -> {
            mc.getMemberFromName(name);
        });
    }

    @Test
    public void assertSocialSecurityNotInSystem(){
        String socialSecurity = "55555555";
        assertThrows(MissingMemberException.class, () -> {
            mc.getMemberFromSocialSecurity(socialSecurity);
        });

    }

    @Test
    public void assertMemberHasNotPayedFromName(){
        String name = "Kadine Karlsson";
        Member member = mc.getMemberFromName(name);
        boolean hasPayed = mc.getHasPayed(member);
        assertFalse(hasPayed);


        /*
        4604151234, Kadine Karlsson
        2019-01-09
         */
    }

    @Test
    public void assertMemberHasNotPayedFromSocialSecurity(){
        String socialSecurity = "9902149834";
        Member member = mc.getMemberFromSocialSecurity(socialSecurity);
        boolean hasPayed = mc.getHasPayed(member);
        assertFalse(hasPayed);

        /*
        9902149834, Jicky Juul
        2023-09-27
         */
    }
}