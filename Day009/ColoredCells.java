class ColoredCells {
    public long coloredCellsRecursion(int n) {
        if( n == 1){
            return 1;
        }
        return 4*(n - 1) + coloredCellsRecursion(n - 1);
    }


public long coloredCellsFormula(int n) {
        return 2 * ((long)n * n - n) + 1;
    }

}