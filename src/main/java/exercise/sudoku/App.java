package exercise.sudoku;

public class App {

	public static void main(String[] args) {
		
		int sudokuTable[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                		{5, 2, 0, 0, 0, 0, 0, 0, 0},
                		{0, 8, 7, 0, 0, 0, 0, 3, 1},
                		{0, 0, 3, 0, 1, 0, 0, 8, 0},
                		{9, 0, 0, 8, 6, 3, 0, 0, 5},
                		{0, 5, 0, 0, 9, 0, 6, 0, 0},
                		{1, 3, 0, 0, 0, 0, 2, 5, 0},
                		{0, 0, 0, 0, 0, 0, 0, 7, 4},
                		{0, 0, 5, 2, 0, 6, 3, 0, 0}};

		Sudoku sudoku = new Sudoku(sudokuTable);
		sudoku.solveSudokuProblem();

		//https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/tutorial/
		//https://www.geeksforgeeks.org/backtracking-algorithms/
		/*-Pick a starting point

				-While the problem isn't solved

					-For each path from the starting point

					-Set that as the starting point and recurse

					-If it returns true, then return true

					-Undo the current move

					-Return false */
	}
}
