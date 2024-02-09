public class DataValidatorImpl implements DataValidator {
    @Override
    public void validate(String[] data) throws IllegalArgumentException {
        if (data.length != 6) {
            throw new IllegalArgumentException("Ошибка: вы ввели " + data.length + " данных, а нужно 6.");
        }
        String birthDate = data[3];
        if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new IllegalArgumentException("Неверный формат даты рождения: " + birthDate);
        }
        String gender = data[5];
        if (gender.length() != 1 || (!"mf".contains(gender))) {
            throw new IllegalArgumentException("Неверный символ пола: " + gender);
        }
        if (data[4].length() != 11) {
            throw new IllegalArgumentException("Номер должен быть из 11 цифр: " + data[4]);
        }
    }
}