package oops;

class Animal
{
 int value = 0;
 Animal()
 {
 addValue();
 }
 void addValue()
 {
	 value += 10;
 }
 int getValue()
 {
 return value;
 }
}