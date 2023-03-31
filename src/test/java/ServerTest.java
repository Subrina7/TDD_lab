import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest1;
    Guest guest2;

    @BeforeEach
    public void setUp() {
        server = new Server();
        Guest guest1 = new Guest(
                "Subrina", 21);
        Guest guest2 = new Guest("Ariel", 16);
    }


    // TODO: test that guest can only get served if over 18

    @Test
    public void isGuestOldEnough() {
        assertThat(server.checkGuestAge(guest1)).isEqualTo(true);
    }

    @Test
    public void underageGuest() {
        assertThat(server.checkGuestAge(guest2)).isEqualTo(false);
    }



    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
