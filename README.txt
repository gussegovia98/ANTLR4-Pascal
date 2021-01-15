Gus Segovia


HOW TO RUN:
Generate: antlr Grammar.g4
Compile: javac -classpath /usr/local/lib/antlr-4.8-complete.jar *java; //the claspath was how it ran on my computer.
Run: grun Grammar start -gui tests/test#.pas;
//test1 is the only test that asks for input and it should be a float.


Most of the functionality is there it parses everything correctly but it does have some issues interpreting specific commands (it will run both if and else blocks at times, it has issues with case statements). It can evaluate pretty much all arithmetic operations that I threw at it and I couldn’t find a boolean expression that didn’t evaluate correctly. It can print variables expressions with variables and simple text. Variable declaration in terms of both booleans and reals works and is stored correctly on the corresponding map. You can swap values between variables. There are inline as well as block comments, the program name is saved and parsed under a variable. We can do all basic math functions.It finds the correct begin and end segment of a block or multiple blocks but cannot do nested one(not sure if this was required).