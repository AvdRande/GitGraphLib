class Edge {
    private List<Vertex> adjVertex;
    private static int id;
    private int eId;


    public Edge(Vertex start, Vertex end) {
        adjVertex = new ArrayList<Vertex>();
        adjVertex.add(start);
        adjVertex.add(end);

        start.add(this);
        end.add(this);

        eId = id;
        id++;
    }

    public Vertex getOtherVertex(Vertex x) {
        if (x.equals(adjVertex.get(0))) {
            return adjVertex.get(1);
        } else {
            return adjVertex.get(0);
        }
    }

    public List<Vertex> getAdjVertex() {
        return adjVertex;
    }

    public void setAdjVertex(List<Vertex> adjVertex) {
        if (adjVertex.size() == 2) {
            this.adjVertex = adjVertex;
        }
    }

    public int getId() {
        return eId;
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

        Edge edge = (Edge) object;

        if (eId != edge.eId) {
            return false;
        }
        if (!adjVertex.equals(edge.adjVertex)) {
            return false;
        }

        return true;
    }
}
