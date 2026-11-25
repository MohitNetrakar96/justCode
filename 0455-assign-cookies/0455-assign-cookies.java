class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l=0; int r=0;
        Arrays.sort(g);
        Arrays.sort(s);

        int m =s.length;
        int n=g.length;

       while (r < n && l < m) {
            if (g[r] <= s[l]) {
                r++;
            }
            l++;
        }
        return r;
    }
}