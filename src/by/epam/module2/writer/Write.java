package by.epam.module2.writer;

import by.epam.module2.figure.Circle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Write {
    private static final String FILE_PATH;

    static {
        FILE_PATH = "data\\out_result.txt";
    }

    public static void writeFile(ArrayList<Circle> inputRadius,ArrayList<Circle> resultLengthList,ArrayList<Circle> resultSquareList) {
        String textToWrite = "";
        String radiusText = "Radius = ";
        String lengthText = "Circumference = ";
        String squareText = "Area = ";
        for (int i = 0; i < resultLengthList.size(); i++) {
            textToWrite += new StringBuilder().append(radiusText).append(inputRadius.get(i).getRadius()).append("  ").append(lengthText).append(resultLengthList.get(i).getRadius()).append("  ").append(squareText).append(resultSquareList.get(i).getRadius()).append("\n").toString();
        }
        File file = new File(FILE_PATH);
        boolean isCreated = true;
        if (file.exists()) {
            isCreated = false;
        }
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(textToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                if (isCreated) {
                    System.out.println("File was created");
                } else {
                    System.out.println("File was overwritten");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}