#
# Ayush Kumar (202103103510253)
# 4th Sem Div: A
# Dijkstra.py
#

class Dijkstra:
  def __init__(self, graph):
    self.graph = graph
    self.visited = set()

  def shortest_distance_helper(self, node):
    if node in self.visited:
      return
      
    self.visited.add(node)
    for i, dist in enumerate(self.graph[node]):
      if dist != 0:
        new_distance = self.distances[node] + dist
        if new_distance < self.distances[i]:
          self.distances[i] = new_distance
        self.shortest_distance_helper(i)

  def shortest_distance_from(self, start_node):
    self.distances = [float('inf') for _ in range(len(self.graph))]
    self.distances[start_node] = 0
    self.shortest_distance_helper(start_node)
    print(self.distances)

