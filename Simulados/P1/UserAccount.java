package br.edu.ifsp.Simulados.P1;

public class UserAccount {
    private String email;
    private String userName;
    private UserAccount[] followers;
    private Post[] myPosts;
    private Post[] myTimeline;
    private int accFollowers;
    private int accTimeline;
    private int accMyPosts;

    public UserAccount(String email, String userName) {
        this.email = email;
        this.userName = userName;
        this.followers = new UserAccount[100];
        this.myPosts = new Post[100];
        this.myTimeline = new Post[10];
        this.accFollowers = 0;
        this.accTimeline = 0;
        this.accMyPosts = 0;
    }

    private void addToTimeline(Post newPost) {
        myTimeline[accTimeline % 10] = newPost;
        accTimeline++;
    }
    public void updateTimeline(Post newPost) {
        if (newPost == null) return;
        for (int i = 0; i < accFollowers; i++) {
            followers[i].addToTimeline(newPost);
        }
    }

    public void publish(String quote) {
        if (accMyPosts == 100) return;
        Post newPost = new Post(quote, this);
        myPosts[accMyPosts++] = newPost;
        updateTimeline(newPost);
    }

    public String showTimeline() {
        StringBuilder sb = new StringBuilder();
        sb.append("Timeline: ");
        for (int i = 0; i < myTimeline.length; i++) {
            sb.append("\n").append(myTimeline[i].show()).append("\n");
        }
        return sb.toString();
    };

    public String getUserName() {
        return userName;
    }

/*
    private UserAccount user;
    private String quote;
    private LocalDateTime date;
    private int claps;
    private int boos;
 */
}
