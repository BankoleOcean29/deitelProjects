package chapterTwo;

public class CheckBoard {

    public static String squareFillPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int outerCounter = 1; outerCounter <= 6; outerCounter++) {
            for (int counter = 1; counter <= 11; counter++) {
                if (counter % 2 == 1)
                    stringBuilder.append(asterisk);
                else
                    stringBuilder.append(space);
            }

            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }


    public static String numberTriangular(char one, char two, char three, char four) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 4)
                stringBuilder.append(one);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 3 || counter == 5)
                stringBuilder.append(two);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 2 || counter == 4 || counter == 6)
                stringBuilder.append(three);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter <= 7; counter++) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }
        return stringBuilder.toString();
    }


    public static String squareHollowPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 0; counter < 9; counter++) {
            if (counter % 2 == 0)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }


        for (int outerCounter = 1; outerCounter <= 4; outerCounter++) {
            stringBuilder.append(System.lineSeparator());
            for (int counter = 0; counter < 9; counter++) {
                if (counter == 0 || counter == 8)
                    stringBuilder.append(asterisk);
                else
                    stringBuilder.append(space);
            }
        }

        stringBuilder.append(System.lineSeparator());
        for (int counter = 0; counter < 9; counter++) {
            if (counter % 2 == 0)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        return stringBuilder.toString();
    }


    public static String numberIncreasingPyramid(char one, char two, char three, char four) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(one);
        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 3; counter++) {
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 5; counter++) {
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1 || counter == 3)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1 || counter == 3 || counter == 5)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
            if (counter == 5)
                stringBuilder.append(four);
        }

        return stringBuilder.toString();
    }


    public static String numberIncreasingReversePyramid(char one, char two, char three, char four) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1 || counter == 3 || counter == 5)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
            if (counter == 5)
                stringBuilder.append(four);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 5; counter++) {
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1 || counter == 3)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
        }
        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 3; counter++) {
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(two);
        }

        stringBuilder.append(System.lineSeparator());
        stringBuilder.append(one);

        return stringBuilder.toString();
    }


    public static String palindromeTriangular(char one, char two, char three, char four) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 7)
                stringBuilder.append(one);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 7)
                stringBuilder.append(one);
            if (counter == 5 || counter == 8)
                stringBuilder.append(two);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 7)
                stringBuilder.append(one);
            if (counter == 5 || counter == 9)
                stringBuilder.append(two);
            if (counter == 3 || counter == 11)
                stringBuilder.append(three);
            if (counter == 1 || counter == 2 || counter == 4 ||
                    counter == 6 || counter == 8 || counter == 10 ||
                    counter == 12 || counter == 13)
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 7)
                stringBuilder.append(one);
            if (counter == 5 || counter == 9)
                stringBuilder.append(two);
            if (counter == 3 || counter == 11)
                stringBuilder.append(three);
            if (counter == 1 || counter == 13)
                stringBuilder.append(four);
            if (counter == 2 || counter == 4 || counter == 6 || counter == 8 ||
                    counter == 10 || counter == 12)
                stringBuilder.append(space);
        }

        return stringBuilder.toString();
    }

    public static String zeroOneTriangle(char one, char zero) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(one);
        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 3; counter++) {
            if (counter == 0)
                stringBuilder.append(zero);
            if (counter == 1)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(one);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 5; counter++) {
            if (counter == 0)
                stringBuilder.append(one);
            if (counter == 1 || counter == 3)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(zero);
            if (counter == 4)
                stringBuilder.append(one);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0)
                stringBuilder.append(zero);
            if (counter == 1 || counter == 3 || counter == 5)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(one);
            if (counter == 4)
                stringBuilder.append(zero);
            if (counter == 5)
                stringBuilder.append(one);
        }

        return stringBuilder.toString();
    }


    public static String numberChangingPyramid(char one, char two, char three, char four,
                                               char five, char six, char seven,
                                               char eight, char nine, int ten) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(one);
        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 3; counter++) {
            if (counter == 0)
                stringBuilder.append(two);
            if (counter == 1)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(three);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 5; counter++) {
            if (counter == 0)
                stringBuilder.append(four);
            if (counter == 1 || counter == 3)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(five);
            if (counter == 4)
                stringBuilder.append(six);
        }
        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0)
                stringBuilder.append(seven);
            if (counter == 1 || counter == 3 || counter == 5)
                stringBuilder.append(space);
            if (counter == 2)
                stringBuilder.append(eight);
            if (counter == 4)
                stringBuilder.append(nine);
            if (counter == 5)
                stringBuilder.append(ten);
        }
        return stringBuilder.toString();
    }


    public static String rhombusPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 10; counter++) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 10; counter++) {
            if (counter == 2 || counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 10; counter++) {
            if (counter == 3 || counter == 5 || counter == 7 || counter == 9)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 10; counter++) {
            if (counter == 4 || counter == 6 || counter == 8 || counter == 10)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        return stringBuilder.toString();

    }


    public static String diamondPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 4)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 3 || counter == 5)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 2 || counter == 4 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 2 || counter == 4 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 3 || counter == 5)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 4)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        return stringBuilder.toString();
    }


    public static String butterflyStarPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 1 || counter == 13)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 3 || counter == 11)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 1 || counter == 5 || counter == 9 || counter == 13)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 3 || counter == 7 || counter == 11)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 1 || counter == 5 || counter == 9 || counter == 13)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 3 || counter == 11)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());


        for (int counter = 1; counter <= 13; counter++) {
            if (counter == 1 || counter == 13)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        return stringBuilder.toString();
    }


    public static String rightHalfPyramid(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(asterisk);
        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 3; counter++) {
            if (counter == 0 || counter == 2)
                stringBuilder.append(asterisk);
            if (counter == 1)
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 5; counter++) {
            if (counter == 0 || counter == 2 || counter == 4)
                stringBuilder.append(asterisk);
            if (counter == 1 || counter == 3)
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0 || counter == 2 || counter == 4 || counter == 6)
                stringBuilder.append(asterisk);
            if (counter == 1 || counter == 3 || counter == 5)
                stringBuilder.append(space);
        }

        return stringBuilder.toString();
    }


    public static String reverseRightHalfPyramid(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 0 || counter == 2 || counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 0 || counter == 2 || counter == 4 || counter == 6 )
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 0 || counter == 2 || counter == 4 )
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 0 || counter == 2)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        stringBuilder.append(asterisk);

        return stringBuilder.toString();
    }


    public static String leftHalfPyramid(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 0; counter < 9; counter++){
            if(counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++){
            if(counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++){
            if(counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++){
            if(counter == 2 || counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++){
            if(counter == 0 || counter == 2 || counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        return stringBuilder.toString();
    }

    public static String reverseTriangleStarPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 0; counter <= 9; counter++) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter <= 9; counter++) {
            if (counter == 2 || counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 3 || counter == 5 || counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 4 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 5)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());


        return stringBuilder.toString();
    }


    public static String reverseLeftHalfPyramid(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 0 || counter == 2 || counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if ( counter == 2 || counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        return stringBuilder.toString();
    }


    public static String kPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0 || counter == 2 || counter == 4 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0 || counter == 2 || counter == 4)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0 || counter == 2)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0 || counter == 2)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0 || counter == 2 || counter == 4)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 0 || counter == 2 || counter == 4 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }




        return stringBuilder.toString();




    }


    public static String triangleStarPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 5)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 4 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 9; counter++) {
            if (counter == 3 || counter == 5 || counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter <= 9; counter++) {
            if (counter == 2 || counter == 4 || counter == 6 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter <= 9; counter++) {
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }



        return stringBuilder.toString();
    }


    public static String reverseNumberTriangularPattern(char one, char two, char three, char four) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 1)
                stringBuilder.append(one);
            if (counter == 3)
                stringBuilder.append(two);
            if (counter == 5)
                stringBuilder.append(three);
            if (counter == 7)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
            if (counter == 6)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 3)
                stringBuilder.append(three);
            if (counter == 5)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 4)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        return stringBuilder.toString();
    }

    public static String mirrorImageTrianglePattern(char one, char two, char three, char four) {

        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 1)
                stringBuilder.append(one);
            if (counter == 3)
                stringBuilder.append(two);
            if (counter == 5)
                stringBuilder.append(three);
            if (counter == 7)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
            if (counter == 6)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 3)
                stringBuilder.append(three);
            if (counter == 5)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 4)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 3)
                stringBuilder.append(three);
            if (counter == 5)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 0; counter < 7; counter++) {
            if (counter == 2)
                stringBuilder.append(two);
            if (counter == 4)
                stringBuilder.append(three);
            if (counter == 6)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++) {
            if (counter == 1)
                stringBuilder.append(one);
            if (counter == 3)
                stringBuilder.append(two);
            if (counter == 5)
                stringBuilder.append(three);
            if (counter == 7)
                stringBuilder.append(four);
            else
                stringBuilder.append(space);
        }

        return stringBuilder.toString();
    }


    public static String hollowTrianglePattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 5)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 4 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 3 || counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 2 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        return  stringBuilder.toString();

    }


    public static String hollowReverseTrianglePattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 2 || counter == 8)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 3 || counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 4 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 9; counter++){
            if (counter == 5)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        return  stringBuilder.toString();

    }


    public static String hollowDiamondPyramid(char asterisk){
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 13; counter++){
            if ( counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++){
            if ( counter == 5 || counter == 9)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++){
            if ( counter == 3 || counter == 11)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++){
            if ( counter == 1 || counter == 13)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++){
            if ( counter == 3 || counter == 11)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());


        for (int counter = 1; counter <= 13; counter++){
            if ( counter == 5 || counter == 9)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 13; counter++){
            if ( counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        return  stringBuilder.toString();
    }

    public static String hollowHourglassPattern(char asterisk) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();

        for (int counter = 1; counter <= 7; counter++){
            if ( counter == 1 || counter == 3 || counter == 5 || counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++){
            if ( counter == 2 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());


        for (int counter = 1; counter <= 7; counter++){
            if ( counter == 3 || counter == 5)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++){
            if ( counter == 4)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++){
            if ( counter == 3 || counter == 5)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++){
            if ( counter == 2 || counter == 6)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }

        stringBuilder.append(System.lineSeparator());

        for (int counter = 1; counter <= 7; counter++){
            if ( counter == 1 || counter == 3 || counter == 5 || counter == 7)
                stringBuilder.append(asterisk);
            else
                stringBuilder.append(space);
        }



        return stringBuilder.toString();


}


public static String pascalTriangle(char one, char two, char three){
    String space = " ";
    StringBuilder stringBuilder = new StringBuilder();

    for (int counter = 1; counter <= 7; counter++){
        if (counter == 4)
            stringBuilder.append(one);
        else
            stringBuilder.append(space);
    }

    stringBuilder.append(System.lineSeparator());

    for (int counter = 1; counter <= 7; counter++){
        if (counter == 3 || counter == 5)
            stringBuilder.append(one);
        else
            stringBuilder.append(space);
    }

    stringBuilder.append(System.lineSeparator());

    for (int counter = 1; counter <= 7; counter++){
        if (counter == 2 || counter == 5)
            stringBuilder.append(one);
        if (counter == 3)
            stringBuilder.append(two);
        else
            stringBuilder.append(space);
    }

    stringBuilder.append(System.lineSeparator());

    for (int counter = 1; counter <= 7; counter++){
        if (counter == 1 || counter == 6)
            stringBuilder.append(one);
        if (counter == 2 || counter == 4)
            stringBuilder.append(three);
        else
            stringBuilder.append(space);
    }

    return stringBuilder.toString();

}

public static String rightPascalTriangle(char asterisk){
    String space = " ";
    StringBuilder stringBuilder = new StringBuilder();

    for (int counter = 1; counter <= 8; counter++){
        if (counter == 1)
            stringBuilder.append(asterisk);
        else
            stringBuilder.append(space);
    }

    stringBuilder.append(System.lineSeparator());

    for (int counter = 1; counter <= 8; counter++){
        if (counter == 3)
            stringBuilder.append(asterisk);
        else
            stringBuilder.append(space);
    }

    stringBuilder.append(System.lineSeparator());

    for (int counter = 1; counter <= 8; counter++){
        if (counter == 1 || counter == 5)
            stringBuilder.append(asterisk);
        else
            stringBuilder.append(space);
    }

    stringBuilder.append(System.lineSeparator());

    for (int counter = 1; counter <= 8; counter++){
        if (counter == 3 || counter == 8)
            stringBuilder.append(asterisk);
        else
            stringBuilder.append(space);
    }

    stringBuilder.append(System.lineSeparator());

    for (int counter = 1; counter <= 8; counter++){
        if (counter == 1 || counter == 5)
            stringBuilder.append(asterisk);
        else
            stringBuilder.append(space);
    }

    stringBuilder.append(System.lineSeparator());

    for (int counter = 1; counter <= 8; counter++){
        if (counter == 3)
            stringBuilder.append(asterisk);
        else
            stringBuilder.append(space);
    }

    stringBuilder.append(System.lineSeparator());

    for (int counter = 1; counter <= 8; counter++){
        if (counter == 1)
            stringBuilder.append(asterisk);
        else
            stringBuilder.append(space);
    }

    return stringBuilder.toString();
    }

    public static String demoMethod(String params){

        String result = params + "me";

        String mysql = "name is bankole";

        return result;
    }


}