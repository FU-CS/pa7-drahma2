package lab8pa7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Q1Test {
    @Test
    void testRotate3x3() {
    Q1 q1 = new Q1();
    int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}};
    q1.rotate(matrix);
    int[][] expected = {
    {7, 4, 1},
    {8, 5, 2},
    {9, 6, 3}};
    assertArrayEquals(expected, matrix);
    }

    @Test
    void testRotate2x2() {
    Q1 q1 = new Q1();
    int[][] matrix = {
    {1, 2},
    {4, 5},};
    q1.rotate(matrix);
    int[][] expected = {
    {4, 1},
    {5, 2},};
    assertArrayEquals(expected, matrix);
    }

    @Test
    void testRotate1x1() {
    Q1 q1 = new Q1();
    int[][] matrix = {
    {1},};
    q1.rotate(matrix);
    int[][] expected = {
    {1}};
    assertArrayEquals(expected, matrix);
    }

    @Test
    void testRotateEmpty() {
    Q1 q1 = new Q1();
    int[][] matrix = {};
    q1.rotate(matrix);
    int[][] expected = {};
    assertArrayEquals(expected, matrix);
    }

    @Test
    void testRotate4x4() {
    Q1 q1 = new Q1();
    int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12},
    {13, 14, 15, 16}};
    q1.rotate(matrix);
    int[][] expected = {
    {13, 9, 5, 1},
    {14, 10, 6, 2},
    {15, 11, 7, 3},
    {16, 12, 8, 4}};
    assertArrayEquals(expected, matrix);
    }
}
