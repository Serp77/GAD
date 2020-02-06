package two;

public class Dummy {

            public static String answer(String question) {
                String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
                if ("Привет, Бот.".equals(question)) {

                    rsl = "Привет, умник.";
                } else if ("Пока.".equals(question)) {

                    rsl = "До скорой встречи.";
                }
                return rsl;
            }
}
