# Abstract Factory

This example was made on the idea of ordering computers from different providers, in this case: Apple and Dell.  
The required parts of these computers are:

- Case
- Motherboard
- Power Source
- Processor
- RAM
- VideoCard

This Abstract Factory makes the client select between the Apple Factory and the Dell Factory in order to get a new PC.
When the client has its PC, the method to print its parts can be executed, thus confirming that the new PC contains components either from the Dell or Apple family.
