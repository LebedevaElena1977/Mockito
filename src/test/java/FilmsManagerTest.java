import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class FilmsManagerTest {

    @Test
    public void test() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");

        String[] expected =  {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
