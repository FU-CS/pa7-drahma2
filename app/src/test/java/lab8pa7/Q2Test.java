package lab8pa7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Q2Test {
    @Test
    public void testOneIsland() {
        Q2 q2 = new Q2();
        char[][] grid = {
        {'1', '1', '1', '1', '0'},
        {'1', '1', '1', '1', '0'},
        {'1', '1', '1', '1', '0'},
        {'0', '0', '0', '0', '0'}};
        assertEquals(1, q2.numIslands(grid)); 
    }
    @Test
    public void testMultipleIsland() {
        Q2 q2 = new Q2();
        char[][] grid = {
        {'1', '0', '1', '0', '1'},
        {'0', '1', '0', '1', '0'},
        {'1', '0', '1', '0', '1'},
        {'0', '1', '0', '1', '0'}};
        assertEquals(10, q2.numIslands(grid)); 
    }

    @Test
    public void testMultipleIsland2() {
        Q2 q2 = new Q2();
        char[][] grid = {
        {'1', '1', '1', '0', '1'},
        {'0', '1', '0', '1', '0'},
        {'1', '0', '1', '1', '1'},
        {'0', '1', '0', '1', '0'}};
        assertEquals(5, q2.numIslands(grid)); 
    }
    @Test
    public void testEmpty() {
        Q2 q2 = new Q2();
        char[][] grid = null;
        assertEquals(0, q2.numIslands(grid)); 
    }
    @Test
    public void NoIslands() {
        Q2 q2 = new Q2();
        char[][] grid = {
        {'0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}};
        assertEquals(0, q2.numIslands(grid)); 
    }
}
