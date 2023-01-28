
# 2-phase distributed commit(2PC) protocol
In this project a 2-phase distributed commit(2PC) protocol and use controlled and randomly injected failures to study how the 2PC protocol handles node crashes. Assumed one transaction coordinator (TC) and at least two participants in the 2PC protocol. Similar to the previous projects, we used multiple processes to emulate multiple nodes. Each node (both the TC and the participants) devises a time-out mechanism when no response is received and transits to either the abort or commit state. We assumed that only one node fails in the controlled test. Evaluate different possibilities of failures:

TC failure : If the coordinator fails before sending the "prepare" message, nodes will not receive the "prepare" message until the time-out and will abort. So, they will respond "no" to the "prepare" message after the coordinator comes back up and sends the "prepare" message.

Node failure : If the transaction coordinator does not receive "yes" from a node, it will abort the transaction.


## Acknowledgements

This project is developed by Divya Boggavarapu(1002086719) and Abhishek Reddy Yaramala(1002072996).


## Requirements
- Java
- Eclipse

## Detailed Instructions to Execute Code
- Run TPCServer.Java, TPCCoordinator.Java and run TPCParticipant.Java two times.
- Four java processes will start running 
- We need to register our participants by entering the name of partcipants.
- We will get messages to Coordinator that our participants are registerd.
- Coordinator will ask if we want to send message to our participants.
- We can switch to participants console windows and choose to Commit or Abort the message.
- If we committed message in all the participants, its a Global Commit.
- If we Aborted message in either one or two its a Global Abort.
- Even if one of the participant didn't respond for Particular time, it'll be considered as Abort.
- All these operations will be logging on server.
    