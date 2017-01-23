package jp.ac.uryukyu.ie.e165726;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        PartSelection partSelection = new PartSelection();
        int partNum;     //選択パート番号
        int ansNum;     //正解数
        boolean isAlreadyOutput = true; //全問正解メッセージを出力したか判定

        System.out.println("苦しんで覚える英単語、単語の達人");
        System.out.println();
        System.out.println("このプログラムはIT系によく出てくる英単語を覚えるために作られました。各パート10単語ずつ出題されるので、4択の中から正解を選んでください。すべて正解するまで抜けられません。");
        System.out.println();

        do {
            partNum = partSelection.select();
            do {
                ansNum = partSelection.callPart(partNum);
                if(ansNum == 5) isAlreadyOutput = false;
            } while (partSelection.judge(ansNum,isAlreadyOutput) == 1);
            isAlreadyOutput = true;
        }while(partSelection.judge(ansNum,isAlreadyOutput) == 2);
    }
}
