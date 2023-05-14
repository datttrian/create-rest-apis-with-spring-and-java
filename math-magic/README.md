# Math Magic

In this project, you will become a mathemagician and write a small
program that performs a mathematical magic trick! It will involve
performing arithmetic operations on an integer that you choose.

The instructions provided are general guidelines. Upon completion of the
project, feel free to explore the code on your own.

If you get stuck during this project or would like to see an experienced
developer work through it, click “**Get Unstuck**“ to see a **project
walkthrough video**.

[Learn Java: Math Magic](https://www.youtube.com/watch?v=Roz_okjnGNM)

1.

Create an `int` variable called `myNumber`.

Set it equal to any integer other than 0.




2.

We will refer to `myNumber` as the original number from now on - it
might be helpful to document this.

Write a comment in the program that documents this.




3.

Create an `int` variable called `stepOne`.

Set it equal to the original number (`myNumber`) multiplied by itself.




4.

Create an `int` variable called `stepTwo`.

Set it equal to the previous result (`stepOne`) plus the original number
(`myNumber`).




5.

Create an `int` variable called `stepThree`.

Set it equal to the previous result (`stepTwo`) divided by the original
number.




6.

Create an `int` variable called `stepFour`.

Set it equal to the previous result (`stepThree`) plus `17`.

7.

Create an `int` variable called `stepFive`.

Set it equal to the previous result (`stepFour`) minus the original
number.




8.

Create an `int` variable called `stepSix`.

Set it equal to the previous result (`stepFive`) divided by `6`.

9.

Print out the value of the last step.

Then, save and run your code!

What number is printed to the console?




10.

Now, go back to your code and change `myNumber` to any other integer.
Run your program again.

Is the output the same?

It’s math magic!

**Note**: Due to the range of the <a
href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"
class="e14vpv2g1 gamut-xro1w8-ResetElement-Anchor-AnchorBase e1bhhzie0"
target="_blank" rel="noopener"><code
class="styles_code__zCrlm">int</code> primitive data type</a>, only set
`myNumber` to integer values between -46,341 and 46,340 (both
inclusive). Values outside of this range for `myNumber` will cause the
value of `stepOne` to exceed the maximum possible value of `int` when we
multiply `myNumber` by itself, which can cause the program to produce
unexpected results!




11.

Great job completing this project! Want to keep challenging yourself?

Recreate this project using only two variables: `myNumber` and
`magicNumber`. Use your understanding of compound assignment operators
to recreate the above program by only manipulating `magicNumber`.

See the **Hint** for more help.

**Reference**: https://www.codecademy.com/paths/create-rest-apis-with-spring-and-java/tracks/spring-apis-java-i/modules/learn-java-variables/projects/math-magic
