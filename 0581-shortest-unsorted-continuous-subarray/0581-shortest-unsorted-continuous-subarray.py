class Solution:
    def findUnsortedSubarray(self, nums: List[int]) -> int:
        n = len(nums)

        if n <= 1:
            return 0

        minorder = sys.maxsize
        maxorder = -sys.maxsize - 1

        for i in range(n):
            if i == 0:
                if nums[i] > nums[i + 1]:
                    minorder = min(minorder, nums[i])
                    maxorder = max(maxorder, nums[i])
            elif i == (n - 1):
                if nums[i] < nums[i - 1]:
                    minorder = min(minorder, nums[i])
                    maxorder = max(maxorder, nums[i])
            elif nums[i] > nums[i + 1] or nums[i] < nums[i - 1]:
                minorder = min(minorder, nums[i])
                maxorder = max(maxorder, nums[i])

        if minorder == sys.maxsize:
            return 0

        left = 0

        while left<n and nums[left] <= minorder:
            left += 1

        right = n - 1

        while right<n and nums[right] >= maxorder:
            right -= 1

        return right - left + 1
