package myLibrary;

public class ArrayTools {

    public static String toString(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + " ";
        }
        return s;
    }

    public static void fill(int[] a, int number) {
        for (int i = 0; i < a.length; i++) {
            a[i] = number;
        }
    }

    public static void fillInc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
    }

    public static void fillIncFrom(int[] a, int number) {
        for (int i = 0; i < a.length; i++) {
            a[i] = number++;
        }
    }

    public static void fillWithRandom(int[] a, int min, int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = NumberTools.generateNumber(min, max);
        }
    }

    public static void ArrayMinMaxArit(int[] a) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        boolean isSorted = true;
        int diff = a[1] - a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i + 1];
            }
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i + 1] - a[i] != diff) {
                isSorted = false;
            }
        }
        System.out.format("\nNejmenší číslo v poli je: %s.\nNejvětší číslo v poli je: %s.\nToto %s aritmetická posloupnost", min, max, (isSorted) ? "je" : "není");
    }

    public static int indexOfFirst(int[] a, int number) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfLast(int[] a, int number) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int[] reverseArrayCopy(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        return b;
    }

    public static int[] reverseArrayInArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp;
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        return a;
    }

    /**
     * ÚKOL
     * úlohy 6
     * 9. cvičení - bankovky výčet
     * 5. cvičení - Eratosthenovo síto
     */

    public static void main(String[] args) {
        int[] b = {1, 2, 6, 4, 5, 6, 7};
        //ArrayToolsUI.displayArray(b);
        //ArrayMinMaxArit(b);
        //System.out.println();
        //ArrayToolsUI.displayArray(b);
        //System.out.println("\n" + toString(b));
        //fill(b, 6);
        //ArrayToolsUI.displayArray(b);
        //System.out.println();
        //fillInc(b);
        //ArrayToolsUI.displayArray(b);
        //System.out.println();
        //fillIncFrom(b, 5);
        //ArrayToolsUI.displayArray(b);
        //fillWithRandom(b, 1, 15);
        //System.out.println();
        //ArrayToolsUI.displayArray(b);
        ArrayToolsUI.show(b);
        //System.out.format("\nIndex čísla je: %s", indexOfFirst(b, 6));
        //System.out.format("\nIndex čísla je: %s", indexOfLast(b, 6));
        System.out.println();
        ArrayToolsUI.show(reverseArrayCopy(b));
        System.out.println();
        ArrayToolsUI.show(reverseArrayInArray(b));
    }
}
