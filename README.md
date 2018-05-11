# random-Question-with-Answer

This code was developed as a sub requirement for a mobile app, which allows the user to select a difficulty level and generate the question based on the selected level.This code is capable of randomly generating questions with random operators and also evaluate the question and provide the correct answer.


There are 4 difficulty levels for the user to select

	 	novice - exactly 2 integer
    		easy - max 3  , 2..3 integers
    		medium - max 4 , 2...4 integers
    		guru -max 6 , min 4 , 4...6 integers
		
Based on the selected level of difficulty an array will created with the random size between the boundaries given.

The array will then be populated with random numbers and indices.

Using recursion the created question array will be evaluated from left to right

		2 + 3 - 3 - 4 - 4 
		answer : -6
		6 / 1 + 5 + 5 - 1 
		answer : 15
		3 / 1 / 6 / 4 + 4 
		answer : 4
		3 - 3 - 6 - 6 
		answer : -12
		 
Please feel free to use this code and modify as your requirement.

Cheers...
		
