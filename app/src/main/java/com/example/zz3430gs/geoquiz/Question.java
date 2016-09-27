package com.example.zz3430gs.geoquiz;

/**
 * Created by zz3430gs on 9/27/16.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue =answerTrue;
    }

    public int getmTextResId(){
        return mTextResId;
    }
    public void setTextResId(int textResId){
        mTextResId = textResId;
    }
    public boolean isAnswerTrue(){
        return mAnswerTrue;
    }
    public void setAnswerTure(boolean answerTrue){
        mAnswerTrue = answerTrue;
    }
}
