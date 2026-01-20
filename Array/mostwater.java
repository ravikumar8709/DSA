
public class mostwater {

    public static int area(int h[]) {

        // brute force approach with complexity 0(n^2) SC O(1)
        // int ans = 0;
        // for (int i = 0; i < h.length; i++) {
        //     for (int j = i + 1; j < h.length; j++) {
        //         int width = j - i;
        //         int height = Math.min(h[i], h[j]);
        //         int area = width * height;
        //         ans = Math.max(ans, area);
        //     }
        // }
        // return ans;
        // Better approach 
        int l = 0;
        int r = h.length - 1;
        int mostwater = 0;
        while (l < r) {
            int width = r - l;
            int height = Math.min(h[l], h[r]);
            int area = width * height;
            mostwater = Math.max(mostwater, area);
            if (h[l] < h[r]) {
                l++;
            } else {
                r--;
            }

        }
        return mostwater;

    }

    public static void main(String[] args) {
        int h[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        mostwater obj = new mostwater();
        System.out.println(obj.area(h));
    }
}
