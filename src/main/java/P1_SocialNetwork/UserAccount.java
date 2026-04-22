package br.edu.ifsp.src.main.java.P1_SocialNetwork;

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
    public boolean delete(int postIdx) {
        if (postIdx < 0 || postIdx >= accMyPosts) return false;

        myPosts[postIdx] = myPosts[accMyPosts - 1];
        myPosts[accMyPosts-1] = null;
        accMyPosts--;

        return true;
    }
    public void clapPost(int postIdx) {
        if (postIdx < 0 || postIdx >= 10) return;
        myTimeline[postIdx].claps();
    }
    public void booPost(int postIdx) {
        if (postIdx < 0 || postIdx >= 10) return;
        myTimeline[postIdx].boo();
    }

    public String showTimeline() {
        StringBuilder sb = new StringBuilder();
        sb.append("Timeline: ");
        for (int i = 0; i < accTimeline; i++) {
            sb.append("\n").append(myTimeline[i].show()).append("\n");
        }
        return sb.toString();
    };

    public void acceptFollower(UserAccount newFollower) {
        if (newFollower == null || accFollowers >= 100) return;
        followers[accFollowers++] = newFollower;
    }
    public void blockFollower(UserAccount follower) {
        if (follower == null) return;
        for (int i = 0; i < accFollowers; i++) {
            if (followers[i].equals(follower)) {
                for (int j = i; j < accFollowers - 1; j++) {
                    followers[j] = followers[j + 1];
                }
                followers[i] = null;
                accFollowers--;
                return;
            }
        }
    }

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
