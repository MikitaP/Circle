package by.epam.module2.reader;

import by.epam.module2.figure.Circle;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Input {

    private static final String FILE_PATH;

    static {
        FILE_PATH = "data\\in_file_radius.txt";
    }

    private static final double INVALID_RADIUS = 0.0;

    public static ArrayList<Circle> readFile()

    {
        ArrayList<Circle> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(FILE_PATH));

            while (sc.hasNext()) {
                String currVal;
                try {
                    currVal = sc.nextLine();
                    if (Double.parseDouble(currVal) > 0) {
                        list.add(new Circle(Double.parseDouble(currVal)));
                    } else {
                        //System.out.println("Incorrect radius: " + currVal);
                        list.add(new Circle(INVALID_RADIUS));
                    }
                } catch (NumberFormatException e) {
                    //System.out.println("Incorrect radius: " + currVal);
                    list.add(new Circle(INVALID_RADIUS));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}