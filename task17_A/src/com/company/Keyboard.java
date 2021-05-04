package com.company;

public class Keyboard {
    private String[] keyboardLayouts;
    private boolean isBacklight;
    private boolean isAdditionalNumbers;

    public Keyboard(){
    }

    public Keyboard(String[] keyboardLayouts, boolean isBacklight, boolean isAdditionalNumbers) {
        this.keyboardLayouts = keyboardLayouts;
        this.isBacklight = isBacklight;
        this.isAdditionalNumbers = isAdditionalNumbers;
    }

    public String[] getKeyboardLayouts() {
        return keyboardLayouts;
    }

    public void setKeyboardLayouts(String[] keyboardLayouts) {
        this.keyboardLayouts = keyboardLayouts;
    }

    public boolean isBacklight() {
        return isBacklight;
    }

    public void setBacklight(boolean backlight) {
        isBacklight = backlight;
    }

    public boolean isAdditionalNumbers() {
        return isAdditionalNumbers;
    }

    public void setAdditionalNumbers(boolean additionalNumbers) {
        isAdditionalNumbers = additionalNumbers;
    }
}
