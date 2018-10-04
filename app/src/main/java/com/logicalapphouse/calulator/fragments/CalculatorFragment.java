package com.logicalapphouse.calulator.fragments;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.logicalapphouse.calculator.common.GlobalClass;
import com.logicalapphouse.calulator.R;
import com.logicalapphouse.calulator.util.CalculatorBrain;

import java.text.DecimalFormat;

@SuppressLint("NewApi")
public class CalculatorFragment extends CommonFragment implements OnClickListener
		{
	int i = 0;
	public CalculatorFragment(){
		
	}
	private TextView mCalculatorDisplay;
	private Boolean userIsInTheMiddleOfTypingANumber = false;
	private CalculatorBrain mCalculatorBrain;
	private static final String DIGITS = "0123456789.";
    private  LinearLayout layout;
    private GradientDrawable gd = null;
    private Typeface condBold=null,condLight=null,condLightItalic=null;
	DecimalFormat df = new DecimalFormat("@###########");

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.calculator_layout, null);

		mCalculatorBrain = new CalculatorBrain();
		mCalculatorDisplay = (TextView) view.findViewById(R.id.textView1);
		condBold = Typeface.createFromAsset(getActivity().getAssets(), "NeoGramCondensed-Regular.ttf");
		condLight = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-CondLight.ttf");
		condLightItalic = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-CondLightItalic.ttf");
		df.setMinimumFractionDigits(0);
		df.setMinimumIntegerDigits(1);
		df.setMaximumIntegerDigits(8);
   
		Button button0 =(Button)view.findViewById(R.id.button0);
		button0.setTypeface(condBold);
		button0.setOnClickListener(this);
	
		Button button1 =(Button)view.findViewById(R.id.button1);
		button1.setTypeface(condBold);
		button1.setOnClickListener(this);
		
		
		
		Button button2 =(Button)view.findViewById(R.id.button2);
		button2.setTypeface(condBold);
		button2.setOnClickListener(this);
	
		
		Button button3 =(Button)view.findViewById(R.id.button3);
		button3.setTypeface(condBold);
		button3.setOnClickListener(this);
		
		
		Button button4 =(Button)view.findViewById(R.id.button4);
		button4.setTypeface(condBold);
		button4.setOnClickListener(this);
		
		
		
		Button button5 =(Button)view.findViewById(R.id.button5);
		button5.setTypeface(condBold);
		button5.setOnClickListener(this);
		
		
		Button button6 =(Button)view.findViewById(R.id.button6);
		button6.setTypeface(condBold);
		button6.setOnClickListener(this);
		
		
		Button button7 =(Button)view.findViewById(R.id.button7);
		button7.setTypeface(condBold);
		button7.setOnClickListener(this);
		
	
		
		Button button8 =(Button)view.findViewById(R.id.button8);
		button8.setTypeface(condBold);
		button8.setOnClickListener(this);
	
		
		Button button9 =(Button)view.findViewById(R.id.button9);
		button9.setTypeface(condBold);
		button9.setOnClickListener(this);
	

		Button buttonAdd =(Button)view.findViewById(R.id.buttonAdd);
		buttonAdd.setTypeface(condBold);
		buttonAdd.setOnClickListener(this);
	
		
		Button buttonSubtract =(Button)view.findViewById(R.id.buttonSubtract);
		buttonSubtract.setTypeface(condBold);
		buttonSubtract.setOnClickListener(this);
		
		
		Button buttonMultiply =(Button)view.findViewById(R.id.buttonMultiply);
		buttonMultiply.setTypeface(condBold);
		buttonMultiply.setOnClickListener(this);
	
		
		
		Button buttonDecimalPoint =(Button)view.findViewById(R.id.buttonDecimalPoint);
		buttonDecimalPoint.setTypeface(condBold);
		buttonDecimalPoint.setOnClickListener(this);
	
		
		
		Button buttonEquals =(Button)view.findViewById(R.id.buttonEquals);
		buttonEquals.setTypeface(condBold);
		buttonEquals.setOnClickListener(this);
	
		
		Button buttonClear =(Button)view.findViewById(R.id.buttonClear);
		buttonClear.setTypeface(condBold);
		buttonClear.setOnClickListener(this);
		
		
				Button buttonClearMemory =(Button)view.findViewById(R.id.buttonClearMemory);
			buttonClearMemory.setTypeface(condBold);
			buttonClearMemory.setOnClickListener(this);
			Button buttonAddToMemory =(Button)view.findViewById(R.id.buttonAddToMemory);
			buttonAddToMemory.setTypeface(condBold);
			buttonAddToMemory.setOnClickListener(this);
			Button buttonSubtractFromMemory=(Button)view.findViewById(R.id.buttonSubtractFromMemory);
			buttonSubtractFromMemory.setTypeface(condBold);
			buttonSubtractFromMemory.setOnClickListener(this);
			Button buttonRecallMemory = (Button)view.findViewById(R.id.buttonRecallMemory);
			buttonRecallMemory.setTypeface(condBold);
			buttonRecallMemory.setOnClickListener(this);

		// The following buttons only exist in layout-land (Landscape mode) and
		// require extra attention.
		// The messier option is to place the buttons in the regular layout too
		// and set android:visibility="invisible".
		if (view.findViewById(R.id.buttonSquareRoot) != null) {
			
			Button buttonSquareRoot =(Button)view.findViewById(R.id.buttonSquareRoot);
			//buttonSquareRoot.setTypeface(condBold);
			buttonSquareRoot.setOnClickListener(this);
			
		}
		if (view.findViewById(R.id.buttonSquared) != null) {
			Button buttonSquared =(Button)view.findViewById(R.id.buttonSquared);
			buttonSquared.setTypeface(condBold);
			buttonSquared.setOnClickListener(this);
		}
		if (view.findViewById(R.id.buttonInvert) != null) {
			Button buttonInvert =(Button)view.findViewById(R.id.buttonInvert);
			buttonInvert.setTypeface(condBold);
			buttonInvert.setOnClickListener(this);
		}
		
		Button buttonToggleSign =(Button)view.findViewById(R.id.buttonToggleSign);
		buttonToggleSign.setTypeface(condBold);
		buttonToggleSign.setOnClickListener(this);
		
		
		
		if (view.findViewById(R.id.buttonSine) != null) {
			Button buttonSine =(Button)view.findViewById(R.id.buttonSine);
			buttonSine.setTypeface(condBold);
			buttonSine.setOnClickListener(this);
		}
		if (view.findViewById(R.id.buttonCosine) != null) {
			Button buttonCosine =(Button)view.findViewById(R.id.buttonSine);
			buttonCosine.setTypeface(condBold);
			buttonCosine.setOnClickListener(this);
		}
		if (view.findViewById(R.id.buttonTangent) != null) {
			Button buttonTangent =(Button)view.findViewById(R.id.buttonTangent);
			buttonTangent.setTypeface(condBold);
			buttonTangent.setOnClickListener(this);
		}
		
		Button buttonDivide =(Button)view.findViewById(R.id.buttonDivide);
		buttonDivide.setTypeface(condBold);
		buttonDivide.setOnClickListener(this);
		layout = (LinearLayout) view
				.findViewById(R.id.functionPad);

	    GradientDrawable gd = new GradientDrawable(
	            GradientDrawable.Orientation.TOP_BOTTOM,
	            new int[] {GlobalClass.getInstance().pref.getColorCode(),GlobalClass.getInstance().pref.getColorCode()});
	    gd.setCornerRadius(0f);
		layout.setBackground(gd);
	
		return view;
	}

	@Override
	public void onClick(View v) {

		String buttonPressed = ((Button) v).getText().toString();

		if (DIGITS.contains(buttonPressed)) {

			// digit was pressed
			if (userIsInTheMiddleOfTypingANumber) {

				if (buttonPressed.equals(".")
						&& mCalculatorDisplay.getText().toString()
								.contains(".")) {
					// ERROR PREVENTION
					// Eliminate entering multiple decimals
				} else {
					mCalculatorDisplay.append(buttonPressed);
				}

			} else {

				if (buttonPressed.equals(".")) {
					// ERROR PREVENTION
					// This will avoid error if only the decimal is hit before
					// an operator, by placing a leading zero
					// before the decimal
					mCalculatorDisplay.setText(0 + buttonPressed);
				} else {
					mCalculatorDisplay.setText(buttonPressed);
				}

				userIsInTheMiddleOfTypingANumber = true;
			}

		} else {
			// operation was pressed
			if (userIsInTheMiddleOfTypingANumber) {

				mCalculatorBrain.setOperand(Double
						.parseDouble(mCalculatorDisplay.getText().toString()));
				userIsInTheMiddleOfTypingANumber = false;
			}

			mCalculatorBrain.performOperation(buttonPressed);
			mCalculatorDisplay.setText(df.format(mCalculatorBrain.getResult()));

		}

	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		// Save variables on screen orientation change
		if(mCalculatorBrain!=null){
		outState.putDouble("OPERAND", mCalculatorBrain.getResult());
		outState.putDouble("MEMORY", mCalculatorBrain.getMemory());
		}
	}

	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onSaveInstanceState(savedInstanceState);
		// Restore variables on screen orientation change
		if(mCalculatorBrain!=null){
		mCalculatorBrain.setOperand(savedInstanceState.getDouble("OPERAND"));
		mCalculatorBrain.setMemory(savedInstanceState.getDouble("MEMORY"));
		mCalculatorDisplay.setText(df.format(mCalculatorBrain.getResult()));
		}
	}


}
