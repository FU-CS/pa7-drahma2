package lab8pa7;

public class Q3 {
    public int maxAreaOfIsland(int[][] grid) {
        // checks if grid is empty, if so it returns null.
        if(grid == null){
            return 0;
        }
        int largest = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];


        // a loop that looks at every cell in grid
        // then check if it is one and has not been visited
        // increment the count
        // use dfs to mark all linked cells as visited
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && visited[i][j] == false){
                    int currIsland = dfs(grid, visited, i, j);
                    if (currIsland > largest){
                        largest = currIsland;
                    }
                }
            }
        }

        return largest;
    }


    private int dfs(int[][] grid, boolean[][] visited, int i, int j){
        // check for cells that are of value 0
        // check for cells that have already been visited
        // once a cell is visited, set visited[i][j] = true
        // figure out how to search all directions
        
        // checks for out of bounds errors
        if (i < 0 || i > grid.length-1 || j < 0 || j > grid[0].length-1){
            return 0;
        }
        if (grid[i][j] == 0 || visited[i][j]){
            return 0;
        }
        
        visited[i][j] = true;
        
        // set size to 1, and add all connected land
        int size = 1;

        size += dfs(grid, visited, i + 1, j);
        size += dfs(grid, visited, i - 1, j);
        size += dfs(grid, visited, i, j - 1);
        size += dfs(grid, visited, i, j + 1);

        return size;
    }
}
