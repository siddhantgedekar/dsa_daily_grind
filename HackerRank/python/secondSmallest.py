def second_lowest(records):
    # for _ in range(int(input())):
    #     name = input()
    #     score = float(input())
        
    #     records.append([name, score])
    
    records.sort(key=lambda records: records[1])
    secondSmallest = sorted(list(set(score for name, score in records)))[1]
    res = [names for names, scores in records if scores == secondSmallest]
    res.sort()
    for i in res:
        print(i)
    return res