import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {

    /*
        A magic square of order n is an arrangement of n × n numbers, usually distinct integers, in a square, such that the n
        numbers in all rows, all columns, and both diagonals sum to the same constant (see Wikipedia: Magic Square).

        We give you two text files: Mercury.txt and Luna.txt. For each file: open the file, and check that all rows
        indeed sum to the same constant.

        Copy both text files to the root directory of your project. This is the directory that contains the src folder.
        Alternative: Use absolute paths to the files (c:\somedir\Mercury.txt on Windows or /Users/myuser/Mercury.txt on Mac)

        You will need to handle or rethrow IOException

        Read the files line by line as explained during the lecture today.

        Use ... = myLine.split("\t"); to break apart each line at the tab character, producing an array of String (String[]),
        each containing one value. Consult the Java API reference for String.split).

        Finally, use ... = Integer.valueOf(substring); to transform each string value into an integer value.

        Optionally, try to check that the columns and the diagonal also sum to the same constant. This is slightly trickier!
     */






    public MagicSquares(){

    }


    public void processFiles(ArrayList<ArrayList<String>> fileList) {

        /**
         * Process each file in the arrayList and load it into an array.
         */
        for (ArrayList<String> currFile: fileList) {

            LoadSquare myChkSqr = new LoadSquare(Integer.valueOf(currFile.get(1)));

            myChkSqr.loadArray(currFile.get(0));
            myChkSqr.checkMagicSquareHorizontal();
            myChkSqr.checkMagicSquareVertical();

        }
    }

    public static void main (String args[]){

        MagicSquares mySquare = new MagicSquares();

        ArrayList<ArrayList<String>> filesToCheckList = new ArrayList<ArrayList<String>>();

        ArrayList<String> x = new ArrayList<>();
        x.add("/Users/Jeff/workspace/java/MIT_6_092/magicSquares/txt/Luna.txt");
        x.add("9");
        filesToCheckList.add(x);

        ArrayList<String> y = new ArrayList<>();
        y.add("/Users/Jeff/workspace/java/MIT_6_092/magicSquares/txt/Mercury.txt");
        y.add("8");
        filesToCheckList.add(y);

        mySquare.processFiles(filesToCheckList);

    }
}
