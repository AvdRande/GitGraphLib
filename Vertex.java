class Vertex {
    private List<Edge> adjEdge;
    private static int id = 0;
    private int vId;

    public Vertex() {
        adjEdge = new ArrayList<Edge>();
        vId = id;
        id++;
    }

    public void addEdge(Edge e) {
        adjEdge.add(e);
    }

    public List<Edge> getAdjEdge() {
        return adjEdge;
    }

    public void setAdjEdge(List<Edge> adjEdge) {
        this.adjEdge = adjEdge;
    }

    public int getId() {
        return vId;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }

        Vertex vertex = (Vertex) object;

        if (vId != vertex.vId) {
            return false;
        }
        if (!adjEdge.equals(vertex.adjEdge)) {
            return false;
        }

        return true;
    }
}
