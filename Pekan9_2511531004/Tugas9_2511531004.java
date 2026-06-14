package Pekan9_2511531004;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays; 
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Stack;



public class Tugas9_2511531004 extends JFrame {
    private Map<String, List<String>> graph_1004 = new HashMap<>();
    private JTextArea hasilArea_1004;
    private JComboBox<String> startBox_1004, goalBox_1004;
    private GraphPanel_1004 graphPanel_1004;
    private Set<String> visitedNodes_1004 = new HashSet<>();

    public Tugas9_2511531004() {
        setTitle("Pencarian Jalur BFS & DFS - 2511531004");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Graph minimal 10 node, 15 edge
        graph_1004.put("Rektorat", Arrays.asList("Perpus", "FTI"));
        graph_1004.put("Perpus", Arrays.asList("Rektorat", "PKM", "Masjid"));
        graph_1004.put("FTI", Arrays.asList("Rektorat", "Lab Jaringan", "Gedung A"));
        graph_1004.put("PKM", Arrays.asList("Perpus", "Masjid", "Gedung B"));
        graph_1004.put("Lab Jaringan", Arrays.asList("FTI", "Labor AI", "Gedung C"));
        graph_1004.put("Masjid", Arrays.asList("Perpus", "PKM", "Labor AI"));
        graph_1004.put("Labor AI", Arrays.asList("Lab Jaringan", "Masjid", "Gedung D"));
        graph_1004.put("Gedung A", Arrays.asList("FTI", "Gedung B"));
        graph_1004.put("Gedung B", Arrays.asList("PKM", "Gedung A", "Gedung C"));
        graph_1004.put("Gedung C", Arrays.asList("Lab Jaringan", "Gedung B", "Gedung D"));
        graph_1004.put("Gedung D", Arrays.asList("Labor AI", "Gedung C"));

        JPanel panel = new JPanel(new BorderLayout());

        // ComboBox Start & Goal
        JPanel topPanel = new JPanel();
        startBox_1004 = new JComboBox<>(graph_1004.keySet().toArray(new String[0]));
        goalBox_1004 = new JComboBox<>(graph_1004.keySet().toArray(new String[0]));
        topPanel.add(new JLabel("Start:"));
        topPanel.add(startBox_1004);
        topPanel.add(new JLabel("Goal:"));
        topPanel.add(goalBox_1004);

        // Tombol BFS, DFS, Reset
        JButton bfsBtn = new JButton("BFS");
        JButton dfsBtn = new JButton("DFS");
        JButton resetBtn = new JButton("Reset");

        bfsBtn.addActionListener(e -> jalankanBFS());
        dfsBtn.addActionListener(e -> jalankanDFS());
        resetBtn.addActionListener(e -> {
            hasilArea_1004.setText("");
            visitedNodes_1004.clear();
            graphPanel_1004.repaint();
        });

        topPanel.add(bfsBtn);
        topPanel.add(dfsBtn);
        topPanel.add(resetBtn);

        panel.add(topPanel, BorderLayout.NORTH);

        // Area hasil
        hasilArea_1004 = new JTextArea(5, 40);
        panel.add(new JScrollPane(hasilArea_1004), BorderLayout.SOUTH);

        // Panel visualisasi graph
        graphPanel_1004 = new GraphPanel_1004(graph_1004, visitedNodes_1004);
        panel.add(graphPanel_1004, BorderLayout.CENTER);

        add(panel);
    }

    private void jalankanBFS() {
        String start = (String) startBox_1004.getSelectedItem();
        String goal = (String) goalBox_1004.getSelectedItem();
        List<String> path = bfs(start, goal);
        hasilArea_1004.setText("BFS Path: " + path + "\nJumlah Node: " + path.size());
        visitedNodes_1004.addAll(path);
        graphPanel_1004.repaint();
    }

    private void jalankanDFS() {
        String start = (String) startBox_1004.getSelectedItem();
        String goal = (String) goalBox_1004.getSelectedItem();
        List<String> path = dfs(start, goal);
        hasilArea_1004.setText("DFS Path: " + path + "\nJumlah Node: " + path.size());
        visitedNodes_1004.addAll(path);
        graphPanel_1004.repaint();
    }

    // BFS
    private List<String> bfs(String start, String goal) {
        Queue<List<String>> queue = new LinkedList<>();
        queue.add(Arrays.asList(start));
        Set<String> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String node = path.get(path.size() - 1);
            if (node.equals(goal)) return path;
            if (!visited.contains(node)) {
                visited.add(node);
                for (String neighbor : graph_1004.getOrDefault(node, new ArrayList<>())) {
                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    queue.add(newPath);
                }
            }
        }
        return new ArrayList<>();
    }

    // DFS
    private List<String> dfs(String start, String goal) {
        Stack<List<String>> stack = new Stack<>();
        stack.push(Arrays.asList(start));
        Set<String> visited = new HashSet<>();

        while (!stack.isEmpty()) {
            List<String> path = stack.pop();
            String node = path.get(path.size() - 1);
            if (node.equals(goal)) return path;
            if (!visited.contains(node)) {
                visited.add(node);
                for (String neighbor : graph_1004.getOrDefault(node, new ArrayList<>())) {
                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    stack.push(newPath);
                }
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Tugas9_2511531004().setVisible(true));
    }
}

// Panel untuk menggambar graph
class GraphPanel_1004 extends JPanel {
    private Map<String, List<String>> graph;
    private Set<String> visited;
    private Map<String, Point> posisiNode = new HashMap<>();

    public GraphPanel_1004(Map<String, List<String>> graph, Set<String> visited) {
        this.graph = graph;
        this.visited = visited;

        // Posisi node manual
        posisiNode.put("Rektorat", new Point(100, 50));
        posisiNode.put("Perpus", new Point(50, 150));
        posisiNode.put("FTI", new Point(200, 150));
        posisiNode.put("PKM", new Point(100, 250));
        posisiNode.put("Lab Jaringan", new Point(250, 250));
        posisiNode.put("Masjid", new Point(50, 350));
        posisiNode.put("Labor AI", new Point(250, 350));
        posisiNode.put("Gedung A", new Point(350, 150));
        posisiNode.put("Gedung B", new Point(350, 250));
        posisiNode.put("Gedung C", new Point(350, 350));
        posisiNode.put("Gedung D", new Point(450, 350));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Gambar edge
        g.setColor(Color.BLACK);
        for (String node : graph.keySet()) {
            Point p1 = posisiNode.get(node);
            for (String neighbor : graph.get(node)) {
                Point p2 = posisiNode.get(neighbor);
                if (p1 != null && p2 != null) {
                    g.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
        }

        // Gambar node
        for (String node : graph.keySet()) {
            Point p = posisiNode.get(node);
            if (p != null) {
                if (visited.contains(node)) {
                    g.setColor(Color.RED); // node dikunjungi
                } else {
                    g.setColor(Color.GREEN); // node default
                }
                g.fillOval(p.x - 20, p.y - 20, 40, 40);
                g.setColor(Color.BLACK);
                g.drawString(node, p.x - 20, p.y - 25);
            }
        }
    }
}
