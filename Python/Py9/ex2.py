# print(1)
# —------------------



arr = [5, 8, 6, 4, 9, 2, 7, 3]
# На выходе:



sum1 = 0
len(arr)
for a in range(len(arr)):
    
    if a == 1:
        sum1 = arr[-1] + arr[0] + arr[1]

    if a < len(arr)-1:
        if sum1 < arr[a-1] + arr[a] + arr[a+1]:
            sum1 = arr[a-1] + arr[a] + arr[a+1]
    if a == len(arr):
        if sum1 < arr[a-1] + arr[a] + arr[0]:
            sum1 = arr[a-1] + arr[a] + arr[0]
        



print(sum1)



