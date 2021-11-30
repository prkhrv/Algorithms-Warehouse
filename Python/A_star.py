# ------ A * search ------
import networkx as nx
import matplotlib.pyplot as plt 
def dist(a, b):
    (x1, y1) = a
    (x2, y2) = b
    return ((x1 - x2) ** 2 + (y1 - y2) ** 2) ** 0.5
G = nx.grid_graph(dim=[3, 3])  # nodes are two-tuples (x,y)
nx.set_edge_attributes(G, {e: e[1][0] * 2 for e in G.edges()}, "cost")
path = nx.astar_path(G, (0, 0), (2, 2), heuristic=dist, weight="cost")
length = nx.astar_path_length(G, (0, 0), (2, 2), heuristic=dist, weight="cost")
print('Path:')
print(path)
print("Path length: ") 
print(length)
pos = nx.spring_layout(G)
nx.draw(G, pos, with_labels = True, node_color="#f86e00")
edge_labels = nx.get_edge_attributes(G, "cost")
nx.draw_networkx_edge_labels(G, pos, edge_labels=edge_labels)
plt.show()
