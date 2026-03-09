import math

def solution(progresses, speeds):
    days = []
    count = 1
    current = 0
    answer = []
    for p,s in zip(progresses,speeds):
        days.append(math.ceil(((100-p)/s)))
    
    current = days[0]
    
    for day in days[1:]:
        if(current>=day):
            count+=1
        else:
            answer.append(count)
            current=day
            count=1

    answer.append(count)
                
    print(answer)
    return answer