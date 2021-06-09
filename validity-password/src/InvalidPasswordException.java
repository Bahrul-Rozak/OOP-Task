class InvalidPasswordException extends Exception {

    int passwordConditionViolated = 0;

    public InvalidPasswordException(int conditionViolated) {
        super("Invalid Password: ");
        passwordConditionViolated = conditionViolated;
    }

    public String printMessage() {

        switch (passwordConditionViolated) {

            case 1:
                return ("Password harus memiliki panjang" + " antara 8 sampai 15 characters");

            case 2:
                return ("Password tidak memiliki" + " spasi");

            case 3:
                return ("Password harus berisi" + " minimal digit angka(0-9)");

            case 4:
                return ("Password harus berisi " + "minimal satu characters");

            case 5:
                return ("Password harus berisi" + " minimal huruf kapital (A-Z)");

            case 6:
                return ("Password harus berisi " + " minimal huruf kecil(a-z)");
        }

        return ("");
    }
}
