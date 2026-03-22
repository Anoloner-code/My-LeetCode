class Solution {
    public String convert(String s, int numRows) {
        List<StringBuilder> rows = new ArrayList<>();
        if (numRows == 1) return s;
        int currentrow = 0;
        int direction = -1; // 1 for down, -1 for up
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        for (int i = 0; i < s.length(); i++) {
            rows.get(currentrow).append(s.charAt(i));
            if (currentrow == 0 || currentrow == numRows - 1) {
                direction *= -1;
        }
            currentrow += direction;
        }
        StringBuilder finalstring = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            finalstring.append(rows.get(i));
        }
        return finalstring.toString();
    }
}
