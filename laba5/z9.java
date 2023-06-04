import java.util.Scanner;
public class z9 {
    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
        System.out.println("Что вам нравится больше всего? 1 - Фильмы, 2 - Сериалы, 3 - Игры, 4 - Аниме, 5 - Книги");
        int x = qwe.nextInt();
        if (x==1) {
            System.out.println("Какой жанр вам нравится? 1 - Боевик, 2 - Фантастика, 3 -  Детективы");
            int y=qwe.nextInt();
            switch (y) {
                case 1:{
                    System.out.println("Рекомендуем к просмотру «Гнев человеческий»");
                    break;
                }
                case 2:{
                    System.out.println("Рекомендуем к просмотру «Начало»");
                    break;
                }
                case 3:{
                    System.out.println("Рекомендуем к просмотру «Достать ножи»");
                    break;
                }
                default:{
                    System.out.println("Нам нечего вам посоветовать!");
                    break;
                }
            }
        }else {
            if (x==2) {
                System.out.println("Какой жанр вам нравится? 1 - Боевик, 2 - Фантастика, 3 -  Детективы");
                int z=qwe.nextInt();
                switch (z) {
                    case 1:{
                        System.out.println("Рекомендуем к просмотру «Бумажный дом»");
                        break;
                    }
                    case 2:{
                        System.out.println("Рекомендуем к просмотру «Сверхъестественное»");
                        break;
                    }
                    case 3:{
                        System.out.println("Рекомендуем к просмотру «Шерлок»");
                        break;
                    }
                    default:{
                        System.out.println("Нам нечего вам посоветовать!");
                        break;
                    }
                }
            }
            else {
                if (x==3) {
                    System.out.println("Какой жанр вам нравится? 1 - Экшен, 2 - RPG, 3 -  Стратегия");
                    int c=qwe.nextInt();
                    switch (c) {
                        case 1:{
                            System.out.println("Рекомендуем к просмотру «Batman: Arkham Knight»");
                            break;
                        }
                        case 2:{
                            System.out.println("Рекомендуем к просмотру «Ведьмак 3: Дикая Охота»");
                            break;
                        }
                        case 3:{
                            System.out.println("Рекомендуем к просмотру «Divinity: Original Sin»");
                            break;
                        }
                        default:{
                            System.out.println("Нам нечего вам посоветовать!");
                            break;
                        }
                    }
                }else {
                    if (x==4) {
                        System.out.println("Какой жанр вам нравится? 1 - Боевик, 2 - Фантастика, 3 -  Детективы");
                        int v=qwe.nextInt();
                        switch (v) {
                            case 1:{
                                System.out.println("Рекомендуем к просмотру «Гуррен-Лаганн»");
                                break;
                            }
                            case 2:{
                                System.out.println("Рекомендуем к просмотру «Евангелион»");
                                break;
                            }
                            case 3:{
                                System.out.println("Рекомендуем к просмотру «Город, в котором меня нет»");
                                break;
                            }
                            default:{
                                System.out.println("Нам нечего вам посоветовать!");
                                break;
                            }
                        }
                    }else {
                        if (x==5) {
                            System.out.println("Какой жанр вам нравится? 1 - Боевик, 2 - Фантастика, 3 -  Детективы");
                            int q=qwe.nextInt();
                            switch (q) {
                                case 1:{
                                    System.out.println("Голодные игры»");
                                    break;
                                }
                                case 2:{
                                    System.out.println("Властелин колец»");
                                    break;
                                }
                                case 3:{
                                    System.out.println("Шерлок Холмс»");
                                    break;
                                }
                                default:{
                                    System.out.println("Нам нечего вам посоветовать!");
                                    break;
                                }
                            }

                        }else {
                            if (x>5) {
                                System.out.println("Пожалуйста, введите числа только от 1 до 5!");
                            }
                        }
                    }

                }
            }
        }
    }
}