def sorting(list1):
	output = []
	i=0
	while i < len(list1):
		flag=1
		for x in list1:
			temp=[]
			if i==x[1]:
				temp.append(x)
			output.extend(temp)
		i=i+1
	return output

print(sorting([[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]))
print(sorting([[12,0],[6,3],[3,4],[9,2], [11,1],[1,5]]))
print(sorting([ [2,4], [5,1], [3,3], [1,5], [4,2], [6,0],[6,3]]))
