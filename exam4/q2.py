num = int(input())
arr = []
count=0
for i in range(num+1):
	temp= bin(i)
	for j in temp:
		if j=='1':
			count=count+1
	arr.append(count)
	count=0
print(arr)