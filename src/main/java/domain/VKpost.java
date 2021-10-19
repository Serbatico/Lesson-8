package domain;

public class VKpost {
    private int postID; //Идентификатор публикации
    private String publicName; // Название группы где выложен пост
    private TimeToday timeToday; // Время когда пост был выложен до истечения 24 часов
    private TimeAfter24Hours timeAfter24Hours; // Время спустя сутки
    private String description; // Описание содержимого статьи/поста
    private String postLink; // Ссылка на модальное окно с постом
    private Likes likes; // Количество людей которым "понравился пост"
    private Reposts reposts; // Количество репостов
    private int views; // Количество просомотров
    private MostInteresting mostInteresting; // Кнопка отображающая наиболее интересные коментарии
    private String userName; // ИмяФамилия коментатора
    private String comment;
    private String commentTime;
    private String replyComment; //Ответ на коментарий
    private int replyAmount; // Колличество ответов на комментарий


}
