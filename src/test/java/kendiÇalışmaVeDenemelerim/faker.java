package kendiÇalışmaVeDenemelerim;

import com.github.javafaker.Faker;
import org.junit.Test;


public class faker {


    @Test
    public void name() {
    Faker faker=new Faker();
    String fName=faker.name().firstName();
        System.out.println("fName = " + fName);

        String lastName=faker.name().lastName();
        System.out.println("lastName = " + lastName);
        String adres=faker.address().country();
        System.out.println("adres = " + adres);
        System.out.println(faker.name().title());
        System.out.println("faker = " + faker.address().fullAddress());
        System.out.println(faker.avatar().image());
        System.out.println("faker.phoneNumber() = " + faker.phoneNumber());
        System.out.println("faker.number() = " + faker.number());
        System.out.println("faker.number().digits(15) = " + faker.number().digits(15));

    }
}
