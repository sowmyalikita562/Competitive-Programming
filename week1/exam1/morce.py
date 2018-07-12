list1 = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
"-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
"-","..-","...-",".--","-..-","-.--","--.."]

input_list=[]
morce_list=[]
input_list=eval(input())

for x in input_list:
	temp=""
	for ch in x:
		temp+=list1[ord(ch)-ord('a')]
	morce_list.append(str(temp))
print(len(set(morce_list)))



# print(input_list[0])
# print(list1[ord('B')-ord('A')])