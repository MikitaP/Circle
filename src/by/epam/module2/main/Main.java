package by.epam.module2.main;


import java.util.ArrayList;

import by.epam.module2.figure.Circle;
import by.epam.module2.reader.Input;
import by.epam.module2.calc.Calculate;
import by.epam.module2.writer.Print;

public class Main {

    public static void main(String[] args) {
        ArrayList<Circle> inputList = Input.readFile();
        Print.writeFile(inputList, Calculate.calcLength(inputList), Calculate.calcSquare(inputList));
    }
}