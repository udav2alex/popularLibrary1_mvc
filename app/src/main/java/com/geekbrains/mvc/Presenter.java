package com.geekbrains.mvc;

public class Presenter {
    public enum Button {ONE, TWO, THREE}

    private final Model mModel;
    private final MainView mView;

    public Presenter(MainView mainView) {
        mModel = new Model();
        mView = mainView;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void buttonClick(Button button) {
        int newModelValue;
        switch (button) {
            case ONE:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                mView.setButtonText(1, newModelValue);
                break;

            case TWO:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                mView.setButtonText(2, newModelValue);
                break;

            case THREE:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                mView.setButtonText(3, newModelValue);
                break;
        }
    }
}
