package compf.core.map_maker.random_map_generator.utils;
import java.util.*;
public class Graph<V,E> {
    public class GraphNode{
        private V data;
        private List<GraphEdge> outgoing=new ArrayList();
        private List<GraphEdge> incoming=new ArrayList();
        public V getData(){
            return data;
        }
        public void setData(V d){
            this.data=d;
        }
        public Iterable<GraphEdge> getOutgoing(){
            return this.outgoing;
        }
        public Iterable<GraphEdge> getIncoming(){
            return this.incoming;
        }
        public void addOutgoing(GraphNode target, E data){
            outgoing.add(new GraphEdge(this,data,target));
        }
    }
    public class GraphEdge{
        private E data;
        private GraphNode node1,node2;
        public E getData(){
            return data;
        }
        public void setData(E d){
            this.data=d;
        }
        public GraphNode getNode1(){
            return node1;
        }
        public GraphNode getNode2(){
            return node2;
        }
        public GraphNode getOpposite(GraphNode node){
            return node==node1?node2:node1;
        }
        public GraphEdge(GraphNode start, E data, GraphNode dest){
            node1=start;
            this.data=data;
            node2=dest;
        }
    }

}
