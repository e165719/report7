package jp.ac.uryukyu.ie.e165726;

public class Answer3 {//165744F 金城歩夢担当

    private int ansNum = 0;

    public int answer3(int i, String ans) { // 選んだ答えが当たっているか答え合わせするメソッド。
        int q = Integer.parseInt(ans); // String型をint型に変換し、変数qに入れる。
        int CollectAnswer; //答えを入れる変数を用意。
        if (i == 0) { //問題1
            if (q == 2) {
                correct();
                setAnsNum();
            } else {
                CollectAnswer = 3;
                mistake(CollectAnswer);
            }
        } else if (i == 1) { //問題2
            if (q == 4) {
                correct();
                setAnsNum();
            } else {
                CollectAnswer = 1;
                mistake(CollectAnswer);
            }
        } else if (i == 2) { //問題3
            if (q == 3) {
                correct();
                setAnsNum();
            } else {
                CollectAnswer = 2;
                mistake(CollectAnswer);
            }
        } else if (i == 3) { //問題4
            if (q == 2) {
                correct();
                setAnsNum();
            } else {
                CollectAnswer = 2;
                mistake(CollectAnswer);
            }
        } else { //問題5
            if (q == 1) {
                correct();
                setAnsNum();
            } else {
                CollectAnswer = 4;
                mistake(CollectAnswer);
            }
        }
        return getAnsNum();
    }

    public void correct() { //答えが当たっていたら正解！！と出力する
        System.out.println("正解！！");
        System.out.println();
    }

    public void mistake(int CollectAnswer) { //答えが間違えていたら正解番号を出力する
        System.out.println("残念。正解は" + CollectAnswer + "です。");
        System.out.println();
    }

    public int getAnsNum() {
        return this.ansNum;
    }

    public void setAnsNum() {
        this.ansNum += 1;
    }

}