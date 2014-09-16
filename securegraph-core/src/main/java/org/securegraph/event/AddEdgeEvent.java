package org.securegraph.event;

import org.securegraph.Edge;
import org.securegraph.Graph;

public class AddEdgeEvent extends GraphEvent {
    private final Edge edge;

    public AddEdgeEvent(Graph graph, Edge edge) {
        super(graph);
        this.edge = edge;
    }

    public Edge getEdge() {
        return edge;
    }

    @Override
    public String toString() {
        return "AddEdgeEvent{edge=" + edge + '}';
    }

    @Override
    public int hashCode() {
        return getEdge().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AddEdgeEvent)) {
            return false;
        }

        AddEdgeEvent other = (AddEdgeEvent) obj;
        return getEdge().equals(other.getEdge()) && super.equals(obj);
    }
}
