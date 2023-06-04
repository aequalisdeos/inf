public class z9 {
    public static void main(String[] args) {
        String text = "Это %какой-то текст% с комментариями. Нужно их удалить. " +
        "Также есть $еще один$ тип комментария. %Здесь% и тут %встречаются%.";
        String result = nocom(text);
        if (result.isEmpty()) {
            System.out.println("В тексте нет комментариев.");
        } else {
            System.out.println(text);
            System.out.println(result);
        }
    }
    public static String nocom(String text) {
        text = text.replaceAll("%.*?%", "");
        text = text.replaceAll("\\$.*?\\$", "");
        text = text.trim();
        return text;
    }
}
