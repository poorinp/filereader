# Input-Output Tasks
by Poorin Pichayamongkol

I ran the tasks on HP Pavilion Notebook with 2.60 Ghz i5-3230M, and got these results:

Task

-----------------------------------------------|--------:

Read file 1-char at a time to String           | 0.718405 sec.

Read file 1-char at a time to StringBuilder    | 0.011758 sec.

Read file line at a time using BufferedReader  | 0.026559 sec.

## Explanation of Results

- String is the slowest because when String1 += String2 it will consume more memory for 
copy the old string + new chars of the other string.

- StringBuilder is the fastest because it use an array of chars and when use .append() 
it will check if there are any free space for the String to append and copy chars to String 
then it will read from array so it will consume less memory.

- BufferedReader is faster than String reader because when we use it it will read file line by line not by one 
char at a time as String so the memory will consume less than String if using BufferedReader. 
 
        