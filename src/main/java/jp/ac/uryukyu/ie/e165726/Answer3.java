package jp.ac.uryukyu.ie.e165726;

/**
 * Created by e165744 on 2017/01/23.
 */
public class Answer3 {
    public int answer3(int i, String ans, int ansNum){
        int q = Integer.parseInt(ans);
        if (i == 0){  //問題1
            if(q == 2) {  //選択した番号が2の場合
                System.out.println("正解！！");
                ansNum += 1;
            }else{
                System.out.println("残念。正解は2です。");
            }
        }else if(i == 1){  //問題2
            if(q == 4){  //選択した番号が2の場合
                System.out.println("正解！！");
                ansNum += 1;
            }else{
                System.out.println("残念。正解は4です。");
            }
        }else if(i == 2){  //問題3
            if(q == 3){  //選択した番号が3の場合
                System.out.println("正解！！");
                ansNum += 1;
            }else{
                System.out.println("残念。正解は3です。");
            }
        }else if(i == 3){  //問題4
            if(q == 2){  //選択した番号が2の場合
                System.out.println("正解！！");
                ansNum += 1;
            }else{
                System.out.println("残念。正解は2です。");
            }
        }else{  //問題5
            if(q == 1){  //選択した番号が1の場合
                System.out.println("正解！！");
                ansNum += 1;
            }else{
                System.out.println("残念。正解は1です。");
            }
        }
        return ansNum;
    }
}
