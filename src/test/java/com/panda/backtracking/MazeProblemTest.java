package com.panda.backtracking;

import org.junit.Test;

public class MazeProblemTest {

	private char[][] maze = { 
			{ '-', '-', '-', '-', '-', '#', '-', '-', '-', '-' }, // 0
			{ '-', '-', '-', '-', '-', '#', '-', '-', '#', '-' }, // 1
			{ '-', '-', '#', '#', '#', '#', '#', '-', '#', '-' }, // 2
			{ '-', '-', '#', '-', '-', '-', '#', '-', '#', '-' }, // 3
			{ '-', '-', '#', '-', '#', '-', '#', '-', '#', '-' }, // 4
			{ '-', '-', '#', '-', '#', '-', '-', '-', '#', '-' }, // 5
			{ '-', '-', '#', '-', '#', '#', '#', '#', '#', '-' }, // 6
			{ '-', '-', '#', '-', '-', '-', '-', '-', '#', '-' }, // 7
			{ '-', '-', '#', '#', '#', '#', '-', '#', '#', '-' }, // 8
			{ '-', '-', '-', '-', '-', '-', '-', '#', '#', '-' } // 9
	};

	@Test
	public void testSolve() {
		new MazeProblem(maze).solve();
	}

}
