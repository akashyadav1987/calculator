package com.logicalapphouse.calulator.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.logicalapphouse.calulator.R;
import com.logicalapphouse.calulator.adapter.VadicMathDetailAdapter;

import java.util.ArrayList;

public class VadicMathDetail extends CommonFragment{
	private ArrayList<String> exampleList =null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view =inflater.inflate(R.layout.list,null);
//		AdView mAdView = (AdView)view. findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice("3B3F2DC204EF5DAB410E3B4A6378893B").build();
//        mAdView.loadAd(adRequest);
		//Banner banner = (Banner)view.findViewById(R.id.startAppBanner);
		Bundle bundle =getArguments();
		int pos = bundle.getInt("pos");
		switch(pos){
		case 1:
			exampleList = new ArrayList<String>();
			exampleList.add("Example");
			exampleList.add("Step 1:");
			exampleList.add("Let us consider subtraction of two 2digit numbers 36 from 62 .");
			exampleList.add("Step 2:");
			exampleList.add("Now, split the values 62 and 36 as follows \n6 / 2 \n3 / 6");
			exampleList.add("Step 3:");
			exampleList.add("Now, perform simple subtraction between the numbers written splitted \n 6 / 2\n - 3 / 6\n--------\n3 / (-4)");
			exampleList.add("Step 4:");
			exampleList.add("As we get negative result, we are in need to add 10 with the second digit and subtract 1 with the first digit obtained after subraction. \n3 / -4)\n(3-1) / (10-4)\n------------\n2 / 6");
			exampleList.add("Step 5:");
			exampleList.add("Final answer attained is 26.");
			break;
		case 2:
			exampleList = new ArrayList<String>();
			exampleList.add("Example");
			exampleList.add("Problem : 16 x 28");
			exampleList.add("Step 1:");
			exampleList.add("First, write your problem down, sitting on top of each other, like you would do when multiplying normally.\n1 6\nx 2 8-------");
			exampleList.add("Step 2:");
			exampleList.add("Cross-multiply the ones with the opposing tens and add them together. In this case, (2*6) + (1*8) = 20. Write 20 underneath 48 one space to the left (ending on the tens column) \n1 6\nx 2 8-------\n48 \n20");
			exampleList.add("Step 3:");
			exampleList.add("Multiply the tens. 1*2 = 2. Place this product another space to the left, in the hundreds column as shown. \n1 6\nx 2 8-------\n48\n20\n2");
			exampleList.add("Step 4:");
			exampleList.add("Now, add the products. Add the three rows as you do in normal multiplication method. The sum of the three rows you created equal 448, our answer. \n1 6\nx 2 8-------\n 48 \n20 \n2\n-------");
			exampleList.add("Final answer attained is  448.");
			break;
		case 4:
			exampleList = new ArrayList<String>();
			exampleList.add("Example");
			exampleList.add("Condition:Select any two numbers and deduct the rightmost digits, i.e., 'unit digit' from both the numerals. The results derived after subtraction of the numbers from unit digits should be 'Equal'. Vedic maths multiplication concept is applicable for all the digits.");
			exampleList.add("Step 1:");
			exampleList.add("Let us consider multiplying any two digit numbers, for example 23 x 24.");
			exampleList.add("Step 2:");
			exampleList.add("Choose the unit digit of both the numerals and deduct it from the given numerals.\n23 - 3 = 20\n24 - 4 = 20");
			exampleList.add("Step 3:");
			exampleList.add("Now, select any one number (24) and add it with unit digit of another number(3)\n24 + 3 = 2");
			exampleList.add("Step 4:");
			exampleList.add("Then, multiply the result obtained in step 2 and step 3.\n27 x 20 = 540");
			exampleList.add("Step 5:");
			exampleList.add("Multiply the unit digit values.\n4 * 3 = 12");
			exampleList.add("Step 6:");
			exampleList.add("Finally, add values obtained from step 3 and step 4.\n540 + 12 = 552\n23 x 24 = 552");
			break;
		case 5:
			exampleList = new ArrayList<String>();
			exampleList.add("Steps");
			exampleList.add("Step 1:");
			exampleList.add("Subtract the given multiplicand value by 1. ");
			exampleList.add("Step 2:");
			exampleList.add("Find the complement of multiplicand (Base value - Multiplicand value). ");
			exampleList.add("Step 3:");
			exampleList.add("Find the digit difference by subtracting multiplicand digit with multiplier digit. Assign (n). ");
			exampleList.add("Step 4:");
			exampleList.add("Start rule 1 value, next append rule 3 (n) number of 9's and rule 2 value.");
			exampleList.add("Example");
			exampleList.add("Ex.: 45 x 999");
			exampleList.add("45 -1 = 44 ");
			exampleList.add("Complement of 45 is 55 (that is 100 - 45) ");
			exampleList.add("Number of digit Difference from multiplier and multiplicand n = 3-2 = 1 ");
			exampleList.add("44955 (Its a final answer)");
			
			break;
		case 6:
			exampleList = new ArrayList<String>();
			exampleList.add("Steps");
			exampleList.add("Step 1:");
			exampleList.add("Add multiplicand with a value (Multiplier-100), then multiply by 100.");
			exampleList.add("Step 2:");
			exampleList.add("x = (multiplicand-100), y = (multiplier-100).");
			exampleList.add("Step 3:");
			exampleList.add(" Multiply x and y.");
			exampleList.add("Step 4:");
			exampleList.add("Add rule 1 result with the rule 3 result. Its a final result.");
			exampleList.add("Ex.: 105 X 107");
			exampleList.add("(105 + 7) X 100 = 112 X 100 = 11200");
			exampleList.add("x = 105 - 100 = 5, y = 107 - 100 = 7 ");
			exampleList.add("5 X 7 = 35");
			exampleList.add("= 11200 + 35 = 11235 ");
			break;
		case 7:
			exampleList = new ArrayList<String>();
			exampleList.add("Steps");
			exampleList.add("Step 1:");
			exampleList.add("Subtract the given multiplicand value by 1. ");
			exampleList.add("Step 2:");
			exampleList.add("Find the complement of multiplicand (Base value - Multiplicand value).");
			exampleList.add("Step 3:");
			exampleList.add("Append step 1 with step 2.");
			exampleList.add("Ex.: 456 x 999 (Multiplicand and Multiplier Digits are Same)");
			exampleList.add("456 -1 = 455 ");
			exampleList.add("Complement of 456 is 544 (that is 1000 - 456)");
			exampleList.add("Final answer is 455544");
			
			break;
		case 8:
			exampleList = new ArrayList<String>();
			exampleList.add("Steps");
			exampleList.add("Step 1:");
			exampleList.add("Reduce the base values from the multiplier and multiplicand.");
			exampleList.add("Step 2:");
			exampleList.add("Cross section the multiplier and multiplicand and add to the reduced values. You will get same difference on both the sides.");
			exampleList.add("Step 3:");
			exampleList.add("Multiply the reduced numbers.");
			exampleList.add("Step 4:");
			exampleList.add("If the resultant value is less than the base value assign zero before the resultant value to equal the base value digits. If the resultant value is greater than the base value carry the one.");
			exampleList.add("Step 5:");
			exampleList.add("If you get carry values, add it to the difference values.");
			exampleList.add("Step 6:");
			exampleList.add("Join both the values to get the final result.");
			exampleList.add("Ex. I : 106 X 108");
			exampleList.add("106 - 100 = 6 and 108 - 100 = 8");
			exampleList.add("106 + 8 = 114 ; 108 + 6 = 114");
			exampleList.add("Here the obtained value is less than the base value. So there is no carry value.");
			exampleList.add("Join both the values (106 x 108 = 11448)");
		
			break;
		case 9:
			exampleList = new ArrayList<String>();
			exampleList.add("Steps");
			exampleList.add("Step 1:");
			exampleList.add("Reduce numbers from the base values. ");
			exampleList.add("Step 2:");
			exampleList.add("Cross section the multiplier and multiplicand and add it to the reduced values. You will get same difference on both the sides.");
			exampleList.add("Step 3:");
			exampleList.add(" Multiply the reduced values. If the resultant value is less than the base value add zero before it. If the resultant value is greater than the base value carry the remainder 1.");
			exampleList.add("Step 4:");
			exampleList.add("Add the carry value with the difference value. ");
			exampleList.add("Step 5:");
			exampleList.add("Append both the values to get the final result.");
			exampleList.add("Ex. I : 89 X 98");
			exampleList.add("Here base value is 100. So, 89 - 100 = -11 and 98 - 100 = -2 ");
			exampleList.add("89 � 2 = 87 ; 98 -11 = 87");
			exampleList.add("-2 x -11 = 22 ");
			exampleList.add("No carry values");
			exampleList.add("Append the result is, 89 x 98 = 8722");
			break;
		case 10:
			exampleList = new ArrayList<String>();
			exampleList.add("Steps");
			exampleList.add("Step 1:");
			exampleList.add("Subtract both the numbers from the base value.");
			exampleList.add("Step 2:");
			exampleList.add("Cross section the multiplier and multiplicand value and add it with the reduced result. You should get same value on both the sides.");
			exampleList.add("Step 3:");
			exampleList.add("Multiply the reduced values. If the obtained value is greater than the base value, carry the remainder.");
			exampleList.add("Step 4:");
			exampleList.add("Subtract the remainder value from the difference value and find complement for the reduced result. If you get the carry value again, subtract the one from the difference value.");
			exampleList.add("Step 5:");
			exampleList.add("Join the obtained value to get the final result.");
			exampleList.add("Ex. 1 : 92 X 111");
			exampleList.add("92 � 100 = - 8 ; 111 � 100 = 11");
			exampleList.add(" 92 + 11 = 103 ; 111 � 8 = 103");
			exampleList.add("8 x 11 = 88");
			exampleList.add("103 - 1 = 102 Complement of 88 is 12 (100 - 88 = 12)");
			exampleList.add(" Join the values, , 92 X 111 = 10212.");
			break;
		case 12:
			exampleList = new ArrayList<String>();
			exampleList.add("Steps");
			exampleList.add("Consider squaring 122");
			exampleList.add("Step 1:");
			exampleList.add("Choose the last two digits of '122' and add it with the given number 122\n=122 + 22\n=144");
			exampleList.add("Step 2:");
			exampleList.add("Multiply 100 with the above result 144\n= 144 x 100\n= 14400");
			exampleList.add("Step 3:");
			exampleList.add("Now mulitply '22' with '22'\n= 22 x 22\n= 484");
			exampleList.add("Step 4:");
			exampleList.add("Now, add the values obtained from step 2 and step 3.\n= 14400 + 484\n= 14884");
			exampleList.add("Answer is 122^2 = 14884");
			break;
		case 13:
			exampleList = new ArrayList<String>();
			exampleList.add("Steps");
			exampleList.add("Step 1:");
			exampleList.add("Find the base of given number. That is maybe, 10, 100, 1000, 10000, ... ");
			exampleList.add("Step 2:");
			exampleList.add("Find the difference between base and a given number. That is a deficiency value. ");
			exampleList.add("Step 3:");
			exampleList.add("Subtract the given number by deficiency and then multiply by base.");
			exampleList.add("Step 4:");
			exampleList.add("Square the deficiency value. ");
			exampleList.add("Step 5:");
			exampleList.add("Add rule 3 result with the rule 4 result. Its a final result.");
			exampleList.add("Ex.: 93 X 93");
			exampleList.add("93 base is 100");
			exampleList.add("100 - 93 = 7");
			exampleList.add("(93 - 7) X 100 = 86 X 100 = 8600");
			exampleList.add("7 X 7 = 49");
			exampleList.add("= 8600 + 49 = 8649");
			break;
		case 15:
			exampleList = new ArrayList<String>();
			exampleList.add("Steps");
			exampleList.add("Conditions:\nIn fraction,\n1) denominator value 1's digit must be 9\n" +
					" 2) denominator value must be prime number (19, 29, 39, 59,...) \nCalculation Rules :" +
					"\n1) Find the number of digit answer from denominator\n n = denominator value - 1" +
					"\n2) First we find the half of the number of digit answer\nm = n / 2\n3) Find x from denominator value" +
					"\nRemove 1's digit and remaining value (Ekadhikena Purvena) add by 1\n4) Always start with 1" +
					"\n5) Now, multiply last find digit to x value, if result is carry occurs to carry the value to next multiplication. Its up to reach m number of digits" +
					"\n6) Next to find the complement of rule 5 results of m digit values.\n7) Now write answer from digit in reverse order from rule 6 and rule 5 with decimal point. Its Answer of given fraction value." +
					"\nExample: 1/19\nRule 1 : n = 19 - 1 = 18 \nRule 2 : m = 18 / 2 = 9 \nRule 3 : x = 1 (Ekadhikena Purvena - digit previous to 9) + 1 = 2 " +
					"\nRule 4 : = 1 (first digit) \nRule 5 : = 1, (first digit) \n1 * 2 (x) = 2, \n2 * 2 = 4, \n 4 * 2 = 8," +
					" \n8 * 2 = 16 (carry 1) = 6, \n6 * 2 = 12 + 1 = 13 (carry 1) = 3, \n3 * 2 = 6 + 1 = 7," +
					" \n7 * 2 = 14 (carry 1) = 4 \n4 * 2 = 8 + 1 = 9 \n(m number of digits find i.e., 9 digits) \nRule 6 : 1 2 4 8 6 3 7 4 9 " +
					"\nComplement (minus from 9) of this result is, \n8 7 5 1 3 6 2 5 0 \nRule 7 : digit in reverse order " +
					"\n0.052631578947368421 \nResult : \n1/19 = 0.052631578947368421");
			break;
			default:
				exampleList = new ArrayList<String>();
				break;
		}
		
		ListView listView =(ListView) view.findViewById(R.id.table_detail);
		VadicMathDetailAdapter vadicmathAdapter =new VadicMathDetailAdapter(getActivity(), exampleList);
		listView.setAdapter(vadicmathAdapter);
		return view;
	}

}
