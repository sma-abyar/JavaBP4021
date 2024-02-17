package exc07.prb03;

import java.util.List;
import java.util.Map;

public class Blobservation {

    protected int width;
    protected int height;

    private Blob[][] table;

    public Blobservation(int width, int height) {
        this.width = width;
        this.height = height;
        table = new Blob[width][height];
    }

    public void populate(List<Map<String, Integer>> blobs) {
        for (Map<String, Integer> blob : blobs) {
            Blob blob1 = new Blob(blob.get("x"),blob.get("y"), blob.get("size"));
            table[blob.get("x")][blob.get("y")] = blob1;
        }
            //TODO
    }

    public void move(int steps) {
        //TODO
    }

    public void move() {
        // TODO
    }

    public Blob[][] getTable() {
        //TODO
        return null;
    }
}
