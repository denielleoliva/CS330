# HW1: Point of Sale


## What is the program?

This program emulates the use of a Point Of Sale machine. There are two types   
of POS's that are used. The first type that can be used is a Store POS where a
user can take both Cash and Credit transactions as well as generate the order
number automatically. The second type is a Kiosk POS which can only take cash 
payments and cannot generate the order number. The order number must be entered
manually by the user. 


## Usage

The following commands can be used to run the program:

`javac Main.java`

`java Main`

These to commands will run the compiler and create class file that can will
run the program itself.

When the program is run the user will be prompted to select from a menu that
contains the possible actions moving forward.

Expected output:

*Are you at a Store(1) or a Kiosk(2)*

*Enter 0 to exit.*

*Enter selection here:*

Possible outputs after this depend on what the user decides to enter.

For each option the user can either carry out a Store specific transaction
or a Kiosk transaction. The Store specific transaction includes a
credit transaction as well as the Kiosk transaction of a cash payment. Unlike
the Store transaction, the Kiosk option will only give you the option to 
process cash payments.

Cash Usage:

*Enter Ticket Order Number: < order number >*

*Kiosk Order Number: xxx*

*Enter amount due: < amount of sale >*

*Enter amount paid: < amount paid >*

*Change Due: XX.XX*

*Thank you for your purchase*

Credit Usage:

*Enter card number: < card number >*

*Enter amount due: < amount of sale >*


To exit the program the user will only need to select 0 when prompted by the
program while a menu is displayed.

## Development

Further development for the program can be done to take care of edge cases.
There are edge cases that deal with the correct data type being inputted that
could be coded against.

                                                                               