import java.util.ArrayList;

public class MaxNonNegativeSubArray {
    private int bestStart, bestLength, bestSum, N;
    private MyArrayList A;

    public MaxNonNegativeSubArray(MyArrayList A) {
        bestStart = bestLength = bestSum = 0;
        this.A = A;
        N = A.size();
    }

    public MyArrayList play() {
        int i = 0;
        while (i < N) {
            while (i < N && A.get(i) < 0) i++;
            if (i == N) break;
            int curStart = i, curLength = 0, curSum = 0;
            while (i < N && A.get(i) >= 0) {
                curLength++;
                curSum += A.get(i);
                i++;
            }
            if (curSum > bestSum ||
                    (curSum == bestSum && curLength > bestLength)) {
                bestStart = curStart;
                bestLength = curLength;
                bestSum = curSum;
            }
        }
        MyArrayList res = new MyArrayList();
        res.addAll(A.subList(bestStart, bestStart + bestLength));
        return res;
    }
}
