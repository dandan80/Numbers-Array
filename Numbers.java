import java.util.Scanner;
public class Numbers {

	private Float[] numbers;
	private int numItems;
  
	public Numbers() {
		numbers = new Float[5];
	}
  
	public Numbers(int size) {
		numbers = new Float[size];
	}

	public void addValue(Scanner keyboard) {
		if (numItems < numbers.length) {
			System.out.println("Enter value: ");
			float input = keyboard.nextFloat();
			numbers[numItems] = input;
			numItems++;
		} else {
			System.out.println("Array full");
		}
	}
  
	public float calcAverage() {
		float average = 0.0f;
		float total = 0.0f;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != null) {
				total += numbers[i];
			} else {
				break;
			}
		}

		if (numItems != 0.0f) {
			average = total / numItems;
		}
		return (float) (Math.round(average * 100.0) / 100.0);
	}

	@Override
	public String toString() {
		String numberList = "";
		for (int i = 0; i < numItems; i++) {
			numberList += numbers[i] + "\n";
		}
		return numberList;
	}

	public Float[] findMinMax() {
		Float[] extremum = new Float[3];
		float max = 0.0f;
		float min = 0.0f;
		float modResult = 0.0f;
		if (numbers[0] != null) {
			max = numbers[0];
			min = numbers[0];
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != null) {
				if (numbers[i] > max) {
					max = numbers[i];
				}
				if (numbers[i] < min) {
					min = numbers[i];
				}
			}
		}
		if (min != 0.0f) {
			modResult = max % min;
			extremum[2] = (float) (Math.round(modResult * 100.0) / 100.0);
		}
		extremum[0] = max;
		extremum[1] = min;
		return extremum;
	}
}
