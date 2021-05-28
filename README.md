First exercise:

Sadzida created class Food.java
Chiara created class Snacks.java
Lukas created class Concerts.java
Sadzida filled the Food class. It prints the food name, flavour and kind of the food that is in the drink.
Chiara filled the Snacks class. It prints the snack name, texture and taste of the food that fits to the drinks.
Lukas filled the Concerts class. It prints the Concert name, kind of music and the name of the band.

---------------------------------------------------------------------------


Erläuterung bzw. „CrashKurs“ der wichtigsten JavaDoc Grundlagen:

Aussehen: 
/**
* Javadoc Kommentar vor Klassen, Methoden, Attributen
*/

-Beschreibt dieBeschreibt wofür Klasse verantwortlich ist und was eine Methode macht (aber
nicht wie eine Methode etwas macht)
-Javadoc Kommentar vor Klassendeklaration
-Immer ein Satz, der kurz beschreibt, für was die Klasse
entworfen und implementiert wurde
-Javadoc kennt verschiedene „Tags“, mit denen Zusatzinformationen
angegeben werden können. Diese werden von Javadoc und teilweise vom Compiler verschieden
behandelt und ausgewertet.
-Wichtige Tags sind
Allgemein: @deprecated, @link, @see
Bei Methoden: @param, @return


---------------------------------------------------------------------------


Warum kann man keine vollständige Testabdeckung durchführen?

Eine vollständige Testabdeckung der Fachlichkeit stellt eine Ausnahme dar, weil die Anzahl möglicher Testfälle 
sehr schnell ungeheuer groß wird (durch kombinatorische Explosion). Ein vollständiger 
Funktionstest für eine einfache Funktion, die zwei 16-Bit-Werte als Argument erhält, würde schon 2^(16+16), 
also ca. 4 Milliarden Testfälle bedeuten, um die Spezifikation vollständig zu testen.
Stattdessen beschränkt man sich auf eine Auswahl sinnvoll erscheinender Tests für Grenzfälle.


---------------------------------------------------------------------------


Second exercise:

25.04.2021
Chiara made a new Branch named SnacksTest, for testing the Snack.java class in IntelliJ
Chiara changed the main.java, Snacks.java classes - added new Constructors in both classes. Than createt the SnacksTest.java class to test all the Methods from the Snacks.java class.


25.04.2021
Sadzida made a FoodTest branch.
Sadzida updated the Food.java, Main.java and created a FoodTest.java. I tested all the methods from the Food.java
and completed all of them (7). Then added these 3 classes to git.

25.04.2021
Lukas created a new Branch with the name Concerts to test class Concerts.java.
Tested the Concerts implementation, Tested the constructor
and tested all getter methods


---------------------------------------------------------------------------

Third exercise:

23.05.2021

We deleted .DS_Store and haim.iml, updated the .gitignore(.DS_Store & *.iml) structured README.md and added JavaDoc comments to the classes.  


28.05.2021


We created the Branch cashRegister. In IntelliJ we created the class Registrierkassa. We also implemented 3 Interfaces named "WeakDrink", "StrongDrink" and 
"NonAlc" with the methods date, person and price. After that in the class Registierkassa we implemented different methods. First one for the total sales for
each drink, second one for the sales on a date, which is a parameter. Third one for the total sales of a person and the fourth one for the sales of a person
on a date as a para parameter. Our Event has only two dates, that's why we as a variable of the form Date only have two. There are three stands, each with one person and one kind of drink. Chiara sells the strong alcoholic drinks, Lukas the weak drinks and Sadzida the non alcoholic ones. 
