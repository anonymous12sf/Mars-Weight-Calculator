public class MarsWeightCalculator {
    public static void main(String[] args) {
        // Declare variables
        float earthWeightBielecki = 70.0f; // Earth weight in kg (replace with your actual weight)
        float marsGravityRatio = 0.38f; // Mars gravity relative to Earth

        // Calculate Mars weight
        double marsWeight = earthWeightBielecki * marsGravityRatio;

        // Print Mars weight with 4 decimal places
        System.out.printf("Mars weight (rounded to 4 decimal places): %.4f kg%n", marsWeight);

        // Cast Mars weight to an integer
        int marsWeightInt = (int) marsWeight;
        System.out.println("Mars weight as an integer: " + marsWeightInt);

        // Cast integer weight to a character
        char marsWeightChar = (char) marsWeightInt;
        System.out.println("Mars weight as a character: " + marsWeightChar);

        // Perform a math operation on the character weight
        int modifiedWeight = marsWeightChar + 10;
        System.out.println("Modified weight (char + 10): " + modifiedWeight);
    }
}
