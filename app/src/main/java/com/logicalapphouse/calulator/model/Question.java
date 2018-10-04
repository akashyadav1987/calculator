package com.logicalapphouse.calulator.model;

import java.util.ArrayList;

/**
 * Created by AkashYad on 7/11/2016.
 */
public class Question {
    private String qus;
    private String answer;
    private String explanation;
    private ArrayList<Options> optionses ;

    public String getQus() {
        return qus;
    }

    public void setQus(String qus) {
        this.qus = qus;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public ArrayList<Options> getOptionses() {
        return optionses;
    }

    public void setOptionses(ArrayList<Options> optionses) {
        this.optionses = optionses;
    }
}
