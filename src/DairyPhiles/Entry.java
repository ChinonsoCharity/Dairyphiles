package DairyPhiles;

import java.time.LocalDateTime;

public class Entry{
    private LocalDateTime time = LocalDateTime.now();
    private String gist;
    private String title;

    public Entry(String newTitle, String newGist){
        title = newTitle;

        gist = newGist;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist;
    }



}
