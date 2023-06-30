package svj.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Unique_Email_Addresses_929Test {

    Unique_Email_Addresses_929 instance= new Unique_Email_Addresses_929();

    @Test
    void numUniqueEmails_1() {
        String[] emails= {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertThat(instance.numUniqueEmails(emails)).isEqualTo(2);
    }

    @Test
    void numUniqueEmails_2() {
        String[] emails= {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        assertThat(instance.numUniqueEmails(emails)).isEqualTo(3);
    }
}