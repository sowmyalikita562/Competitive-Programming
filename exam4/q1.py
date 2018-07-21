num = int(input())
num1 = bin(num)
count = 0
max1=0
for x in range(1,len(num1)):
	if num1[x-1]=='1' and num1[x]=='1':
		count=count+1
		if max1<count:
			max1=count
	else:
		count=0
print(max1)