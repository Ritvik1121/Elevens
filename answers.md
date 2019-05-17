1. Size is an instance variable so there is no need for getters and setters since it's defined in the subclass. 

2. Removing and replacing cards are the same for all games being played. So once it's implemented in Board class there is no need for instance variables.

3. isLegal() and anotherPlayIsPossible() would still be polymorphic. The alternative design could work but it would need the methods to be implemented separatley. 