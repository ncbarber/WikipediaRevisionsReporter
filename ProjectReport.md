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

(Write one or more paragraphs comparing and contrasting the iterative and functional  
approaches to string concatenation you explored in challenge #3. Which do you
prefer, and why?)

## Reflection Question #2: Polymorphism and Dependency Inversion

(Explain how polymorphism engendered dependency inversion in this little
application. Be clear and precise here, as this is, in part, an assessment of
your correct use of technical terminology.
Consider, for example, where exactly is polymorphism used?
Where exactly is a dependency inverted?)

