from operator import itemgetter
transactions = ['bin', 'can', 'bin', 'bin', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'b']
transactions.sort()

temp = []
dic = {}
for i in transactions:
    if i not in dic:
        dic.update({i: 1})
    else:
        y = dic[i]
        dic.update({i: y + 1})
x = sorted(dic.items(), key=itemgetter(1), reverse=True)
for key, value in dic.items():
    temp.append(key + " " + str(value))

print(temp)