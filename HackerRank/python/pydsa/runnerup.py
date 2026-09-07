def runner_up_score(inp_data):
    arr = map(int, inp_data.split())
    first = second = float('-inf')

    for score in arr:
        if score > first:
            second = first
            first = score
        elif score > second and score != first:
            second = score

    return second