import java.util.Arrays;
class FindRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k = 0; k < 4; k++){
            for (int i =0; i < mat.length; i++){
                for(int j = i + 1; j < mat.length; j++){
                    mat[i][j] += mat[j][i];
                    mat[j][i] = mat[i][j] - mat[j][i];
                    mat[i][j] = mat[i][j] - mat[j][i];
                }
            }
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat.length/2; j++){
                    mat[i][j] += mat[i][mat.length - 1 - j];
                    mat[i][mat.length - 1 - j] = mat[i][j] - mat[i][mat.length - 1 - j];
                    mat[i][j] = mat[i][j] - mat[i][mat.length - 1 - j];
                }
            }
            if (Arrays.deepEquals(mat, target)) return true;
        }
        return false;
    }
}