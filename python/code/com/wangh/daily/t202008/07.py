class Node:
    def __init__(self, value):
        self._value = value
        self._children = []

    def __repr__(self):
        return 'Node({!r})'.format(self._value)

    def add_child(self, node):
        self._children.append(node)

    def __iter__(self):
        return iter(self._children)


if __name__ == '__main__':
    root = Node(0)
    child1 = Node(1)
    child2 = Node(2)
    child3 = Node(3)
    root.add_child(child1)
    root.add_child(child2)
    root.add_child(child3)

    for ch in root:
        print(ch)

from itertools import permutations

p = [1, 2, 3, 4]
for x in permutations(p, 3):
    print(x)
