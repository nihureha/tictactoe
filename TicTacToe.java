import java.util.Scanner;

public class TicTacToe {
  public static void main(String[] args) {
    /* ------ DO NOT CHANGE START ------ */

    Scanner scanner;
    scanner = new Scanner(System.in);

    /* ------ DO NOT CHANGE END ------ */

    int arr[], i, turn, win, tie, inputChecker, select0, select1, select2, select3, select4, select5, select6, select7, select8, input;
    String num0, num1, num2, num3, num4, num5, num6, num7, num8;
    boolean someBoo0, someBoo1, pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9, pos10, pos11, pos12, pos13, pos14, pos15, pos16, someBoo2, someBoo3;
    boolean isInside, filledIn, valid;
    num0 = "1";
    num1 = "2";
    num2 = "3";
    num3 = "4";
    num4 = "5";
    num5 = "6";
    num6 = "7";
    num7 = "8";
    num8 = "9";

    select0 = 0;
    select1 = 0;
    select2 = 0;
    select3 = 0;
    select4 = 0;
    select5 = 0;
    select6 = 0;
    select7 = 0;
    select8 = 0;
    
    pos1 = false;
    pos2 = false;
    pos3 = false;
    pos4 = false;
    pos5 = false;
    pos6 = false;
    pos7 = false;
    pos8 = false;
    pos9 = false;
    pos10 = false;
    pos11 = false;
    pos12 = false;
    pos13 = false;
    pos14 = false;
    pos15 = false;
    pos16 = false;
    win = 0;
    tie = 0;
    inputChecker = 0;
    arr = new int[9];
    i = 0;
    turn = 0;
    System.out.println(num0 + " | " + num1 + " | " + num2);
    System.out.println(num3 + " | " + num4 + " | " + num5);
    System.out.println(num6 + " | " + num7 + " | " + num8);
    while(win == 0) {
      someBoo2 = true;
      System.out.println("Where would you like to place your piece?");
      input = scanner.nextInt();
      System.out.println("you just entered " + input);
      input = input - 1;
      isInside = !((input > 8) || (input < 0));
      if ((input < 9) && (input > -1)) {
        valid = false;
        if (arr[input] == 0) {
          valid = true;
        } else {
          valid = false;
          while (valid == false) {
            System.out.println("Please choose a different number.");
            input = scanner.nextInt();
            System.out.println("you just entered " + input);
            input = input - 1;
            if ((input < 9) && (input > -1)) {
              if (arr[input] == 0) {
                valid = true;
              }
            }
          }
        }
      } else {
        valid = false;
        while (valid == false) {
          System.out.println("Please choose a different number.");
          input = scanner.nextInt();
          System.out.println("you just entered " + input);
          input = input - 1;
          if ((input < 9) && (input > -1)) {
            if (arr[input] == 0) {
              valid = true;
            }
          }
        }
      }
      
      if (turn == 0) {
        arr[input] = 1;
        if (input == 0) {
          num0 = "X";
        }
        if (input == 1) {
          num1 = "X";
        }
        if (input == 2) {
          num2 = "X";
        }
        if (input == 3) {
          num3 = "X";
        }
        if (input == 4) {
          num4 = "X";
        }
        if (input == 5) {
          num5 = "X";
        }
        if (input == 6) {
          num6 = "X";
        }
        if (input == 7) {
          num7 = "X";
        }
        if (input == 8) {
          num8 = "X";
        }
      } else {
        arr[input] = -1;
        if (input == 0) {
          num0 = "O";
        }
        if (input == 1) {
          num1 = "O";
        }
        if (input == 2) {
          num2 = "O";
        }
        if (input == 3) {
          num3 = "O";
        }
        if (input == 4) {
          num4 = "O";
        }
        if (input == 5) {
          num5 = "O";
        }
        if (input == 6) {
          num6 = "O";
        }
        if (input == 7) {
          num7 = "O";
        }
        if (input == 8) {
          num8 = "O";
        }
      }
      System.out.println(num0 + " | " + num1 + " | " + num2);
      System.out.println(num3 + " | " + num4 + " | " + num5);
      System.out.println(num6 + " | " + num7 + " | " + num8);
      pos1 = ((num0 =="X") && (num3 == "X") && (num6 == "X"));
      pos2 = ((num1 =="X") && (num4 == "X") && (num7 == "X"));
      pos3 = ((num2 == "X") && (num5 == "X") && (num8 == "X"));
      pos4 = ((num0 == "X") && (num1 == "X") && (num2 == "X"));
      pos5 = ((num3 == "X") && (num4 == "X") && (num5 == "X"));
      pos6 = ((num6 == "X") && (num7 == "X") && (num8 == "X"));
      pos7 = ((num0 == "X") && (num4 == "X") && (num8 == "X"));
      pos8 = ((num2 == "X") && (num4 == "X") && (num6 == "X"));
      pos9 = ((num0 == "O") && (num3 == "O") && (num6 == "O"));
      pos10 = ((num1 == "O") && (num4 == "O") && (num7 == "O"));
      pos11 = ((num2 == "O") && (num5 == "O") && (num8 == "O"));
      pos12 = ((num0 == "O") && (num1 == "O") && (num2 == "O"));
      pos13 = ((num3 == "O") && (num4 == "O") && (num5 == "O"));
      pos14 = ((num6 == "O") && (num7 == "O") && (num8 == "O"));
      pos15 = ((num0 == "O") && (num4 == "O") && (num8 == "O"));
      pos16 = ((num2 == "O") && (num4 == "O") && (num6 == "O"));
      if (pos1 || pos2 || pos3 || pos4 || pos5 || pos6 || pos7 || pos8) {
        System.out.println("X wins!");
        win = 1;
      }
      if (pos9 || pos10 || pos11 || pos12 || pos13 || pos14 || pos15 || pos16) {
        System.out.println("O wins!");
        win = -1;
      }
      if (turn == 1) {
        turn = 0;
      } else {
        turn = 1;
      }
      tie = tie + 1;
      if ((tie == 9) && (win == 0)) {
        System.out.println("It is a tie! Play again.");
        win = 2;
      }
    }
  }
}
