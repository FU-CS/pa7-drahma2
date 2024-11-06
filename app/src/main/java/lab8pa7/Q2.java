package lab8pa7;

public class Q2 {
    public int numIslands(char[][] grid) {
        // checks if grid is empty, if so it returns null.
        if(grid == null){
            return 0;
        }
        //initialize count, rows and columns
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        // a loop that looks at every cell in grid
        // then check if it is one and has not been visited
        // increment the count
        // use dfs to mark all linked cells as visited
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    count = count + 1;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, boolean[][] visited, int i, int j){
        // check for cells that are of value 0
        // check for cells that have already been visited
        // once a cell is visited, set visited[i][j] = true
        // figure out how to search all directions
        
        // checks for out of bounds errors
        if (i < 0 || i > grid.length-1 || j < 0 || j > grid[0].length-1){
            return;
        }
        if (grid[i][j] == '0' || visited[i][j]){
            return;
        }
        visited[i][j] = true;
        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i - 1, j);
        dfs(grid, visited, i, j - 1);
        dfs(grid, visited, i, j + 1);
    }
}
