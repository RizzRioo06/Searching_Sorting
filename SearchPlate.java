public class SearchPlate {
    public static int findPlateIter(String[] plates, String plate) {
        for (int i = 0; i < plates.length; i++)
            if (plates[i].equals(plate))
                return i;
        return -1;
    }

    public static int findPlateRec(String[] plates, String plate, int i) {
        if (i >= plates.length)
            return -1;
        return plates[i].equals(plate) ? i : findPlateRec(plates, plate, i + 1);
    }

    public static void main(String[] args) {
        String[] plates = { "YGN1234", "MDY4567", "NPT1111" };
        String target = "MDY4567";
        System.out.println("Iterative: " + findPlateIter(plates, target));
        System.out.println("Recursive: " + findPlateRec(plates, target, 0));
    }
}
// This code demonstrates both iterative and recursive approaches to search for
// a vehicle plate number in an array of strings.
// The iterative method uses a for loop to check each element, while the
// recursive method checks the current index and calls itself for the next
// index.