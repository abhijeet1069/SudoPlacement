package Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solver1Test {
    Solver1 obj;
    @BeforeEach
    void setUp() {
        obj = new Solver1();
    }
    @Test
    void test1(){
        assertEquals(52, obj.findClosest(new int[]{3, 5 ,6 ,7, 8, 9, 10, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
            27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 52, 53, 54, 56, 57, 58, 59, 60,
            61, 62, 63,64, 65, 66, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 ,81, 82, 83, 84 ,85 ,86 ,87 ,88, 89, 91, 92 ,93 ,94, 95,
            96, 97, 98, 99, 101, 102} ,51));
    }
}
