import sys
N = int(sys.stdin.readline().strip())

tree = {}

for i in range(N):
    root,left,right = sys.stdin.readline().strip().split()
    tree[root] = [left,right]

#전위 순회는 루트 - 왼쪽 - 오른쪽
def preorder(root):
    if root != '.':
        print(root,end="")
        preorder(tree[root][0])
        preorder(tree[root][1])
    
#중위 순회는 왼쪽 - 루트 - 오른쪽
def inorder(root):
    if root != '.':
        inorder(tree[root][0])
        print(root,end="")
        inorder(tree[root][1])

#후위 순회는 왼쪽 - 오른쪽 - 루트
def postorder(root):
    if root != '.':
        postorder(tree[root][0])
        postorder(tree[root][1])
        print(root,end="")
        
preorder('A')
print()
inorder('A')
print()
postorder('A')