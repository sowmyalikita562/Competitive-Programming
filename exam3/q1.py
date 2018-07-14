
num1 = input()
num2=input()

num1=bin(int(num1))
num2=bin(int(num2))
if len(num1)!=len(num2):
	if len(num1) < len(num2):
		temp="0b"
		for i in range(len(num2)-len(num1)):
			temp+="0"
		temp+=num1[2:]
		num1=temp
	if len(num2) < len(num1):
		temp="0b"
		for i in range(len(num1)-len(num2)):
			temp+="0"
		temp+=num2[2:]
		num2=temp

count=0
print(num1)
print(num2)
for i in range(len(num1)):
	if num1[i]!=num2[i]:
		count=count+1

print(count)
