# Lab Report 2 

# 1)

`StringServer Class`

<img width="756" alt="Screen Shot 2023-10-21 at 12 12 31 AM" src="https://github.com/shinaegyo/cse15l-lab2/assets/137027086/cec46b48-df94-426e-938a-98670ffb766d">


`add-message screenshot`

<img width="807" alt="lab2-add-message1" src="https://github.com/shinaegyo/cse15l-lab2/assets/137027086/5252bed7-2269-4f16-b263-fe5e9bf2f14a">

   The method is handleRequest in the StringServer class.
   The relevant argument is URI as it processes the url which contains the information about the path and query parameters. The class fields are 'letters' and 'nums' and the passed-in argument is "I think Stephen Curry will average 32.4 PPG this season because he is the goat" and `nums` is incremented to 4 because there were three previous messages and now a fourth one is added.
   The URI as well as the `letters` and `nums` changed. The URI changes every time I add another message, the `nums` increments to 4 in this case (but in general represents the current number of messages (or lines)), and the most recent argument after the query is added as a string to `letters`, on a separate line.
   

   `add-message screenshot`
   
   <img width="797" alt="lab2-add-message2" src="https://github.com/shinaegyo/cse15l-lab2/assets/137027086/0137265a-a86f-4320-aa66-8caf197dc78d">
   
   The method is handleRequest in the StringServer class.
   The relevant argument is URI which contains the path `/add-message` with query `s=I am going to bed now`. The class fields are 'letters' and 'nums'. `nums` is incremented to 5 because there were 4 previous messages and now a fifth one is added.
   The string `letters` and int `nums` changed. `letters` now have an additional line containing the contents of our query, prefaced by a number, which has the same value as `nums`, representing the total number of messages that have been added. 
   

# 2) 

a)
`/Users/jamesshin/.ssh/id_rsa`

`id_rsa`represents private
private key screenshot

<img width="325" alt="lab2-part2" src="https://github.com/shinaegyo/cse15l-lab2/assets/137027086/3d042120-bfea-45dc-8add-1ac23ab66bd1">


b)
`/home/linux/ieng6/cs15lfa23ml/.ssh/id_rsa.pub`

`rsa.pub` represents public
public key screenshot

<img width="367" alt="lab2-part1" src="https://github.com/shinaegyo/cse15l-lab2/assets/137027086/1231e817-12e9-4238-b59e-220dd754ef56">


c)
<img width="780" alt="lab2-part3" src="https://github.com/shinaegyo/cse15l-lab2/assets/137027086/97dcd6b8-36e2-4c3f-b5ac-5cac867b142d">


# 3)
Something I learned in Lab 2 and Lab 3 is running javac and then the class name then typing in the class.java with the server port number.
This allowed me to open up a new server. I also learned that I can add a query with specified letter to either increment a number and or add a string message.
The ssh command allowed me to create a remote server rather than working directly from my server. It was difficult to put one thing I learned so I including all
three things because it really helped me learn the functionalities.
   
   

  
