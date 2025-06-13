class CPU {
    public int register = 0;
    public int[] memory = {5, 10, 0};

    private static final int LOAD = 1;
    private static final int SAVE = 2;
    private static final int ADD = 3;
    private static final int SUB = 4;
    private static final int HALT = 5;

    private int[][] program = {
            { LOAD, 0},
            { ADD, 1},
            { SAVE, 2},
            { HALT, 0}
    };

    public void xexcuteprogram() {
        int pc = 0;

        while (true) {
            int opcode = program[pc][0];
            int operand = program[pc][1];

            switch (opcode) {
                case LOAD:
                    register = memory[operand];
                    System.out.println("MOV: Loding memory[" + operand + " (" + memory[0] + ") into register.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args){

    }
}