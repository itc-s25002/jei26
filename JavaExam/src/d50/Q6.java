package d50;

//実行用クラス
public class Q6 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);//コマンドライン引数を整数に変換
        int max = Integer.parseInt(args[1]);
        if (max < min) { //max<minなら入れ替える
            int tmp = max;
            max = min;
            min = tmp;
        }

        PrimeNumbers primeNumbers = new PrimeNumbers(); // オブジェクトの作成
        primeNumbers.initializePrimeNumbers(max);
        int[] part = primeNumbers.getPart(min,max);

        //拡張for分を使い配列partのすべての要素を出力
        for (int prime : part) {
            System.out.printf("%d, ",prime);
        }
    }
}

//素数判定配列を保持し、指定された配列の素数を求めるクラス
class PrimeNumbers {
    boolean[] isPrimeNumbers;

    //素数判定配列を設定するメソッド
    void initializePrimeNumbers(int max) {
        isPrimeNumbers = new boolean[max + 1];//最大値+1を要素数とする配列を用意
        for (int i = 2; i <= max; i++) {// 2~999の範囲指定
            isPrimeNumbers[i] = true;//trueに初期化
        }

        //pが最大値の正の平方根を超えるまで繰り返す
        //素数として2をpに設定
        //pの次の素数を先頭から探索し、pへ設定する
        for (int p = 2; p <= Math.sqrt(max); p++) {
            if (isPrimeNumbers[p]) {//pが素数であれば倍数をfalseに設定
                for (int m = p * 2; m <= max; m += p) {
                    isPrimeNumbers[m] = false;//pの倍数をすべてfalseに設定
                }
            }
        }
    }

    //指定された範囲の素数を素数判定配列から抜き出し、結果を配列で返す
    int[] getPart(int min, int max) {
        int count = 0;
        for (int n = min; n <= max; n++) {//素数の数をcountへ
            if (isPrimeNumbers[n]) {
                count++;
            }
        }

        int[] part = new int[count];
        int index = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNumbers[n]) {
                part[index++] = n;
            }
        }
        return part;
    }
}
