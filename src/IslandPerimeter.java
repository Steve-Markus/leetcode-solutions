public class IslandPerimeter {

  public static void main(String[] args) {
    int[][] grid = {
        {0, 1, 0, 0},
        {1, 1, 1, 0},
        {0, 1, 0, 0},
        {1, 1, 0, 0}
    };
    System.out.println(islandPerimeter(grid)); // Output: 16
  }

  private static int islandPerimeter(int[][] grid) {
    int perimeter = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 1) {
          perimeter += 4;

          if (i > 0 && grid[i - 1][j] == 1) {
            perimeter -= 2;
          }

          if (j > 0 && grid[i][j - 1] == 1) {
            perimeter -= 2;
          }
        }
      }
    }
    return perimeter;
  }
}
