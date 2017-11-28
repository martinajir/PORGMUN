package com.porgmun.martinajireckova.porgmun.volley_data;


public class FeedItem {
    private String id;
    private String name, message, image, profilePic, createdTime, url, story;

    public FeedItem() {
    }

    public FeedItem(String id, String name, String image, String message,
                    String profilePic, String timeStamp, String url, String story) {
        super();
        this.id = id;
        this.name = name;
        this.image = image;
        this.message = message;
        this.profilePic = profilePic;
        this.createdTime = timeStamp;
        this.url = url;
        this.story=story;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImge() {
        return image;
    }

    public void setImge(String image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String timeStamp) {
        this.createdTime = timeStamp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStory()	{ return story; }

    public void setStory(String story){ this.story = story;}
}
