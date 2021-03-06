package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
        ALICE("ALICE", "Hey, my name is ALICE!"),
        BOB("BOB", "Hey, my name is BOB!"),
        ;

        private String name;
        private String catchPhrase;


    AliceBobEnum(String name, String catchPhrase) {
        this.name = name;
        this.catchPhrase = catchPhrase;

    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public boolean isAlice() {
        return this.equals(ALICE);
    }

    public boolean isBob() {
        return this.equals(BOB);
    }
}
