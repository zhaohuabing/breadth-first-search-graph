package com.zhaohuabing;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GraphTest {

  @Test
  public void testBFSO1() {
    Graph graph = this.constructGraph();
    List<Node> result = graph.breadthFirstSearch("A");
    System.out.println(result);
    assertEquals(result.get(0).getName(), "A");
    assertEquals(result.get(1).getName(), "B");
    assertEquals(result.get(2).getName(), "C");
    assertEquals(result.get(3).getName(), "D");
    assertEquals(result.get(4).getName(), "E");
    assertEquals(result.get(5).getName(), "F");
  }

  @Test
  public void testBFSO2() {
    Graph graph = this.constructGraph();
    List<Node> result = graph.breadthFirstSearch("B");
    System.out.println(result);
    assertEquals(result.get(0).getName(), "B");
    assertEquals(result.get(1).getName(), "A");
    assertEquals(result.get(2).getName(), "C");
    assertEquals(result.get(3).getName(), "D");
    assertEquals(result.get(4).getName(), "E");
    assertEquals(result.get(5).getName(), "F");
  }


  @Test
  public void testBFSO3() {
    Graph graph = this.constructGraph();
    List<Node> result = graph.breadthFirstSearch("D");
    System.out.println(result);
    assertEquals(result.get(0).getName(), "D");
    assertEquals(result.get(1).getName(), "B");
    assertEquals(result.get(2).getName(), "C");
    assertEquals(result.get(3).getName(), "E");
    assertEquals(result.get(4).getName(), "F");
    assertEquals(result.get(5).getName(), "A");
  }

  /**
   * Create a graph for testing
   *
   *             B          D
   *       .-+---------.'-------F
   *    .-'  |       .' |
   * A.'     |     .'   |
   *   `.    |   .'     |
   *     `-. | .'       |
   *        `.'---------+
   *         C          E
   */
  private Graph constructGraph() {
    Graph graph = new Graph();
    graph.addEdge("A", "B");
    graph.addEdge("A", "C");
    graph.addEdge("B", "C");
    graph.addEdge("B", "D");
    graph.addEdge("C", "D");
    graph.addEdge("C", "E");
    graph.addEdge("D", "E");
    graph.addEdge("D", "F");
    return graph;
  }
}
