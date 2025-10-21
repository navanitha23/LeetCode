class Solution {
    public List<String> commonChars(String[] words) {

        List<String> res = new ArrayList<>();
        int[] chars = new int[26];

        Arrays.fill(chars, Integer.MAX_VALUE);

        int[] tmp = new int[26];
        for (String word : words) {
            Arrays.fill(tmp, 0);

            for (char ch : word.toCharArray()) {
                tmp[ch - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if (chars[i] > tmp[i]) {
                    chars[i] = tmp[i];
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            for (int count = 0; count < chars[i]; count++) {
                res.add(String.valueOf((char) (i + 'a')));
            }
        }

        return res;
    }
}