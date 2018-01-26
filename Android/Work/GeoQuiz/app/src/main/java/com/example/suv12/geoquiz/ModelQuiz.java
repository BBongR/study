package com.example.suv12.geoquiz;

/**
 * Created by suv12 on 2018-01-20.
 */

public class ModelQuiz {

    private int mQuizId;
    private boolean mAnswer;

    public ModelQuiz() {
    }

    public ModelQuiz(int quizId, boolean answer) {
        mQuizId = quizId;
        mAnswer = answer;
    }

    public int getQuizId() {
        return mQuizId;
    }

    public void setQuizId(int quizId) {
        mQuizId = quizId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    @Override
    public String toString() {
        return "ModelQuiz{" +
                "mQuizId=" + mQuizId +
                ", mAnswer=" + mAnswer +
                '}';
    }
}
