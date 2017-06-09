# inMemoryBank

A great way to understand impact of the choices we make during development process for performance and concurrency is to analyse few simple cases.
	Case 1: Money transfer between 2 accounts: From(A), To(B), Amount(X)
    Case 2: Money transfer between multiple accounts: From(A, Amount(X)), From(B, Amount(Y)), To(C, Amount(Z1)), To(D, Amount(Z2)), To(E, Amount(Z3))

We will start with empty project and switch to particular branch to analyse progressive solutions.

Build tool        : Maven
Microbenchmark lib: Google's caliper

Feel to free to IDE of choice.

To clone the project      : git clone ....
To switch different branch: git checkout <BRANCH>

After a quick look into src directory, please switch to L1
   >> git checkout L1



