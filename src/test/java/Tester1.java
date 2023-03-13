import org.junit.jupiter.api.*;

public class Tester1 {
    private static int i;

    @BeforeAll
    static void setUp() {
        i = 0;
        System.out.println("Prepare All");
    }

    @BeforeEach
    void setUpEach() {
        System.out.println("Check " + (++i) + " ...");
    }

    @AfterEach
    void clearUpEach() {
        System.out.println("Done ...");
    }

    @AfterAll
    static void clearUp() {
        System.out.println("Done All");
    }

    @Test
    void t1() {
        Assertions.assertEquals(
                (new MaxNonNegativeSubArray(new MyArrayList(1, 2, 5, -7, 2, 3))).play(),
                new MyArrayList(1, 2, 5)
        );
    }

    @Test
    void t2() {
        Assertions.assertEquals(
                (new MaxNonNegativeSubArray(new MyArrayList(10, -1, 2, 3, -4, 100))).play(),
                new MyArrayList(100, true)
        );
    }

    @Test
    void t3() {
        Assertions.assertEquals(
                (new MaxNonNegativeSubArray(new MyArrayList(-1, -1, -1, -1, -1))).play(),
                new MyArrayList()
        );
    }

    @Test
    void t4() {
        Assertions.assertEquals(
                (new MaxNonNegativeSubArray(new MyArrayList(2, 2, -1, 1, 1, 1, 1))).play(),
                new MyArrayList(1, 1, 1, 1)
        );
    }

    @Test
    void t5() {
        Assertions.assertEquals(
                (new MaxNonNegativeSubArray(new MyArrayList(1, 2, -1, 2, 1))).play(),
                new MyArrayList(1, 2)
        );
    }
}
