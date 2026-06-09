package Pekan9_2511531004;
import java.util.*;

public class GraphTraversal_2511531004 {
    private Map<String, List<String>> graph = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge_2511531004(String node1, String node2) {
        graph.putIfAbsent(node1, new ArrayList<>());
        graph.putIfAbsent(node2, new ArrayList<>());
        graph.get(node1).add(node2);
        graph.get(node2).add(node1);
    }

    // Menampilkan graf awal
    public void printGraph_2511531004() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node : graph.keySet()) {
            System.out.print(node + " -> ");
            List<String> neighbors = graph.get(node);
            System.out.println(String.join(", ", neighbors));
        }
        System.out.println();
    }

    // DFS rekursif
    public void dfs_2511531004(String start) {
        Set<String> visited = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper_2511531004(start, visited);
        System.out.println();
    }

    private void dfsHelper_2511531004(String current, Set<String> visited) {
        if (visited.contains(current)) return;
        visited.add(current);
        System.out.print(current + " ");
        for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
            dfsHelper_2511531004(neighbor, visited);
        }
    }

    // BFS iteratif
    public void bfs_2511531004(String start) {
        Set<String> visited_1004 = new HashSet<>();
        Queue<String> queue_1004 = new LinkedList<>();
        queue_1004.add(start);
        visited_1004.add(start);
        System.out.println("Penelusuran BFS:");
        while (!queue_1004.isEmpty()) {
            String current = queue_1004.poll();
            System.out.print(current + " ");
            for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited_1004.contains(neighbor)) {
                    queue_1004.add(neighbor);
                    visited_1004.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        GraphTraversal_2511531004 graph = new GraphTraversal_2511531004();

        // Contoh graf: A-B, A-C, B-D, B-E
        graph.addEdge_2511531004("A", "B");
        graph.addEdge_2511531004("A", "C");
        graph.addEdge_2511531004("B", "D");
        graph.addEdge_2511531004("B", "E");

        // Cetak graf awal
        System.out.println("Graf Awal adalah: ");
        graph.printGraph_2511531004();

        // Lakukan penelusuran
        graph.dfs_2511531004("A");
        graph.bfs_2511531004("A");
    }
}
