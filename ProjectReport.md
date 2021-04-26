# Project Report

Nathaniel Barber

## Challenge #1 Complete

In this challenge the main thing that needed to get done was changing the a line 
within the QueryEngineModule class so that the actual Wikipedia QueryEngine is there
instead of the "Fake one" that was there. 

## Challenge #2 Complete

Within this challenge even though the way that the time was displayed, 
it could be useful infomration in some way. I did this by creating RevisionImplementation.
This takes the the RevisionImplementation interface which uses a format function.
From there RevisionFormatter was made to implement RevisionImplementation. RevisionModule was then made
to bind the two RevisionImplementation and RevisionFormatter together. The last step that I took was adding the RevisionModule 
to the App file. So now when the actual output is set, its in the format of "At *WhateverTime*, *TheUser* made a change on the date *Date*" 

## Challenge #3 Complete

For this challange, in order to remove the loop I used steam() which was something I haven't done before!
From what I was able to find in helping me through this, I would have to map the steam. Since we have the RevisionFormatter, 
I was able to use this to format the revisions at a new line. This map was used to collect and join within the Collectors class.
I put this all into an outputArea as a text and it was good to go! 

## Reflection Question #1: Functional vs OO

Since coming at this string concatentation in a functional approach was something that was somewhat new to me
there were many things that I found interesting and sort of was able to build my preferences
For the most part I have always built around a more iterative manner, with something
like a for loop. However I did enjoy the change away from this. Using these functions and putting them all together
really feel a lot more high level and more difficult to grasp. I would probably see myself normally revert to n iterative appraoch 
although in a lot of cases there are more of a reason to use a functional approach. 

## Reflection Question #2: Polymorphism and Dependency Inversion

Polymorphism was something that I found was used within the RevisionFormatter and RevisionImplementation classes in my case.
In turn the dependecy inversion occurs within the WkipediaAnalyzer. The RevisionImplementation is able to have all sorts of different uses and take on different forms as well. 
The QueryEngine is another thing that we can look at as an example of polymorphism. This is because where there are any sorts of instances of these classes that in turn implement interfaces, we can see that polymorphism in that. Dependency inversions occur when we follow Guide. We can invert these dependencies by the use of these abstractions and through interfaces as well. 
