package Lab_7;
import java.util.Scanner;
public class Task_1 {
  	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean b = true;       //да, обычная переменная типа boolean
		i = (int)b;             //нет, 1)не указан тип i; 2)boolean не переводится в int
		int i = 1;              //да, обычная переменная типа int
		boolean b = (boolean)i; //int не переводится в boolean
	}
}
