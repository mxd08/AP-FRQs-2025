## Question 1 Analysis
### Dog Walker

This section contains my analysis of Question 1 (Methods and Control Structures):

#### My initial approach during the exam:
##-First, I carefully read the question prompt to understand what was being asked.
-I identified that I needed to implement two methods: walkDogs(int hour) and dogWalkShift(int startHour, int endHour).
-I highlighted the existing helper methods:
-numAvailableDogs(int hour): gives how many dogs are available at a given hour
-updateDogs(int hour, int numWalked): updates the internal state to reflect that numWalked dogs were walked during hour
-maxDogs: a class variable representing the maximum number of dogs that can be walked at one time
-I focused on logic for correctly walking dogs based on availability and computing the correct money earned during a shift.

#### My revised solution after review:
-I re-evaluated the logic for the walkDogs method to ensure I was checking if the number of available dogs was less than maxDogs. Instead of walking the full maxDogs every time, I now correctly walk the smaller of the two.
-I made sure that the updateDogs(hour, number) method is called every time dogs are walked, and that it updates the correct number based on the actual dogs walked.
-For dogWalkShift, I realized I needed to add money not just based on the number of dogs walked, but also add a bonus if:
-The walker is walking the full maxDogs, or
-The hour is between 9 AM and 5 PM inclusive.
-I used a for loop from startHour to endHour inclusive to calculate the total money earned over the shift.
-I ensured that money is calculated by multiplying the number of dogs walked each hour by $5 and correctly adding the $3 bonus where applicable.
-After reviewing, I tested boundary conditions such as when no dogs are available, or when the hour is at the edge of the bonus range (like 9 and 17).
  
#### Key concepts tested in this question:
-Using if statements and loops (for loop).
-Filling in logic within provided method signatures.
-Correctly utilizing helper methods (numAvailableDogs, updateDogs).
-Knowing that calling updateDogs changes the internal state of the object.
-Basic arithmetic operations for computing earnings.  

#### What I learned from revisiting this problem:
-The importance of reading carefully to distinguish between the helper methods provided and the ones to implement.
-A methodical approach helps avoid errors like forgetting to call updateDogs.
-It’s crucial to think through edge cases, such as when available dogs are less than maxDogs.
-Reinforced the importance of combining logic and conditions, like calculating bonuses based on time and dog-walking capacity.
