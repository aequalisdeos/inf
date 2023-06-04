public class z12 {
    public static void main(String[] args) {
        String[] data = {
                "Возраст: 25, Пол: Мужской, IQ: 120, Балл: 85, Место учебы: МГУ, Место жительства: Москва, Численность семьи: 4",
                "Возраст: 30, Пол: Женский, IQ: 130, Балл: 90, Место учебы: МФТИ, Место жительства: Санкт-Петербург, Численность семьи: 3",
                "Возраст: ..., Пол: ..., IQ: ..., Балл: ..., Место учебы: ..., Место жительства: ..., Численность семьи: ..."
        };
        for (int i = 0; i < data.length; i++) {
            String original = data[i];
            String replaced = original.replaceAll("\\.+", "Заполнить");
            replaced = replaced.replaceAll("Мужской", "М")
                    .replaceAll("Женский", "Ж");
            replaced = replaced.replaceAll("город", "г.")
                    .replaceAll("Город", "г.");
            replaced = replaced.replaceAll("край", "кр.")
                    .replaceAll("Край", "кр.")
                    .replaceAll("область", "обл.")
                    .replaceAll("Область", "обл.");
            System.out.println("Исходная строка: " + original);
            System.out.println("Измененная строка: " + replaced);
            System.out.println();
        }
    }
}
