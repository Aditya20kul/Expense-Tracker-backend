package com.aditya20kul.expenseapp.enums;

public enum CategoryEnum {
    FOOD("FOOD"),
    TRAVEL("TRAVEL"),
    FLAT("FLAT"),
    HOME("HOME"),
    ENTERTAINMENT("ENTERTAINMENT"),
    UTILITIES("UTILITIES"),
    LUXURY("LUXURY"),
    GIFT("GIFT"),
    MISC("MISC"),
    MEDICINE("MEDICINE"),
    CLOTHES("CLOTHES");

    public final String label;

    private CategoryEnum(String label) {
        this.label = label;
    }
    public String getCategoryEnum(){
        return label;
    }
}
