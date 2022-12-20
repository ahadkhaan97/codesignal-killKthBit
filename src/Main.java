public class Main {
    public static void main(String[] args) {
        System.out.println(solution(2147483647, 31));
    }

    //simplified solution
    @SuppressWarnings("SameParameterValue")
    static int solution(int n, int k) {
        String binary = Integer.toBinaryString(n);
        if (n == 0)
            return 0;
        else {
            if (binary.length() > k) {
                String first = binary.substring(0, binary.length() - k);
                String second = binary.substring(binary.length() - k + 1);
                String finalString = first + '0' + second;
                return Integer.parseInt(finalString, 2);
            } else {
                return n;
            }
        }
    }

    //submitted solution
    static int mySolution(int n, int k) {
        return n == 0 ? 0 :
                Integer.toBinaryString(n).length() >= k ? Integer.parseInt(Integer.toBinaryString(n).substring(0, Integer.toBinaryString(n).length() - k) + '0' +
                        Integer.toBinaryString(n).substring(Integer.toBinaryString(n).length() - k + 1), 2) : n;
    }
}