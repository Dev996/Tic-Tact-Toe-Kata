package com.dev.ttt.console;

/**
 * @Classname Screen Interface
 *
 * @author Developer D996
 * @version 1.0
 */
public interface Screen {

	void draw(String[][] cells);

	int updateBoard(String[][] cells, String userSign, int moveCount, String positionInput);

}
