import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LoadSquare {

    int arraySize;
    public int[][] magicArray;
    FileReader fr;
    public BufferedReader br;

    public LoadSquare(int arrSize) {

        arraySize = arrSize;
        this.magicArray = new int[arraySize][arraySize];
    }

    public void loadArray(String fileName) {
        /**
         * Load the current file into a 2-d array
         */
        int arrayLine = 0;
        System.out.println("Processing " + fileName);

        try {

            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line = null;

            while ((line = br.readLine()) != null) {

                if (!line.equals("")) {

                    processLine(line, arrayLine);
                    arrayLine++;

                } else {

                    // System.out.println("empty line");
                }

            }

            br.close();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
        }
    }

    private void processLine(String inLine, int i){

        System.out.println("Processing " + inLine);
        String[] tString = inLine.split("\t");

        int y = 0;
        for(String s: tString){

            magicArray[i][y] = Integer.valueOf(s);
            y++;

        }

    }


    public void checkMagicSquareHorizontal(){

        int[] lineTotals = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            int lineTotal = 0;
            for(int j = 0; j < arraySize; j++){
                lineTotal += magicArray[i][j];
            }
            lineTotals[i] = lineTotal;
        }
        boolean totalsMatch = true;

        for(int i = 0; i < lineTotals.length; i++) {
            if (i < (lineTotals.length - 1)) {

                if (!(lineTotals[i] == lineTotals[i + 1])){
                    totalsMatch = false;
                    System.out.println("Mismatched totals in line " + i + " and " + (i+1));
                }

            }
        }

        if (totalsMatch){
            System.out.println("Horizontal totals match in square!");
        }
    }

    public void checkMagicSquareVertical() {

        int[] lineTotals = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            int lineTotal = 0;
            for(int j = 0; j < arraySize; j++){
                int tt = magicArray[j][i];
                lineTotal += magicArray[j][i];
            }
            lineTotals[i] = lineTotal;
        }
        boolean totalsMatch = true;

        for(int i = 0; i < lineTotals.length; i++) {
            if (i < (lineTotals.length - 1)) {

                if (!(lineTotals[i] == lineTotals[i + 1])){
                    totalsMatch = false;
                    System.out.println("Mismatched totals in line " + i + " and " + (i+1));
                }

            }
        }

        if (totalsMatch){
            System.out.println("Vertical totals match in square!");
        }
    }

} // end of class

