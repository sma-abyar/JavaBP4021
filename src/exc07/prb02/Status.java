package exc07.prb02;

public class Status {
    protected String name;
    String path;
    public String setPath(String path){
        if (path!=""){
            this.path = System.getProperty(path);
        }else {
            this.path = System.getProperty("user.dir");
        }
        return path;
    }

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

}
