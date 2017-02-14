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
    private static final double invalidRadius = 0.0;
    public static ArrayList<Circle> readFile() throws FileNotFoundException

    {
        Scanner sc = new Scanner(new File(FILE_PATH));
        ArrayList<Circle> list = new ArrayList<>();
        while (sc.hasNext()) {
            String currVal;
            try {
                currVal = sc.nextLine();
                if (Double.parseDouble(currVal) > 0) {
                    list.add(new Circle(Double.parseDouble(currVal)));
                } else {
                    //System.out.println("Incorrect radius: " + currVal);
                    list.add(new Circle(invalidRadius));
                }
            } catch (NumberFormatException e) {
                //System.out.println("Incorrect radius: " + currVal);
                list.add(new Circle(invalidRadius));
            }
        }
        return list;
    }
}