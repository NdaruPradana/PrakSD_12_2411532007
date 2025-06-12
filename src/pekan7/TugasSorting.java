package pekan7;

public class TugasSorting {
    public static void main(String[] args) {
        char[] data = new char[26];
        for (int i = 0; i < 26; i++) {
            data[i] = (char) ('Z' - i);
        }

        for (int i = 1; i < 7; i++) {
            char key = data[i];
            int j = i - 1;
            
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }

       
        System.out.print("Hasil akhir array: ");
        for (char c : data) {
            System.out.print(c + " ");
        }
    }
}
