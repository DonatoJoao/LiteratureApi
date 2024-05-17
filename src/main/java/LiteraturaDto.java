import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
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



    public String getResult() {
        return result;
    }



    public String getTitle() {
        return title;
    }



    public String getSubtitle() {
        return subtitle;
    }



    public String getWriter() {
        return writer;
    }



    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "LiteraturaDto{" +
                "results='" + results + '\'' +
                ", result='" + result + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", writer='" + writer + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
