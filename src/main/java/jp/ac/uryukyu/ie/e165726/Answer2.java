package jp.ac.uryukyu.ie.e165726;

/**
 * Created by e165744 on 2017/01/23.
 */
public class Answer2 {
    public int answer2(int i, String ans, int ansNum){
        int q = Integer.parseInt(ans);
        int CollectAnswer;
        if (i == 0){
            if(q == 3) {
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 3;
                mistake(CollectAnswer);
            }
        }else if(i == 1){
            if(q == 1){
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 1;
                mistake(CollectAnswer);
            }
        }else if(i == 2){
            if(q == 2){
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 2;
                mistake(CollectAnswer);
            }
        }else if(i == 3){
            if(q == 3){
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 3;
                mistake(CollectAnswer);
            }
        }else{
            if(q == 3){
                correct();
                ansNum += 1;
            }else{
                CollectAnswer = 3;
                mistake(CollectAnswer);
            }
        }
        return ansNum;
    }

    public void correct(){ //答えが当たっていたら正解！！と出力する
        System.out.println("正解！！");
        System.out.println();
    }

    public void mistake(int CollectAnswer){ //答えが間違えていたら正解番号を出力する
        System.out.println("残念。正解は" + CollectAnswer + "です。");
    }

}
