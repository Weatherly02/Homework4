package edu.dmacc.codedsm.hw4;

public class VariableAdder {
        private int RedRoseCost = 2;
        private final int DOZEN_ROSES = 12;

        public static void main(String[] args) {
            int totalCost = 24;

            VariableAdder adder = new VariableAdder();
            VariableAdder adder2 = new VariableAdder();

            int results = (adder.RedRoseCost + adder2.DOZEN_ROSES + totalCost);

            System.out.println(adder.RedRoseCost);
            System.out.println(adder2.DOZEN_ROSES);
            System.out.println(totalCost);
            System.out.println(results);

                                    }

        }


