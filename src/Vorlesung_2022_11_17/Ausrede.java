package Vorlesung_2022_11_17;

public class Ausrede {

    public static void main(String[] args) {
        String[] a = {"Unmittelbare", "Überraschende", "Zufällige", "Unvorhersebare", "Denkenswerte"};
        String[] b = {"private", "galaktische", "atmosphärische", "wetter-bedingte", "kuriose"};
        String[] c = {"Ausfälle", "Störungen", "Pausen", "Unterbrechungen", "Fehler"};
        String[] d = {"der Konzentration", "der Straßenbahn", "des Füllers", "des Computers", "des Handys"};

        int n = a.length * b.length * c.length * d.length;
        String[] ausreden = new String[n];

        /*for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    for (int l = 0; l < d.length; l++) {
                        ausreden[i * b.length * c.length * d.length + j * c.length * d.length + k * d.length + l] = a[i] + " " + b[j] + " " + c[k] + " " + d[l];
                    }
                }
            }
        }*/

        int i = 0;

        for (String eins: a) {
            for (String zwei: b) {
                for (String drei: c) {
                    for (String vier: d) {
                        ausreden[i++] = eins + " " + zwei + " " + drei + " " + vier;
                    }
                }
            }
        }
        
        int random = (int) (Math.random() * n);
        System.out.println(ausreden[random]);

    }
}