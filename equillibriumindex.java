public class equillibriumindex {
    public static int findEquilibriumIndex(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) { 
                return i;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int equilibriumIndex = findEquilibriumIndex(arr);

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium Index: " + equilibriumIndex);
        } else {
            System.out.println("No Equilibrium Index found.");
        }
    }
}
