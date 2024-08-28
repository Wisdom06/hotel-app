package org.hotellerie.enums;

public enum RoomsEnum {
    BASIC("1"),
    LUXURY("2"),
    SUITE("3");

    private String value;

    RoomsEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }
    public static RoomsEnum fromValue(String value) {
        for (RoomsEnum roomsEnum : RoomsEnum.values()) {
            if (roomsEnum.getValue().equals(value)) {
                return roomsEnum;
            }
        }
        throw new IllegalArgumentException("Numéro non valide : " + value);
    }

}
