package com.example.mapremiereapplication.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class QuestionBank implements Serializable {

        private List<Question> mQuestionList;
        private int mQuestionIndex;

        public QuestionBank(List<Question> questionList) {
            // Mélanger la liste des questions avant de l'enregistrer
            this.mQuestionList = questionList;

            Collections.shuffle(mQuestionList);
        }

        public Question getCurrentQuestion() {
            return mQuestionList.get(mQuestionIndex);
        }

        public Question getNextQuestion() {
            mQuestionIndex++;
            return mQuestionList.get(mQuestionIndex);
        }

}
