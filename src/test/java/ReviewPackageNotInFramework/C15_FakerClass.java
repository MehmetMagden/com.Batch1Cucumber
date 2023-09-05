package ReviewPackageNotInFramework;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C15_FakerClass {

    /*

    When we need a fake name or surname etc. we can use faker class


     */

    @Test
    public void test(){
        Faker faker = new Faker();

        System.out.println(faker.company().name()); // Renner, Johnson and Runolfsdottir
        System.out.println(faker.address().fullAddress()); // 464 Langosh Road, South Earleneport, OH 11643-8060

        System.out.println(faker.phoneNumber().cellPhone()); // 864-969-7133






    }


}
