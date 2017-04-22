import java.util.*

class Graph {
    private List<Vertex> vertexList;
    private List<Edge> edgeList;
    private boolean isDirected;
    private int nVertices;
    private int nEdges;

    public Graph(boolean directed) {
        vertexList = new ArrayList<Vertex>();
        edgeList = new ArrayList<Vertex>();
        isDirected = directed;
        nVertices = 0;
        nEdges = 0;
    }

    public int[] graphColoring() {
        boolean hasChanged = true;
        int[] coloring = new int[vertexList.size()];
        Arrays.fill(coloring, 0);
        while(hasChanged) {
            hasChanged = false;
            // loop through all the vertices and check if changes must be made
            for(Vertex v : vertexList) {
                
            }
        }
        return coloring;
    }

    public boolean areAdjacent(Vertex x, Vertex y) {
        for (Edge e : x.getAdjEdge()) {
            if(e.getOtherVertex().equals(y)) {
                return true;
            }
        }
        return false;
    }

    public List<Vertex> getNeighboursOf(Vertex x) {
        List<Vertex> ret = new ArrayList<Vertex>();
        for(Edge e : x.getAdjEdge()) {
            ret.add(e.getOtherVertex(x));
        }
        return ret;
    }

    public Graph addVertex(Vertex v) {
        vertexList.add(v);
        nVertices++;
        return this;
    }

    public Graph removeVertex(Vertex v) {
        vertexList.remove(v);
        nVertices--;
        return this;
    }

    public Graph addEdge(int id1, int id2) {
        edgeList.add(new Edge(vertexList.get(id1), vertexList.get(id2)));
        return this;
    }

    public Graph addEdge(Edge e) {
        edgeList.add(e);
        return this;
    }

    public Graph removeEdge(int id1, int id2) {
        edgeList.remove(new Edge(vertexList.get(id1), vertexList.get(id2)));
        return this;
    }
}