# Complexity-1
This was the college assignment to test the knowledge of algorithm analysis and the implementation of algorithms. In this problem set, I was required to search for two integers that are the same but differ in arithmetic signs in two text files with different sizes; for example, I had to find integers like 2 and -2, 6 and -6. This problem set has two algorithmic implementations named algorithm1 and algorithm2.

# algorithm1

Algorithm1 executes in O(n^2).
It means that the algorithm takes time, which is quadratic of its input array. It starts to visit each element present in the given array. It does so with a for loop having an index variable i. The complexity here will be O (n). For each element, it again visits all other elements following it. This block also has complexity O(n), as it uses a nested for loop with an index variable j.Inside the nested for loop, the algorithm checks whether the sum of the current (arr[i]) and next element (arr[j]) is 0. If it is true, then the algorithm prints messages onto a console. This step has a constant complexity of O(1).As soon as an algorithm performs two nested for loops, its whole runtime complexity will be considered O(n^2).

# algorithm2

Algorithm2 executes in O(n). 
It means that the algorithm takes runtime, which is linearly dependent on its input array. The algorithm creates a hashset to store all those visited elements. This step takes a constant amount of time, which is O(1). To initialize the indexes i and j, it also takes a constant amount of time, which is O(1). The algorithm terminates when the two indexes become equal. While looping, the algorithm does the following: it calculates the sum of the current elements at i and j, and this process takes a constant amount of time. It has condition statements to check if the sum of the current elements is equal to zero and if the elements have been visited or not. If the elements have a sum equal to zero, then they are added to the set. Therefore, this step takes O(1). Hence, the algorithm stops when the two indexes i and j become equal; it will iterate n times, which produces a runtime time complexity of O(n).

# Which algorithm is efficient for the problem set?
Algorithm 2 is more efficient than one. Since algorithm 2 executes in O(n), the time is proportional to the input size.


# Clone the practical to your local server.



