import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LiteraturaDto {
    private String results;
    private String result;
    private String title;
    private String subtitle;
    private String writer;
    private String link;

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    @Override
    public String toString(){
        return "LiteraturaDto{" +
                "results' : {" + results+ '\'' +
                "result' : {" + result+ '\'' +
                "title' :" + title + '\'' +
                ", subtitle' :" + subtitle + '\'' +
                ", writer' :" + writer + '\'' +
                ", link' :" + link + '\'' +
                '}' + '}' + '}';
    }
}
