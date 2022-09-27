package Logic;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int i;
        String number = "";
        int[] arrayCifras;

        do {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the first value, which will be the times to repeat");
            System.out.println("With a comma , we separate the other values that will be the ones that");
            System.out.println("They will be shown as the 7-segment display");
            System.out.println("Example: 2,183");
            System.out.print("Number to enter -> ");
            number = in.nextLine();

            String firstNumber = number.split(",")[0];//1000
            String decimals = number.split(",")[1];//183

            int numberOfRepetition = Integer.parseInt(firstNumber);

            if (numberOfRepetition <= 5) {

                arrayCifras = new int[decimals.length()];

                for (i = 0; i < decimals.length(); i++) {
                    arrayCifras[i] = Integer.parseInt(String.valueOf(decimals.charAt(i)));
                    System.out.printf("%d", arrayCifras[i]);
                }
                String[][] arrayDisplay = new String[decimals.length()][7];
                System.out.println("");


                for (i = 0; i < decimals.length(); i++) {
                    if (arrayCifras[i] <= 5) {
                        switch (arrayCifras[i]) {
                            case 0: {
                                arrayDisplay[i][0] = "---";
                                arrayDisplay[i][1] = "|";
                                arrayDisplay[i][2] = "|";
                                arrayDisplay[i][3] = "   ";
                                arrayDisplay[i][4] = "|";
                                arrayDisplay[i][5] = "|";
                                arrayDisplay[i][6] = "---";
                                break;
                            }
                            case 1: {
                                arrayDisplay[i][0] = "   ";
                                arrayDisplay[i][1] = " ";
                                arrayDisplay[i][2] = "|";
                                arrayDisplay[i][3] = "   ";
                                arrayDisplay[i][4] = " ";
                                arrayDisplay[i][5] = "|";
                                arrayDisplay[i][6] = "   ";
                                break;
                            }
                            case 2: {
                                arrayDisplay[i][0] = "---";
                                arrayDisplay[i][1] = " ";
                                arrayDisplay[i][2] = "|";
                                arrayDisplay[i][3] = "---";
                                arrayDisplay[i][4] = "|";
                                arrayDisplay[i][5] = " ";
                                arrayDisplay[i][6] = "---";
                                break;
                            }
                            case 3: {
                                arrayDisplay[i][0] = "---";
                                arrayDisplay[i][1] = " ";
                                arrayDisplay[i][2] = "|";
                                arrayDisplay[i][3] = "---";
                                arrayDisplay[i][4] = " ";
                                arrayDisplay[i][5] = "|";
                                arrayDisplay[i][6] = "---";
                                break;
                            }
                            case 4: {
                                arrayDisplay[i][0] = "   ";
                                arrayDisplay[i][1] = "|";
                                arrayDisplay[i][2] = "|";
                                arrayDisplay[i][3] = "---";
                                arrayDisplay[i][4] = " ";
                                arrayDisplay[i][5] = "|";
                                arrayDisplay[i][6] = " ";
                                break;
                            }
                            case 5: {
                                arrayDisplay[i][0] = "---";
                                arrayDisplay[i][1] = "|";
                                arrayDisplay[i][2] = " ";
                                arrayDisplay[i][3] = "---";
                                arrayDisplay[i][4] = " ";
                                arrayDisplay[i][5] = "|";
                                arrayDisplay[i][6] = "---";
                                break;
                            }
                            case 6: {
                                arrayDisplay[i][0] = "---";
                                arrayDisplay[i][1] = "|";
                                arrayDisplay[i][2] = " ";
                                arrayDisplay[i][3] = "---";
                                arrayDisplay[i][4] = "|";
                                arrayDisplay[i][5] = "|";
                                arrayDisplay[i][6] = "---";
                                break;
                            }
                            case 7: {
                                arrayDisplay[i][0] = "---";
                                arrayDisplay[i][1] = " ";
                                arrayDisplay[i][2] = "|";
                                arrayDisplay[i][3] = "   ";
                                arrayDisplay[i][4] = " ";
                                arrayDisplay[i][5] = "|";
                                arrayDisplay[i][6] = "   ";
                                break;
                            }
                            case 8: {
                                arrayDisplay[i][0] = "---";
                                arrayDisplay[i][1] = "|";
                                arrayDisplay[i][2] = "|";
                                arrayDisplay[i][3] = "---";
                                arrayDisplay[i][4] = "|";
                                arrayDisplay[i][5] = "|";
                                arrayDisplay[i][6] = "---";
                                break;
                            }
                            case 9: {
                                arrayDisplay[i][0] = "---";
                                arrayDisplay[i][1] = "|";
                                arrayDisplay[i][2] = "|";
                                arrayDisplay[i][3] = "---";
                                arrayDisplay[i][4] = " ";
                                arrayDisplay[i][5] = "|";
                                arrayDisplay[i][6] = "---";
                                break;
                            }
                        }
                    } else {
                        System.out.println("Please enter data less than or equal to five digits. Example: 5.12345");
                        System.exit(0);
                    }
                }

                for (int j = 0; j < numberOfRepetition; j++) {
                    System.out.println("Repetition " + (j + 1) + " of " + numberOfRepetition);
                    for (i = 0; i < decimals.length(); i++) {
                        System.out.printf(" %s  ", arrayDisplay[i][0]);
                    }
                    System.out.println("");
                    for (i = 0; i < decimals.length(); i++) {
                        System.out.printf("%s   %s ", arrayDisplay[i][1], arrayDisplay[i][2]);
                    }
                    System.out.println("");
                    for (i = 0; i < decimals.length(); i++) {
                        System.out.printf(" %s  ", arrayDisplay[i][3]);
                    }
                    System.out.println("");
                    for (i = 0; i < decimals.length(); i++) {
                        System.out.printf("%s   %s ", arrayDisplay[i][4], arrayDisplay[i][5]);
                    }
                    System.out.println("");
                    for (i = 0; i < decimals.length(); i++) {
                        System.out.printf(" %s  ", arrayDisplay[i][6]);
                    }
                    System.out.println("");
                    System.out.println("\n");

                }

            } else {
                System.out.println("Enter a number that is equal to or less than five" +
                        "\nre-run the code");
                System.exit(0);
            }
        } while (number.equals("0,0"));
    }

}
