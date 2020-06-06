# Approach 1: Naive
def twoSum_naive(nums, target):
    for i in range(len(nums)-1):
        for j in range(i+1, len(nums)):
            if( nums[i] + nums[j] == target ):
                print(i, " , ", j)
                return

# Approach 2: Hash map
def twoSum_hashing(nums, target):
    # create an empty hash map
    dict = {}
    # iterate through each element in nums
    for i, j in enumerate(nums):
        # check if pair exists (i, sum -j), if difference is seen before, return
        if target-j in dict:
            print(i , " , ", dict.get( target - j))
            return
        # store the index of the current element in the dictionary
        dict[j] = i

if __name__ == "__main__":
    nums = [55, 16, 2, 45, 7]
    target = 9

    # twoSum_naive(nums, target)
    twoSum_hashing(nums, target)

# with hashing - Runtime: 52 ms
#                Memory Usage: 15.3 MB