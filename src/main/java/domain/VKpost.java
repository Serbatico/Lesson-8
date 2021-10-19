package domain;

public class VKpost {
    private int postID; //Идентификатор публикации
    private int ownerID;
    private String createdBy; // Имя автора кто выложил пост
    private Date date; // Время когда пост был выложен до истечения 24 часов
    private String text; // Текст записи.
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private LikesInfo likesInfo; // Количество людей которым "понравился пост"
    private Repost repost; // Количество репостов
    private Views views; // Количество просомотров
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;
    private MostInteresting mostInteresting; // Кнопка отображающая наиболее интересные коментарии
    private String userName; // ИмяФамилия коментатора
    private String comment;
    private String commentTime;
    private String replyComment; //Ответ на коментарий
    private int replyAmount; // Колличество ответов на комментарий


}
