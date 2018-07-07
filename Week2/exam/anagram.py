for i in range(10):
	
	s = input().lower()
	t = input().lower()

	dict1 = {}

	for i in s:
		if i == " ":
			continue
		if i in dict1:
			dict1[i] += 1
		else:
			dict1[i] = 1

	dict2 = {}

	for i in t:
		if i == " ":
			continue
		if i in dict2:
			dict2[i] += 1
		else:
			dict2[i] = 1

	flag = 0
	if len(dict1) == len(dict2):
		for i in dict1:
			if i in dict2:
				if dict1[i] == dict2[i]:
					continue
				else:
					flag = 1
					break
			else:
				flag = 1 
				break
	else:
		flag = 1

	if flag == 1:
		print("false")
	else:
		print("true")

	print("\n")
