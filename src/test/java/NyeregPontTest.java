import org.junit.jupiter.api.Test;

class NyeregPontTest {
    @Test
    void testConstructor() {
        new NyeregPont();
    }

    @Test
    void testNyeregPontKereses() {
        (new NyeregPont()).NyeregPontKereses(new int[][]{new int[]{1, 1, 1, 1}
        });
    }

    @Test
    void testNyeregPontKereses2() {
        (new NyeregPont()).NyeregPontKereses(new int[][]{new int[]{4, 3, 2, 7},{3,2,1,2}});
    }

    @Test
    void testNyeregPontKereses3() {
        (new NyeregPont()).NyeregPontKereses(new int[][]{new int[]{8,5,4},{8,5,4},{8,5,4},{8,5,4}});
    }
}

