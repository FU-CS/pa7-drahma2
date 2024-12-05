package lab8pa7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q3Test {
    @Test
    public void testOneIsland() {
        Q3 q3 = new Q3();
        int[][] grid = {
        {1, 1, 1, 1, 0},
        {1, 1, 1, 1, 0},
        {1, 1, 1, 1, 0},
        {0, 0, 0, 0, 0}};
        assertEquals(12, q3.maxAreaOfIsland(grid)); 
    }
    
    @Test
    public void testMultipleIslands() {
        Q3 q3 = new Q3();
        int[][] grid = {
        {1, 0, 1, 0, 1},
        {0, 1, 0, 1, 0},
        {1, 0, 1, 0, 1},
        {0, 1, 0, 1, 0}};
        assertEquals(1, q3.maxAreaOfIsland(grid)); 
    }

    @Test
    public void testMultipleIslands2() {
        Q3 q3 = new Q3();
        int[][] grid = {
        {1, 1, 1, 0, 1},
        {0, 1, 0, 1, 0},
        {1, 0, 1, 1, 1},
        {0, 1, 0, 1, 0}};
        assertEquals(5, q3.maxAreaOfIsland(grid)); 
    }

    @Test
    public void testEmpty() {
        Q3 q3 = new Q3();
        int[][] grid = null;
        assertEquals(0, q3.maxAreaOfIsland(grid)); 
    }

    @Test
    public void NoIslands() {
        Q3 q3 = new Q3();
        int[][] grid = {
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}};
        assertEquals(0, q3.maxAreaOfIsland(grid)); 
    }
}
