
class Solution {
    public List<Integer> spiralOrder(int[][] mat) {

        List<Integer> list = new ArrayList<>();

        int m = mat.length;
        int n = mat[0].length;

        int srow = 0;
        int scol = 0;
        int erow = m - 1;
        int ecol = n - 1;

        while (srow <= erow && scol <= ecol) {

            // Left to Right
            for (int j = scol; j <= ecol; j++) {
                list.add(mat[srow][j]);
            }

            // Top to Bottom
            for (int i = srow + 1; i <= erow; i++) {
                list.add(mat[i][ecol]);
            }

            // Right to Left
            if (srow < erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    list.add(mat[erow][j]);
                }
            }

            // Bottom to Top
            if (scol < ecol) {
                for (int i = erow - 1; i > srow; i--) {
                    list.add(mat[i][scol]);
                }
            }

            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return list;
    }
}
