package sample;







import static java.lang.System.exit;
import java.util.Scanner;
import java.util.*;

public class stack {

    Scanner in = new Scanner(System.in);
    ArrayList A = new ArrayList<>();
    int top = -1, limit;

    stack() {
        System.out.println("Enter Limit of Stack");
        limit = in.nextInt();
    }

    void push(int x) {
        if (top >= limit) {
            System.out.println("OverFlow..Push Function Will not work\n");
        } else {
            A.add(++top, x);
        }
    }

    void pop() {
        if (top < 0) {
            System.out.println("UnderFlow..Stack is Empty\n");
        } else if (top >= 0) {
            System.out.println("\nPop Function Executed...\nValue = " + A.remove(top--));

        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(A.get(i) + "\n");

        }
    }

    public static void main(String[] args) {

        stack A = new stack();
        
        int op, l, m, op1;
        float f;
        String s;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nEnter Value\n");
                    m = in.nextInt();
                    A.push(m);
                    break;

                case 2:
                    A.pop();
                    break;

                case 3:
                    A.display();
                    break;
                case 4:
                    exit(0);
            }

        } while (true);

    }
}


