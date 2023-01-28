
# Vector Clock Process
This program is to develop an n-node distributed system that implements a vector clock. The distributed system uses a logical clock to timestamp messages sent/received among the nodes. We used java programming language.
The distributed system will be emulated using multiple processes on a single machine.
Each process represents a machine and has a unique port number for communication.

Implemented the vector clock for your distributed system. We created two threads for each process, one for sending messages to other nodes and one for listening to its communication port.
Communication among nodes was done using sockets. Once a process sends a message, it will print its vector clock before and after sending a message. Similarly, once a process receives a message,
 it will print its vector clock before and after receiving the message. We did it for 3 processes which will not fail, join, or leave the distributed system.


## Acknowledgements

This project is developed by Divya Boggavarapu(1002086719) and Abhishek Reddy Yaramala(1002072996).

## Requirements
- Java
- Eclipse

## Detailed Instructions to Execute Code
- Right click on the VectorClockProcess.java and run as 1 Java application for 3 times.
- Three java processes will start running 
- It will give the message 'Process p1 started on port 9670 has been initiated, 
   This is process p1, press Enter to send message'
- Once we click enter, Please type Process name(p1, p2, p3) to which you want to send message and message text
- It'll display the vector clock before sending the message and after sending the message
- change the console and repeat the same procedure for all the processes by changing the console, we can see the updated vector clock.    