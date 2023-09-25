import org.junit.Test;
import org.example.Main;

import static org.junit.Assert.assertEquals;

public class DistanceTest {

    @Test
    public void givenTwoPoints_whenCalculateDistanceWithPoint2D_thenCorrect() {

        double x1 = 3;
        double y1 = 4;
        double x2 = 7;
        double y2 = 1;

        double distance = Main.calculateDistanceBetweenPointsWithPoint2D(x1, y1, x2, y2);

        assertEquals(distance, 5, 0.001);
    }
}
