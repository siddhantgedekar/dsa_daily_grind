def scoreAvg(records, query_name):
    if query_name in records:
        scores = records[query_name]
        return sum(scores) / len(scores)
    else:
        return 0.00