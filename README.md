# Roman Numerals

## Problem Statement

Part 1

Convert decimal numbers to roman numerals

Part 2

Convert roman numerals to decimal numbers

Part 1 : Convert decimal numbers to roman numerals

Test Cases:

| Test Case Name | Input Values | Output Values |
|----------------|--------------|---------------|
| Test 01        | 1            | I             |
| Test 02        | 2            | II            |
| Test 03        | 3            | III           |
| Test 04        | 4            | IV            |
| Test 05        | 5            | V             |
| Test 06        | 6            | VI            |
| Test 07        | 9            | IX            |
| Test 08        | 10           | X             |
| Test 09        | 45           | XLV           |
| Test 10        | 56           | LVI           |
| Test 11        | 92           | XCII          |
| Test 12        | 197          | CXCVII        |
| Test 13        | 462          | CDLXII        |
| Test 14        | 583          | DLXXXIII      |
| Test 15        | 935          | CMXXXV        |
| Test 16        | 1056         | MLVI          |
| Test 17        | 1592         | MDXCII        |
| Test 18       | 3197         | MMMCXCVII     |

Pseudocode:
1. From the following table, find the highest decimal value v that is less than or equal to the decimal number x
   and its corresponding roman numeral n:

 | Decimal value (v) | Roman numeral (n) |
 |-------------------|-------------------|
 | 1                 | I                 |
 | 4                 | IV                |
 | 5                 | V                 |
 | 9                 | IX                |
 | 10                | X                 |
 | 40                | XL                |
 | 50                | L                 |
 | 90                | XC                |
 | 100               | C                 |
 | 400               | CD                |
 | 500               | D                 |
 | 900               | CM                |
 | 1000              | M                 |

2. Write the roman numeral n that you found and subtract its value v from x:
x = x - v


3. Repeat stages 1 and 2 until you get zero result of x.

### Example #1
x = 36
