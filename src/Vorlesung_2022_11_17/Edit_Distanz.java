package Vorlesung_2022_11_17;

public class Edit_Distanz {

    public static void main(String[] args) {

        String s1 = "DHBW Mannheim";
        String s2 = "Maimarkt Mannheim";

        int[][] edit = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i < edit.length; i++){
            edit[i][0] = i;
        }

        for (int j = 0; j < edit[0].length; j++){
            edit[0][j] = j;
        }

        for (int i = 1; i < edit.length; i++){
            for (int j = 1; j < edit[0].length; j++){
                if (s1.charAt(i - 1) == s2.charAt(j - 1)){
                    edit[i][j] = edit[i - 1][j - 1];
                } else {
                    edit[i][j] = Math.min(edit[i - 1][j - 1], Math.min(edit[i - 1][j], edit[i][j - 1])) + 1;
                }
            }
        }

        System.out.println(edit[s1.length()][s2.length()]);

    }
}