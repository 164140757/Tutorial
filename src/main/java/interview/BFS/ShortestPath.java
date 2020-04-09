package interview.BFS;


import java.util.LinkedList;
import java.util.Queue;

/**
 * In an N by N square grid, each cell is either empty (0) or blocked (1).
 * <p>
 * A clear path from top-left to bottom-right has length k if and only if it is
 * composed of cells C_1, C_2, ..., C_k such that:
 * <p>
 * Adjacent cells C_i and C_{i+1} are connected 8-directionally
 * (ie., they are different and share an edge or corner)
 * C_1 is at location (0, 0) (ie. has value grid[0][0])
 * C_k is at location (N-1, N-1) (ie. has value grid[N-1][N-1])
 * If C_i is located at (r, c), then grid[r][c] is empty (ie. grid[r][c] == 0).
 * Return the length of the shortest such clear path from top-left to bottom-right.
 * If such a path does not exist, return -1.
 */
public class ShortestPath {
    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {1, -1}, {1, 1}, {-1, 0}, {-1, -1}, {-1, 1}};
        Queue<Pair<Integer, Integer>> queue = new LinkedList<Pair<Integer, Integer>>();
        queue.add(new Pair<Integer, Integer>(0, 0));
        int pathLength = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            pathLength++;
            // the next level
            while (size-- > 0) {
                Pair<Integer, Integer> pair = queue.poll();
                int i = pair.first;
                int j = pair.second;
                if (grid[i][j] == 1) {
                    continue;
                }
                if (i == m - 1 && j == n - 1) {
                    return pathLength;
                }
                grid[i][j] = 1;
                // try
                for (int[] d : directions) {
                    int di = d[0] + i;
                    int dj = d[1] + j;
                    if (di < 0 || di >= m || dj < 0 || dj >= n) {
                        continue;
                    }
                    queue.add(new Pair<>(di, dj));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] test = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(shortestPathBinaryMatrix(test));
    }

    private static class Pair<T1, T2> {
        public T1 first;
        public T2 second;

        Pair(T1 o1, T2 o2) {
            this.first = o1;
            this.second = o2;
        }
    }
}
