public class LicensePlateSearch {
    public static boolean checkPrefix(String plate) {
        return plate.startsWith("YGN");
    }

    public static boolean plateSearch(String[] plates, String target) {
        for (String plate : plates) {
            if (checkPrefix(plate) && plate.equals(target))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] plates = { "YGN1234", "MDY9090", "YG7777", "NPT8888" };
        String target = "NPT8888";
        System.out.println(plateSearch(plates, target) ? "Found in YGN" : "Not Found");
    }
}
// This code checks if a given license plate number starts with "YGN" and
// searches for it in an array of strings.
// The `checkPrefix` method checks if the plate starts with "YGN", and the
// `plateSearch` method searches for the target plate in the array.