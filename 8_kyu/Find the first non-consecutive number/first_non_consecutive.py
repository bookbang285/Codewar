"""
Your task is to find the first element of an array that is not consecutive.

By not consecutive we mean not exactly 1 larger than the previous element of the array.

E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.

If the whole array is consecutive then return null2.

The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all be unique and in ascending order. 
The numbers could be positive or negative and the first non-consecutive could be either too!

test.assert_equals(first_non_consecutive([1,2,3,4,6,7,8]), 6)
        test.assert_equals(first_non_consecutive([1,2,3,4,5,6,7,8]), None)
        test.assert_equals(first_non_consecutive([4,6,7,8,9,11]), 6)
        test.assert_equals(first_non_consecutive([4,5,6,7,8,9,11]), 11)
        test.assert_equals(first_non_consecutive([31,32]), None)
        test.assert_equals(first_non_consecutive([-3,-2,0,1]), 0)
        test.assert_equals(first_non_consecutive([-5,-4,-3,-1]), -1)

"""

def first_non_consecutive(arr):
    number = arr[0]
    index = 0
    for i in arr :
        if number == i :
            number+=1
        else :
            return arr[index]
        index+=1
    return None

print(first_non_consecutive([-5,-4,-3,-1]))