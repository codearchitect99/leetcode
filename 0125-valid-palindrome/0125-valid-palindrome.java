class Solution {
    public boolean isPalindrome(String s) {
        List<Character> sList = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sList.add(Character.toLowerCase(c));
            }
        }

        int listCount = (sList.size() % 2 == 0) ? sList.size() / 2 : sList.size() / 2 + 1;
        for (int i = 0; i < listCount; i++) {
            if (sList.get(i) != sList.get(sList.size() - 1 - i)) return false;
        }
        return true;
    }
}