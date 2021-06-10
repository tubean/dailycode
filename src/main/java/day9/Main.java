package day9;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        solution(() -> System.out.println("Hello World"), 10000);
    }

    public static void solution(Command command, int n) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                command.execute();
            }
        }, n);

    }

    interface Command {
        void execute();
    }

}
