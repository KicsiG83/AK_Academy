package hu.ak_akademia.webshop.dto;

public enum Status {

    ACTIVE("A"), DELETED("D");

    private final String code;

    private Status(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Status getFromCode(String code) {
        for (Status status : values()) {
            if (status.getCode().equalsIgnoreCase(code)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Érvénytelen státusz kód: " + code);
    }

}