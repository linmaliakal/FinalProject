import java.util.*;

public class ConnectFour {

  // important variables
  int round = 0;
  boolean gameType = false;

  // data structures
  Map<Integer, Stack<String>> board = new HashMap<Integer, Stack<String>>();
  Stack<Integer> column1 = new Stack<String>(" ", " ", " ", " ", " ", " ");
  Stack<Integer> column2 = new Stack<String>(" ", " ", " ", " ", " ", " ");
  Stack<Integer> column3 = new Stack<String>(" ", " ", " ", " ", " ", " ");
  Stack<Integer> column4 = new Stack<String>(" ", " ", " ", " ", " ", " ");
  Stack<Integer> column5 = new Stack<String>(" ", " ", " ", " ", " ", " ");
  Stack<Integer> column6 = new Stack<String>(" ", " ", " ", " ", " ", " ");
  Stack<Integer> column7 = new Stack<String>(" ", " ", " ", " ", " ", " ");

  public ConnectFour(boolean gameType) {
    this.gameType = gameType;
  }

  public HashMap<Integer, Stack<String>> buildBoard() {
    board.put(1, column1);
    board.put(2, column2);
    board.put(3, column3);
    board.put(4, column4);
    board.put(5, column5);
    board.put(6, column6);
    board.put(7, column7);

    return board;
  }

  public Stack<String> buildColumn(int col, String item) {
    if (col == 1) {
      column1.push(item);
    } else if (col == 2) {
      column2.push(item);
    } else if (col == 3) {
      column3.push(item);
    } else if (col == 4) {
      column4.push(item);
    } else if (col == 5) {
      column5.push(item);
    } else if (col == 6) {
      column6.push(item);
    } else if (col == 7) {
      column7.push(item);
    }
  }

  // public void printBoard(HashMap<Integer, Stack<String>> b){
  //   for(int i = 0; i < b.size(); i++){
  //     Stack<String> x = b.get(i);
  //   }
  // }
}